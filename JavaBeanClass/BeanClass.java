
/* When a class has the private data members and has the public getter and setter methods
 * then those call will be called as the JavaBeanClass 
 * And the object created for the JavaBeanClass are called as the JavaBeanObject
 * */
public class BeanClass {

	private String name ="Qspiders" ;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		BeanClass b = new BeanClass();
		
		/*
		 * Even though if u have intalized the default value the value to the variable
		 * Is will be replaced if we call the setMethod
		 */
		b.setName("Girsih");
		System.out.println(b.getName());
	}

}
