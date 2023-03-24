package service.type;

import service.interfaces.Packing;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:41 PM
 * @since : 0.1.0
 **/
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
