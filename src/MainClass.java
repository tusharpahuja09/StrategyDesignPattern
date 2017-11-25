
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tommy=new Animal();
		tommy.setAge(2);
		tommy.setName("tommy");
		tommy.setFlyType(new WalkingType());
		
		Animal pegiot=new Animal();
		pegiot.setAge(3);
		pegiot.setName("pegiot");
		pegiot.setFlyType(new FlyingType());
		
		tommy.tryToFly();
		pegiot.tryToFly();
		// giving flying ability to tommy
		tommy.setFlyType(new FlyingType());
		tommy.tryToFly();

	}

}
