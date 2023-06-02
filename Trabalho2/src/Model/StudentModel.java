package Model;

import java.util.ArrayList;

public class StudentModel extends UserModel{
    
    private ArrayList<ClassModel> classesList;
    
    private MessageModel teacherMsg;
    
    private float averange;
    private ArrayList<Float> examsGrades;
    
    public StudentModel(String firstName, String userName, String emailAddress, String password) {
        super(firstName, userName, emailAddress, password, 45678 , 2);
    }
    
    public ArrayList<ClassModel> getClassesList() {
        return classesList;
    }

    public void setClassesList(ArrayList<ClassModel> classesList) {
        this.classesList = classesList;
    }

    public MessageModel getTeacherMsg() {
        return teacherMsg;
    }

    public void setTeacherMsg(MessageModel teacherMsg) {
        this.teacherMsg = teacherMsg;
    }

    public float getAverange() {
        return averange;
    }

    public void setAverange(float averange) {
        this.averange = averange;
    }

    public float getExamGrade(int index) {
        return examsGrades.get(index);
    }

    public void setExamGrade(ArrayList<Float> examsGrades) {
        this.examsGrades = examsGrades;
    }

    public ArrayList<Float> getExamsGrades() {
        return examsGrades;
    }

    public void setExamsGrades(ArrayList<Float> examsGrades) {
        this.examsGrades = examsGrades;
    }
    
    
    
    
    
}
