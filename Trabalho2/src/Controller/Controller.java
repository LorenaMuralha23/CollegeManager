package Controller;

import Model.ClassModel;
import Model.EmailValidationModel;
import Model.ExamModel;
import Model.ExceptionModel;
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
import View.MsgStudentView;
import View.RecordGradeView;
import View.ScheduleExamView;
import View.StudentStcDashboardView;
import View.StudentsDashboardView;
import View.TeacherDashboardView;
import java.awt.BorderLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Controller {

    public MainFrame window = new MainFrame();

    //User's panel
    public LoginView loginPanel;
    public CreateAccountView crtAccountPanel;

    //Teacher's panels
    public TeacherDashboardView teacherDashboardPanel;
    public CreateClassView crtClassPanel;
    public ScheduleExamView scheduleExamPanel;
    public RecordGradeView recordGradePanel;
    public ClassDetailsView classDetailsPanel;
    public StudentStcDashboardView studentStcDashboardView;

    //Students panels
    public StudentsDashboardView studentsDashboardPanel;
    public MsgStudentView msgStudentViewPanel;
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

        //======> user test starts here
        TeacherModel teacherTest = new TeacherModel("Lorena", "lorena23", "lorena@gmail.com", "2301", 34);
        TeacherModel teacherTest2 = new TeacherModel("Erasmo", "Erluis23", "erasmo@gmail.com", "0512", 36);
        StudentModel studentTest = new StudentModel("cMiguel", "cMiguel29", "miguel@gmail.com", "2909", 45);
        StudentModel studentTest2 = new StudentModel("Rose", "rose28", "rose@gmail.com", "2811", 48);
        StudentModel studentTest3 = new StudentModel("Lu", "lu19", "lu@gmail.com", "1906", 46);
        StudentModel studentTest4 = new StudentModel("Arthur", "art26", "arthut@gmail.com", "2612", 63);
        StudentModel studentTest5 = new StudentModel("Fefe", "felson13", "fefe@gmail.com", "1301", 47);
        StudentModel studentTest6 = new StudentModel("Alice", "machadao01", "alice@gmail.com", "0106", 52);
        ExamModel exam1 = new ExamModel("Exam 1", 1, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 20));
        ExamModel exam2 = new ExamModel("Exam 2", 2, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 21));
        ExamModel exam3 = new ExamModel("Exam 3", 3, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 22));
        ExamModel exam4 = new ExamModel("Exam 4", 4, 5, 0, 2, teacherTest, "Programacao", "", LocalDate.of(2023, 06, 23));
        usersDB.add(teacherTest);
        usersDB.add(teacherTest2);
        usersDB.add(studentTest);
        usersDB.add(studentTest2);
        usersDB.add(studentTest3);
        ClassModel class1 = new ClassModel("Desenvolvimento Android", "Programacao", teacherTest, 6, 1);
        ClassModel class2 = new ClassModel("Desenvolvimento WEB", "Programacao", teacherTest, 6, 2);
        ClassModel class3 = new ClassModel("Design WEB", "Programacao", teacherTest2, 6, 2);
        ClassModel class4 = new ClassModel("Desing UX", "Programacao", teacherTest2, 6, 1);
        teacherTest.setClasses(class1);
        teacherTest.setClasses(class2);
        teacherTest2.setClasses(class3);
        teacherTest2.setClasses(class4);
        class1.setExamToList(exam1);
        class1.setExamToList(exam2);
        class1.setExamToList(exam3);
        class1.setExamToList(exam4);
        class1.getStudentsList().add(studentTest);
        class1.getStudentsList().add(studentTest2);
        class1.getStudentsList().add(studentTest3);
        class1.getStudentsList().add(studentTest4);
        class1.getStudentsList().add(studentTest5);
        class1.getStudentsList().add(studentTest6);
        //======> user test finishes here
        loginPanel = new LoginView();
        showScreen(loginPanel);

        window.setVisible(true);

    }

    public void showScreen(JPanel newPanel) {
        this.window.getContentPane().removeAll();
        this.window.add(newPanel, BorderLayout.CENTER);
        this.window.pack();
    }

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
                        throw new ExceptionModel("We couldn't find an account associated with this email address!");
                    }

                } else {
                    //invalid email address
                    throw new ExceptionModel("Invalid email address");
                }

            } else {
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
                                user = new TeacherModel(firstName, userName, emailAddress, password, usersDB.size() + 1);
                            } else {
                                //User type -> Student
                                user = new StudentModel(firstName, userName, emailAddress, password, usersDB.size() + 1);
                            }

                            if (addUserDB(user)) {
                                window.showSucessfullMsg("Congrats! Your account was create successfully! Log in and enjoy!");
                                showUsersDB();
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

    //====> Teacher's methods
    public void createClass(String className, String subject, int totalOfExams, float minAvrgOfApp, int calcType) {

        try {
            if (!className.equals("") && !subject.equals("") && calcType != 0 && minAvrgOfApp != 0) {

                if (!existsClassByName(className)) {
                    if (totalOfExams >= 0) {

                        ClassModel newClass = new ClassModel(className, subject, userLogged, minAvrgOfApp, calcType);

                        if (addClassesToUser(newClass)) {
                            window.showSucessfullMsg("Success! Your new class is now avaliable!");
                            crtClassPanel.cleanFields();
                        }

                        showClasses();
                    } else {
                        throw new ExceptionModel("You can't set negative numbers as total of Exams!");
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

                if (!existExam(classAux, name)) {
                    if (userLogged instanceof TeacherModel userAux) {
                        ExamModel newExam = new ExamModel(name, classAux.getExamList().size() + 1, numOfQstns, weightOfExam, valueOfEachQst, userAux, classAux.getSubject(), warnForStudents, date);
                        if (addExamToList(newExam, classAux)) {
                            scheduleExamPanel.cleanFields();
                            
                        }
                    }
                } else {
                    throw new ExceptionModel("A exam with the same name already exists!");
                }

            } else {
                throw new ExceptionModel("Complete the fields to continue");
            }
        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

    }

    public void fillStudentsTable(DefaultTableModel model, ClassModel classToVerify, ExamModel examSelected) {
        //remove all row to update everything
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }

        this.modelStudentsTable = model;

        if (!classToVerify.getStudentsList().isEmpty()) {
            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                this.modelStudentsTable.insertRow(i, new Object[]{classToVerify.getStudentsList().get(i).getName()});
            }
        }

    }

    public void fillRecordGradeTable(DefaultTableModel model, ClassModel classToVerify) {
        modelRecordGradeTable = model;
        Object[] rowData = new Object[3];

        if (!classToVerify.getFinishedExams().isEmpty()) {
            if (model.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); i++) {
                    model.removeRow(i);
                }
            }

            for (int i = 0; i < classToVerify.getStudentsList().size(); i++) {
                rowData[0] = classToVerify.getStudentsList().get(i).getName();
                for (int j = 0; j < 10; j++) {
                    
                }
                rowData[2] = "No grade register";
                modelRecordGradeTable.addRow(rowData);
            }
        }

    }

    public boolean verifyGradeChange(DefaultTableModel model, ClassModel classToVerify, ArrayList<Float> inicialValues) {
        boolean keepChanges = false;
        modelRecordGradeTable = model;

        return keepChanges;
    }

    public void recordGrades(DefaultTableModel model, ClassModel classToUpdate, String examName) {
        System.out.println("Nome para procurar: " + examName);
        int indexOfExam = classToUpdate.getExamList().indexOf(findExamByName(classToUpdate, examName));
        System.out.println("Index do exame: " + indexOfExam);
        try {
            for (int i = 0; i < classToUpdate.getStudentsList().size(); i++) {

            }
            showStudentGrade(classToUpdate);
        } catch (NumberFormatException e) {
            window.showErrorMsg("Grades need to be a numeric value!");
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
                        classToVerify.getFinishedExams().add(ex);
                        ex.setIsFinished(true);
                        window.showConfirmMsg("The exam " + examToFinish.getName() + "was successfully finished!");
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

    //====> Student methods
    public void joinClass(String className) {

        ClassModel classAux = findClassByName(className);

        try {

            if (userLogged instanceof StudentModel) {
                System.out.println("Userlogged name: " + userLogged.getName());
                StudentModel userAux = (StudentModel) userLogged;

                if (!existsStudentInClass(userAux, classAux)) {

                    classAux.getStudentsList().add(userAux);
                    if (!classAux.getExamList().isEmpty()) {
                        for (int i = 0; i < classAux.getExamList().size(); i++) {
                            userAux.getExamsGrades().add(0f);
                        }
                    }
                    window.showSucessfullMsg("Congratulations! You joined this class!");
                    showStudentsInTheClass(classAux);

                } else {
                    throw new ExceptionModel("You are in this class already!");
                }

            }

        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

    }

    //====> "Data Base" methods
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
                            System.out.println("Achei a classe!");
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
                System.out.println("Quantidade de classes: " + userAux.getClasses().size());
            }

            showClasses();

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
        ExamModel examFinded = null;
        try {
            for (int i = 0; i < classToSearch.getFinishedExams().size(); i++) {
                if (classToSearch.getFinishedExams().get(i).getName().equals(examName)) {
                    examFinded = classToSearch.getFinishedExams().get(i);
                }
            }
            if(examFinded == null){
                throw new ExceptionModel("There isn't any  exam with this info in this class!");
            }
        } catch (ExceptionModel e) {
            window.showErrorMsg(e.getMessage());
        }

        return examFinded;
    }

    public boolean addExamToList(ExamModel newExam, ClassModel classToAdd) {
        boolean isSuceed = false;
        try {
            if (userLogged instanceof TeacherModel) {
                classToAdd.setExamToList(newExam);
                isSuceed = true;
                Main.controller.window.showSucessfullMsg("Your ne exam is schedule to " + newExam.getDate() + "!");
                
                if(!classToAdd.getStudentsList().isEmpty()){
                    for (int i = 0; i < classToAdd.getStudentsList().size(); i++) {
                        classToAdd.getStudentsList().get(i).setExamGrade(0f);
                    }
                }
                
            }
        } catch (Exception e) {
            Main.controller.window.showErrorMsg("An error ocurred while scheduling your new exam! Please, try again later!");
        }
        return isSuceed;
    }

    public void logOut() {
        userLogged = null;
        showScreen(loginPanel);
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
            for (int j = 0; j < classModel.getStudentsList().get(i).getExamsGrades().size(); j++) {
                System.out.println(classModel.getStudentsList().get(i).getExamsGrades().get(i) + ", ");
            }
            System.out.println("}");
        }
    }
}
