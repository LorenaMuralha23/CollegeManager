package Model;

import View.MainFrame;
import java.util.ArrayList;

public class TeacherModel extends UserModel implements GradeOperations {

    public ArrayList<ClassModel> classes;
    public ArrayList<ClassModel> classesFinished;
    private int calcType;

    public TeacherModel(String firstName, String userName, String emailAddress, String password) {
        super(firstName, userName, emailAddress, password, 82938, 1);
        classes = new ArrayList<>();
    }

    public ArrayList<ClassModel> getClasses() {
        return classes;
    }

    public void setClasses(ClassModel newClass) {
        classes.add(newClass);
    }

    public int getCalcType() {
        return calcType;
    }

    public void setCalcType(int calcType) {
        this.calcType = calcType;
    }

    @Override
    public float calcExamGrade(int numRightAnswers, ExamModel exam) {
        return numRightAnswers * exam.getValueOfEachQuestion();
    }

    @Override
    public void normalAverangeCalc(StudentModel student) {
        int sumOfGrades = 0;

        try {
            if (!classesFinished.isEmpty()) {

                for (int i = 0; i < classesFinished.size(); i++) {
                    if (!student.getExamsGrades().isEmpty()) {
                        for (int j = 0; j < student.getExamsGrades().size(); j++) {
                            sumOfGrades += student.getExamGrade(j);
                        }
                    }
                }

                float averange = sumOfGrades / student.getExamsGrades().size();
                student.setAverange(averange);

            } else {
                throw new ExceptionModel("Error: There no exam grade for this student!");
            }
        } catch (ExceptionModel e) {
            Main.controller.window.showErrorMsg(e.getMessage());
        }

    }

    @Override
    public void weightedAverangeCalc(StudentModel student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
