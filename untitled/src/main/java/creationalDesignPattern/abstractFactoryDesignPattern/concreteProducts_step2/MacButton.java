package creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Button;

public class MacButton implements Button {
    public void render() {
        System.out.println("Mac Button");
    }
}
