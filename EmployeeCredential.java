package EmployeeAssignment;

import java.util.Scanner;

public class EmployeeCredential {
	
	public static void main (String [] args) {
		
		//Employee department id input
		Scanner id = new Scanner(System.in);
        System.out.println ("Enter Department Id: \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
        int departmentId = id.nextInt();
        
		
		//Employee Name Input
		Scanner fnm = new Scanner(System.in);
        System.out.println ("Enter First Name: ");
        String firstName = fnm.nextLine();
        
		Scanner lnm = new Scanner(System.in);
        System.out.println ("Enter Last Name: ");
        String lastName = lnm.nextLine();

        EmployeeService service = new EmployeeService();
        service.authenticate(departmentId, firstName, lastName);

		System.out.println("Your Mail Id is:" + firstName+ "." + lastName + "@gl.in");
		System.out.println("Your Password is: Zaq12wsx");
    

		
	}
		

}
