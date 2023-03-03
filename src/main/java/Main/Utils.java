package Main;


import java.util.*;
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
    public static String task3(List<String> numbers){

        return numbers.stream()
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
    public static List<Long> task4(long a, long c,long m,int size){
        long seed = System.currentTimeMillis();
        return  Stream
                .iterate(seed, previous -> (a * previous + c) % m)
                .limit(size)
                .collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T>res=new ArrayList<>();
        Iterator <T> iterator1=first.iterator();
        Iterator <T> iterator2=second.iterator();
        while (iterator2.hasNext()&& iterator2.hasNext()){
            res.add(iterator2.next());
            res.add(iterator1.next());
        }
        return res.stream();
    }
}
