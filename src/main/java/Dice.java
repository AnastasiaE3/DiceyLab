import java.util.Random;

public class Dice {
    int numberOfDice; //defines the number of dice the object has
    Random huy = new Random(1);
    public Dice (int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossSum() {
        int throwDice = 0;
        for (int i = 0; i < numberOfDice; i ++){
            int roll = huy.nextInt(6) + 1;
            throwDice += roll;
        }
        return throwDice;
    }



}
