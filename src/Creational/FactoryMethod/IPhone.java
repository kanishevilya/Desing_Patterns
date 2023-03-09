package Creational.FactoryMethod;

public class IPhone extends SmartPhone {
    private String modelName;
    public IPhone(String modelName) {
        this.modelName = modelName;
    }
    @Override
    public String toString() {

        return "IPhone | "+super.toString();
    }
    @Override
    public String getModel() {
        return this.modelName;
    }
}
