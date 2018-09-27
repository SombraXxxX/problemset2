import java.util.Scanner;
public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your first name please");
	String first = in.nextLine();
	System.out.println("Enter your last name please");
	String last = in.nextLine();
	String full = "Hello, " + first + " "+ last + "!";
	System.out.println(full);
	
	}
	
	public void gradeMe() {
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter your first homework score: ");
	int homeone = in.nextInt();
	System.out.println("Please enter your second homework score: ");
	int hometwo = in.nextInt();
	System.out.println("Please enter your third homework score: ");
	int homethree = in.nextInt();
	System.out.println("Please enter your first quiz score: ");
	int quizone = in.nextInt();
	System.out.println("Please enter your second quiz score: ");
	int quiztwo = in.nextInt();
	System.out.println("Please enter your third quiz score: ");
	int quizthree = in.nextInt();
	System.out.println("Please enter your first test score: ");
	int testone = in.nextInt();
	System.out.println("Please enter your second test score: ");
	int testtwo = in.nextInt();
	System.out.println("Please enter your third test score: ");
	int testthree = in.nextInt();
	double avghome = ((homeone + hometwo + homethree)/3)*0.15; 
	double avgquiz = ((quizone + quiztwo + quizthree)/3)*0.30;
	double avgtest = ((testone + test two + testthree)/3)*0.55;
	Double final = avghome + avgquiz + avg test;
	System.out.println(final + "%");

	
	}
	
	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of students: ");
		int students = in.nextInt();
		System.out.println("Please enter the number of teachers: ");
		int teachers = in.nextInt();
		int total = students + teachers;
		int bus = total/46;
		double remainder = total%46.00;
		System.out.println("Buses: " + bus);
		System.out.println("Last Bus contains:" + remainder);

	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String first = in.nextLine();
		System.out.println("Please enter your last name: ");
		String last = in.nextLine();
		System.out.println("Please enter the current grade you are in: ");
		String grade = in.nextLine();
		System.out.println("Please enter your age: ");
		String age = in.nextLine();
		System.out.println("Please enter your hometown: ");
		String hometown = in.nextLine();
		String one = "NAME     : " + first + last;
		String two = "GRADE    : " + grade;
		String three = "AGE      : " + age;
		String four = "HOMETOWN : " + hometown;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);

	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String first = in.nextLine();
		char f = in.nextLine().charAt(0);
		System.out.println("Please enter your middle name: ");
		String middle = in.nextLine();
		char m = in.nextLine().charAt(0);
		System.out.println("Please enter your last name: ");
		String last = in.nextLine();
		char l = in.nextLine().charAt(0);
		System.out.println("Your intials are " + f + m + l + ".");

	}
}
