package zad1;

import zad1.zad1a.Point;
import zad1.zad1b.PointController;

import java.util.Scanner;

/**
 * Created by Admin on 22.11.2017.
 */
public class PointApplication {



    public void menuScreen() {
        System.out.println("Wybierz opcje: ");
        System.out.println("1 - dodaj X ");
        System.out.println("2 - odejmij X ");
        System.out.println("3 - dodaj Y ");
        System.out.println("4 - odejmij Y ");
        System.out.println("5 - wyjście");
        System.out.println("");
    }

    public void printCoordinates(Point point) {
        System.out.println("Koordynaty to: X " + point.getX() + "Y " + point.getY());
    }
    public static void main(String[] args) {

    Point point = new Point(0, 0);
    PointController pointController = new PointController();
    PointApplication pointApplication = new PointApplication();
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();

        pointApplication.menuScreen();


        while (true) {
            try {
            option = keyboard.nextInt();


                switch (option) {
                    case 1:
                        pointController.addX(point);
                        pointApplication.printCoordinates(point);
                        break;
                    case 2:
                        pointController.minusX(point);
                        pointApplication.printCoordinates(point);
                        break;
                    case 3:
                        pointController.addY(point);
                        pointApplication.printCoordinates(point);
                        break;
                    case 4:
                        pointController.minusY(point);
                        pointApplication.printCoordinates(point);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("DDDDDDDUPA");

                        break;
                }
            }catch (Exception E){
                System.out.println("Siabadaba");
                keyboard.next();
            }

        }
    }
}


