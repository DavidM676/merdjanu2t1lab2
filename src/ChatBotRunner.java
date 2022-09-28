import java.util.Scanner;

public class ChatBotRunner {

    public static void main(String[] args) {
        ChatBot cb = new ChatBot("123456789", 2);

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name: ");
        String yourName = scan.nextLine();
        cb.greeting(yourName);
        scan.nextLine();



        System.out.print("how is the weather: ");
        scan.nextLine();
        cb.weather();

        System.out.print("Would u like to convert feet to meters(y/n): ");
        String ok = scan.nextLine();
        if (ok.equals("y")) {
            System.out.print("Enter a number of feet as a int: ");
            int f = (int)scan.nextDouble();
            System.out.println(f + " feet in meters is "+cb.convertFeetToMeters(f));

        }

        System.out.print("Whats ur favorite integer number: ");
        int num = (int)scan.nextDouble();
        cb.favoriteNumber(num);
        scan.nextLine();



        System.out.print("Would u like to add three numbers(y/n): ");
        String yn = scan.nextLine();
        if (yn.equals("y")) {
            int[] nums = {0, 0, 0};
            for (int i = 0; i<3; i++) {
                System.out.print("Enter a int: ");
                nums[i] = (int)scan.nextDouble();

            }
            System.out.println("The sum is "+ cb.addNumbers(nums[0], nums[1], nums[2]));

        }
        cb.hi();
        System.out.println(cb.one());
       System.out.println(cb.goodbye());

       scan.close();
    }
}
