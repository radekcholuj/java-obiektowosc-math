import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        NumberRepo numberRepo = new NumberRepo(size);
        numberRepo.generateValues();
        numberRepo.displayAll();

        double min = numberRepo.findMin();
        System.out.println("Min value: "+min);

        double max = numberRepo.findMax();
        System.out.println("Max value: "+max);

        double[] logNumbers = numberRepo.logNumbers();
        System.out.println("Log numbers: ");
        for (double number : logNumbers) {
            System.out.println(number);
        }
        System.out.println("Enter the number A: ");
        int numberA =scanner.nextInt();
        System.out.println("Enter the number B: ");
        int numberB =scanner.nextInt();

        numberRepo.minMaxAB(numberA,numberB);
    }
}
