package model;

public class City {
	private String title;
	private float squareKM;
	private String nameOfMayor;
	private String surnameOfMayor;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getSquareKM() {
		return squareKM;
	}

	public void setSquareKM(float squareKM) {
		this.squareKM = squareKM;
	}

	public String getNameOfMayor() {
		return nameOfMayor;
	}

	public void setNameOfMayor(String nameOfMayor) {
		this.nameOfMayor = nameOfMayor;
	}

	public String getSurnameOfMayor() {
		return surnameOfMayor;
	}

	public void setSurnameOfMayor(String surnameOfMayor) {
		this.surnameOfMayor = surnameOfMayor;
	}

	public City(String title, float squareKM, String nameOfMayor, String surnameOfMayor) {
		this.title = title;
		this.squareKM = squareKM;
		this.nameOfMayor = nameOfMayor;
		this.surnameOfMayor = surnameOfMayor;
	}

	@Override
	public String toString() {
		return "City [title=" + title + ", squareKM=" + squareKM + ", nameOfMayor=" + nameOfMayor + ", surnameOfMayor="
				+ surnameOfMayor + "]";
	}

}
