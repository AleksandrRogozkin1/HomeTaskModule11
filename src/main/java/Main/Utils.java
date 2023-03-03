package Main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public static String task1(List<String> strings){
        return strings.stream()
                .filter(str -> strings.indexOf(str)%2 != 0)
                .collect(Collectors.joining(" "));
    }
    public static List<String> task2(List<String> strings){
        return strings
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public static String task3(String[] strings){
        List<String> list = new ArrayList<>();
        return Arrays.stream(strings)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
    public static Stream<Long> task4(long a, long c,long m,int size){
        long seed = System.currentTimeMillis();
        return Stream
                .iterate(seed, previous -> (a * previous + c) % m)
                .limit(size);

    }


}
