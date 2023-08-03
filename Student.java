package Project;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name, faculty, course, id, level, sClass, labTime;
	private int rollNo;
	static List<Student> studentList = new ArrayList<Student>();
	
	public String getLabTime() {
		return labTime;
	}

	public void setLabTime(String labTime) {
		this.labTime = labTime;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public Student() {
	}

}
