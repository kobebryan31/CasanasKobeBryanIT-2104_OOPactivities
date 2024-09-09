import java.util.Scanner;

public class GreaterCharacterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        
        System.out.print("Enter first character: ");
        char char1 = scanner.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char char2 = scanner.next().charAt(0);
        
        char greaterChar = (char) Math.max(char1, char2);
        
        System.out.println("-----------------------");
        System.out.println("The character with the greater value is: " + greaterChar);
        System.out.println("-----------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + ": " + (int) char1);
        System.out.println(char2 + ": " + (int) char2);
    }
}