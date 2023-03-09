package Creational.FactoryMethod;

public class Main {
    public static void main(String[]args){
        SmartPhone iPhone = SmartPhoneFactory.getInstance("IPhone", "XR");
        SmartPhone samsung = SmartPhoneFactory.getInstance("Samsung", "Galaxy s22 ultra");
        SmartPhone nokia = SmartPhoneFactory.getInstance("Nokia", "3310");
        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
