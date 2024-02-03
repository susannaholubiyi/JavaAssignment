import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike automaticBike;
    @BeforeEach
    public void initializeBike(){
        automaticBike = new Bike();
    }

    @Test
    public void turnBikeOn_bikeIsOnTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();

        assertTrue(automaticBike.isOn());
    }

    @Test
    public void turnBikeOff_bikeIsOffTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        automaticBike.toggle();

        assertFalse(automaticBike.isOn());
    }

    @Test
    public void increaseBikeSpeedWhenBikeIsOn_speedincreasesTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1, automaticBike.getGear());
        automaticBike.accelerateSpeed();
        assertEquals(1, automaticBike.getSpeed());
        assertEquals(1, automaticBike.getGear());

    }

    @Test
    public void increaseBikeSpeedWhenBikeIsOff_speedRemainsZeroTest() {
        assertFalse(automaticBike.isOn());
        assertEquals(0, automaticBike.getSpeed());

        automaticBike.accelerateSpeed();
        assertEquals(0, automaticBike.getSpeed());
    }

    @Test
    public void bikeIsTurnedOn_gearIsOnGearOneTest() {
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1, automaticBike.getGear());
    }

    @Test
    public void  accelerateTo21_gearChangesToGearTwoTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1,automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());
        for(int count = 1; count <= 21; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(21, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());
    }

    @Test
    public void  accelerateTo29_gearIsStillOnGearTwoTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1,automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());
        for(int count = 0; count < 25; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(29, automaticBike.getSpeed());

        assertEquals(2, automaticBike.getGear());
    }

    @Test
    public void accelerateTo31_gearChangesToGearThreeTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1,automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());
        for(int count = 0; count < 26; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(31, automaticBike.getSpeed());

        assertEquals(3, automaticBike.getGear());
    }

    @Test
    public void  accelerateTo40_gearIsStillOnGearTwoTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1,automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());
        for(int count = 0; count < 29; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(40, automaticBike.getSpeed());

        assertEquals(3, automaticBike.getGear());
    }

    @Test
    public void accelerateTo41_gearChangesToGearFourTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1,automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());
        for(int count = 0; count < 30; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(43, automaticBike.getSpeed());

        assertEquals(4, automaticBike.getGear());
    }

    @Test
    public void decelerateBikeSpeedWithoutAcceleratingFirst_speedRemainsZeroTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        assertEquals(1, automaticBike.getGear());
        automaticBike.decelerateSpeed();
        assertEquals(0, automaticBike.getSpeed());
        assertEquals(1, automaticBike.getGear());

    }

    @Test
    public void deceleratesTo39_gearChangesToGearThreeFromFourTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        for(int count = 0; count < 30; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(43, automaticBike.getSpeed());
        assertEquals(4, automaticBike.getGear());

        automaticBike.decelerateSpeed();
        assertEquals(39, automaticBike.getSpeed());
        assertEquals(3, automaticBike.getGear());
    }

    @Test
    public void deceleratesTo31_gearIsStillAtThreeTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        for(int count = 0; count < 29; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(40, automaticBike.getSpeed());
        assertEquals(3, automaticBike.getGear());

        for(int count = 1; count <=3; count++) {
            automaticBike.decelerateSpeed();
        }
        assertEquals(31, automaticBike.getSpeed());
        assertEquals(3, automaticBike.getGear());
    }

    @Test
    public void deceleratesTo29_gearChangesToGearTwoFromThreeTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        for(int count = 0; count < 26; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(31, automaticBike.getSpeed());
        assertEquals(3, automaticBike.getGear());

        automaticBike.decelerateSpeed();
        assertEquals(28, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());
    }

    @Test
    public void deceleratesTo21_gearIsStillAtTwoTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());

        for(int count = 0; count < 25; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(29, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());

        for(int count = 1; count <=4; count++) {
            automaticBike.decelerateSpeed();
        }
        assertEquals(21, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());
    }

    @Test
    public void  accelerateBelow21_gearChangesToGearOneTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.toggle();
        assertTrue(automaticBike.isOn());


        for(int count = 1; count <= 21; count++){
            automaticBike.accelerateSpeed();
        }
        assertEquals(21, automaticBike.getSpeed());
        assertEquals(2, automaticBike.getGear());

        automaticBike.decelerateSpeed();
        assertEquals(19, automaticBike.getSpeed());
        assertEquals(1, automaticBike.getGear());
    }

    @Test
    public void decreaseBikeSpeedWhenBikeIsOff_speedRemainsZeroTest() {
        assertFalse(automaticBike.isOn());
        assertEquals(0, automaticBike.getSpeed());

        automaticBike.decelerateSpeed();
        assertEquals(0, automaticBike.getSpeed());
    }

}

