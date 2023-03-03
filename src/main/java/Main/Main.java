package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("name1");
        nameList.add("name2");
        nameList.add("name3");
        nameList.add("name4");
        System.out.println("\nTask1\n"+Utils.task1(nameList));

        System.out.println("\nTask2\n"+Utils.task2(nameList));

        List <String> numbers = List.of("1, 2, 0", "4, 5");
        System.out.println("\nTask3\n"+Utils.task3(numbers));

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        int size =5;
        System.out.println("\nTask4\n"+Utils.task4(a, c, m, size));


        Stream<Integer> stream1=Stream.of(1,2,3,4,5);
        Stream<Integer> stream2=Stream.of(6,7,8,9,0);

        System.out.println("\nTask5\n"+Utils.zip(stream1,stream2).collect(Collectors.toList()));

    }

}
