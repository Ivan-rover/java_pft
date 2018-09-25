package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {

	private int id;
	private final String firstname;
	private final String house;
	private final String address;
	private final String group;

	public File getPhoto() {
		return photo;
	}

	public ContactData withPhoto(File photo) {
		this.photo = photo;
		return this;
	}

	private File photo;

	public ContactData(String firstname, String house, String address, String group) {
		this.id = Integer.MAX_VALUE;
		this.firstname = firstname;
		this.house = house;
		this.address = address;
		this.group = group;
	}

	public ContactData(int id, String firstname, String house, String address, String group) {
		this.id = id;
		this.firstname = firstname;
		this.house = house;
		this.address = address;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getHouse() {
		return house;
	}

	public String getAddress() {

		return address;
	}

	public String getGroup() {

		return group;
	}

	@Override
	public String toString() {
		return "ContactData{"
				+ "id='" + id + '\'' +
				", firstname='" + firstname + '\'' +
				", house='" + house + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ContactData that = (ContactData) o;


		if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
		return house != null ? house.equals(that.house) : that.house == null;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
		result = 31 * result + (house != null ? house.hashCode() : 0);
		return result;
	}
}
	//
//	public String getGroup() {
//	return group;
//	}


