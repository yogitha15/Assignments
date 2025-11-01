package Assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees empNames= new Employees();
		Employees empIds= new Employees();
		
		String empName []= new String[3];
		
		empName [0]=empNames.empName1;
		empName [1]=empNames.empName2;
		empName [2]=empNames.empName3;
		
		int[] empId=new int[3];
		empId[0]=empIds.empId1;
		empId[1]=empIds.empId2;
		empId[2]=empIds.empId3;
		
		System.out.println ("Employee Name = "+ empName [0] +" , "+ "Employee Id = "+ empId[0]);
		System.out.println ("Employee Name = "+ empName [1] +" , "+ "Employee Id = "+ empId[1]);
		System.out.println ("Employee Name = "+ empName [2] +" , "+ "Employee Id = "+ empId[2]);
		
		

	}

}
