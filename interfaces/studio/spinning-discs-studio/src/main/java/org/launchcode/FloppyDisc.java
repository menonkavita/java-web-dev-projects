package org.launchcode;

public class FloppyDisc extends DataDisc implements OpticalDisc{
    private double discSize;

    public FloppyDisc(String ID, String name, String discType) {
        super(ID, name, discType, 0);
    }

    public FloppyDisc(String ID, String name, String discType, int discCapacity, double discSize) {
        super(ID, name, discType, discCapacity);
        this.discSize = discSize;
    }

    public double getDiscSize() {
        return discSize;
    }

    public void setDiscSize(float discSize) {
        this.discSize = discSize;
    }

    // getFileNames() used to calculate disc space yet
    // returns number of files; disc space will be calculated separately for CDs & DVDs in  their classes.
    // CD - 5 MB, DVD - 10 MB size
    public double calculateFloppyDiscSpaceUsed(){
        System.out.println("Floppies spin moderately.");
        return super.getFileNames().size() * 2;
    }

    @Override
    public void spinSpeed() {
        System.out.println("Floppy Discs rotate at 300 RPM, or about five revolutions per second");
    }

    @Override
    public String toString() {
        String n = "\n";

        return "Name: " + super.getName() + n +
                "Disc Type: " + super.getDiscType() + n +
                "Floppy Disc Size is : " + discSize + n +
                "Max Disc Capacity: " + super.getDiscCapacity()  + " MB" + n +
                "Space available in CD: " + String.valueOf(super.getDiscCapacity() - calculateFloppyDiscSpaceUsed()) + " MB";

    }
}
