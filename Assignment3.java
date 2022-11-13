public class Assignment3 {
	public static void main(String[]args) {
		String name="Jack";
		Student stu1 = new Student(name);
		Grading grading1 = new Grading(60);
		Grading grading2 = new Grading(80);
		stu1.addGrade(100);
		stu1.addGrade(78);
		stu1.addGrade(55);
		stu1.addGrade(67);
		stu1.addGrade(98);
		stu1.addGrade(90);
		System.out.println("information:");
		System.out.println(stu1.info(name)+"\n");
		System.out.println("grading1 summarizeGrade(...)");
		System.out.println(grading1.summarizeGrade(stu1.getGrades())+"\n");
		System.out.println("grading2 summarizeGrade(...)");
		System.out.println(grading2.summarizeGrade(stu1.getGrades())+"\n");
	}
}