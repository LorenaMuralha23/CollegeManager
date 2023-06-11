package Model;

import View.MsgStudentView;
import java.util.ArrayList;

public class StudentModel extends UserModel {

    private ArrayList<ClassModel> classesList;

    private MessageModel teacherMsg;
    private ArrayList<MessageModel> msgsReceived = new ArrayList<>();
    private int lastNumMsg;

    private float averange;
    private ArrayList<Float> examsGrades;

    public StudentModel(String firstName, String userName, String emailAddress, String password, int id) {
        super(firstName, userName, emailAddress, password, id, 2);
        classesList = new ArrayList<>();
        msgsReceived = new ArrayList<>();
        examsGrades = new ArrayList<>();
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

    public void setExamGrade(float newGrade) {
        this.examsGrades.add(newGrade);
    }

    public ArrayList<Float> getExamsGrades() {
        return examsGrades;
    }

    public void setExamsGrades(ArrayList<Float> examsGrades) {
        this.examsGrades = examsGrades;
    }

    @Override
    public String toString() {
        return "StudentModel{" + "\nNome: " + super.firstName + "\nTeacher Msg: " + teacherMsg + "\nMsg Received: " + msgsReceived + "\nLast Num Msg: " + lastNumMsg
                + "\nId: " + id + "\nAverange: " + averange + "\nExams Grades: " + examsGrades + '}';
    }

}
