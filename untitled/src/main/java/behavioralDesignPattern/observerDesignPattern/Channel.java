package behavioralDesignPattern.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    public void unSubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void notifySubscriber(){
        for (Subscriber sub:subscribers){
            sub.update();
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
