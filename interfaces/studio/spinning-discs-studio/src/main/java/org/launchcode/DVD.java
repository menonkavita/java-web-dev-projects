package org.launchcode;

public class DVD extends DataDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public DVD(String ID, String name, String discType, int discCapacity) {
        super(ID, name, discType, discCapacity);
    }


    // getFileNames() used to calculate disc space yet
    // returns number of files; disc space will be calculated separately for CDs & DVDs in  their classes.
    // CD - 5 MB, DVD - 10 MB size
    public double calculateDVDSpaceUsed(){
        return super.getFileNames().size() * 10;
    }

    @Override
    public String toString() {
        String n = "\n";

        return "Name: " + super.getName() + n +
                "Disc Type: " + super.getDiscType() + n +
                "Max Disc Capacity: " + super.getDiscCapacity() + " MB" + n +
                "Space available in CD: " + String.valueOf(super.getDiscCapacity() - calculateDVDSpaceUsed()) + " MB";
    }

    @Override
    public String spinDisc() {
        return OpticalDisc.super.spinDisc();
    }

    @Override
    public void spinSpeed() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }


//    Deleted Method from Interface OpticalDisc that needed to be implemented earlier
//    @Override
//    public void runFile() {
//        System.out.println("\n\nRunning the DVD to display the files ... ");
//    }

}
