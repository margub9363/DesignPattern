package creationalDesignPattern.FactoryDesignPattern;

import creationalDesignPattern.FactoryDesignPattern.com.phone.OS;
import creationalDesignPattern.FactoryDesignPattern.com.phone.OperatingSystemFactory;
import creationalDesignPattern.FactoryDesignPattern.com.phone.Windows;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfIOS = scanner.nextLine();
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance(typeOfIOS);
        os.spec();
    }
}
