package Model;

import java.util.ArrayList;

public class StudentModel extends UserModel {

    private ArrayList<ClassModel> classesList;

    private float averange;
    private ArrayList<ExamModel> exams;
    private ArrayList<Integer> numberOfRightAnws;
    private ArrayList<Float> examsScores;

    public StudentModel(String firstName, String userName, String emailAddress, String password, long id) {
        super(firstName, userName, emailAddress, password, id, 2);
        classesList = new ArrayList<>();
        exams = new ArrayList<>();
        numberOfRightAnws = new ArrayList<>();
        examsScores = new ArrayList<>();
    }

    public ArrayList<ClassModel> getClassesList() {
        return classesList;
    }

    public void setClassesList(ArrayList<ClassModel> classesList) {
        this.classesList = classesList;
    }

    public float getAverange() {
        return averange;
    }

    public void setAverange(float averange) {
        this.averange = averange;
    }

    public ExamModel getExam(int index) {
        return exams.get(index);
    }

    public ArrayList<ExamModel> getStudentExams() {
        return exams;
    }

    public ArrayList<Integer> getNumberOfRightAnwsArray() {
        return numberOfRightAnws;
    }

    public void setNumOfRightAnwr(int index, int num) {
        this.numberOfRightAnws.add(index, num);
    }

    public ArrayList<Float> getExamsScoresArray() {
        return examsScores;
    }

    public void setExamsScores(int index, float score) {
        this.examsScores.add(index, score);
    }

}
