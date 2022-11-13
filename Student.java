public class Student {
	private String name = "Jack";
	private int[] grades = new int[5];
	private int gradeIndex = 0;
	//constructor
	Student(String name){
		this.name=name;
		//this.grades= null;
		this.gradeIndex=0;
	}
	//get all the private data and the number in the array
	public String getName() {
		return name;
	}
	public int[] getGrades() {
		return grades;
	}
	public int getGradeIndex() {
		return gradeIndex;
	}
	public int getGrade(int idx) {
		return grades[idx];
	}
	//reset the name and number in the array
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int gradeIndex, int grade) {
		this.grades[gradeIndex]=grade;
	}
	
	//add grade to the array
	public void addGrade(int grade) {
		if(gradeIndex<5) {
			grades[gradeIndex]=grade;
		}else {
			System.out.printf("Array index out of bounds\n");
		}
		gradeIndex++;
	}
	//get the student info
	public String info(String name) {
		String info="Name: "+this.name+"\nGrades: "+grades[0]+" "+grades[1]+" "+grades[2]+" "+grades[3]+" "+grades[4];
		return info;
	}
	
}
