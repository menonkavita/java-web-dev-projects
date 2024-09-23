package technology;

public class Computer extends AbstractEntity {
    private String processor;
    private float screenSize;
    private String typeofOS;

    public Computer(int ID) {
        super(ID);
    }

    public Computer(String processor, int ID) {
        super(ID);
        this.processor = processor;
        this.screenSize = 0;
    }

    public Computer(String processor, float screenSize, int ID) {
        super(ID);
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public Computer(String processor, float screenSize, String typeofOS, int ID) {
        super(ID);
        this.processor = processor;
        this.screenSize = screenSize;
        this.typeofOS = typeofOS;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getTypeofOS() {
        return typeofOS;
    }

    public void setTypeofOS(String typeofOS) {
        this.typeofOS = typeofOS;
    }

}
