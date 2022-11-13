public class Grading {
	private int passMark=0;
	Grading(int passMarks){
		this.passMark=passMarks;
	}
	public int getPassMarks() {
		return passMark;
	}
	public static String toLetterGrade(int score) {
		String letterGrade=(score==0)? "X":(score<50 && score>0)? "E":(score<60 && score>=50)? "D":(score<70 && score>=60)? "C":(score<80 && score>=70)? "B":"A";
		return letterGrade;
	}
	public static double calculateAvg(int[] grades) {
		int sum=0;
		for(int grade:grades) {
			if(grade!=0) {
				sum=sum+grade;
			}
		}
		return sum/5.0;
	}
	public String summarizeGrade(int[]grades) {
		int pass=0;
		int zero=0;
		for(int grade:grades) {
			if(grade>=passMark) {
				pass++;
			}
			if(grade==0) {
				zero++;
			}
		}
		String[] lettergrades= new String[5];
		for(int i=0; i<5; i++) {
			lettergrades[i]=Grading.toLetterGrade(grades[i]);
		}
		String sumarize="Avg. Score: "+Grading.calculateAvg(grades)+"\nPass: "+pass+", Failed: "+ (5-pass-zero) +"\nAll grades Letter: "+lettergrades[0]+" "+lettergrades[1]+" "+lettergrades[2]+" "+lettergrades[3]+" "+lettergrades[4]+" ";
		return sumarize;
	}
}