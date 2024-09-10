package ONLINEVDOS;
//lazy


//class Dog
//{
//	static Dog d;
//	private Dog() //why we give constructor its for object creation
//	{
//		//super()--its go to object ,its create the objects "constructor also create object"
//	}
//	static synchronized


//Dog getDog()
//	{
//		
//		if(d==null) {
//		Dog d=new Dog();
//		}
//       return d;
//	}
//}
//public class DesignPattern {
//
//	public static void main(String[] args) {
//		Dog d1=Dog.getDog();
//		
//
//	}
//
//}
//------------------------//

//Early
//class Dog
//{
//	
//	static Dog d=new Dog();
//	private Dog() //why we give constructor its for object creation
//	{
//		//super()--its go to object ,its create the objects "constructor also create object"
//	}
//	static Dog getDog()
//	{
//		return d;
//	}
//}
//public class DesignPattern {
//
//	public static void main(String[] args) {
//		Dog d1=Dog.getDog();
//		Dog d2=Dog.getDog();
//		System.out.println(d1);
//		System.out.println(d2);
//		
//		
//
//	}
//}

//-----------------------------------------------//
//factory design

interface Animal
{
	
}
class AnimalFactory
{
	static Animal instanceMethod(String name)  // -->Animal is return type
	{
		if(name.equalsIgnoreCase("dog"))           //factory is creating the objects that is why its called factory
			return new Dog();
		else if(name.equalsIgnoreCase("Cat"))
		  return new Cat();
		else if(name.equalsIgnoreCase("cat"))
		 return new Rat();
		return null;
	}
	
}
class Cat implements Animal
{
	
}
class Dog implements Animal
{
	
}
class Rat implements Animal
{
	
}

public class DesignPattern {

	public static void main(String[] args) {
		Animal d=AnimalFactory.instanceMethod("dog");
		Animal c=AnimalFactory.instanceMethod("cat");

	}
}





