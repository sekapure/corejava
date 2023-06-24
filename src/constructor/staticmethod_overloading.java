package constructor;

public class staticmethod_overloading
{
 public static void main(String[] args) 
 {
	
m1(5,6);
m1(4);

 }
	
 

public static void m1(int a ,int b)
{
	
System.out.println(a+b);
}
public static void m1(int a)
{
System.out.println(a);	
}

}

