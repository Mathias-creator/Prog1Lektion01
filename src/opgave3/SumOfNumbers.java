package opgave3;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        var listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var sum = 0;
        for (int i = 0; i < listOfNumbers.size() ; i++) {
            sum += listOfNumbers.get(i);
            System.out.println(sum);
        }
    }
}
