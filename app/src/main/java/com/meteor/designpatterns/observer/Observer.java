package com.meteor.designpatterns.observer;

/**
 * 作者：Meteor on 2019/6/28 10:54
 * 邮箱：15537171227@163.com
 * 观察者模式
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();//更新观察者
}
