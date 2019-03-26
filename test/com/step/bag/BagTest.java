package com.step.bag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagTest {

    @Test
    void shouldAddGivenBallToTheBag() {
        BallBagValidator ballValidator = new BallBagValidator();
        RedBallValidator redBallValidator = new RedBallValidator();
        ballValidator.addValidator(redBallValidator);
        Balls balls = new Balls();
        Bag bag = new Bag(balls, ballValidator);
        Ball redBall = new Ball(BallType.RED);
        bag.add(redBall);
        Balls expectedBalls = new Balls();
        expectedBalls.add(redBall);

        assertEquals(expectedBalls, bag.getSummary());
    }
}