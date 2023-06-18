package Model;

import View.MainFrame;
import java.util.ArrayList;

public class TeacherModel extends UserModel {

    public ArrayList<ClassModel> classes;
    public ArrayList<ClassModel> classesFinished;

    
    public TeacherModel(String firstName, String userName, String emailAddress, String password, long id) {
        super(firstName, userName, emailAddress, password, id, 1);
        classes = new ArrayList<>();
    }

    public ArrayList<ClassModel> getClasses() {
        return classes;
    }

    public void setClasses(ClassModel newClass) {
        classes.add(newClass);
    }
    
}
