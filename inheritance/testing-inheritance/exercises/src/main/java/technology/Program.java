package technology;

public class Program {

    public static void main(String [] args){
        Computer laptopA = new Laptop("Intel Pentium i7", 15, 1);
        Computer smartPhoneA = new SmartPhone("A15 Bionic chip", 1, 3);

        SmartPhone smartOne = new SmartPhone(2, 4, true);

        System.out.println("\nLaptop with ID: " + laptopA.getID() + " has"
                + "\nProcessor: " + laptopA.getProcessor()
                + "\nScreen size: " + laptopA.getScreenSize() + " inches\n");

        System.out.println("Smart Phone with ID: " + smartPhoneA.getID() + " has"
                + "\nProcessor: " + smartPhoneA.getProcessor()
                + "\nNumber of Camera(s): " + ((SmartPhone) smartPhoneA).getNumberOfCamera() + "\n");


        System.out.println("Smart Phone with ID: " + smartOne.getID() + " has"
                + "\nNumber of Camera(s): " + smartOne.getNumberOfCamera()
                + "\nMulti-Sim option available? " + (smartOne.isMultiSim() ? "yes" : "no") + "\n");

    }

}
