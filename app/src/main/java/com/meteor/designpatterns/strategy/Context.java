package com.meteor.designpatterns.strategy;

/**
 * 作者：Meteor on 2019/6/28 11:45
 * 邮箱：15537171227@163.com
 * 策略模式
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
