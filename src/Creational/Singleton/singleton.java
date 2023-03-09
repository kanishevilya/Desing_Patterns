package Creational.Singleton;

public class singleton {
    private static singleton uniqInstance;
    private singleton(){ }
    public static singleton getInstance(){
        if(uniqInstance == null){
            return new singleton();
        }
        return uniqInstance;
    }
//
    public void getDescription(){
        System.out.println("I'm simple singleton");
    }
}
