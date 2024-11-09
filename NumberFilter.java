import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberFilter {
    public static void main(String[] args) {
        // Step 1: Create a list of integers with both positive and negative numbers
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        System.out.println("Original List: " + numbers);

        // Step 2: Define predicates using lambda expressions
        Predicate<Integer> isPositive = n -> n >= 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        // Step 3: Filter the list based on each condition and print the results
        List<Integer> positiveNumbers = numbers.stream().filter(isPositive).collect(Collectors.toList());
        System.out.println("Positive Numbers: " + positiveNumbers);

        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> greaterThan10Numbers = numbers.stream().filter(isGreaterThan10).collect(Collectors.toList());
        System.out.println("Numbers Greater Than 10: " + greaterThan10Numbers);
    }
}

