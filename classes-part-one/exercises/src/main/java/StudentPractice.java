public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student stud1 = new Student("Jake", 12345, 1, 4.0);
        System.out.println("\nStudent details: \n");
        System.out.println("Name: " + stud1.getName());
        System.out.println("ID: " + stud1.getStudentId());
        System.out.println("Current Credits: " + stud1.getNumberOfCredits());
        System.out.println("GPA: " + stud1.getGpa());

        stud1.setName("Jake Barrett");
        stud1.setGpa(4.25);
        System.out.println("\nUpdated Name: " + stud1.getName());
        System.out.println("ID: " + stud1.getStudentId());
        System.out.println("Current Credits: " + stud1.getNumberOfCredits());
        System.out.println("Updated GPA: " + stud1.getGpa());

        Student stud2 = new Student("Josey", 23451, 1, 3.5);
        System.out.println("\nName: " + stud2.getName());
        stud2.setName("Josey Sweets");
        System.out.println("Updated Name: " + stud2.getName());
        System.out.println("ID: " + stud2.getStudentId());
        System.out.println("Current Credits: " + stud2.getNumberOfCredits());
        System.out.println("GPA: " + stud2.getGpa());
        stud2.setGpa(3.65);
        System.out.println("Updated GPA: " + stud2.getGpa());

        Student stud3 = new Student("Blake", 32451, 1, 3.25);
        System.out.println("\nName: " + stud3.getName());
        System.out.println("ID: " + stud3.getStudentId());
        System.out.println("Current Credits: " + stud3.getNumberOfCredits());
        System.out.println("GPA: " + stud3.getGpa());

    }
}
