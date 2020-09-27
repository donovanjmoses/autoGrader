// AUTHOR: DONOVAN MOSES
// FILENAME: STUDENT.JAVA
// SPECIFICATION: STUDENT CLASS
// FILE FOR LAB 7

public class Student {
		//instance variables
		private String firstName;
		private String lastName;
		private String fullName;
		private String asuId;
		private double grade;
		
		public Student(String firstName, String lastName, String fullName, String asuID, double grade) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.fullName = fullName;
			this.asuId = asuID;
			this.grade = grade;
		}
		
		public String toString() {
	        return String.format("Student: %s, ASU ID: %s, Grade: %s",
	                fullName, asuId, grade);
	    }
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getFullName() {
			return fullName;
		}

		public String getAsuId() {
			return asuId;
		}

		public double getGrade() {
			return grade;
		}
		
		public void setGrade(double newGrade) {
			grade = newGrade;
		}
		
}
