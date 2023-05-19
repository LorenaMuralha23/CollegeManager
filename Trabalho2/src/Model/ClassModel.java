package Model;

import java.util.ArrayList;

public class ClassModel {
    
    private String name;
    private String subject;
    
    private TeacherModel teacher;
    
    private ArrayList<StudentModel> studentsList;
    private ArrayList<ExamModel> examList;
   
    private float totalAverange;
    private float minimumrAverange;

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

    public TeacherModel getTeacher() {
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

    public void setExamList(ArrayList<ExamModel> examList) {
        this.examList = examList;
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
    
    
}
