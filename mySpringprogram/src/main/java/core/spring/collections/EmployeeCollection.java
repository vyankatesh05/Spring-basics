package core.spring.collections;

import java.util.List;
import java.util.Set;

public class EmployeeCollection {
String name;
List<String> phoneno;
Set<String> address;
public EmployeeCollection() {
	super();
}
public EmployeeCollection(String name, List<String> phoneno, Set<String> address) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhoneno() {
	return phoneno;
}
public void setPhoneno(List<String> phoneno) {
	this.phoneno = phoneno;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "EmployeeCollection [name=" + name + ", phoneno=" + phoneno + ", address=" + address + "]";
}


}
