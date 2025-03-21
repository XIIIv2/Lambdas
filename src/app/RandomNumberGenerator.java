package app;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        return (int) (min + Math.random() * max);
    }
}
