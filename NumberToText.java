import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberToText {

    //This code is simply converts the number to text.
    // e.g: 346 is converted to [ Three Hundred Forty Six ].

    // NOTE: We use recursion in this code.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("NOTE: Maximum number is 999999999.\nEnter number: ");
        int number = scan.nextInt();

        convert(number);
    }

    public static String convert(int number){
        String[] digits = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens2 = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(number < 20){
            System.out.print(digits[number]);
        }
        else if(number < 100){
            System.out.print(tens2[number/10] + (number%10 != 0 ? " " : "") + digits[number%10]);
        }
        else if(number < 1000){
            System.out.print(digits[number/100] + " Hundred ");
            System.out.print(" " + convert(number%100));
        }
        else if(number < 10000){
            System.out.print(digits[(number/1000)] + " Thousand ");
            System.out.print(" " + convert(number%1000));
        }
        else if(number < 100000){
            System.out.print(tens2[(number/10000)] + " ");
            System.out.print(" " + convert(number%10000));
        }
        else if(number < 1000000){
            if(((number%100000)/1000) == 00){
                System.out.print(digits[(number/100000)] + " Hundred Thousand ");
            }
            else{
                System.out.print(digits[(number/100000)] + " Hundred ");
            }
            System.out.print(" " + convert(number%100000));
        }
        else if(number < 10000000){
            System.out.print(digits[(number/1000000)] + " Million ");
            System.out.print(" " + convert(number%1000000));
        }
        else if(number < 100000000){
            System.out.print(tens2[(number/10000000)] + " ");
            System.out.print(" " + convert(number%10000000));
        }
        else if(number < 1000000000){
            if(((number%100000000)/1000000) == 00){
                System.out.print(digits[(number/100000000)] + " Hundred Million ");
            }
            else{
                System.out.print(digits[(number/100000000)] + " Hundred ");
            }
            System.out.print(" " + convert(number%100000000));
        }
        else{
            System.out.println("Number is beyond our limits!\n Try smaller number.");
        }

        return "";
    }
}
