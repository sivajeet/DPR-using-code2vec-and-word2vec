// Java code to demonstrate method chaining

final class Student {

	// instance fields
	private int id;
	private String name;
	private String address;

	// Setter Methods
	// Note that all setters method
	// return this reference
	public Student setId(int id)
	{
		this.id = id;
		return this;
	}

	public Student setName(String name)
	{
		this.name = name;
		return this;
	}

	public Student setAddress(String address)
	{
		this.address = address;
		return this;
	}

	@Override public String toString()
	{
		return "
		id = "
		+this.id + "
		, name = "
		+this.name + "
		, address = "
		+this.address;
	}
}

// Driver class
public class MethodChainingDemo {
	public static void main(String args[])
	{
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setId(1)
			.setName(" Ram & quot;)
			.setAddress(" Noida & quot;);
		student2.setId(2)
			.setName(" Shyam & quot;)
			.setAddress(" Delhi & quot;);

		System.out.println(student1);
		System.out.println(student2);
	}
}
