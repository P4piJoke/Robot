package com.company.papizuk.robot.legs;

public class R2D2Leg implements Leg {
    @Override
    public void left_leg() {
        System.out.println("Moving left leg like R2D2");
    }

    @Override
    public void right_leg() {
        System.out.println("Moving right leg like R2D2");
    }
}
