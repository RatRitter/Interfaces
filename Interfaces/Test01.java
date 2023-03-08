

import org.junit.jupiter.api.Test;

//import flashlight.Flashlight;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
class Test01 {

	@Test
	void testFlashlightOff() {
		Flashlight flashlight = new Flashlight();
		assertFalse(flashlight.isLight());
	}
	@Test
	void testFlashlightOn() {
		Flashlight flashlight = new Flashlight();
		flashlight.on();
		assertTrue(flashlight.isLight());
	}
	@Test
	void testFlashlightIsOff() {
		Flashlight flashlight = new Flashlight();
		flashlight.on();
		flashlight.off();
		assertFalse(flashlight.isLight());
}
	@Test
	void testFiveTurn() {
		Flashlight flashlight = new Flashlight();
		for(int i = 0;i < 5;i++) {
			flashlight.on();
			flashlight.off();
			
		}
		flashlight.on();
		assertFalse(flashlight.isLight());
	}
	@Test
	void testTurnFiveOff() {
		Flashlight flashlight = new Flashlight();
		for(int i = 0; i < 5;i++) {
			flashlight.on();
		}
		flashlight.on();
		assertTrue(flashlight.isLight());
	}
	@Test
	void testChinaBattery() {
		ChinaBattery battery = new ChinaBattery(5);
		for(int i = 0; i < 5;i++) {
			battery.charge();
		}
		Assert.assertFalse(battery.charge());
	}
}