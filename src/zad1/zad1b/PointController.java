package zad1.zad1b;

import zad1.zad1a.Point;

/**
 * Created by Admin on 22.11.2017.
 */
public class PointController {


    public void addX(Point point){

            point.setX(point.getX() + 1); //czemu dwa plósy nie działajom ?

    }
    public void minusX(Point point){
        point.setX(point.getX()- 1);

    }
    public void addY(Point point){
        point.setY(point.getY()+ 1);

    }
    public void minusY(Point point){
        point.setY(point.getY()+ 1);

    }



}

