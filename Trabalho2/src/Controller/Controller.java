package Controller;

import Model.ClassModel;
import Model.EmailValidationModel;
import Model.ExceptionModel;
import Model.StudentModel;
import Model.TeacherModel;
import Model.UserModel;
import View.ClassDetailsView;
import View.CreateAccountView;
import View.CreateClassView;
import View.LoginView;
import View.MainFrame;
import View.MsgStudentView;
import View.RecordGradeView;
import View.ScheduleExamView;
import View.StudentsDashboardView;
import View.TeacherDashboardView;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

    //Students panels
    public StudentsDashboardView studentsDashboardPanel;
    public MsgStudentView msgStudentViewPanel;

    public EmailValidationModel emailValidator;

    //Users DB
    public ArrayList<UserModel> usersDB;

    private UserModel userLogged;

    public UserModel getUserLogged() {
        return userLogged;
    }

    public void start() {
        usersDB = new ArrayList<>();
        emailValidator = new EmailValidationModel();

        //======> user test starts here
        UserModel teacherTest = new TeacherModel("Lorena", "lorena23", "lorena@gmail.com", "2301");
        UserModel studentTest = new StudentModel("cMiguel", "cMiguel29", "miguel@gmail.com", "2911");
        usersDB.add(teacherTest);
        usersDB.add(studentTest);
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
                                user = new TeacherModel(firstName, userName, emailAddress, password);
                            } else {
                                //User type -> Student
                                user = new StudentModel(firstName, userName, emailAddress, password);
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
                throw new ExceptionModel("Complete the fields to continue");
            }
        } catch (ExceptionModel e) {
            this.window.showErrorMsg(e.getMessage());
        }

    }

    public void scheduleExam() {

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

}
