package zad5;

import java.util.Scanner;

/**
 * Created by Sradmin on 22.11.2017.
 */
public class SimpleCalc {

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    private double firstValue;
    private double secondValue;
    private int numberOfAction;

    public void chooseOperation(char c) {
        switch (c) {

            case '+':
                numberOfAction = 1;
                break;
            case '-':
                numberOfAction = 2;
                break;
            case '*':
                numberOfAction = 3;
                break;
            case '/':
                numberOfAction = 4;
                break;
            default:
                Scanner scanner = new Scanner(System.in);
                System.out.println("spróbuj jeszcze raz");
                char anotherChance = scanner.next().charAt(0);
                chooseOperation(anotherChance);
        }
    }

    public double executeOperation(SimpleCalc simpleCalc) {
        switch (simpleCalc.numberOfAction) {

            case 1:
                return firstValue + secondValue;
            case 2:
                return firstValue - secondValue;
            case 3:
                return firstValue * secondValue;
            case 4:
                return firstValue / secondValue;
            default:
                System.out.println("Coś się pokiełbasiło");
                return 0;
        }
    }


}
