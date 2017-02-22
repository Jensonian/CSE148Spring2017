package p4;

import java.util.Arrays;

public class Student {
	private String fName;
	private String lName;
	private int[] scores;

	public Student(String fName, String lName, int[] scores) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.scores = scores;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public int getHighest() {
		int highest = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(highest < scores[i]) {
				highest = scores[i];
			}
		}
		return highest;
	}
	
	public int getLowest() {
		int lowest = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(lowest > scores[i]) {
				lowest = scores[i];
			}
		}
		return lowest;
	}
	
	public double getAverage() {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total * 1.0 / scores.length;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", scores=" + Arrays.toString(scores) + "]";
	}

}
