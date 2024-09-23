package technology;

public class Laptop extends Computer {

    private int numberOfUSBPorts;
    private int hardDriveSize;

    public Laptop(int ID) {
        super(ID);
    }

    public Laptop(String processor, float screenSize, int ID) {
        super(processor, screenSize, ID);
    }

    public Laptop(int ports, String processor, float screenSize, int ID){
        super(processor, screenSize, ID);
        this.numberOfUSBPorts = ports;
    }

    public Laptop(String processor, float screenSize, String typeofOS, int ID) {
        super(processor, screenSize, typeofOS, ID);
    }


    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public int getNumberOfUSBPorts() {
        return numberOfUSBPorts;
    }

    public void setNumberOfUSBPorts(int numberOfUSBPorts) {
        this.numberOfUSBPorts = numberOfUSBPorts;
    }
}
