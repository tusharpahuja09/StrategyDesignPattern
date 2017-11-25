
public class Animal {
String name;
int age;
Fly flyType;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void setFlyType(Fly flyType) {
	this.flyType = flyType;
}
void tryToFly()
{
	flyType.tryToFly();
}
}