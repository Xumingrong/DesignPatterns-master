package com.meteor.designpatterns.observer;

/**
 * 作者：Meteor on 2019/6/28 11:02
 * 邮箱：15537171227@163.com
 * 观察者模式
 */
public class BObserver extends Observer {
    public BObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("B接收到消息了");
    }
}
