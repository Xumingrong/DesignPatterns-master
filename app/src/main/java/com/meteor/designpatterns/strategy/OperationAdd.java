package com.meteor.designpatterns.strategy;

/**
 * 作者：Meteor on 2019/6/28 11:41
 * 邮箱：15537171227@163.com
 * 策略模式
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
