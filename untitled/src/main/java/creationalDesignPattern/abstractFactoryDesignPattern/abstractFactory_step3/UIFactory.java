package creationalDesignPattern.abstractFactoryDesignPattern.abstractFactory_step3;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
