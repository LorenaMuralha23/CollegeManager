package Model;

import java.util.ArrayList;

public abstract class UserModel {
    
    protected String name;
    protected int idRegistration;
    protected int userType;
    
    protected ArrayList<ClassModel> finishedClasses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(int idRegistration) {
        this.idRegistration = idRegistration;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
    
    
    
}
