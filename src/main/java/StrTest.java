import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class StrTest {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = sc.nextLine();

        StringUtils strUtl = new StringUtils();

        strUtl.isNumeric(userInput);
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = sc.nextLine();

        StringUtils strUtl = new StringUtils();
        System.out.printf("You Entered: %s%n", userInput);
        if(!strUtl.isNumeric(userInput)){
            System.out.println("You did not enter a number");
        }
        String swapCase = strUtl.swapCase(userInput);
        System.out.println(swapCase);

        String reverseWord = strUtl.reverse(userInput);
        System.out.println(reverseWord);
    }
}
