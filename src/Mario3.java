import java.util.Scanner;

/**
 * Created by dana on 7/26/14.
 */
public class Mario3 {
    public static void main(String[] args) {
        String output_choice;
        int height;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a height between 0 and 23: ");
            height = input.nextInt();
        }while ((height<0) || (height>23));

        do {
            System.out.print(" (1) for console or (2) for file:");
            output_choice = input.next();
        }while (!((output_choice.equals("1")) || (output_choice.equals("2"))));

        Printer choice = (output_choice.equals("2")) ? new FilePrinter("mario.txt") : new ConsolePrinter();

        PyramidFactory factory = new PyramidFactory();

        choice.print(factory.createPyramid(height));

    }
}
