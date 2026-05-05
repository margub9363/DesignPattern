package creationalDesignPattern.abstractFactoryDesignPattern;

import creationalDesignPattern.abstractFactoryDesignPattern.abstractFactory_step3.UIFactory;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Button;
import creationalDesignPattern.abstractFactoryDesignPattern.abstractProducts_step1.Checkbox;

public class Application_step5 {
    private Button button;
    private Checkbox checkbox;

    public Application_step5(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.check();
    }
}
