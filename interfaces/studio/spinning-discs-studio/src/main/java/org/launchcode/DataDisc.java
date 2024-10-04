package org.launchcode;

import java.util.ArrayList;

public abstract class DataDisc extends BaseDisc {
    private ArrayList<String> fileNames;
    private int discCapacity;                // Max space available for storage on disc
    //private double discSpaceUsed;



    public DataDisc(String ID, String name, String discType, int discCapacity) {
        super(ID, name, discType);
        this.discCapacity = discCapacity;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    // getFileNames() used to calculate disc space yet
    // returns number of files; disc space will be calculated separately for CDs & DVDs in  their classes.
    // CD - 5 MB, DVD - 10 MB size
    public ArrayList<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(ArrayList<String> fileNames) {
        this.fileNames = fileNames;
    }
}
