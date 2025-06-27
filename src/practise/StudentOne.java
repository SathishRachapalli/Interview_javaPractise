package practise;

import java.util.Objects;

public class StudentOne {
	
	int Id;
	String Name;
	
	public StudentOne(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentOne other = (StudentOne) obj;
		return Id == other.Id && Objects.equals(Name, other.Name);
	}

	public StudentOne() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
	

}
