
public class Person {
	
	/*attributes*/
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	
	
	/*constructors*/
	
	
	/**
	 * default constructor
	 */
	
	public Person() {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = null;
		this.gender = '_';
		this.height = 0.0;
		this.weight = 0.0;
	}

	
	/**
	 * overload 2 parameter constructor
	 * @param dod of person
	 * @param weight of person
	 */
	
	public Person(String dob, double weight) {
		this.dob = dob;
		this.weight = weight;
		
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.gender = '_';
		this.height = 0.0;
		
	}
	
	/**
	 * Overloaded 7 parameter constructors
	 * @param nid of person
	 * @param firstName of person
	 * @param lastName of person
	 * @param dod of person
	 * @param gender of person
	 * @param height of person
	 * @param weight of person
	 */
	
	public Person(String nid, String firstName, String lastName, String dob, char gender, double height, double weight) {
		this.nid = nid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	/*behaviors*/
	
	public String getName() {
		return this.firstName+ "" + this.lastName;
		
	}
	
	/**
	 * @param height of person
	 * @param weight of person
	 * @return the bmi of the person
	 */
	
	public double calculateBmi() {
		return(this.weight/ (Math.pow(this.height, 2)));
	}
	
	
	/**
	 * 
	 * return bmi of Person we are manipulating
	 */
	
	

	
	public String getnid() {
		return this.nid;
	}
	/**
	 * @return the firstName
	 */
	public String getfirstName() {
		return this.firstName;
	}
	
	/**
	 * @return thelastName
	 */
	public String getlastName() {
		return lastName;
	}
	
	/**
	 * @return the bob
	 */
	public String getdob() {
		return dob;
	}
	
	/**
	 * @return the gender
	 */
	public char getgender() {
		return gender;
	}
	
	/**
	 * @return the height
	 */
	public double getheight() {
		return height;
	}
	
	/**
	 * @return the weight
	 */
	public double getweight() {
		return weight;
		
	}
	
	/*setter*/
	
	public void setnid(String nid) {
		this.nid = nid;
		
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setlastName(String lastName) {
	this.lastName = lastName;
	}
	
	public void setdob(String dob) {
		this.dob = dob;
	}
	
	public void setgender(char gender) {
		this.gender = gender;
	}
	
	public void setheight(double height) {
		this.height = height;
	}
	
	public void setweight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return nid + " " + firstName + " " + lastName + " " + dob + " " + gender + " " + height + " " + weight;
	}
	
	
	

}
