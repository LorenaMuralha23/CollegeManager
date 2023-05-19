package Model;

public class ExamModel {
    
    private int id;
    private int numOfQuestions;
    private int totalValue;
    private int weightOfQuestion;
    
    private float valueOfQuestion;
    
    private TeacherModel teacher;
    
    private String subject;
    private String warningForStudents;
    
    private boolean isFinished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfQuestions() {
        return numOfQuestions;
    }

    public void setNumOfQuestions(int numOfQuestions) {
        this.numOfQuestions = numOfQuestions;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getWeightOfQuestion() {
        return weightOfQuestion;
    }

    public void setWeightOfQuestion(int weightOfQuestion) {
        this.weightOfQuestion = weightOfQuestion;
    }

    public float getValueOfQuestion() {
        return valueOfQuestion;
    }

    public void setValueOfQuestion(float valueOfQuestion) {
        this.valueOfQuestion = valueOfQuestion;
    }

    public TeacherModel getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherModel teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWarningForStudents() {
        return warningForStudents;
    }

    public void setWarningForStudents(String warningForStudents) {
        this.warningForStudents = warningForStudents;
    }

    public boolean isIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    
    
}
