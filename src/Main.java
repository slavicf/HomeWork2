import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Написать программу, которая делает следующее:
//        - спрашивает у пользователя имя (String)
//        - спрашивает у пользователя город проживания (String)
//        - спрашивает у пользователя возраст (int)
//        - спрашивает у пользователя хобби (String)
//        - перед каждым вводом данных, программа должна вывести информацию пользователю с требованием ввода соответствующей информации.
//        - программа выводит красиво оформлено всю информацию о пользователе в трех разных вариантах:
//        ----------------------------------
//        Вариант 1 (табличный):
//        Имя:            хххххх
//        Город:          хххххх
//        Возраст:        хххххх
//        Хобби:          хххххх
//        ----------------------------------
//        Вариант 2 (текстовый):
//        Человек по имени хххххх живет в городе хххххх.
//        Этому человеку хххххх лет и любит он заниматься хххххх.
//        ----------------------------------
//        Вариант 3 (иной):
//        хххххх - имя
//        хххххх - город
//        хххххх - возраст
//        хххххх - хобби
//        ----------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String Name = scanner.nextLine();

        System.out.print("Введите город вашего проживания: ");
        String City = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int Age = scanner.nextInt();
        scanner.nextLine();             // Команда необходима для опорожнения буфера после nextInt()

        System.out.print("Введите ваше хобби: ");
        String Hobby = scanner.nextLine();
        System.out.println();
//        ----------------------------------
        System.out.println("Вариант 1 (табличный):");
        System.out.println("Имя:\t\t" + Name);
        System.out.println("Город:\t\t" + City);
        System.out.println("Возраст:\t" + Age);
        System.out.println("Хобби:\t\t" + Hobby);
        System.out.println();
//        ----------------------------------
        System.out.println("Вариант 2 (текстовый):");
        System.out.printf("Человек по имени %s живет в городе %s.\n", Name, City);
        System.out.printf("Этому человеку %s лет и любит он заниматься %s.\n\n", Age, Hobby);
//        ----------------------------------
        System.out.println("Вариант 3 (иной):");
        System.out.println(Name + " - имя");
        System.out.println(City + " - город");
        System.out.println(Age + " - возраст");
        System.out.println(Hobby + " - хобби");

    }
}
