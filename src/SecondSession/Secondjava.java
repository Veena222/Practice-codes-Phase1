package SecondSession;

public class Secondjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=10;	//TYPE CASTING AS FLOAT IS BIGGER THAN INT HENCE IT GETS CONVERTED AUTOMATICALLY IMPLICIT TYPECASTING
		byte b1 =(byte) 1000;//Explicit typecasting
		int a=65;
		char c =(char)a;
calculator c1= new calculator();
int result = c1.sum(2, 3);//function call
int result2=c1.convertStringToInt("123");
System.out.println(c);//typecasting
System.out.println(result2);
System.out.println(result);
	}

}
class calculator{
	int sum(int num1,int num2) {
		int num3 = num1 +num2;
		return num3;
		
	
	}
	
	int multiply(int num1,int num2) {
		int num4= num1*num2;
		return num4;
	}
	
	int convertStringToInt(String input) {//converting string to integer
		int result2 = Integer.parseInt(input);
		return result2;
		
	}
	
}