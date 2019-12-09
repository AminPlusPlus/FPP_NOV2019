package prog_2_4;

import java.util.Date;

public class Professor extends DeptEmployee {

	public Professor(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
	}

	private int numPublications;


	public int getNumPublications() {
		return numPublications;
	}

	public void setNumPublications(int numPublications) {
		this.numPublications = numPublications;
	}
}
