package com.company.papizuk.robot.legs;

public class TransformerLeg implements Leg {
    @Override
    public void left_leg() {
        System.out.println("Moving left leg like Transformer");
    }

    @Override
    public void right_leg() {
        System.out.println("Moving right leg like Transformer");
    }
}
