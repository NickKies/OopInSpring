package Chap06.templateCallbackPatternRefactoring;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총 초초종총 총! 총");

        System.out.println();

        rambo.runContext("칼! 카가갈 칼! 칼!");

        System.out.println();

        rambo.runContext("망치! 마마망치ㅢ치칙!");
    }
}
