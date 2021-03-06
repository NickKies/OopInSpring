package test.java.expert002;

import main.java.expert001_02.AmericaTire;
import main.java.expert001_02.Car;
import main.java.expert001_02.KoreaTire;
import main.java.expert001_02.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void 자동차_한국타이어_장착_타이어브랜드_테스트() {
        Tire tire1 = new KoreaTire();
        Car car1 = new Car(tire1);

        assertEquals("장착된 타이어 : 한국 타이어", car1.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트() {
        Tire tire2 = new AmericaTire();
        Car car2 = new Car(tire2);

        assertEquals("장착된 타이어 : 미국 타이어", car2.getTireBrand());
    }
}
