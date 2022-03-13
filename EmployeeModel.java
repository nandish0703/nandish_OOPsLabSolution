package EmployeeAssignment;

public class EmployeeModel {
	
	private String frstName;
	private String lstName;
	private int departmentId;
	
	public EmployeeModel(int id, String fnm, String lnm) {
		this.departmentId = id;
		this.frstName = fnm;
		this.lstName = lnm;
	}
	
	public int getDepartmentId () {
		 return departmentId;
	}
	
	public String getFrstNm () {
		 return frstName;
	}
	
	public String getLstNm () {
		 return lstName;
	}
	
	
}
