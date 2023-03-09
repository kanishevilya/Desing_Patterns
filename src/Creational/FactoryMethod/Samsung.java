package Creational.FactoryMethod;

public class Samsung extends SmartPhone {
    private String modelName;
    public Samsung(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {

        return "Samsung | "+super.toString();
    }
    @Override
    public String getModel() {
        return this.modelName;
    }
}
