package ap.slides.AbstractInterfaces21;
//(c) A+ Computer Science

// www.apluscompsci.com

interface A {
	void fun();
}

interface B {
	void notFun();
}

interface C {
	void weird();
}

interface D extends A, B, C // works just fine
{

}

public class InterfaceExtends {
	public static void main(String[] args) {
	}
}