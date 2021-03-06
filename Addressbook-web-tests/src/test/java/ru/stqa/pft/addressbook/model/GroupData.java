package ru.stqa.pft.addressbook.model;

public class GroupData {
//	public void setId(int id) {
//		this.id = id;
//	}


	private final String name;
	private int id ;
	private final String header;
	private final String footer;




	public GroupData(String name, String header, String footer) {
		this.id = 0;
		this.name = name;
		this.header = header;
		this.footer = footer;
	}
	public GroupData(int id, String header, String footer, String name) {
		this.id = id;
		this.name = name;
		this.header = header;
		this.footer = footer;
	}


	public String getName() {

		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		       this.id = id;
		    }

	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}

	@Override
   public String toString() {
		        return "GroupData{" +"name='" + name + '\'' + ", id='" + id + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GroupData groupData = (GroupData) o;

		if (id != groupData.id) return false;
		return name != null ? name.equals(groupData.name) : groupData.name == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + id;
		return result;
	}
}


