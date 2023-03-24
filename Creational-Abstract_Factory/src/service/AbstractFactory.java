package service;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 9:38 AM
 * @since : 0.1.0
 **/
public abstract class AbstractFactory {
    protected abstract Shape getShape(String shapeType);
}
