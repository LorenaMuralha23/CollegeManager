package Model;

<<<<<<< HEAD
import View.MsgStudentView;
=======
>>>>>>> 374e150 (serialization finished)
import java.util.ArrayList;

public class StudentModel extends UserModel {

    private ArrayList<ClassModel> classesList;
<<<<<<< HEAD
    private ArrayList<String> classesSituation;
    
    
    private MessageModel teacherMsg;
    private ArrayList<MessageModel> msgsReceived = new ArrayList<>();
  
=======
>>>>>>> 374e150 (serialization finished)

    private float averange;
    private ArrayList<ExamModel> exams;
    private ArrayList<Integer> numberOfRightAnws;
    private ArrayList<Float> examsScores;

    public StudentModel(String firstName, String userName, String emailAddress, String password, long id) {
        super(firstName, userName, emailAddress, password, id, 2);
        classesList = new ArrayList<>();
<<<<<<< HEAD
        msgsReceived = new ArrayList<>();
        exams = new ArrayList<>();
        classesSituation = new ArrayList<>();
=======
        exams = new ArrayList<>();
>>>>>>> 374e150 (serialization finished)
        numberOfRightAnws = new ArrayList<>();
        examsScores = new ArrayList<>();
    }

    public ArrayList<ClassModel> getClassesList() {
        return classesList;
    }

    public void setClassesList(ArrayList<ClassModel> classesList) {
        this.classesList = classesList;
    }

<<<<<<< HEAD
    public MessageModel getTeacherMsg() {
        return teacherMsg;
    }

    public void setTeacherMsg(MessageModel teacherMsg) {
        this.teacherMsg = teacherMsg;
    }

=======
>>>>>>> 374e150 (serialization finished)
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

<<<<<<< HEAD
    public String getClassesSituation(int index) {
        System.out.println(classesSituation.get(index));
        return classesSituation.get(index);
    }

    public void setClassesSituation(String situation) {
        this.classesSituation.add(situation);
    }

    public void setStudentState(int index, String state){
        this.classesSituation.add(index, state);
    }

=======
>>>>>>> 374e150 (serialization finished)
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
<<<<<<< HEAD
    
    
    
    @Override
    public String toString() {
        return "StudentModel{" + "\nNome: " + super.firstName + "\nTeacher Msg: " + teacherMsg + "\nMsg Received: " + msgsReceived + "\nLast Num Msg: " 
                + "\nId: " + id + "\nAverange: " + averange + "\nExams Grades: " + exams + '}';
    }
=======
>>>>>>> 374e150 (serialization finished)

}
