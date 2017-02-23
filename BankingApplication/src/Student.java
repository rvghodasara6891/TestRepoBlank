import coursePackage.CourseNames;

class Student {

	private String name;//Student Name
	private int rollNumber;// Roll Number
	private CourseNames[] courseNames;
	
	public CourseNames[] getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(CourseNames[] courseNames) {
		this.courseNames = courseNames;
	}


	public Student(String name, int rollNumber, CourseNames[] courseNames) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.courseNames = courseNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
		
}
