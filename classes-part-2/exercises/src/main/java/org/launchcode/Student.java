package org.launchcode;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits
        if(credits <= 29){
            return "Freshman";
        } else if (credits <=59) {
            return "Sophomore";
        }
        else if(credits <= 89){
            return "Junior";
        }
        else{
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // Formula to calculate GPA
        // Calculate their current total quality score by using the formula gpa * numberOfCredits.
        // total quality score divided by total credits.
        double calculateTotalGPA = this.numberOfCredits * this.gpa;
        calculateTotalGPA += grade * (double) courseCredits;

        this.numberOfCredits += courseCredits;
        this.gpa = calculateTotalGPA / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    public String toString(){
        String studReport = String.format("%s with Student ID: %s has %d credits and a GPA of %.2f", this.name, this.studentId, this.numberOfCredits, this.gpa);
        return studReport;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    // The two objects to compare are the same object (identical).
    // Two objects are identical if they both point to the same memory address. In essence, they are the same object.
    // If object1 and object2 are identical, then changing one property value in object1 also changes that value for object2.
    public boolean equals(Object toBeCompared){
        System.out.println("equals()");

        if(toBeCompared == this){
            return true;
        }

        // Check if toBeCompared is null.
        if(toBeCompared == null){
            return false;
        }

        // Check if object passed as parameter is a Student class object.
        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student ben = new Student("Benjamin");

        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        ben.addGrade(12, 3.95);
        System.out.println(ben);
        ben.addGrade(27, 3.8);
        System.out.println(ben);

        System.out.println("Is student Sally same as student Ben? ");
        System.out.println(sally == ben);

        System.out.println("Do students Sally & Ben have same student IDs? ");
        System.out.println(sally.getStudentId() == ben.getStudentId());
    }
}