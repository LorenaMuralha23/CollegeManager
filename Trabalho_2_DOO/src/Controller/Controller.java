package Controller;

import Model.ClassModel;
import Model.EmailValidationModel;
import Model.ExamModel;
import Model.ExceptionModel;
import Model.GradeOperations;
import Model.IdGeneratorModel;
import Model.Main;
import Model.StudentModel;
import Model.TeacherModel;
import Model.UserModel;
import View.ClassDetailsView;
import View.CreateAccountView;
import View.CreateClassView;
import View.JoinClassView;
import View.LoginView;
import View.MainFrame;
import View.RecordGradeView;
import View.ScheduleExamView;
import View.StudentStcDashboardView;
import View.StudentsDashboardView;
import View.TeacherDashboardView;
import java.awt.BorderLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Controller implements GradeOperations {

    public MainFrame window = new MainFrame();

    //User's panel
    public LoginView loginPanel;
    public CreateAccountView crtAccountPanel;

    IdGeneratorModel idGenerator;

    //Teacher's panels
    public TeacherDashboardView teacherDashboardPanel;
    public CreateClassView crtClassPanel;
    public ScheduleExamView scheduleExamPanel;
    public RecordGradeView recordGradePanel;
    public ClassDetailsView classDetailsPanel;
    public StudentStcDashboardView studentStcDashboardView;

    //Students panels
    public StudentsDashboardView studentsDashboardPanel;
    public JoinClassView enterClassViewPanel;
    public EmailValidationModel emailValidator;

    //Users DB
    public ArrayList<UserModel> usersDB;
    private UserModel userLogged;

    //Models
    DefaultTableModel modelStudentsTable;
    DefaultTableModel modelRecordGradeTable;

    public UserModel getUserLogged() {
        return userLogged;
    }

    public void start() {
        usersDB = new ArrayList<>();

        emailValidator = new EmailValidationModel();

        idGenerator = new IdGeneratorModel();
        loginPanel = new LoginView();
        showScreen(loginPanel);
        deserializeUserDB();

        window.setVisible(true);
    }

    public void showScreen(JPanel newPanel) {
        this.window.getContentPane().removeAll();
        this.window.add(newPanel, BorderLayout.CENTER);
        this.window.pack();
    }

    //===> System methods starts here
    public void logInAccount(String email, String password) {
        try {

            if (!email.equals("") && !password.equals("")) {//is empty?

                if (emailValidator.patternMatches(email)) {//return true if the email is a valid address
                    if (existsUserDB(email, password)) {//verify if there is a user with this info
                        userLogged = findUserDB(email, password);
                        if (userLogged.getUserType() == 1) {
                            //teacher
                            teacherDashboardPanel = new TeacherDashboardView();
                            showScreen(teacherDashboardPanel);
                        } else {
                            //student
                            studentsDashboardPanel = new StudentsDashboardView();
                            showScreen(studentsDashboardPanel);
                        }

                    } else {
                        loginPanel.cleanFields();
                        throw new ExceptionModel("We couldn't find an account associated with this email address!");
                    }

                } else {
                    //invalid email address
                    loginPanel.cleanFields();
                    throw new ExceptionModel("Invalid email address");
                }

            } else {
                loginPanel.cleanFields();
                throw new ExceptionModel("Enter your email and password to continue!");
            }

        } catch (ExceptionModel e) {
            this.window.showErrorMsg(e.getMessage());
        }
    }

    public void createAccount(String firstName, String userName, String emailAddress, String password, String confirmPswrd, int userType) {

        try {
            if (!firstName.equals("") && !userName.equals("") && !emailAddress.equals("") && !password.equals("") && !confirmPswrd.equals("") && userType != 0) {

                if (emailValidator.patternMatches(emailAddress)) {//verifying email

                    if (password.equals(confirmPswrd)) {//verifying if both password are the same

                        if (!existsUserDB(userName, password)) {//verifying if this email is associate with another account

                            UserModel user;

                            if (userType == 1) {
                                //User type -> Teacher
                                user = new TeacherModel(firstName, userName, emailAddress, password, idGenerator.generator());
                            } else {
                                //User type -> Student
                                user = new StudentModel(firstName, userName, emailAddress, password, idGenerator.generator());
                            }

                            if (addUserDB(user)) {
                                window.showSucessfullMsg("Congrats! Your account was create successfully! Log in and enjoy!");
                            }

                        } else {
                            throw new ExceptionModel("There is an account associate with this email. Please, Log In or change the email address.");
                        }

                    } else {
                        throw new ExceptionModel("Both passwords need to be the same!");
                    }

                } else {
                    throw new ExceptionModel("Invalid email address");
                }

            } else {
                throw new ExceptionModel("Complete the fields to continue");
            }
        } catch (ExceptionModel e) {
            this.window.showErrorMsg(e.getMessage());
        }

    }
    //===> System methods ends here

    //====> Teacher's methods
    public void createClass(String className, String subject, int totalOfExams, float minAvrgOfApp, int calcType) {

        try {
            if (!className.equals("") && !subject.equals("") && calcType != 0 && minAvrgOfApp != 0) {

                if (!existsClassByName(className)) {
                    if (totalOfExams > 0) {

                        ClassModel newClass = new ClassModel(className, subject, userLogged, minAvrgOfApp, calcType, totalOfExams);

                        if (addClassesToUser(newClass)) {
                            window.showSucessfullMsg("Success! Your new class is now avaliable!");
                            crtClassPanel.cleanFields();
                        }

                    } else {
                        throw new ExceptionModel("You can't set negative numbers or 0 as total of Exams!");
                    }
                } else {
                    throw new ExceptionModel("A class with the same name already exists!");
                }

            } else {
                throw new ExceptionModel("Complete the fields to continue");
            }
        } catch (ExceptionModel e) {
            this.window.showErrorMsg(e.getMessage());
        }

    }

    public void scheduleExam(String name, LocalDate date, String className, int numOfQstns, float valueOfEachQst, float weightOfExam, String warnForStudents) {

        try {
            if (!className.equals("") && numOfQstns != 0 && valueOfEachQst != 0) {
                ClassModel classAux = findClassByName(className);

                if (classAux.getExamList().size() < classAux.getTotalOfExams()) {
                    if (!existExam(classAux, name)) {
                        if (userLogged instanceof TeacherModel userAux) {
                            ExamModel newExam = new ExamModel(name, classAux, idGenerator.generator(), numOfQstns, weightOfExam, valueOfEachQst, userAux, classAux.getSubject(), warnForStudents, date);
                            if (addExamToList(newExam, classAux)) {
                                scheduleExamPanel.cleanFields();
                            }
                        }
                    } else {
                        throw new ExceptionModel("A exam with the same name already exists!");
                    }
                } else {
                    this.scheduleExamPanel.cleanFields();
                    throw new ExceptionModel("You have exceeded the maximum number of exams. Finish one to schedule a new one");
                }

            } else {
                throw new ExceptionModel("Complete the fields to continue");
            }
        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

    }

    public void fillStudentsTable(DefaultTableModel model, ClassModel classToVerify) {
        //remove all row to update everything
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }

        Object[] rowData = new Object[1];
        this.modelStudentsTable = model;

        if (!classToVerify.getStudentsList().isEmpty()) {
            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                rowData[0] = classToVerify.getStudentsList().get(i).getName();
                modelStudentsTable.addRow(rowData);
            }
        }

    }

    public void fillRecordGradeTable(DefaultTableModel model, ClassModel classToVerify, ExamModel exam) {
        modelRecordGradeTable = model;
        Object[] rowData = new Object[3];
        cleanRecordGradeTable(modelRecordGradeTable);
        for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
            rowData[0] = classToVerify.getStudentsList().get(i).getName();
            int examIndex = 0;
            for (int j = 0; j < classToVerify.getStudentsList().get(i).getStudentExams().size(); j++) {
                if (classToVerify.getStudentsList().get(i).getStudentExams().get(j).getId() == exam.getId()) {
                    examIndex = j;
                }
            }

            rowData[1] = classToVerify.getStudentsList().get(i).getNumberOfRightAnwsArray().get(examIndex);
            rowData[2] = classToVerify.getStudentsList().get(i).getExamsScoresArray().get(examIndex);

            modelRecordGradeTable.addRow(rowData);
        }
    }

    public void cleanRecordGradeTable(DefaultTableModel model) {
        modelRecordGradeTable = model;

        if (modelRecordGradeTable.getRowCount() > 0) {
            while (modelRecordGradeTable.getRowCount() > 0) {
                modelRecordGradeTable.removeRow(0);
            }
        }

    }

    public void saveGradeTable(DefaultTableModel model, ClassModel classToVerify, ExamModel exam) {
        this.modelRecordGradeTable = model;

        if (!exam.getCorrectedStatus()) {
            String msg = """
                         Are you sure you want to save the changes?
                         Alert: If you do, the status of exam will change for "corrected exam"
                         """;

            int option = window.showConfirmMsg(msg);
            if (option == 0) {
                exam.setCorrectedStatus(true);
            }

        }

        if (exam.getCorrectedStatus()) {
            int[] numberOfRightAwns = new int[modelRecordGradeTable.getRowCount()];
            float[] results = new float[modelRecordGradeTable.getRowCount()];

            for (int i = 0; i < modelRecordGradeTable.getRowCount(); i++) {
                String numObj = modelRecordGradeTable.getValueAt(i, 1).toString();
                numberOfRightAwns[i] = Integer.parseInt(numObj);
                results[i] = calcExamGrade(exam, numberOfRightAwns[i]);
            }

            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                StudentModel studentAux = classToVerify.getStudentsList().get(i);
                for (int j = 0; j < studentAux.getStudentExams().size(); j++) {
                    if (studentAux.getStudentExams().get(j).getId() == exam.getId()) {
                        studentAux.getNumberOfRightAnwsArray().set(j, numberOfRightAwns[i]);
                        studentAux.getExamsScoresArray().set(j, results[i]);
                    }
                }

            }

            cleanRecordGradeTable(modelRecordGradeTable);
            fillRecordGradeTable(modelRecordGradeTable, classToVerify, exam);
        }
    }

    public void finishClass(ClassModel classToFinish) {

        String msg = """
                     Are you sure you want to finish this class?
                     ALERT: This action will permanently remove this class
                     """;
        int option = JOptionPane.showConfirmDialog(null, msg, "Confirm question", WIDTH);

        if (option == 0) {
            if (removeClass(classToFinish)) {
                window.showSucessfullMsg("Class: " + classToFinish.getName() + " was successfully remove! ");
                classDetailsPanel.startComboBox();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operation canceled!", "Operation canceled", HEIGHT);
        }

    }

    public void updateClass(ClassModel classToUpdate, String newName, String newSubject) {
        String msg = """
                     You have changed some info.
                     Do you want to keep the changes?
                     """;

        if (window.showConfirmMsg(msg) == 0) {
            classToUpdate.setName(newName);
            classToUpdate.setSubject(newSubject);
        } else {
            JOptionPane.showMessageDialog(null, "Changes canceled", "Operation canceled", HEIGHT);
        }
    }

    public void finishExam(ExamModel examToFinish, ClassModel classToVerify) {
        String msg = """
                     You decided to finish the exam. Are you sure about it?
                     Alert: This will permanently remove this exam. We can't recover it once you delete.
                     """;

        if (window.showConfirmMsg(msg) == 0) {

            for (int i = 0; i < classToVerify.getExamList().size(); i++) {
                try {
                    if (examToFinish.getId() == classToVerify.getExamList().get(i).getId()) {
                        ExamModel ex = classToVerify.getExamList().get(i);
                        classToVerify.getExamList().remove(ex);
                        classToVerify.getFinishedExams().add(ex);
                        ex.setIsFinished(true);
                        window.showSucessfullMsg("The exam " + examToFinish.getName() + " was successfully finished!");
                        classDetailsPanel.startComboBox();

                    }
                } catch (Exception e) {
                    String errorMsg = """
                                 An unexpected error ocurred removing the exam from our system. Please, try again later.     
                                 """;
                    window.showErrorMsg(errorMsg + e.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Changes canceled", "Operation canceled", HEIGHT);
        }

    }
    //====> Teacher's methods here

    //====> Student's methods starts here
    public void joinClass(String className) {

        ClassModel classAux = findClassByName(className);

        try {

            if (userLogged instanceof StudentModel) {

                StudentModel userAux = (StudentModel) userLogged;

                if (!existsStudentInClass(userAux, classAux)) {

                    classAux.getStudentsList().add(userAux);
                    userAux.getClassesList().add(classAux);
                    if (!classAux.getExamList().isEmpty()) {
                        for (int i = 0; i < classAux.getExamList().size(); i++) {
                            userAux.getStudentExams().add(classAux.getExamList().get(i));
                            userAux.getNumberOfRightAnwsArray().add(0);
                            userAux.getExamsScoresArray().add(0f);
                        }
                    }

                    window.showSucessfullMsg("Congratulations! You joined this class!");

                } else {
                    throw new ExceptionModel("You are in this class already!");
                }

            }

        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

    }

    public float calcExamGrade(ExamModel exam, int numberOfRightAnsw) {
        return exam.getValueOfEachQuestion() * numberOfRightAnsw;
    }
    //====> Student's methods ends here

    //====> "Data Base" methods starts here
    public boolean existsUserDB(String email, String password) {
        boolean userExists = false;

        for (int i = 0; i < usersDB.size(); i++) {
            if (usersDB.get(i).getEmailAddress().equals(email) && usersDB.get(i).getPassword().equals(password)) {
                userExists = true;
            }
        }

        return userExists;
    }

    public UserModel findUserDB(String email, String password) {
        UserModel userFinded = null;

        try {
            if (existsUserDB(email, password)) {

                for (int i = 0; i < usersDB.size(); i++) {
                    if (usersDB.get(i).getEmailAddress().equals(email) && usersDB.get(i).getPassword().equals(password)) {
                        userFinded = usersDB.get(i);
                    }
                }

            } else {
                throw new ExceptionModel("There isn't any user with this info in our system!");
            }
        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }
        return userFinded;
    }

    public boolean addUserDB(UserModel newUser) {
        boolean success = false;

        try {
            usersDB.add(newUser);
            success = true;
        } catch (Exception e) {
            window.showErrorMsg("An error ocurred associating your account with our system. Please, try again later.\n"
                    + "Error: " + e.getMessage());
            success = false;
        }

        return success;
    }

    public boolean existsClassByName(String className) {
        boolean existsClass = false;
        if (userLogged instanceof TeacherModel) {
            TeacherModel userAux = (TeacherModel) userLogged;

            for (int i = 0; i < userAux.getClasses().size(); i++) {

                if (userAux.getClasses().get(i).getName().equals(className)) {
                    existsClass = true;
                }

            }

        }

        return existsClass;

    }

    public ClassModel findClassByName(String nameToFind) {
        ClassModel classFinded = null;

        for (int i = 0; i < usersDB.size(); i++) {

            if (usersDB.get(i) instanceof TeacherModel) {
                TeacherModel userAux = (TeacherModel) usersDB.get(i);
                //he probably has classes -> verify
                if (!userAux.getClasses().isEmpty()) {
                    for (int j = 0; j < userAux.getClasses().size(); j++) {
                        if (userAux.getClasses().get(j).getName().equals(nameToFind)) {
                            classFinded = userAux.getClasses().get(j);
                        }
                    }
                }
            }

        }
        return classFinded;
    }

    public boolean addClassesToUser(ClassModel newClass) {
        boolean success = false;

        try {
            if (userLogged instanceof TeacherModel) {
                TeacherModel userAux = (TeacherModel) userLogged;
                userAux.setClasses(newClass);
                success = true;
            }

            if (userLogged instanceof TeacherModel) {
                TeacherModel userAux = (TeacherModel) userLogged;
            }

        } catch (Exception e) {
            window.showErrorMsg("An error ocurred while saving your new class! Please, try again later!");
            success = false;
        }

        return success;
    }

    public boolean existExam(ClassModel classToSearch, String examName) {
        boolean existExam = false;

        for (int i = 0; i < classToSearch.getExamList().size(); i++) {
            if (classToSearch.getExamList().get(i).getName().equals(examName)) {
                existExam = true;
            }
        }

        return existExam;
    }

    public ExamModel findExamByName(ClassModel classToSearch, String examName) {
        ExamModel examFinded = null;
        try {
            if (existExam(classToSearch, examName)) {

                for (int i = 0; i < classToSearch.getExamList().size(); i++) {
                    if (classToSearch.getExamList().get(i).getName().equals(examName)) {
                        examFinded = classToSearch.getExamList().get(i);
                    }
                }

            } else {
                throw new ExceptionModel("There isn't any exam with this info in this class!");
            }
        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

        return examFinded;
    }

    public ExamModel findFinishedExamByName(ClassModel classToSearch, String examName) {
        ExamModel examFinishedFinded = null;

        try {

            for (int i = 0; i < classToSearch.getFinishedExams().size(); i++) {
                if (classToSearch.getFinishedExams().get(i).getName().equals(examName)) {
                    examFinishedFinded = classToSearch.getFinishedExams().get(i);
                }
            }

        } catch (Exception e) {
            window.showErrorMsg(e.getMessage());
        }

        return examFinishedFinded;
    }

    public boolean addExamToList(ExamModel newExam, ClassModel classToAdd) {
        boolean isSuceed = false;
        try {
            if (userLogged instanceof TeacherModel) {
                classToAdd.setExamToList(newExam);
                isSuceed = true;
                for (int i = 0; i < classToAdd.getStudentsList().size(); i++) {
                    classToAdd.getStudentsList().get(i).getStudentExams().add(newExam);
                    classToAdd.getStudentsList().get(i).setNumOfRightAnwr(classToAdd.getStudentsList().get(i).getNumberOfRightAnwsArray().size(), 0);
                    classToAdd.getStudentsList().get(i).setExamsScores(classToAdd.getStudentsList().get(i).getExamsScoresArray().size(), 0f);
                }
                Main.controller.window.showSucessfullMsg("Your new exam is schedule to " + newExam.getDate() + "!");

            }
        } catch (Exception e) {
            Main.controller.window.showErrorMsg("An error ocurred while scheduling your new exam! Please, try again later!");
        }
        return isSuceed;
    }

    public void logOut() {
        int option = window.showConfirmMsg("Are you sure you want to log out?");
        if (option == 0) {
            userLogged = null;
            showScreen(loginPanel);
            loginPanel.cleanFields();
        }
    }

    public StudentModel findStudentInClass(StudentModel student, ClassModel classToVerify) {
        StudentModel studentFinded = null;
        if (!classToVerify.getStudentsList().isEmpty()) {

            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                if (classToVerify.getStudentsList().get(i).getId() == student.getId()) {
                    studentFinded = classToVerify.getStudentsList().get(i);
                }
            }

        }

        return studentFinded;
    }

    public boolean existsStudentInClass(StudentModel studentToFind, ClassModel classToVerify) {

        boolean exists = false;

        if (!classToVerify.getStudentsList().isEmpty()) {
            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                if (studentToFind.getId() == classToVerify.getStudentsList().get(i).getId()) {
                    exists = true;
                }
            }
        }

        return exists;

    }

    public StudentModel findStudentById(long id, ClassModel classModel) {
        StudentModel studentFinded = null;
        for (int i = 0; i < classModel.getStudentsList().size(); i++) {
            if (classModel.getStudentsList().get(i).getId() == id) {
                studentFinded = classModel.getStudentsList().get(i);
            }
        }
        return studentFinded;
    }

    public boolean removeClass(ClassModel classToFinish) {
        boolean success = false;
        try {
            if (userLogged instanceof TeacherModel userAux) {

                for (int i = 0; i < userAux.getClasses().size(); i++) {
                    if (userAux.getClasses().get(i).getName().equals(classToFinish.getName())) {
                        userAux.getClasses().remove(userAux.getClasses().get(i));
                        success = true;
                    }
                }

            }
        } catch (Exception e) {
            window.showErrorMsg("An error ocurred while removing the class! Please, try again later!");
            success = false;
        }

        return success;
    }
    //====> "Data Base" methods ends here

    //====> DashBoard information getters starts here
    public String getNumberOfStudents(ClassModel classToVerify) {

        String numberOfStudentsTxt = String.valueOf(classToVerify.getStudentsList().size());
        return numberOfStudentsTxt;

    }

    public String getNumberOfExamsFromClass(ClassModel classToVerify) {
        int cont = 0;
        for (int i = 0; i < classToVerify.getExamList().size(); i++) {
            if (classToVerify.getExamList().get(i).getDate().isAfter(LocalDate.now())) {
                cont++;
            }
        }

        String numberOfExamsTxt = String.valueOf(cont);
        return numberOfExamsTxt;
    }

    public String getPrctOfApprovement(ClassModel classToVerify) {
        String percetageTxt = "";

        if (!classToVerify.getStudentsList().isEmpty()) {

            if (!classToVerify.getFinishedExams().isEmpty()) {

                boolean isAllCorrected = true;
                for (int i = 0; i < classToVerify.getFinishedExams().size(); i++) {
                    if (classToVerify.getFinishedExams().get(i).getCorrectedStatus() == false) {
                        isAllCorrected = false;
                    }
                }

                if (isAllCorrected) {
                    int cont = 0;
                    if (classToVerify.getCalcType() == 1) {
                        for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                            float studentAverange = getTotalAverangeFloat(classToVerify.getStudentsList().get(i), classToVerify);
                            if (studentAverange > classToVerify.getMinimumrAverange()) {
                                //the student is approved :)
                                cont++;
                            }
                        }
                    } else {
                        for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                            float studentAverange = getTotalAverangeFloat(classToVerify.getStudentsList().get(i), classToVerify);
                            if (studentAverange > classToVerify.getMinimumrAverange()) {
                                //the student is approved :)
                                cont++;
                            }
                        }

                    }
                    float prctOfApprovement = (100 * cont) / classToVerify.getStudentsList().size();
                    DecimalFormat formatter = new DecimalFormat("#.#");
                    percetageTxt = formatter.format(prctOfApprovement);
                    percetageTxt += "%";
                } else {
                    percetageTxt = "0.0%";
                }

            } else {
                //there isn't exams finished. So, any student failure yet
                percetageTxt = "0.0%";
            }
        } else {
            //there isn't students in this class
            percetageTxt = "0.0%";
        }

        return percetageTxt;
    }

    public String getPrctOfFailure(ClassModel classToVerify) {
        String percetageTxt = "";

        if (!classToVerify.getFinishedExams().isEmpty()) {
            boolean isAllCorrected = true;
            //verify if all exams are corrected. If it's, it can calculate the statistics
            //if it's not, it can not calculate the statistics
            for (int i = 0; i < classToVerify.getFinishedExams().size(); i++) {
                if (classToVerify.getFinishedExams().get(i).getCorrectedStatus() == false) {
                    isAllCorrected = false;
                }
            }

            if (isAllCorrected) {
                int cont = 0;
                if (classToVerify.getCalcType() == 1) {
                    //normal averange calc
                    for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                        float studentAverange = getTotalAverangeFloat(classToVerify.getStudentsList().get(i), classToVerify);
                        if (studentAverange < classToVerify.getMinimumrAverange()) {
                            //the student is not approved yet
                            cont++;
                        }
                    }

                } else {
                    //weighted averange calc
                    for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                        float studentAverange = getTotalAverangeFloat(classToVerify.getStudentsList().get(i), classToVerify);
                        if (studentAverange < classToVerify.getMinimumrAverange()) {
                            //the student is not approved yet
                            cont++;
                        }
                    }

                }

                if (!classToVerify.getStudentsList().isEmpty()) {
                    float prctOfApprovement = (100 * cont) / classToVerify.getStudentsList().size();
                    DecimalFormat formatter = new DecimalFormat("0.0");
                    percetageTxt = formatter.format(prctOfApprovement);
                    percetageTxt += "%";
                }
            } else {
                percetageTxt = "0.0%";
            }

        } else {
            //there isn't exams finished. So, any student failure yet
            percetageTxt = "0.0%";
        }

        return percetageTxt;
    }

    public String getNumExamFinished(ClassModel classToVerify) {
        String numOfFinishedExamsTxt = "";

        numOfFinishedExamsTxt = String.valueOf(classToVerify.getFinishedExams().size());

        return numOfFinishedExamsTxt;
    }

    public String getNumOfExams(ClassModel classToVerify) {
        String numOfExamsTxt = "0";

        int numOfExamsInt = classToVerify.getExamList().size() + classToVerify.getFinishedExams().size();

        numOfExamsTxt = String.valueOf(numOfExamsInt);

        return numOfExamsTxt;
    }

    public String getClassTeacherName(ClassModel classToVerify) {
        return classToVerify.getTeacher().getName();
    }

    public String getClassSubject(ClassModel classToVerify) {
        return classToVerify.getSubject();
    }

    public String getTotalAverangeTxt(StudentModel student, ClassModel classModel) {
        String totalAverangeTxt = "";
        float sumGrades = 0;
        float totalAverange = 0;

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classModel.getName())) {
                sumGrades += student.getExamsScoresArray().get(i);
            }
        }

        totalAverange = sumGrades / classModel.getTotalOfExams();
        DecimalFormat formatter = new DecimalFormat("#.#");
        totalAverangeTxt = String.valueOf(formatter.format(totalAverange));
        return totalAverangeTxt;
    }

    public Float getTotalAverangeFloat(StudentModel student, ClassModel classModel) {
        float sumGrades = 0;
        float totalAverange = 0;

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classModel.getName())) {
                sumGrades += student.getExamsScoresArray().get(i);
            }
        }

        totalAverange = sumGrades / classModel.getTotalOfExams();
        return totalAverange;
    }

    public String getClassAverange(ClassModel classModel) {
        float sumGrades = 0;
        float totalClassAverange = 0;
        String totalClassAverangeTxt = "";

        for (int i = 0; i < classModel.getStudentsList().size(); i++) {
            for (int j = 0; j < classModel.getStudentsList().get(i).getStudentExams().size(); j++) {

                if (classModel.getStudentsList().get(i).getStudentExams().get(j).getClassCorresponding().getName().equals(classModel.getName())) {
                    sumGrades += classModel.getStudentsList().get(i).getExamsScoresArray().get(j);
                }

            }
        }

        DecimalFormat formatter = new DecimalFormat("0.0");
        totalClassAverange = sumGrades / classModel.getFinishedExams().size();
        totalClassAverangeTxt = String.valueOf(formatter.format(totalClassAverange));

        return totalClassAverangeTxt;
    }

    public String getNumberOfRightAnswers(ExamModel exam, StudentModel student) {
        String numberOfRightAnswers = "";
        for (int i = 0; i < student.getStudentExams().size(); i++) {

            if (exam.getId() == student.getStudentExams().get(i).getId()) {
                if (exam.getCorrectedStatus()) {
                    numberOfRightAnswers = String.valueOf(student.getNumberOfRightAnwsArray().get(i));
                } else {
                    numberOfRightAnswers = "NoC";
                }
            }

        }

        return numberOfRightAnswers;
    }

    public String getNumberOfWrongAnswers(ExamModel exam, StudentModel student) {
        String numberOfWrongAnswers = "0";
        int numOfWrongAnswersInt = 0;

        if (exam.getCorrectedStatus()) {
            for (int i = 0; i < student.getStudentExams().size(); i++) {
                if (exam.getId() == student.getStudentExams().get(i).getId()) {
                    numOfWrongAnswersInt = exam.getNumOfQuestions() - student.getNumberOfRightAnwsArray().get(i);
                }
            }
        } else {
            numberOfWrongAnswers = "NoC";
        }

        numberOfWrongAnswers = String.valueOf(numOfWrongAnswersInt);
        return numberOfWrongAnswers;
    }

    public String getTotalSquore(ExamModel exam, StudentModel student) {
        String totalSquoreTxt = "0";

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (exam.getId() == student.getStudentExams().get(i).getId()) {
                totalSquoreTxt = String.valueOf(student.getExamsScoresArray().get(i));
            }
        }

        return totalSquoreTxt;
    }
    //====> DashBoard information getters ends here

    //====> Calculate grades forms starts here
    @Override
    public float normalAverangeCalc(StudentModel student, ClassModel classToCalc) {
        float averange;
        try {
            int sumOfGrades = 0;

            for (int i = 0; i < student.getStudentExams().size(); i++) {
                if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classToCalc.getName())) {
                    sumOfGrades += student.getExamsScoresArray().get(i);
                }
            }

            averange = sumOfGrades / student.getStudentExams().size();

        } catch (ArithmeticException e) {
            averange = 0;
        }
        return averange;
    }

    @Override
    public float weightedAverangeCalc(StudentModel student, ClassModel classToCalc) {
        float sumOfGrades = 0;
        float sumOfWeight = 0;
        float averange;

        try {
            for (int i = 0; i < student.getStudentExams().size(); i++) {
                if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classToCalc.getName())) {

                    sumOfGrades += student.getExamsScoresArray().get(i) * student.getStudentExams().get(i).getWeight();
                    sumOfWeight += student.getStudentExams().get(i).getWeight();
                }
            }

            averange = sumOfGrades / sumOfWeight;
        } catch (ArithmeticException e) {
            averange = 0;
        }

        return averange;
    }
    //====> Calculate grades forms ends here

    //====> Serialization methods starts here
    public static void serializeUser() {

        String fileName = "usersDB.ser";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(Main.controller.usersDB);
            out.close();
            file.close();

            System.out.println("Server msg: "
                    + "\n\t Serialization finished successfully");

        } catch (Exception e) {
            Main.controller.window.showErrorMsg("There was an error while saving your data in our system! Please, try again later!");
        }

    }

    public static void deserializeUserDB() {
        ArrayList<UserModel> usersRecovered = null;
        String fileName = "usersDB.ser";

        try {
            FileInputStream file = new FileInputStream(fileName);

            ObjectInputStream in = new ObjectInputStream(file);
            usersRecovered = (ArrayList<UserModel>) in.readObject();
            Main.controller.usersDB.addAll(usersRecovered);
            System.out.println("Server msg: "
                    + "\n\t Desserialization finished successfully");

        } catch (Exception e) {
            String msg = """
                         We are sorry!
                         "There was an error while recovering the data from our system! Please, try again later!"
                         """;
            Main.controller.window.showErrorMsg(msg + "\nError: " + e.getMessage());

        }

    }
    //====> Serialization methods ends here
}
