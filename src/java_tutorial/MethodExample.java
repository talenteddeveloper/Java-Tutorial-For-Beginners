package java_tutorial;

// youtube : https://youtu.be/Oxh9QqX6vRg
public class MethodExample {

	public static void main(String[] args) {
		MethodExample methodObj = new MethodExample();
		methodObj.firstMethod("Ram");
		System.out.println(methodObj.addNumbers(4, 6));;
	}
	
	void firstMethod(String name) {
		System.out.println("hello "+name);
	}
	
	int addNumbers(int a, int b) {
		//int c= a + b;//4,6= c= 4+6=10
		//return c;
		return a+b;
	}
	
}
