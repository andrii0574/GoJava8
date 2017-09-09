package JavaTechSkills.Modul2;
import java.util.Scanner;

/**
 * Created by Komp on 09.09.2017.
 */
public class interview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter Your City");
        String city = sc.nextLine();

        while (true) {
            try {
                System.out.println("Enter Your Age");
                age = sc.nextInt();
                sc.nextLine();

                break;
            } catch(Exception e) {
                System.out.println(e);
                sc.nextLine();
            }
        }

        System.out.println("Enter Your Hobby");
        String hobby = sc.nextLine();

        System.out.println("Вариант 1 (табличный):");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

        System.out.println("----------------------------------");

        System.out.println("Вариант 2 (текстовый):");
        System.out.println("Человек по имени "+ name +" живет в городе "+ city +".\n" +
                            "Этому человеку "+ age +" лет и любит он заниматься "+ hobby +".");

        System.out.println("----------------------------------");

        System.out.println("Вариант 3 (иной):");
        System.out.println(name + " - имя");
        System.out.println(city + " - город: ");
        System.out.println(age + " - возраст: ");
        System.out.println(hobby + " - хобби: ");

        /*Вариант 1 (табличный):
        Имя: хххххх
        Город: хххххх
        Возраст: хххххх
        Хобби: хххххх
                ----------------------------------
        Вариант 2 (текстовый):
        Человек по имени хххххх живет в городе хххххх.
        Этому человеку хххххх лет и любит он заниматься хххххх.
                ----------------------------------
        Вариант 3 (иной):
        хххххх - имя
        хххххх - город
        хххххх - возраст
        хххххх - хобби
                ----------------------------------*/
    }
}
