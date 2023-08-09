package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name: XYZ");
	}

	public void studentDept() {
		System.out.println("Student Departnement BTech IT");
	}

	public void studentId() {
		System.out.println("Student ID - IT0034");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();
	}
}
