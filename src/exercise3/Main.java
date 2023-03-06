package exercise3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        iterateList(features);
    }

    private static void iterateList(List<String> list) {
        list.forEach(feature -> System.out.println(feature));
    }
}
