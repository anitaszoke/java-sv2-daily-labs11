package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int howManyNumbers;
    private int howMuchPull;

    public Lottery(int howManyNumbers, int howMuchPull) {
        this.howManyNumbers = howManyNumbers;
        this.howMuchPull = howMuchPull;
    }

    public List<Integer> startLottery() {
        List<Integer> winnerNumbers = new ArrayList<>();
        int numbers = getHowManyNumbers();
        int pull = getHowMuchPull();
        int randomNumber = 0;

        Random random = new Random();
        while (winnerNumbers.size()<pull) {
            randomNumber = random.nextInt(numbers);
            if (!winnerNumbers.contains(randomNumber)) {
                winnerNumbers.add(randomNumber);
            }
        }
        return winnerNumbers;
    }

    public int getHowManyNumbers() {
        return howManyNumbers;
    }

    public int getHowMuchPull() {
        return howMuchPull;
    }
}
