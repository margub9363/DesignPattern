package creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;

public class WindowsCheckbox implements Checkbox {
    public void check() {
        System.out.println("Windows Checkbox");
    }
}
