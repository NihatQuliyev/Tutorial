package streamMath;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Math {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7);

        int maxNumber = number.stream()
                .reduce(number.get(0) , Integer::max);


        int minNumber = number.stream()
                        .reduce(0,Integer :: min);

        int sumNumber = number.stream()
                        .reduce(0,Integer ::sum);

        System.out.println(
                        "Min Number : " + minNumber +
                        "\nMax Number : " + maxNumber +
                        "\nSum Number : " + sumNumber
        );

        List<Integer> list = number.stream()
                .map(num ->num*num)
                .collect(Collectors.toList());

        System.out.println("Pow Numbers : " + list);

        List<Integer> list1 =  number.stream()
                .map(num -> IntStream.rangeClosed(1,num)
                .reduce(1,(int x ,int y) -> x*y))
                .collect(Collectors.toList());

        System.out.println("Factorial numbers: " + list1);

    }



}
