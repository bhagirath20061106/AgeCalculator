import java.util.Scanner;

public class AgeCalsy {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {
            int year, age, Cyear = 2024;

            System.out.print("Enter the year you were born in: ");
            year = get.nextInt();

            age = Cyear - year;
            System.out.printf("Your age in year %d is: %d", Cyear, age);
        }
    }
}