package demo;

import java.util.stream.IntStream;

public class Main {

    void foo(String x){
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello!");
        IntStream.range(1, 10).forEach(System.out::println);
    }

    void boo(String x){
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello!");
        IntStream.range(1, 10).forEach(System.out::println);
    }


}
