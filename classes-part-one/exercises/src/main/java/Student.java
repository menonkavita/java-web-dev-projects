public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public void setName(String name){
                this.name=name;
        }

        public void setStudentId(int studentId){
                this.studentId=studentId;
        }

        public void setNumberOfCredits(int credits){
                this.numberOfCredits=credits;
        }

        public void setGpa(double gpa){
                this.gpa=gpa;
        }

        public String getName(){
                return name;
        }

        public int getStudentId(){
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa(){
                return gpa;
        }

        public Student(String name, int id, int credits, double gpa){
                this.name=name;
                this.studentId=id;
                this.numberOfCredits=credits;
                this.gpa=gpa;
        }

}
