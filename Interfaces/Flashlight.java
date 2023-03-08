


	

		public class Flashlight{
			
			public Flashlight() {
			light = false;
			count = 0;
			battery = new ChinaBattery(5);
			
			}
			public void on() {

	if(!light) {
		count++;
		if(count <= maxCount) {
			light = true;
			light = battery.charge();			
		}
	}
			}
			public void off() {
				light = false;
			}
			public boolean isLight() {
				return light;
			}
			private static final int maxCount = 5;
			private ChinaBattery battery;
			private boolean light;
	private int count;
	
		

	
		}
	


