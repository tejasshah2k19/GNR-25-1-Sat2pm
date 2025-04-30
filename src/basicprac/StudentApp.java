package basicprac;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		Student ram = null;
		Student laxman = null;

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter name and marks of three subjects");
		String name = scr.next();
		int maths = scr.nextInt();
		int sci = scr.nextInt();
		int eng = scr.nextInt();

	}

}

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
		System.out.println(name + " " + maths + " " + sci + " " + eng);

	}

}