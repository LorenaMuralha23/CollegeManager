package Model;

import java.util.ArrayList;

public class TeacherModel extends UserModel{
    
    private ArrayList<ClassModel> classes;
    private int calcType;

    public ArrayList<ClassModel> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassModel> classes) {
        this.classes = classes;
    }

    public int getCalcType() {
        return calcType;
    }

    public void setCalcType(int calcType) {
        this.calcType = calcType;
    }
    
}
