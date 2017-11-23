package zad4;

/**
 * Created by Zegarmistrz Światła Purpurowy on 22.11.2017.
 */
public class Matrix {

    // Kto to wymyślił??

    ///////////////// Suma iloczynów przekątnych tablicy
    public double firstTask(double[][] array2d){

        return  (array2d[0][0] * array2d[0][2]* array2d[1][1])+ (array2d[0][2]*array2d[2][0]* array2d[2][2]);

    }
    ////////////////Iloczyn sum środkowego wiersza i środkowej kolumny tablicy
    public double secondTask(double[][] array2d) {

        return  (array2d[0][0] + array2d[0][1] + array2d[0][2])/(array2d[0][1] + array2d[0][2] + array2d[0][3]);
    }
    ////////////////Suma wszystkich elementów znajdujących się przy krawędzi tablicy
    public double thirdTask(double[][] array2d) {
        double operation = 0;
        for (double[] row : array2d) {
            for (double index : row) {
            operation += index;
            }
        }
        return operation - array2d[1][1];
    }

    public static void main(String[] args) {
        double[][] array2d= {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}
        };



    }

}
