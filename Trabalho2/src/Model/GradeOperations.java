package Model;

public interface GradeOperations {
    
    public float calcExamGrade(int numRightAnswers, ExamModel exam);
    public void normalAverangeCalc(StudentModel student);
    public void weightedAverangeCalc(StudentModel student);
    
}
