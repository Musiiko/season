import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the serial number of the month = ");
        int i = num.nextInt();

        System.out.println(
                switch (i){
                    case 12,1,2 -> "Season: winter";
                    case 3,4,5 -> "Season: spring";
                    case 6,7,8 -> "Season: summer";
                    case 9,10,11 -> "Season: autumn";
                    default -> "Ouch ! Not the ordinal number of the month! Repeat one more time";
                }
        );
    }
}