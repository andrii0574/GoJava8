package JavaTechSkills.Module4;

import java.util.Scanner;

/**
 * Created by Komp on 09.09.2017.
 */
public class recursion {
    static int number = 1;

    static int rectRows = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Some Number:");
        int number1 = sc.nextInt();
        recursion1(number1);


        System.out.println("Enter Width Of Rectangle:");
        rectRows = sc.nextInt();
        int widthRect = rectRows;
        System.out.println("Enter Height Of Rectangle:");
        int heightRect = sc.nextInt();
        if (heightRect > 0){
            drawRectangle(widthRect, heightRect);
        }else {
            drawRectangle(widthRect);
        }
        

        System.out.println("Enter first argument:");
        String firstArg = sc.next();
        System.out.println("Enter second argument:");
        String secondArg = sc.next();

        getMax(Integer.parseInt(firstArg), Integer.parseInt(secondArg));
        getMax(Float.parseFloat(firstArg), Float.parseFloat(secondArg));
    }

    public static void recursion1(int x) {
        if (x > 0){
            recursion1(x - 1);
            System.out.println(number++);
        }
    }

    public static void drawRectangle(int x, int y){
        if (y > 0){
            for (int i = 0; i < x; i++) {
                System.out.print("+");
            }
            System.out.println("");
            drawRectangle(x, y-1);
        }
    }

    public static void drawRectangle(int x){
        if (x > 0){
            for (int i = 0; i < rectRows; i++) {
                System.out.print("+");
            }
            System.out.println("");
            drawRectangle(x-1);
        }
    }

    public static void getMax(int x, int y){
        if (x > y){
            System.out.println(x + " is Bigger then " + y);
        }else if(x == y){
            System.out.println(x + " is Equal with" + y);
        }else{
            System.out.println(x + " - is Smaller then " + y);
        }
    }

    public static void getMax(float x, float y){
        if (x > y){
            System.out.println(x + " is Bigger then " + y);
        }else if(x == y){
            System.out.println(x + " is Equal with" + y);
        }else{
            System.out.println(x + " - is Smaller then " + y);
        }
    }

}
