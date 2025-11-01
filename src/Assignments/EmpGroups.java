package Assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees Emp = new Employees();
		//Employees empIds = new Employees();

		String empName[] = new String[3];

		empName[0] = Emp.empName1;
		empName[1] = Emp.empName2;
		empName[2] = Emp.empName3;

		int[] empId = new int[3];
		empId[0] = Emp.empId1;
		empId[1] = Emp.empId2;
		empId[2] = Emp.empId3;

		System.out.println("Employee Name = " + empName[0] + " , " + "Employee Id = " + empId[0]);
		System.out.println("Employee Name = " + empName[1] + " , " + "Employee Id = " + empId[1]);
		System.out.println("Employee Name = " + empName[2] + " , " + "Employee Id = " + empId[2]);

	}

}
