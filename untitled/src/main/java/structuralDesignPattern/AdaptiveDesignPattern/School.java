package structuralDesignPattern.AdaptiveDesignPattern;

public class School {
    public static void main(String[] args) {
        PenAdapter penAdapter = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(penAdapter);
        aw.writeAssignmet("I'm bit tired to write an assignment");
    }
}
