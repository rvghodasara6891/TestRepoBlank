import coursePackage.CourseNames;

class StudentScheduler {

	private Student[] students = new Student[10];
	private int studentCounter;

	void addStudent(String name, int rollNumber, CourseNames[] courseNames) {
		boolean bStudentPresent = false;

		// Added the validation part for roll Number
		if (studentCounter > 0) {
			for (int i = 0; i < studentCounter; i++) {
				System.out.println(studentCounter);

				if (students[i].getRollNumber() == rollNumber) {

					System.out.println("Roll Number " + rollNumber
							+ "already exists. Please add record for some different roll number");
					bStudentPresent = true;
					break;
				}
			}

		}

		if (!bStudentPresent) {
			Student student = new Student(name, rollNumber,courseNames);
			students[studentCounter++] = student;
		}

	}

	void showStudents() {
		for (int i = 0; i < studentCounter; i++) {
			System.out.println("Roll Number: " + students[i].getRollNumber() + "," + "Name: " + students[i].getName());
        
			
			
		}
		
		

	}

}
