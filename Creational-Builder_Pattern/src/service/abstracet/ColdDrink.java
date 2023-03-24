package service.abstracet;

import service.interfaces.Item;
import service.interfaces.Packing;
import service.type.Bottle;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:44 PM
 * @since : 0.1.0
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
