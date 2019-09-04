/**
 * 
 */
import java.util.Scanner;
/**
 * @author Divesh
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*creating Varaibles*/
		
		String inputnid;
		String inputfirstName;
		String inputlastName;
		String inputdob;
		char inputgender;
		double inputheight;
		double inputweight;
		
		/*initiate a first person object*/
		
		Person p1 = new Person();
		System.out.println(p1);
		
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the nid");
		inputnid = myScanner.next();
		
		System.out.println("Enter the firstName");
		inputfirstName = myScanner.next();
		
		System.out.println("Enter the lastName");
		inputlastName = myScanner.next();
		
		System.out.println("Enter the dob");
		inputdob = myScanner.next();
		
		System.out.println("Enter the gender");
		inputgender = myScanner.next().charAt(0);
		
		System.out.println("Enter the height");
		inputheight = myScanner.nextDouble();
		
		System.out.println("Enter the weight");
		inputweight = myScanner.nextDouble();
		
		
		
		/*set the attributes of the Person p2*/
		Person p2 = new Person();
		
		p2.setnid(inputnid);
		p2.setfirstName(inputfirstName);
		p2.setlastName(inputlastName);
		p2.setdob(inputdob);
		p2.setgender(inputgender);
		p2.setheight(inputheight);
		p2.setweight(inputweight);
		
		
		/*display details*/
		System.out.println("nid: " + p2.getnid());
		System.out.println("firstName: " + p2.getfirstName());
		System.out.println("lastName: " + p2.getlastName());
		System.out.println("dob: " + p2.getdob());
		System.out.println("gender: " + p2.getgender());
		System.out.println("height: " + p2.getheight());
		System.out.println("weight: " + p2.getweight());
		
		System.out.println("FULLrecord of person2: " + p2.toString());
		
		
		/* Creating Arrays*/
		
		int size=0;
		
		System.out.println("How many person are there:");
		size = myScanner.nextInt();
		
		Person[] list = new Person[size];
		for (int i =0; i<list.length; i++) {
			
			System.out.println("Please enter the details for person" + (i+1) + ":");
				
			list[i] = new Person();
			
			System.out.println("nid");
			String nationalID = myScanner.next();
			list[i].setnid(nationalID);
			
			System.out.println("firstName");
			String name = myScanner.next();
			list[i].setfirstName(name);
			
			System.out.println("lastName");
			String surname = myScanner.next();
			list[i].setlastName(surname);
			
			System.out.println("dob");
			String birth = myScanner.next();
			list[i].setdob(birth);
			
			System.out.println("gender");
			char gender = myScanner.next().charAt(0);
			list[i].setgender(gender);
			
			System.out.println("height");
			double height = myScanner.nextDouble();
			list[i].setheight(height);
			
			System.out.println("weight");
			double weight = myScanner.nextDouble();
			list[i].setweight(weight);
			
			
			System.out.println("FULLrecord of Person:" + list[i].toString() + ".");
		}
		
		
		for (int i =0; i<list.length; i++) {
			System.out.println("BMI of Person" + (i+1) + ":");
			System.out.println(list[i].calculateBmi());
		}
		
		
		
		
		
		

	}

}
