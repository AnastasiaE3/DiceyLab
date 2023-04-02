import java.sql.SQLOutput;
import java.util.Scanner;

public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    Bins result;

    public Simulation(int numberOfDice, int numberOfTosses) {

       numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDice);
        this.result = new Bins(2, 12); //min/max
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResult();
    }

    private void runSimulation() {
        for (int i = 1; i < numberOfTosses; i++) {
            int jopa = dice.tossSum();
            result.incrementBin(jopa);
        }
    }

    private void printResult() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed " + numberOfTosses + " times");
        System.out.println("***\n");
        int binResult = 0;
        int result = 0;
        for (int i = 2; i < 12; i++) {
            binResult = Integer.parseInt(Integer.toBinaryString(i));
            result = getBin(i);
            double percent = ((double) result / numberOfTosses);
            System.out.printf("%2d : %6d : %.2f ************\n", binResult, result, percent);

        }
    }

    private int getBin(int i) {
        return 0;
    }

}
