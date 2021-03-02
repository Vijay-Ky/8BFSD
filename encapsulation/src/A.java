class A 
{
	private String name;
	private String idNum;
	private int age;

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getIdnum()
	{
		return idNum;
	}

	public void setAge(int newAge)
	{
		this.age = newAge;
	}

	public void setName(String newName)
	{
		this.name =  newName;
	}

	public void setIdnum(String newId)
	{
		this.idNum = newId;
	}
}
class MyDriver 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.setName("vijay");
		a1.setAge(990);
		a1.setIdnum("A1420");
		System.out.println("Name: " + a1.getName() + " Age: " + a1.getAge() +
			" Idnum: " + a1.getIdnum());
	}
}
