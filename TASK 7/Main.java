import java.util.Scanner;
/* 
 	
Write a program that convert from Numbers to Strings and back toNumbers. 
Write a program that reverse a String. Example takes in "hello world" and return"dlrow olleh"
*/
public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void numberToString() {
            System.out.println("Input the number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println(number);
            String numberInStringFormat = String.valueOf(number);
            System.out.println(numberInStringFormat);
            int numberBackToInt = Integer.parseInt(numberInStringFormat);
            System.out.println(numberBackToInt);
        } 

    static void stringReserver() {
            System.out.println("Say Something: ");
            String stringChosen = scanner.nextLine();
           StringBuilder builder = new StringBuilder();
            for (int i = stringChosen.length() - 1; i >= 0; i--) {
                builder.append(stringChosen.charAt(i));
            }
            System.out.println(builder.toString());
    }
    public static void main(String[] args) {
        numberToString();
        stringReserver();
    }
}
