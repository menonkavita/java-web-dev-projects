package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String ID;
    private String name;
    private String discType;


    public BaseDisc(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public BaseDisc(String ID, String name, String discType) {
        this.ID = ID;
        this.name = name;
        this.discType = discType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
