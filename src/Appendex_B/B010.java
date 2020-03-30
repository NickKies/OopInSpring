package Appendex_B;

import java.util.function.*;

public class B010 {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("hello");
        Supplier<Integer> sup = () -> 3 * 3;
        Consumer<Integer> con = num -> System.out.println(num);
        Function<Integer, String> fun = num -> "input: " + num;
        Predicate<Integer> pre = num -> num > 10;
        UnaryOperator<Integer> uOp = num -> num * num;

        BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str + num);
        BinaryOperator<Integer> bOp = (num1, num2) -> num1 - num2;
    }
}
