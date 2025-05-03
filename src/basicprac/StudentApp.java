package basicprac;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

//		Student ram = null;
//		Student laxman = null;

		Student student[] = new Student[10];
		Scanner scr = new Scanner(System.in);
		int studentCounter = 0;
		while (true) {
			System.out.println("\n0 For EXIT");
			System.out.println("1 For Add  Student");
			System.out.println("2 For List Student");
			System.out.println("Enter choice");

			int choice = scr.nextInt();

			switch (choice) {
			case 1:
				// add student
				System.out.println("Enter name and marks of three subjects");
				String name = scr.next();
				int maths = scr.nextInt();
				int sci = scr.nextInt();
				int eng = scr.nextInt();

				student[studentCounter] = new Student(name, maths, sci, eng);
				studentCounter++;
				break;
			case 2:
				// list student
				for(int i=0;i<studentCounter;i++) {
					student[i].displayStudentData();
				}
				break;
			case 0:
				System.exit(0);

			default:
				System.out.println("Enter Valid Choice...");
				break;
			}// switch
		} // while

	}// main

}// StudentApp

class Student {

	private String name;
	private int maths, sci, eng;
	private int obtainedMarks;
	private int maxMark;
	private int minMark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public int getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}

	public int getMinMark() {
		return minMark;
	}

	public void setMinMark(int minMark) {
		this.minMark = minMark;
	}

	public Student() {
		//

	}

	Student(String name, int maths, int sci, int eng) {
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.calculateResult();
	}

	void calculateResult() {
		// max
		// min
		// obtained

		if (this.maths > this.sci && this.maths > this.eng) {
			this.maxMark = this.maths;
		} else if (this.eng > this.sci && this.eng > this.maths) {
			this.maxMark = this.eng;
		} else {
			this.maxMark = this.sci;
		}

		if (this.maths < this.sci && this.maths < this.eng) {
			this.minMark = this.maths;
		} else if (this.eng < this.sci && this.eng < this.maths) {
			this.minMark = this.eng;
		} else {
			this.minMark = this.sci;
		}

		this.obtainedMarks = this.maths + this.sci + this.eng;

	}

	void displayStudentData() {
		System.out.printf("\n%-10s %3d %3d %3d",name,maths,sci,eng);

	}

}