package creationalDesignPattern.FactoryDesignPattern.com.phone;

public class OperatingSystemFactory {

    public OS getInstance(String str) {
        if(str.equalsIgnoreCase("Open")) {
            return new Android();
        } else if (str.equalsIgnoreCase("Closed")) {
            return new IOS();
        }
        else return new Windows();
    }
}
