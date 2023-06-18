package Model;

<<<<<<< HEAD
import java.time.LocalDate;

public class ExamModel {
=======
import java.io.Serializable;
import java.time.LocalDate;

public class ExamModel implements Serializable{
>>>>>>> 374e150 (serialization finished)

    private ClassModel classCorresponding;
    
    private long id;
    private int numOfQuestions;
    
    private float valueOfEachQuestion;
    private float totalValue;
    private float weight;
    
    
    private TeacherModel teacher;
    
    private String name;
    private String subject;
    private String warningForStudents;

    private boolean isFinished;

    private LocalDate date;
    
    public ExamModel() {
    }
    
    public ExamModel(String name, ClassModel classCorresponding, long id, int numOfQuestions, float weightOfExam, float valueOfEachQuestion, TeacherModel teacher, String subject, String warningForStudents, LocalDate date) {
        this.name = name;
        this.classCorresponding = classCorresponding;
        this.id = id;
        this.numOfQuestions = numOfQuestions;
        this.weight = weightOfExam;
        this.valueOfEachQuestion = valueOfEachQuestion;
        this.teacher = teacher;
        this.subject = subject;
        this.warningForStudents = warningForStudents;
        this.date = date;
        this.totalValue = numOfQuestions*valueOfEachQuestion;
        this.isFinished = false;
    }

    public ClassModel getClassCorresponding() {
        return classCorresponding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumOfQuestions() {
        return numOfQuestions;
    }

    public void setNumOfQuestions(int numOfQuestions) {
        this.numOfQuestions = numOfQuestions;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public float getValueOfEachQuestion() {
        return valueOfEachQuestion;
    }

    public void setValueOfEachQuestion(float valueOfQuestion) {
        this.valueOfEachQuestion = valueOfQuestion;
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

    public boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExamModel{" + "\nId: " + id + "\nNum Of Questions: " + numOfQuestions + "\n Weight Of Exam: " + weight 
                + "\nValue Of Each Question: " + valueOfEachQuestion + "\nTotal Value: " + totalValue + "\nTeacher: " + teacher + "\nSubject: " + subject + "\nWarning For Students: " 
                + warningForStudents + "\nDate: " + date + '}' + "\n";
    }

     
    
}
