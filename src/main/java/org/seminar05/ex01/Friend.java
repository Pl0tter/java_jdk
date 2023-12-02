package org.seminar05.ex01;

public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend friend) {
        System.out.println(name + ": " + friend.getName() + " поклонился мне");
        friend.bowBack(this);
    }

    private synchronized void bowBack(Friend friend) {
        System.out.println(name + ": " + friend.getName() + " кланяется в ответ");
    }
}