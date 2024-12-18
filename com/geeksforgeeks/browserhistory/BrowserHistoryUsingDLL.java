package com.geeksforgeeks.browserhistory;

class HistoryEntry{

    String url;
    HistoryEntry prev;
    HistoryEntry next;

    public HistoryEntry(String url){
        this.url=url;
        this.prev=null;
        this.next=null;
    }
}

class DoublyLinkedListHistory{
    private HistoryEntry current;

    public DoublyLinkedListHistory(){
        this.current = null;
    }
    public void  visit(String url){
        HistoryEntry newEntry = new HistoryEntry(url);
        if(current != null){
            current.next = newEntry;
            newEntry.prev =current;
        }
        current = newEntry;
        newEntry.next = null;
    }
    public String back(int k){
        while (current != null && k-- >0){
            current = current.prev;
        }
        return current != null ? current.url : "";
    }

    public String forword(int k){
        while (current != null && k-- >0){
            current = current.next;
        }
        return current != null ? current.url : "";
    }

}

public class BrowserHistoryUsingDLL {
    public static void main(String[] args) {
        DoublyLinkedListHistory dllh = new DoublyLinkedListHistory();
        dllh.visit("A");
        dllh.visit("B");
        dllh.visit("C");
        dllh.visit("D");
        System.out.println(dllh.back(1));
        System.out.println(dllh.back(1));
        System.out.println(dllh.back(1));
        dllh.visit("D");
        dllh.visit("A");
        System.out.println(dllh.forword(1));

    }
}
