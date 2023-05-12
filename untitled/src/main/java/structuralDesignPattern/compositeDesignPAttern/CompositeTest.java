package structuralDesignPattern.compositeDesignPAttern;

public class CompositeTest {
    public static void main(String[] args) {
        Leaf hd = new Leaf(4000,"hard-drive");
        Leaf mouse = new Leaf(500,"Mouse");
        Leaf monitor = new Leaf(8000,"Monitor");
        Leaf ram = new Leaf(3000,"RAM");
        Leaf cpu = new Leaf(9000,"CPU");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

//        ram.showPrice();
        computer.showPrice();
    }
}
