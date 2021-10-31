package lab7;

public class AveragingNumbers {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.printf("No arguments");
            return;
        }

        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, the arg is invalid: " + arg);
                return;
            }
        }

        System.out.printf("The average is %.2f%n", (double) sum / args.length);
    }

}
