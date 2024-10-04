package org.launchcode;

public class LP extends DataDisc implements OpticalDisc {
    private String albumName;
    private float discSize;

    public LP(String ID, String name, String discType) {
        super(ID, name, discType, 30);
        this.albumName = albumName;
    }

    public LP(String ID, String name, String discType, String albumName) {
        super(ID, name, discType, 30);
        this.albumName = albumName;
    }

    public LP(String ID, String name, String discType, String albumName, float discSize) {
        super(ID, name, discType, 30);
        this.albumName = albumName;
        this.discSize = discSize;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public float getDiscSize() {
        return discSize;
    }

    public void setDiscSize(float discSize) {
        this.discSize = discSize;
    }

    // getFileNames() used to calculate disc space yet
    // returns number of files; disc space will be calculated separately for CDs & DVDs in  their classes.
    // CD - 5 MB, DVD - 10 MB size
    public double calculateLPDiscSpaceUsed(){
        return super.getFileNames().size() * 2;
    }

    @Override
    public String toString() {
        String n = "\n";

        return "Name: " + super.getName() + n +
                "Disc Type: " + super.getDiscType() + n +
                "Floppy Disc Size is : " + discSize + n +
                "Max Disc Capacity: " + super.getDiscCapacity()  + " MB" + n +
                "Album Name: " + albumName + n;
    }

    @Override
    public String spinDisc() {
        System.out.println("LPs spin leisurely.");
        return OpticalDisc.super.spinDisc();
    }

    @Override
    public void spinSpeed() {
        System.out.println("LP Discs rotate at about 33 1/3 RPM, or about five revolutions per second");
    }
}
