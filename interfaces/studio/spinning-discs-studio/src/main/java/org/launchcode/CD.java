package org.launchcode;

public class CD extends DataDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private boolean isMusicCD;


    public CD(String ID, String name, String discType, int discCapacity) {
        super(ID, name, discType, discCapacity);
    }

    public CD(String ID, String name, String discType, int discCapacity, boolean isMusicCD) {
        super(ID, name, discType, discCapacity);
        this.isMusicCD = isMusicCD;
    }


    // getFileNames() used to calculate disc space yet
    // returns number of files; disc space will be calculated separately for CDs & DVDs in  their classes.
    // CD - 5 MB, DVD - 10 MB size
    public double calculateCDSpaceUsed(){
        return super.getFileNames().size() * 5;
    }

    public String toString(){
        String n = "\n";

        return "Name: " + super.getName() + n +
                "Disc Type: " + super.getDiscType() + n +
                "Is a Music CD? " + String.valueOf(isMusicCD ? "yes" : "no") + n +
                "Max Disc Capacity: " + super.getDiscCapacity()  + " MB" + n +
                "Space available in CD: " + String.valueOf(super.getDiscCapacity() - calculateCDSpaceUsed()) + " MB";
    }


//    Deleted Method from Interface OpticalDisc that needed to be implemented earlier
//    @Override
//    public void runFile() {
//        System.out.println("Running the CD to display the files ... ");
//    }


    @Override
    public void spinSpeed() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }
}
