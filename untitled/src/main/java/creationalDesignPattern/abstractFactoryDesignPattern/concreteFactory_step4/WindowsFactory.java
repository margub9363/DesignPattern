package creationalDesignPattern.abstractFactoryDesignPattern.concreteFactory_step4;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractFactory_step3.UIFactory;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;
import creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2.WindowsButton;
import creationalDesignPattern.abstractFactoryDesignPattern.concreteProducts_step2.WindowsCheckbox;

class WindowsFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
