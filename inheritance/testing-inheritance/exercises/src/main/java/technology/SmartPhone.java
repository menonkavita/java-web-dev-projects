package technology;

public class SmartPhone extends Computer {

    private final int numberOfCamera;
    private boolean isMultiSim;

    public SmartPhone(int ID, int numberOfCamera) {
        super(ID);
        this.numberOfCamera = numberOfCamera;
    }

    public SmartPhone(String processor, int ID, int numberOfCamera) {
        super(processor, ID);
        this.numberOfCamera = numberOfCamera;
    }

    public SmartPhone(int ID, int numberOfCamera, boolean isMultiSim){
        super(ID);
        this.numberOfCamera = numberOfCamera;
        this.isMultiSim = isMultiSim;
    }

    public int getNumberOfCamera() {
        return numberOfCamera;
    }

    public boolean isMultiSim() {
        return isMultiSim;
    }

    public void setMultiSim(boolean multiSim) {
        isMultiSim = multiSim;
    }

    public String checkSim(){

        return isMultiSim ? "Smart Phone can hold multiple Sim Cards" : "Smart Phone does not have multiple Sim Card option";
    }
}
