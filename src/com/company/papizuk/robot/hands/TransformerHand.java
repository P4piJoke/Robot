package com.company.papizuk.robot.hands;

public class TransformerHand implements Hand {
    @Override
    public void left_hand() {
        System.out.println("Moving left hand like Transformer");
    }

    @Override
    public void right_hand() {
        System.out.println("Moving right hand like Transformer");
    }
}
