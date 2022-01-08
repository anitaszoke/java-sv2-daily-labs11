package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void startLotteryTest() {
        Lottery lottery = new Lottery(90,5);

        assertEquals(5,lottery.startLottery().size());
        System.out.println(lottery.startLottery());

        for (int i=0; i < lottery.startLottery().size(); i++) {
            assertFalse(lottery.startLottery().subList(i+1,lottery.startLottery().size()).contains(lottery.startLottery().get(i)));
        }
    }

}