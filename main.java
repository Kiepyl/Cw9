import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
//        cars();
        zad4();
    }
    private static void cars(){
        Car auto1 = new Car("Skyline", 1997);
        Car auto2 = new Car("Corolla", 2003);
        Car auto3 = new Car("E46", 1998);
        Car auto4 = new Car("Superb", 2010);
        Car auto5 = new Car("X5", 2017);
        Car auto6 = new Car("X1", 2015);
        Car auto7 = new Car("Celica", 1999);
        Car auto8 = new Car("Focus", 2007);
        Car auto9 = new Car("Hellcat", 2019);
        Car auto10 = new Car("GT", 1997);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(auto1);
        cars.add(auto2);
        cars.add(auto3);
        cars.add(auto4);
        cars.add(auto5);
        cars.add(auto6);
        cars.add(auto7);
        cars.add(auto8);
        cars.add(auto9);
        cars.add(auto10);
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    private static void zad4(){
        int[] array = new int[10];
        fillArray(array);
        System.out.printf("Array: ");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                System.out.printf(array[i] + ".");
            }
            else System.out.printf(array[i] + ", ");
        }
    }

    private static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        if(x < 0) {
            throw new NegativeNumberException();
        }
        return x;
    }

    private static void fillArray(int []array){
        for(int i = 0; i < array.length; i++){
            try{
                int x = readNumber();
                array[i] = x;
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}