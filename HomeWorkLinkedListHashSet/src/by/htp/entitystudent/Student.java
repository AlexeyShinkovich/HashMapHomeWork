package by.htp.entitystudent;

public class Student implements Comparable<Object> {
	private String name;
	private String firstname;
	private String nameF;

	public Student() {
	}

	public Student(String name, String firstname, String nameF) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.nameF = nameF;
	}

	public String getName() {
		return name;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getNameF() {
		return nameF;
	}

	@Override
	public String toString() {
		return firstname + " " + name + " " + nameF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nameF == null) ? 0 : nameF.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nameF == null) {
			if (other.nameF != null)
				return false;
		} else if (!nameF.equals(other.nameF))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		int compareTo = this.firstname.compareTo(((Student) o).firstname);
		if (compareTo != 0) {
			return compareTo;
		} else if ((compareTo = this.name.compareTo(((Student) o).name)) != 0) {
			return compareTo;
		}
		return this.nameF.compareTo(((Student) o).nameF);
	}

}
