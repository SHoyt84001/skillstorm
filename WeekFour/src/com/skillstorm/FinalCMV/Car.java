package com.skillstorm.FinalCMV;
public class Car {
	public int speedLimit = 90;
	
	private void driveFast() {
		speedLimit = 120;
	}
	
	public static void main(String[] args) {
		Car VW = new Car();
		System.out.println(VW);
	}

	@Override
	public String toString() {
		return "Car [speedLimit=" + speedLimit + "]";
	}

	public int getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

}

class VW extends Car {
	
	void driveFast () {
		speedLimit = 100;
	}
	
	public static void main(String[] args) {
		VW test = new VW();
		test.driveFast();
		System.out.println("This is the speed of the test: "  + test);
	}
}