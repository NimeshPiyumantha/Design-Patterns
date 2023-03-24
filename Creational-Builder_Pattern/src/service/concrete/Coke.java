package service.concrete;

import service.abstracet.ColdDrink;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:46 PM
 * @since : 0.1.0
 **/
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}