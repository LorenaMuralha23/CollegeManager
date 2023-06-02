package Model;

import java.util.ArrayList;

public abstract class UserModel {

    protected String firstName;
    protected String userName;
    protected String emailAddress;
    protected String password;
    protected int id;
    protected int userType;
    
    protected ArrayList<ClassModel> finishedClasses;

    public UserModel(String firstName, String userName, String emailAddress, String password, int idRegistration, int userType) {
        this.firstName = firstName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.id = idRegistration;
        this.userType = userType;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdRegistration() {
        return id;
    }

    public void setIdRegistration(int idRegistration) {
        this.id = idRegistration;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "\nFirst Name: " + firstName + "\nUser Name: " + userName + "\nEmail Address:" + emailAddress 
                + "\nPassword: " + password + "\nId: " + id + "\nUser Type: " + userType + "\nFinished Classes: " + finishedClasses + "\n" + '}';
    }
    
    
    
}
