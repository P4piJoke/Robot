package com.company.papizuk.robot.hands;

public class R2D2Hand implements Hand {
    @Override
    public void left_hand() {
        System.out.println("Moving left hand like R2D2");
    }

    @Override
    public void right_hand() {
        System.out.println("Moving right hand like R2D2");
    }
}
