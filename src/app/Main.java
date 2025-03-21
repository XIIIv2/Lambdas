package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.printf("%d + %d = %d%n", a, b, mathOperation.operate(a, b));

        String testString = "test";
        //StringManipulator stringManipulator = input -> input.toUpperCase();
        StringManipulator stringManipulator = String::toUpperCase;
        System.out.printf("\"%s\" in upper case: %s%n", testString, stringManipulator.manipulate(testString));

        String processString = "LoReM iPSuM";
        Function<String, Integer> stringListProcessor = StringListProcessor::countUpperCase;
        System.out.printf("Total upper case letters in \"%s\": %d%n", processString, stringListProcessor.apply(processString));

        int min = 1;
        int max = 100;
        Supplier<Integer> randomNumberGenerator = () -> RandomNumberGenerator.generateRandomNumber(min , max);
        System.out.printf("Random number (min=%d, max=%d): %d%n", min, max, randomNumberGenerator.get());
    }
}
