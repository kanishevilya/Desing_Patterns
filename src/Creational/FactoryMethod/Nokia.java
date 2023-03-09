package Creational.FactoryMethod;

public class Nokia extends SmartPhone {
    private String modelName;
    public Nokia(String modelName) {
        this.modelName = modelName;
    }
    @Override
    public String toString() {

        return "Nokia | "+super.toString();
    }
    @Override
    public String getModel() {
        return modelName;
    }
}
