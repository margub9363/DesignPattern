package behavioralDesignPattern.observerDesignPattern;

public class Youtube {
    public static void main(String[] args) {
        Channel FitnessClub = new Channel();
        Subscriber s1 = new Subscriber("Rahman");
        Subscriber s2 = new Subscriber("Margub");
        Subscriber s3 = new Subscriber("Tannu");
        Subscriber s4 = new Subscriber("Hunter");

        FitnessClub.subscribe(s1);
        FitnessClub.subscribe(s2);
        FitnessClub.subscribe(s3);
        FitnessClub.subscribe(s4);

        s1.subscribeChannel(FitnessClub);
        s2.subscribeChannel(FitnessClub);
        s3.subscribeChannel(FitnessClub);
        s4.subscribeChannel(FitnessClub);

        FitnessClub.upload("Exercise Video");
    }
}
