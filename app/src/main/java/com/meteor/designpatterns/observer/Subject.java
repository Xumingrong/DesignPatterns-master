package com.meteor.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Meteor on 2019/6/28 10:55
 * 邮箱：15537171227@163.com
 * 观察者模式
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    //添加到集合中
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //遍历发送消息给观察者
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }

    }
}
