package service.types;

import service.Shape;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:17 AM
 * @since : 0.1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
