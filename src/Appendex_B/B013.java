package Appendex_B;

import java.util.Arrays;

public class B013 {
    public static void main(String[] args) {
        Integer[] ages = { 20, 25, 18, 27, 30, 21, 17, 19, 34, 28 };

        Arrays.stream(ages)
                .filter(age -> age < 20) // SQL WHERE 절과 같다. true/false 반환
                .forEach(age -> System.out.format("Age %d!! Cant't enter\n", age));
    }
}
