package Assignments;

public class ArrayAssignment {

	public static void main(String[] args) {

		String semester[] = new String[5];
		semester[0] = "Sem1";
		semester[1] = "Sem2";
		semester[2] = "Sem3";
		semester[3] = "Sem4";
		semester[4] = "Sem5";

		String subject[][] = new String[5][6];
		subject[0][0] = "Subject1";
		subject[0][1] = "Subject2";
		subject[0][2] = "Subject3";
		subject[0][3] = "Subject4";
		subject[0][4] = "Subject5";

		String status[][] = new String[5][6];
		status[0][0] = "status1";
		status[0][1] = "status2";
		status[0][2] = "status3";
		status[0][3] = "status4";
		status[0][4] = "status5";

		String actualSubjectValue[][][] = new String[5][6][6];

		actualSubjectValue[0][0][0] = "Mathematics 1";
		actualSubjectValue[0][1][1] = "Physics";
		actualSubjectValue[0][2][2] = "Chemistry";
		actualSubjectValue[0][3][3] = "Computer Programming";
		actualSubjectValue[0][4][4] = "Engineering Drawing";
		actualSubjectValue[0][5][5] = "Basic Electrical Eng.";
		
		actualSubjectValue[1][0][0] = "Mathematics 2";
		actualSubjectValue[1][1][1] = "Mechanics";
		actualSubjectValue[1][2][2] = "Environmental sci.";
		actualSubjectValue[1][3][3] = "Basic Electronics";
		actualSubjectValue[1][4][4] = "Engineering Physics";
		actualSubjectValue[1][5][5] = "Engineering Graphics";
		
		actualSubjectValue[2][0][0] = "Data Structures";
		actualSubjectValue[2][1][1] = "Discrete Mathematics";
		actualSubjectValue[2][2][2] = "Digitral Electronics";
		actualSubjectValue[2][3][3] = "Operrating System";
		actualSubjectValue[2][4][4] = "Signals and Systems";
		actualSubjectValue[2][5][5] = "Objec-Oriented prog.";

		
		actualSubjectValue[3][0][0] = "Algoriitms";
		actualSubjectValue[3][1][1] = "Computer Network";
		actualSubjectValue[3][2][2] = "Database Systems";
		actualSubjectValue[3][3][3] = "Microprocessors";
		actualSubjectValue[3][4][4] = "Communication Eng.";
		actualSubjectValue[3][5][5] = "Software Engineering";
		
		actualSubjectValue[4][0][0] = "Probability & stas";
		actualSubjectValue[4][1][1] = "Machine learning";
		actualSubjectValue[4][2][2] = "Compilewr Design";
		actualSubjectValue[4][3][3] = "Theory of Computation";
		actualSubjectValue[4][4][4] = "Embedded Systems";
		actualSubjectValue[4][5][5] = "Computer Graphics";
		
		
		String actualMarksValue[][][] = new String[5][6][6];

		actualMarksValue[0][0][0] = "Pass(78)";
		actualMarksValue[0][1][1] = "Pass(85)";
		actualMarksValue[0][2][2] = "Fail(21)";
		actualMarksValue[0][3][3] = "Pass(74)";
		actualMarksValue[0][4][4] = "Pass(88)";
		actualMarksValue[0][5][5] = "Pass(79)";
		
		actualMarksValue[1][0][0] = "Pass(82)";
		actualMarksValue[1][1][1] = "Pass(77)";
		actualMarksValue[1][2][2] = "Pass(93)";
		actualMarksValue[1][3][3] = "Fail(19)";
		actualMarksValue[1][4][4] = "Fail(24)";
		actualMarksValue[1][5][5] = "Pass(90)";
		
		actualMarksValue[2][0][0] = "Pass(88)";
		actualMarksValue[2][1][1] = "Pass(81)";
		actualMarksValue[2][2][2] = "Pass(76)";
		actualMarksValue[2][3][3] = "Fail(32)";
		actualMarksValue[2][4][4] = "Pass(82)";
		actualMarksValue[2][5][5] = "Pass(78)";

		
		actualMarksValue[3][0][0] = "Pass(91)";
		actualMarksValue[3][1][1] = "Pass(73)";
		actualMarksValue[3][2][2] = "Fail(19)";
		actualMarksValue[3][3][3] = "Pass(80)";
		actualMarksValue[3][4][4] = "Pass(76)";
		actualMarksValue[3][5][5] = "Pass(87)";
		
		actualMarksValue[4][0][0] = "Pass(86)";
		actualMarksValue[4][1][1] = "Pass(88)";
		actualMarksValue[4][2][2] = "Pass(84)";
		actualMarksValue[4][3][3] = "Pass(95)";
		actualMarksValue[4][4][4] = "Pass(73)";
		actualMarksValue[4][5][5] = "Pass(90)";

		System.out.println("Semester 2 Subject 4 is "+actualSubjectValue[1][4][4]+ "and Semester 2 Subject 5 is "+ actualSubjectValue[1][5][5]);
		System.out.println("Staus/Marks of Semester 4 Subject 3 " + actualMarksValue[3][2][2] + " Staus/Marks of Semester 4 Subject 3 "+ actualMarksValue[3][5][5]);
		
		
	}

}
