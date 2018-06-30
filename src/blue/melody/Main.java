package blue.melody;

import java.util.*;

public class Main {

    private static void easiestExerciseEver(String[] args) {
        System.out.println("*");
    }

    private static void drawHorizontalLine(String[] args) {
        for (int n = 0; n < Integer.parseInt(args[1]); n++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawVerticalLine(String[] args) {
        for (int n = 0; n < Integer.parseInt(args[1]); n++) {
            System.out.println("*");
        }
    }

    private static void drawRightTriangle(String[] args) {
        int size = Integer.parseInt(args[1]);
        for (int n = 0; n < size; n++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawIsoTriangle(String[] args) {
        int size = Integer.parseInt(args[1]);
        for (int row = 1; row <= size; row++) {
            for (int i = size - row; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawDiamond(String[] args) {
        int size = Integer.parseInt(args[1]);
        for (int row = 1; row <= size; row++) {
            for (int i = size - row; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = size - 1; row > 0; row--) {
            for (int i = size - row; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawDiamondName(String[] args) {
        int size = Integer.parseInt(args[1]);
        for (int row = 1; row < size; row++) {
            for (int i = size - row; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Melody");
        for (int row = size - 1; row > 0; row--) {
            for (int i = size - row; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Set<Integer> generate(int n) {
        // TreeSet's are automatically sorted and unique
        Set<Integer> factors = new TreeSet<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Use the first argument to select which exercise (1 - 9)");
            return;
        }

        switch (args[0]) {
            case "1":
                easiestExerciseEver(args);
                break;
            case "2":
                drawHorizontalLine(args);
                break;
            case "3":
                drawVerticalLine(args);
                break;
            case "4":
                drawRightTriangle(args);
                break;
            case "5":
                drawIsoTriangle(args);
                break;
            case "6":
                drawDiamond(args);
                break;
            case "7":
                drawDiamondName(args);
                break;
            case "8":
                fizzBuzz();
                break;
            case "9":
                for (int i : generate(Integer.parseInt(args[1]))) {
                    System.out.print(i);
                    System.out.print(", ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Please select a number between 1 and 9");
        }
    }
}
