package creationalDesignPattern.BuilderDesignPattern.Phone;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setProcessor("Abc").setOs("Android").setRam(2).getPhone();
        System.out.println(p);
    }
}
