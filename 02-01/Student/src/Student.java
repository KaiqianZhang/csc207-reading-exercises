/**
 * 
 */

/**
 * @author Kaiqian
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private int age;

	/**
	 * Constructor 
	 */
	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
	
	/**
	 * get the first name
	 * 
	 * @return a string that is first name
	 */
	public String getFirstName(){
		return this.firstName;
	}
	
	/**
	 * set the first name 
	 * 
	 * @param firstName a string
	 * @return zero
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	/**
	 * get the last name
	 * 
	 * @return a string that is last name
	 */
	public String getLastName(){
		return this.lastName;
	}
	
	/**
	 * set the last name 
	 * 
	 * @param lastName a string
	 * @return zero
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
	 * get the id
	 * 
	 * @return an integer id
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * set the id
	 * 
	 * @param id an integer
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * get the age
	 * 
	 * @return an integer age
	 */
	public int getAge(){
		return this.age;
	}
	
	/**
	 * set the age
	 * 
	 * @param age an integer
	 */
	public void setAge(int age){
		this.age = age;
	}
	
	public static void main(String[] args) {
		Student myStudent = new Student("Kaiqian", "Zhang", 31, 22);
		System.out.println(myStudent.getId());
	}

}
