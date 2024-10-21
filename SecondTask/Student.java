import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your Age : ");
        int age = scanner.nextInt();

        System.out.println("Enter City : ");
        String city = scanner.next();

        System.out.println("Enter Contact : ");
        long contact = scanner.nextLong();

        System.out.println();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
        System.out.println("Contact : " + contact);


        scanner.close();

    }
    
}
