package Chap04.staticBlock;

public class Driver05 {
    public static void main(String[] args) {
        System.out.println("메인 메서드 시작");
        System.out.println(Animal.age);
    }
}

class Animal {
    static int age = 0;

    static {
        System.out.println("Animal class ready on!");
    }
}
