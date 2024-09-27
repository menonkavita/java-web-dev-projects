package org.launchcode;

public interface OpticalDisc {
    // can't think of any constants for now to be had in the interface

    // Interface methods cannot have body
    default String spinDisc(){
        return "CDs spins at a rate of 500 RPMs.\nDVDs spin at a rate of 570-1600 RPMs";
    }

    void runFile();

}
