package Chap06.templateMethodPattern;

public abstract class Animal {
    // template method
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온 ...");
        play();
        runSomething();
        System.out.println("잘했어!");
    }

    // 추상 메서드
    abstract void play();

    // Hook method
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
