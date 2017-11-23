package zad5;

import java.util.Scanner;

/**
 * Created by Admin on 23.11.2017.
 */
public class CalcApplication {

    public static void main(String[] args) {

        SimpleCalc simpleCalc = new SimpleCalc();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            boolean isFirstValueWrong = true;
            boolean isSecondValueWrong = true;

            while (isFirstValueWrong) {

                System.out.println("Podaj pierwszą wartość: ");
                try {
                    simpleCalc.setFirstValue(scanner.nextDouble());
                    isFirstValueWrong = false;
                } catch (Exception E) {
                    System.out.println("Coś się popsuło i nie było mnie słychać");
                    isFirstValueWrong = true;
                    scanner.next();
                }
            }
            System.out.println("Podaj operację");
            simpleCalc.chooseOperation(scanner.next().charAt(0));
            while (isSecondValueWrong) {
                System.out.println("Podaj drugą wartość: ");
                try {
                    simpleCalc.setSecondValue(scanner.nextDouble());
                    isSecondValueWrong = false;
                } catch (Exception E) {
                    System.out.println("Coś się popsuło i nie było mnie słychać");
                    isSecondValueWrong = true;
                    scanner.next();
                }
                System.out.println("Wynik to: " + simpleCalc.executeOperation(simpleCalc));
            }

        }
    }
}
