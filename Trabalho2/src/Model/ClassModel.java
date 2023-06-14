package Model;

import java.util.ArrayList;

public class ClassModel{
    
    private String name;
    private String subject;
    
    private UserModel teacher;
    
    private ArrayList<StudentModel> studentsList;
    private ArrayList<ExamModel> examList;
    private ArrayList<ExamModel> finishedExams;
   
    private float totalAverange;
    private float minimumrAverange;
    
    private int calcType; //1 -> normal averange // 2 -> weighted averange
    private int totalOfExams;
    
    public ClassModel(String name, String subject, UserModel teacher, float minimumrAverange, int calcType, int totalOfExams) {
        this.name = name;
        this.subject = subject;
        this.teacher = teacher;
        this.minimumrAverange = minimumrAverange;
        this.calcType = calcType;
        this.totalOfExams = totalOfExams;
        examList = new ArrayList<>();
        studentsList = new ArrayList<>();
        finishedExams = new ArrayList<>();
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotalOfExams() {
        return totalOfExams;
    }

    public void setTotalOfExams(int totalOfExams) {
        this.totalOfExams = totalOfExams;
    }
    
    public UserModel getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherModel teacher) {
        this.teacher = teacher;
    }

    public ArrayList<StudentModel> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<StudentModel> studentsList) {
        this.studentsList = studentsList;
    }

    public ArrayList<ExamModel> getExamList() {
        return examList;
    }

    public void setExamToList(ExamModel examToAdd) {
        this.examList.add(examToAdd);
    }

    public float getTotalAverange() {
        return totalAverange;
    }

    public void setTotalAverange(float totalAverange) {
        this.totalAverange = totalAverange;
    }

    public float getMinimumrAverange() {
        return minimumrAverange;
    }

    public void setMinimumrAverange(float minimumrAverange) {
        this.minimumrAverange = minimumrAverange;
    }

    public int getCalcType() {
        return calcType;
    }

    public void setCalcType(int calcType) {
        this.calcType = calcType;
    }

    public ArrayList<ExamModel> getFinishedExams() {
        return finishedExams;
    }

    public void setFinishedExams(ExamModel finishExam) {
        this.finishedExams.add(finishExam);
    }

    
    
    @Override
    public String toString() {
        return "ClassModel{" + "\nName: " + name + "\nSubject: " + subject + "\nTeacher: " + teacher + "\nStudents List: " + studentsList 
                + "\nExam List: " + examList + "\nTotal Averange: " + totalAverange + "\nMinimum Averange: " + minimumrAverange + "\nCalc Type: " + calcType + "\n" + '}';
    }
    
    
    
}
