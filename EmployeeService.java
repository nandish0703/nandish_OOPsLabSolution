package EmployeeAssignment;

public class EmployeeService {

	
	private EmployeeModel [] employee = new EmployeeModel [4];
	{
		employee [0] = new EmployeeModel(1,"abc","tech");
		employee [1] = new EmployeeModel(2,"def","admin");
		employee [2] = new EmployeeModel(3,"ghi","hr");
		employee [3] = new EmployeeModel(4,"jkl","legal");
		
	}
	
	
	private EmployeeModel getDepartmentId(int id) {
		switch (id) {
		case 1:
		 return employee [0];
		case 2:
			 return employee [1];
		case 3:
			 return employee [2];
		case 4:
			 return employee [3];
		default:	
			return null;
					 
		}
		
	}	
	
	public boolean authenticate(int id, String firstName, String lastName) {
		EmployeeModel empl = new EmployeeModel(id, lastName, lastName);
		//if (empl.getDepartmentId().equals(id)) {
			if(empl.getFrstNm().equals(firstName)) {
				if(empl.getLstNm().equals(lastName)) {
					return true;
				}
				return false;
			}
			return false;
		//}
		//return false;
	}

}
