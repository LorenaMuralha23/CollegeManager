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
<<<<<<< HEAD
import View.MsgStudentView;
=======
>>>>>>> 374e150 (serialization finished)
import View.RecordGradeView;
import View.ScheduleExamView;
import View.StudentStcDashboardView;
import View.StudentsDashboardView;
import View.TeacherDashboardView;
import java.awt.BorderLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
<<<<<<< HEAD
import java.io.FileOutputStream;
=======
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
>>>>>>> 374e150 (serialization finished)
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

<<<<<<< HEAD
    public ArrayList<Long> ids;
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
    public MsgStudentView msgStudentViewPanel;
=======
>>>>>>> 374e150 (serialization finished)
    public JoinClassView enterClassViewPanel;
    public EmailValidationModel emailValidator;

    //Users DB
    public ArrayList<UserModel> usersDB;
<<<<<<< HEAD

=======
>>>>>>> 374e150 (serialization finished)
    private UserModel userLogged;

    //Models
    DefaultTableModel modelStudentsTable;
    DefaultTableModel modelRecordGradeTable;

    public UserModel getUserLogged() {
        return userLogged;
    }

    public void start() {
        usersDB = new ArrayList<>();
<<<<<<< HEAD
        emailValidator = new EmailValidationModel();
        ids = new ArrayList<>();
        idGenerator = new IdGeneratorModel();

        //======> user test starts here
        TeacherModel teacherTest = new TeacherModel("Lorena", "lorena23", "lorena@gmail.com", "2301", 34);
        TeacherModel teacherTest2 = new TeacherModel("Erasmo", "Erluis23", "erasmo@gmail.com", "0512", 36);
        StudentModel studentTest = new StudentModel("cMiguel", "cMiguel29", "miguel@gmail.com", "2909", 45);
        StudentModel studentTest2 = new StudentModel("Rose", "rose28", "rose@gmail.com", "2811", 48);
        StudentModel studentTest3 = new StudentModel("Lu", "lu19", "lu@gmail.com", "1906", 46);
        StudentModel studentTest4 = new StudentModel("Arthur", "art26", "arthut@gmail.com", "2612", 63);
        StudentModel studentTest5 = new StudentModel("Fefe", "felson13", "fefe@gmail.com", "1301", 47);
        StudentModel studentTest6 = new StudentModel("Alice", "machadao01", "alice@gmail.com", "0106", 52);
        usersDB.add(teacherTest);
        usersDB.add(teacherTest2);
        usersDB.add(studentTest);
        usersDB.add(studentTest2);
        usersDB.add(studentTest3);
        usersDB.add(studentTest4);
        usersDB.add(studentTest5);
        usersDB.add(studentTest6);
        ClassModel class1 = new ClassModel("Desenvolvimento Android", "Programacao", teacherTest, 6, 1, 4);
        ClassModel class2 = new ClassModel("Desenvolvimento Kotlin", "Programacao", teacherTest, 6, 1, 2);
        ExamModel exam1 = new ExamModel("Exam 1", class2, 1, 10, 0, 1, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 20));
        ExamModel exam2 = new ExamModel("Exam 2", class2, 2, 10, 0, 1, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 21));
        ExamModel exam3 = new ExamModel("Exam 3", class1, 3, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 22));
        ExamModel exam4 = new ExamModel("Exam 4", class1, 4, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 23));
        teacherTest.setClasses(class1);
        teacherTest.setClasses(class2);
        class2.setExamToList(exam1);
        class2.setExamToList(exam2);
        class1.setExamToList(exam3);
        class1.setExamToList(exam4);
//        class1.getStudentsList().add(studentTest);
//        class1.getStudentsList().add(studentTest2);
//        class1.getStudentsList().add(studentTest3);
//        class1.getStudentsList().add(studentTest4);
//        class1.getStudentsList().add(studentTest5);
//        class1.getStudentsList().add(studentTest6);
        //======> user test finishes here
        loginPanel = new LoginView();
        showScreen(loginPanel);

        window.setVisible(true);

=======

        emailValidator = new EmailValidationModel();

        idGenerator = new IdGeneratorModel();
        loginPanel = new LoginView();
        showScreen(loginPanel);
        deserializeUserDB();

        window.setVisible(true);
>>>>>>> 374e150 (serialization finished)
    }

    public void showScreen(JPanel newPanel) {
        this.window.getContentPane().removeAll();
        this.window.add(newPanel, BorderLayout.CENTER);
        this.window.pack();
    }
<<<<<<< HEAD

=======
    
    //===> System methods starts here
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
=======
                        loginPanel.cleanFields();
>>>>>>> 374e150 (serialization finished)
                        throw new ExceptionModel("We couldn't find an account associated with this email address!");
                    }

                } else {
                    //invalid email address
<<<<<<< HEAD
=======
                    loginPanel.cleanFields();
>>>>>>> 374e150 (serialization finished)
                    throw new ExceptionModel("Invalid email address");
                }

            } else {
<<<<<<< HEAD
=======
                loginPanel.cleanFields();
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
                                showUsersDB();
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD

=======
    //===> System methods ends here
    
>>>>>>> 374e150 (serialization finished)
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

<<<<<<< HEAD
                        showClasses();
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
                            ids.add(idGenerator.generator());
                            ExamModel newExam = new ExamModel(name, classAux, ids.get(ids.size() - 1), numOfQstns, weightOfExam, valueOfEachQst, userAux, classAux.getSubject(), warnForStudents, date);
=======
                            ExamModel newExam = new ExamModel(name, classAux, idGenerator.generator(), numOfQstns, weightOfExam, valueOfEachQst, userAux, classAux.getSubject(), warnForStudents, date);
>>>>>>> 374e150 (serialization finished)
                            if (addExamToList(newExam, classAux)) {
                                scheduleExamPanel.cleanFields();
                            }
                        }
                    } else {
                        throw new ExceptionModel("A exam with the same name already exists!");
                    }
                } else {
<<<<<<< HEAD
=======
                    this.scheduleExamPanel.cleanFields();
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
        showScores(classToVerify, exam);
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
                        System.out.println("Nome: " + ex.getName());
                        System.out.println("Id: " + ex.getId());
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD

    //====> Student methods
    //testar o metodo show situation pra ver a situacao
=======
    //====> Teacher's methods here
    
    //====> Student's methods starts here
>>>>>>> 374e150 (serialization finished)
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

<<<<<<< HEAD
                    userAux.setClassesSituation("-- In progress --");
                    showSituationInClass(classAux, userAux);
=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD

    //====> "Data Base" methods
=======
    //====> Student's methods ends here
    
    //====> "Data Base" methods starts here
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
                System.out.println("Quantidade de classes: " + userAux.getClasses().size());
            }

            showClasses();

=======
            }

>>>>>>> 374e150 (serialization finished)
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
        userLogged = null;
        showScreen(loginPanel);
<<<<<<< HEAD
=======
        loginPanel.cleanFields();
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
        System.out.println("Id recebido: " + id);
=======
>>>>>>> 374e150 (serialization finished)
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
            if (userLogged instanceof TeacherModel) {
                TeacherModel userAux = (TeacherModel) userLogged;

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
<<<<<<< HEAD

    public void updateStudentState(StudentModel student, ClassModel classToUpdate, String state) {

        for (int i = 0; i < student.getClassesList().size(); i++) {

            if (student.getClassesList().get(i).getName().equals(classToUpdate.getName())) {
                student.setStudentState(i, state);
            }

        }

    }

=======
    //====> "Data Base" methods ends here
    
>>>>>>> 374e150 (serialization finished)
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
                int cont = 0;
                if (classToVerify.getCalcType() == 1) {
                    for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                        float studentAverange = normalAverangeCalc(classToVerify.getStudentsList().get(i), classToVerify);
                        if (studentAverange > classToVerify.getMinimumrAverange()) {
                            //the student is approved :)
                            cont++;
                        }
                    }
                } else {

                    for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                        float studentAverange = weightedAverangeCalc(classToVerify.getStudentsList().get(i), classToVerify);
                        if (studentAverange > classToVerify.getMinimumrAverange()) {
                            //the student is approved :)
                            cont++;
                        }
                    }

                }

                float prctOfApprovement = (100 * cont) / classToVerify.getStudentsList().size();
                DecimalFormat formatter = new DecimalFormat("0.0");
                percetageTxt = formatter.format(prctOfApprovement);
                percetageTxt += "%";
<<<<<<< HEAD

=======
>>>>>>> 374e150 (serialization finished)
            } else {
                //there isn't exams finished. So, any student failure yet
                percetageTxt = "0.0%";
            }
<<<<<<< HEAD

=======
>>>>>>> 374e150 (serialization finished)
        } else {
            //there isn't students in this class
            percetageTxt = "0.0%";
        }
        return percetageTxt;
    }

    public String getPrctOfFailure(ClassModel classToVerify) {
        String percetageTxt = "";

        if (!classToVerify.getFinishedExams().isEmpty()) {
            int cont = 0;
            if (classToVerify.getCalcType() == 1) {
                //normal averange calc
                for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                    float studentAverange = normalAverangeCalc(classToVerify.getStudentsList().get(i), classToVerify);
                    if (studentAverange < classToVerify.getMinimumrAverange()) {
                        //the student is not approved yet
                        cont++;
                    }
                }

            } else {
                //weighted averange calc
                for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                    float studentAverange = weightedAverangeCalc(classToVerify.getStudentsList().get(i), classToVerify);
                    if (studentAverange < classToVerify.getMinimumrAverange()) {
                        //the student is not approved yet
                        cont++;
                    }
                }

            }

            float prctOfApprovement = (100 * cont) / classToVerify.getStudentsList().size();
            DecimalFormat formatter = new DecimalFormat("0.0");
            percetageTxt = formatter.format(prctOfApprovement);
            percetageTxt += "%";

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

    public String getTotalAverange(StudentModel student, ClassModel classModel) {
        String totalAverangeTxt = "";
        float sumGrades = 0;
        float totalAverange = 0;

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classModel.getName())) {
                sumGrades += student.getExamsScoresArray().get(i);
            }
        }

        totalAverange = sumGrades / classModel.getTotalOfExams();
<<<<<<< HEAD
        totalAverangeTxt = String.valueOf(totalAverange);
=======
        DecimalFormat formatter = new DecimalFormat("0.0");
        totalAverangeTxt = String.valueOf(formatter.format(totalAverange));
>>>>>>> 374e150 (serialization finished)

        return totalAverangeTxt;
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
<<<<<<< HEAD
        System.out.println("Soma das notas: " + sumGrades);
        DecimalFormat formatter = new DecimalFormat("0.0");
        totalClassAverange = sumGrades / classModel.getFinishedExams().size();
        System.out.println("Media total da sala: " + totalClassAverange);
=======
        
        DecimalFormat formatter = new DecimalFormat("0.0");
        totalClassAverange = sumGrades / classModel.getFinishedExams().size();
>>>>>>> 374e150 (serialization finished)
        totalClassAverangeTxt = String.valueOf(formatter.format(totalClassAverange));

        return totalClassAverangeTxt;
    }

    public String getNumberOfRightAnswers(ExamModel exam, StudentModel student) {
        String numberOfRightAnswers = "";
        for (int i = 0; i < student.getStudentExams().size(); i++) {

            if (exam.getId() == student.getStudentExams().get(i).getId()) {
                numberOfRightAnswers = String.valueOf(student.getNumberOfRightAnwsArray().get(i));
            }

        }

        return numberOfRightAnswers;
    }

    public String getNumberOfWrongAnswers(ExamModel exam, StudentModel student) {
        String numberOfWrongAnswers = "0";
        int numOfWrongAnswersInt = 0;

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (exam.getId() == student.getStudentExams().get(i).getId()) {
                numOfWrongAnswersInt = exam.getNumOfQuestions() - student.getNumberOfRightAnwsArray().get(i);
            }
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

<<<<<<< HEAD
        System.out.println(totalSquoreTxt);
        return totalSquoreTxt;
    }

    //====> Test Methods
    public void showUsersDB() {
        System.out.println("\nUsers DB updated:");
        for (int i = 0; i < usersDB.size(); i++) {
            System.out.println(usersDB.get(i).toString());
        }
    }

    public void showClasses() {
        System.out.println("\nTeacher's class updated:");
        if (userLogged instanceof TeacherModel) {
            TeacherModel aux = (TeacherModel) userLogged;
            for (int i = 0; i < aux.getClasses().size(); i++) {
                System.out.println(aux.getClasses().get(i).toString());
            }
        }
    }

    public void showExams(ClassModel classToSee) {

        for (int i = 0; i < classToSee.getExamList().size(); i++) {
            System.out.println(classToSee.getExamList().get(i).toString());
        }

    }

    public void showStudentsInTheClass(ClassModel classModel) {
        System.out.println("Students list in class: " + classModel.getName());
        for (int i = 0; i < classModel.getStudentsList().size(); i++) {
            System.out.println(classModel.getStudentsList().get(i));
        }

    }

    public void showStudentGrade(ClassModel classModel) {
        for (int i = 0; i < classModel.getStudentsList().size(); i++) {
            System.out.println("Aluno: " + classModel.getStudentsList().get(i).getName());
            System.out.println("Notas: ");
            System.out.print("{");
            for (int j = 0; j < classModel.getStudentsList().get(i).getStudentExams().size(); j++) {
                System.out.println(classModel.getStudentsList().get(i).getStudentExams().get(i) + ", ");
            }
            System.out.println("}");
        }
    }

    public void showSituationInClass(ClassModel classModel, StudentModel student) {

        for (int i = 0; i < student.getClassesList().size(); i++) {
            if (student.getClassesList().get(i).getName().equals(classModel.getName())) {
                System.out.println("Situacao do aluno " + student.getName() + " na classe " + student.getClassesList().get(i).getName() + ": "
                        + student.getClassesSituation(i));
            }
        }

    }

    public void showScores(ClassModel classToVerify, ExamModel exam) {

        for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {

            for (int j = 0; j < classToVerify.getStudentsList().get(i).getStudentExams().size(); j++) {
                if (classToVerify.getStudentsList().get(i).getStudentExams().get(j).getId() == exam.getId()) {
                    System.out.println("Aluno: " + classToVerify.getStudentsList().get(i).getName());
                    System.out.println("Nota no " + classToVerify.getStudentsList().get(i).getStudentExams().get(j).getName() + ": " + classToVerify.getStudentsList().get(i).getExamsScoresArray().get(j));
                }
            }

        }

    }

    public void showIds(ClassModel classToVerify) {

        for (int i = 0; i < classToVerify.getExamList().size(); i++) {
            System.out.println("Id do(a) " + classToVerify.getExamList().get(i).getName() + ": " + classToVerify.getExamList().get(i).getId());
        }

        for (int i = 0; i < classToVerify.getFinishedExams().size(); i++) {
            System.out.println("Id do(a) " + classToVerify.getFinishedExams().get(i).getName() + ": " + classToVerify.getFinishedExams().get(i).getId());
        }

    }

    @Override
    public float normalAverangeCalc(StudentModel student, ClassModel classToCalc) {
        int sumOfGrades = 0;

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classToCalc.getName())) {
                sumOfGrades += student.getExamsScoresArray().get(i);
            }
        }

        float averange = sumOfGrades / student.getStudentExams().size();

=======
        
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
>>>>>>> 374e150 (serialization finished)
        return averange;
    }

    @Override
    public float weightedAverangeCalc(StudentModel student, ClassModel classToCalc) {
        float sumOfGrades = 0;
        float sumOfWeight = 0;
<<<<<<< HEAD

        for (int i = 0; i < student.getStudentExams().size(); i++) {
            if (student.getStudentExams().get(i).getClassCorresponding().getName().equals(classToCalc.getName())) {

                sumOfGrades += student.getExamsScoresArray().get(i) * student.getStudentExams().get(i).getWeight();
                sumOfWeight += student.getStudentExams().get(i).getWeight();
            }
        }

        float averange = sumOfGrades / sumOfWeight;

        return averange;
    }


=======
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
>>>>>>> 374e150 (serialization finished)
}
