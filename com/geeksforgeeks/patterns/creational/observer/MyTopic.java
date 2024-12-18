package com.geeksforgeeks.patterns.creational.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Publisher{

    private List<Subscriber> subscribers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public MyTopic() {
        this.subscribers = new ArrayList<>();
    }


    @Override
    public void register(Subscriber sub) {
        if(sub == null)
            throw new NullPointerException("Null Subscriber");
        synchronized (MUTEX){
            if(!subscribers.contains(sub)){
                subscribers.add(sub);
            }
        }
    }

    @Override
    public void unRegister(Subscriber sub) {
        synchronized (MUTEX) {
            subscribers.remove(sub);
        }
    }

    @Override
    public void notifySubscriber() {
        List<Subscriber> observersLocal = null;
        synchronized (MUTEX) {
                if(!changed)
                    return;
                observersLocal = new ArrayList<>(this.subscribers);
                this.changed = true;
        }
        for (Subscriber obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Subscriber sub) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifySubscriber();
    }
}
