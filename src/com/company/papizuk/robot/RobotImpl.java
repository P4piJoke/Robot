package com.company.papizuk.robot;

import com.company.papizuk.robot.body.Body;
import com.company.papizuk.robot.body.R2D2Body;
import com.company.papizuk.robot.hands.Hand;
import com.company.papizuk.robot.head.Head;
import com.company.papizuk.robot.head.TransformerHead;
import com.company.papizuk.robot.legs.Leg;

public class RobotImpl implements Robot{
    private  int battery;
    private String model;
    private Body body;
    private Head head;
    private Hand hand;
    private Leg leg;

    public RobotImpl(int battery, String model, Body body, Head head, Hand hand, Leg leg) {
        this.battery = battery;
        this.model = model;
        this.body = body;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public void move() {

        if (battery <= 10) {
            System.out.println("Battery is to low");
        } else {
            System.out.println("I'm moving");
        }
    }

    @Override
    public String communicate(String speech) {
        return null;
    }

    @Override
    public boolean calculate(double a, char c, double b) {
        return false;
    }
}
