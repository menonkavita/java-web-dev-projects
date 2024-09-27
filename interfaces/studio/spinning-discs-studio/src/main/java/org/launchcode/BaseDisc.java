package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String ID;
    private String name;
    private ArrayList<String> fileNames;
    private String discType;
    private int discCapacity;                // Max space available for storage on disc
    //private double discSpaceUsed;

    public BaseDisc(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public BaseDisc(String ID, String name, String discType) {
        this.ID = ID;
        this.name = name;
        this.discType = discType;
    }

    public BaseDisc(String ID, String name, String discType, int discCapacity) {
        this.ID = ID;
        this.name = name;
        this.discType = discType;
        this.discCapacity = discCapacity;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

}
