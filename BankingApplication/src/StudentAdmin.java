import java.util.Scanner;

import coursePackage.CourseNames;

public class StudentAdmin {

	private static Scanner scanner= new Scanner(System.in);
	private static StudentScheduler studentscheduler= new StudentScheduler();
	private static int courseCounter;
	
	public static void main(String[] args) {
				
		while (true)
		{
			System.out.println("1. Add Student");
			System.out.println("2. ShowStudents");
			System.out.println("3.Exit");
			
			int iOption=scanner.nextInt();
			
			switch(iOption)
			{			
			case 1: addStudent();	
			break;
			case 2: showStudents();
			break;
			case 3:System.exit(0);
			break;
			default:System.out.println("Sorry. You have entered wrong choice");
						
			}
					
		}
		

	}

	private static void showStudents() {
		studentscheduler.showStudents();
		
	}

	private static void addStudent() {
			
		CourseNames [] courseNames= new CourseNames[10];
		
		System.out.println("Enter roll number, name and courses of student");
		int rollNumber=scanner.nextInt();
		String name=scanner.next();
		while(true)
		{
			String courseName=scanner.next();
			CourseNames courseNameObject= new CourseNames(courseName);
			courseNames[courseCounter ++]=courseNameObject;
			System.out.println("Do you want to add some more courses? Y/N");
			String yOrn=scanner.next();
			if (yOrn.equalsIgnoreCase("N")||yOrn.equalsIgnoreCase("n"))
			{
				courseCounter=0;
				break;
							
			}
			
		}
		studentscheduler.addStudent(name, rollNumber,courseNames);
		
	}

}
