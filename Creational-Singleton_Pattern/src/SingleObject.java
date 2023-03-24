/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/23/2023
 * @time : 11:47 PM
 * @since : 0.1.0
 **/
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

