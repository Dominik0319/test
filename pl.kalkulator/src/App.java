import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj pierwszą liczbę:");
        int a= scanner.nextInt();
        System.out.println("Podaj drugą liczbe liczbę:");
         int b= scanner.nextInt();
        System.out.println("Podaj trzecią liczbę:");
        int c= scanner.nextInt();    
        System.out.println("twój wynik to: " + (a+b+c));
    scanner.close();
    }
}
