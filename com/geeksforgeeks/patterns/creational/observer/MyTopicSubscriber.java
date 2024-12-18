package com.geeksforgeeks.patterns.creational.observer;

public class MyTopicSubscriber implements Subscriber{

    private String name;
    private Publisher topic;

    public MyTopicSubscriber(String nm){
        this.name=nm;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Consuming message::" + message);
    }

    @Override
    public void setPublisher(Publisher pub) {
        this.topic = pub;
    }
}
