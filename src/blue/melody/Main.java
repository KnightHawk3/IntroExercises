package blue.melody;

public class Main {

    private static void easiestExerciseEver(String[] args) {
        System.out.println("*");
    }

    private static void drawHorizontalLine(String[] args) {
        for (int n = 0; n < Integer.parseInt(args[2]); n++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawVerticalLine(String[] args) {
        for (int n = 0; n < Integer.parseInt(args[2]); n++) {
            System.out.println("*");
        }
    }

    private static void drawRightTriangle(String[] args) {
        int size = Integer.parseInt(args[2]);
        for (int n = 0; n < size; n++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawIsoTriangle(String[] args) {
        int size = Integer.parseInt(args[2]);
        for (int n = 0; n < size; n++) {
            for (int i = n; i < size; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < size / 2; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        switch (args[1]) {
            case "1":
                easiestExerciseEver(args);
                break;
            case "2":
                easiestExerciseEver(args);
                break;
            case "3":
                easiestExerciseEver(args);
                break;
            case "4":
                easiestExerciseEver(args);
                break;
            case "5":
                easiestExerciseEver(args);
                break;
            case "6":
                easiestExerciseEver(args);
                break;
            case "7":
                easiestExerciseEver(args);
                break;
            case "8":
                easiestExerciseEver(args);
                break;
            case "9":
                easiestExerciseEver(args);
                break;
        }
    }
}
