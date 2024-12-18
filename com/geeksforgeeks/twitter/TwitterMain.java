package com.geeksforgeeks.twitter;

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/


// Design a simplified version of Twitter where users can post tweets, follow/unfollow another user, and is able to see the 10 most recent tweets in the user's feed.

// 1 User => N Tweets (Agg)
// User (M) <=> User (N) (Assoc)
// content html string <img tag />

import java.util.*;

// Class to represent a tweet
class Tweet {
    private static int tweetCounter = 1;
    private int tweetId;
    private String content;
    private Date timestamp;
    private User author;
    // private String imageUrl;

    public Tweet(String content, User author) {
        this.tweetId = tweetCounter++;
        this.content = content;
        this.author = author;
        this.timestamp = new Date();
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public Date getTimeStamp() {
        return timestamp;
    }


    @Override
    public String toString() {
        return "Tweet by " + author.getUsername() + " with content " + content + " on " + timestamp;
    }

}


// Class to represent a User
class User {
    private static int userCounter = 1;
    private int userId;
    private String username;
    private Set<User> followedUsers; // User can follow multiple users
    private List<Tweet> tweets; // User can have or post many tweets but tweets exist independently

    public User(String username) {
        this.userId = userCounter++;
        this.username = username;
        this.followedUsers = new HashSet<>();
        this.tweets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    // Get the list of user's this user is following
    public Set<User> getFollowedUsers() {
        return followedUsers;
    }

    public void follow(User user) {
        if (followedUsers.contains(user)) {
            return;
        }
        else {
            followedUsers.add(user);
        }
    }

    public void unFollow(User user) {
        if(followedUsers.contains(user)) {
            followedUsers.remove(user);
        }
    }

    public void postTweet(String content){
        Tweet tweet = new Tweet(content, this);
        tweets.add(tweet);
    }

    public void getNewsFeed() {
        PriorityQueue<Tweet> feed = new PriorityQueue<>(10, new Comparator<Tweet>(){
            public int compare(Tweet t1, Tweet t2) {
                return t2.getTimeStamp().compareTo(t1.getTimeStamp()); // Sort by recent first
            }
        });
        for(User followed : followedUsers) {
            feed.addAll(followed.getTweets());
        }

        int count = 0;
        while(!feed.isEmpty() && count < 10) {
            // feed.poll() will be the most tweet
            System.out.println(feed.poll());
            count++;
        }
    }
}


public class TwitterMain
{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        User alice = new User("alice");
        User bob = new User("bob");
        User charlie = new User("Charlie");
        alice.follow(bob);
        alice.follow(charlie);
        bob.postTweet("First Tweet by bob !");
        Thread.sleep(2000);
        bob.postTweet("Second Tweet by bob !");
        Thread.sleep(2000);
        charlie.postTweet("First Tweet by charlie !");
        Thread.sleep(2000);
        charlie.postTweet("Second Tweet by charlie !");
        Thread.sleep(2000);
        System.out.println(alice.getFollowedUsers());
        alice.getNewsFeed();
        alice.unFollow(charlie);
        System.out.println(alice.getFollowedUsers());
        alice.getNewsFeed();
    }


}

