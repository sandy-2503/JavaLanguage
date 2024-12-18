package com.geeksforgeeks.patterns.creational.observer;

public class Client {
    public static void main(String[] args) {
        System.out.println("Observer");

        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Subscriber obj1 = new MyTopicSubscriber("Obj1");
        Subscriber obj2 = new MyTopicSubscriber("Obj2");
        Subscriber obj3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setPublisher(topic);
        obj2.setPublisher(topic);
        obj3.setPublisher(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
