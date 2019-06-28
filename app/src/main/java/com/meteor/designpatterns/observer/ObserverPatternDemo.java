package com.meteor.designpatterns.observer;

/**
 * 作者：Meteor on 2019/6/28 11:07
 * 邮箱：15537171227@163.com
 * 观察者模式
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new AObserver(subject);
        new BObserver(subject);
        new CObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
