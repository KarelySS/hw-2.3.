public class Transport {
    private String modelName;
    private int countWheels;

    public Transport(String modelName, int countWheels) {
        this.modelName = modelName;
        this.countWheels = countWheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
}