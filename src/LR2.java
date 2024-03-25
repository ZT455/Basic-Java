import java.util.Scanner;

public class LR2 {
    public static final int MAX_DIMENSION = 20;
    public static final int MIN_DIMENSION = 1;
    public static final int MAX_VALUE = 50;
    public static final int MIN_VALUE = 1;
    public static void main(String[] args) {

        String manual = "Manual", random = "Random";
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Please enter Horizontal: ");
        int x = inputDimensionOfMatrix(inputKeyboard);
        System.out.println("Please enter Vertical: ");
        int y = inputDimensionOfMatrix(inputKeyboard);

        System.out.println("Choose type of filling in the matrix:");
        System.out.println("Type: Manual - to fill matrix manually");
        System.out.println("Type: Random - to fill matrix with random numbers");

        String fillInMethod = inputKeyboard.next();
        if (fillInMethod.equals(manual)) {
            manualFill(x, y, inputKeyboard);
        }
        if (fillInMethod.equals(random)) {
            randomFill(x, y, inputKeyboard);
        }
    }

    public static int inputDimensionOfMatrix(Scanner input) {

        int NumberDimension;

        NumberDimension = input.nextInt();

        while (NumberDimension > MAX_DIMENSION || NumberDimension < MIN_DIMENSION) {

            System.out.println("Dimension is not in " + MIN_DIMENSION + " - "
                    + MAX_DIMENSION + "\n Enter another number:");
            NumberDimension = input.nextInt();

        }

        return NumberDimension;
    }
    public static int[][] manualFill(int Horizontal, int Vertical, Scanner inputKeyboard) {
        int[][] matrix = new int[Horizontal][Vertical];
        for (int i = 0; i < Horizontal; i++) {
            for (int j = 0; j < Vertical; j++) {
                System.out.print("Enter next number: ");
                matrix[i][j] = inputKeyboard.nextInt();
                System.out.print(" ");
            }
        }
        for (int i = 0; i < Horizontal; i++) {

            for (int j = 0; j < Vertical; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        maxMinAverage(matrix);
        return matrix;

    }
    public static int[][] randomFill(int Horizontal, int Vertical, Scanner inputKeyboard) {

        int[][] matrix = new int[Horizontal][Vertical];
        int amountOfNumber = MAX_VALUE + MIN_VALUE + 1;

        for (int i = 0; i < Horizontal; i++) {
            for (int j = 0; j < Vertical; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * amountOfNumber - MIN_VALUE);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        maxMinAverage(matrix);
        return matrix;
    }


    private static void maxMinAverage(int[][] matrix) {

        calculateMax(matrix);
        calculateMin(matrix);
        calculateAverage(matrix);

    }
    private static double calculateAverage(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        double average = (1.0 * sum) / (matrix.length * matrix[0].length);
        System.out.println("Matrix average " + average);
        return average;
    }
    private static int calculateMax(int[][] matrix) {
        int max = matrix[1][1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max <= matrix[i][j])
                    max = matrix[i][j];
            }
        }

        System.out.println("Matrix maximum " + max);
        return max;
    }
    private static int calculateMin(int[][] matrix) {

        int min = matrix[1][1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min >= matrix[i][j])
                    min = matrix[i][j];
            }
        }

        System.out.println("Matrix minimum is " + min);
        return min;

    }

}
