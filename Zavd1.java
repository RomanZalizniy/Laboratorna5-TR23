import java.util.Scanner;

public class Zavd1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // створення об'єкту Scanner для зчитування вводу з клавіатури

        System.out.print("Введіть радіус кола: ");
        double radius = input.nextDouble(); // зчитування радіусу з клавіатури

        double area = Math.PI * Math.pow(radius, 2); // обчислення площі кола

        System.out.println("Площа кола з радіусом " + radius + " дорівнює " + area);
    }
}
