package Model;

import java.util.ArrayList;

public class StudentModel extends UserModel{
    
    private ArrayList<ClassModel> classesList;
    
    private MessageModel teacherMsg;
    
    private float totalGrade;
    private ArrayList<Float> examsGrades;

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

    public float getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(float totalGrade) {
        this.totalGrade = totalGrade;
    }

    public ArrayList<Float> getExamsGrades() {
        return examsGrades;
    }

    public void setExamsGrades(ArrayList<Float> examsGrades) {
        this.examsGrades = examsGrades;
    }

    
    
    
}
