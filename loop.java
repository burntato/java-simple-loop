import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Enter a word: ");
        String word = input2.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }

        System.out.println("Finished printing");

        // close the scanner
        input.close();
        input2.close();
    }
}