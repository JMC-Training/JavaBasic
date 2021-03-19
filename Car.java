package test;

public class Car {

	private String color = "無色";

	public Car(String color) {
		this.color = color;
	}

	public void drive() {
		String message = this.color + "の車が走っています";
		System.out.println(message);
	}
}

