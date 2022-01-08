package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void startLotteryTest() {
        Lottery lottery = new Lottery(90,5);

        assertEquals(5,lottery.startLottery().size());
    }

}