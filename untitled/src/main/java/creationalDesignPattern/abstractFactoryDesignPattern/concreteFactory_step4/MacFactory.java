package creationalDesignPattern.abstractFactoryDesignPattern.concreteFactory_step4;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractFactory_step3.UIFactory;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;
import creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2.MacButton;
import creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2.MacCheckbox;

class MacFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
