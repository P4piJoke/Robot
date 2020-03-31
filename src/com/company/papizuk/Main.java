package com.company.papizuk;

import com.company.papizuk.robot.RobotImpl;
import com.company.papizuk.robot.body.Body;
import com.company.papizuk.robot.body.R2D2Body;
import com.company.papizuk.robot.body.TransformerBody;
import com.company.papizuk.robot.hands.R2D2Hand;
import com.company.papizuk.robot.hands.TransformerHand;
import com.company.papizuk.robot.head.R2D2Head;
import com.company.papizuk.robot.head.TransformerHead;
import com.company.papizuk.robot.legs.Leg;
import com.company.papizuk.robot.legs.R2D2Leg;
import com.company.papizuk.robot.legs.TransformerLeg;


public class Main {

    public static void main(String[] args) {

        R2D2Body r2D2Body = new R2D2Body();
        R2D2Head r2D2Head = new R2D2Head();
        R2D2Hand r2D2Hand = new R2D2Hand();
        R2D2Leg r2D2Leg = new R2D2Leg();
        TransformerBody transformerBody = new TransformerBody();
        TransformerHead transformerHead = new TransformerHead();
        TransformerHand transformerHand = new TransformerHand();
        TransformerLeg transformerLeg = new TransformerLeg();

        Body[] bodies = new Body[]{new R2D2Body(),new TransformerBody()};


        for (int i = 0; i < 2; i++) {
            System.out.println(bodies[i].getTypeOfProtect());
        }

        RobotImpl robot1 = new RobotImpl(100,"R1",transformerBody,transformerHead, r2D2Hand, transformerLeg);
        RobotImpl robot2 = new RobotImpl(100,"R2",r2D2Body,r2D2Head, transformerHand, r2D2Leg);
    }
}
