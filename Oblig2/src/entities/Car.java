package entities;

public class Car {

	private Integer registrationNumber;
	private String model;
	private String color;
	private Chassis chassis;
	private Boolean available;

	public Car(Integer registrationNumber, String model, String color, Chassis chassis) {
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.color = color;
		this.chassis = chassis;
	}

}
