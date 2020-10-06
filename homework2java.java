
public class homework2java {
	
	public static void main(String[] args) {
		double grade1 = 91.14;
		double grade2 = 85.01;
		double grade3 = 72;
		double grade4 = 63;
		double grade5 = 81.14;
		
		double avg_grade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
		
		System.out.println("Your final average grade is " + avg_grade + ".");
		
		if (avg_grade >= 90.00 && avg_grade <= 100) {
			System.out.print("A: Fantastic job!");
		} else if (avg_grade >= 80 && avg_grade <= 89.99) {
			System.out.print("B: Good!");
		} else if (avg_grade >= 70 && avg_grade <= 79.99) {
			System.out.print("C: Please try more next time!");
		} else if (avg_grade <= 69.99) {
			System.out.print("F: Unfortunately you failed!");
		}
	}

}
