package creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;

public class MacCheckbox implements Checkbox {
    public void check() {
        System.out.println("Mac Checkbox");
    }
}
