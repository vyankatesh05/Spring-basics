package spring_4155D.mySpringprogram;

public class Student1 {
int rollno;
String name;
String city;
public Student1(int rollno, String name, String city) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "Student1 [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
}


}
