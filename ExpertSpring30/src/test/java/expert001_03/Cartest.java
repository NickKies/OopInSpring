package test.java.expert001_03;

import main.java.expert001_03.AmericaTire;
import main.java.expert001_03.Car;
import main.java.expert001_03.KoreaTire;
import main.java.expert001_03.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cartest {
    @Test
    public void 자동차_한국타이어_장착_타이어브랜드_테스트() {
        Tire tire1 = new KoreaTire();
        Car car1 = new Car();
        car1.setTire(tire1);

        assertEquals("장착된 타이어 : 한국 타이어", car1.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트() {
        Tire tire2 = new AmericaTire();
        Car car2 = new Car();
        car2.setTire(tire2);

        assertEquals("장착된 타이어 : 미국 타이어", car2.getTireBrand());
    }
}
