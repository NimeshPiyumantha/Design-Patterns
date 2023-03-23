/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/23/2023
 * @time : 11:49 PM
 * @since : 0.1.0
 **/
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
