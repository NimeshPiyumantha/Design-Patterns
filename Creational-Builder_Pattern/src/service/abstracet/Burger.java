package service.abstracet;

import service.interfaces.Item;
import service.interfaces.Packing;
import service.type.Wrapper;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:43 PM
 * @since : 0.1.0
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}