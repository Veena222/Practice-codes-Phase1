package FirstSessionProject;

public class FirstJave {

	public static void main(String[] args) {
		//String s;
		// TODO Auto-generated method stub
		Student s1=new Student();//creating object of typ student
		s1.name="veena";//assigning values
		Student s3 = new Student("Veena",123);
		
		System.out.println(s1.name);
		s1.rollno();
		s1.attendsession();//calling the method
		
		Student s2=new Student();//creating obj 2
		s2.name="raj";
		System.out.println(s2.name);
		s2.attendsession();
		
		s1.sumofnumbers(2,3);//passses as arguments
		
		
	}

}
class Student{//encapsulation
	String name;//instance variable(global variable)
	int rollno;
	
	//constrictor as it is same as class name and no return type
	Student(){
		System.out.println("hello");
	}
	Student(String name,int rollno){//Parameterised constructor
		int x;//local variable(Will nt be accessible outside this method.
	}
	void rollno() {
		System.out.println("123");
	
		
	}
	void attendsession() {
		System.out.println("present");
	}

	int sumofnumbers(int x, int y) {// passed as parameters//polymorphysim
		 int z=x+y;
		return z;
		
		
		
	}
	float sumofnumbers(float x) {
		float z = x;
		return z;
	}
	
}
