public class Student {
    private String studentNumber;
    private String degree;
    private int yearLevel;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;
    private double finalTermGrade;

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void calculateFinalTermGrade() {
        finalTermGrade = (prelimGrade + midtermGrade + (2 * finalGrade)) / 4.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", degree='" + degree + '\'' +
                ", yearLevel=" + yearLevel +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", prelimGrade=" + prelimGrade +
                ", midtermGrade=" + midtermGrade +
                ", finalGrade=" + finalGrade +
                ", finalTermGrade=" + finalTermGrade +
                '}';
    }
}
