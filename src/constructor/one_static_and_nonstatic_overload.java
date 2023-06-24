package constructor;

public class one_static_and_nonstatic_overload
{
public static void main(String[] args)
{
	one_static_and_nonstatic_overload s=new one_static_and_nonstatic_overload();
	s.m1(4, 5);
	
	m1(6);
}
public static void m1(int a)
{
System.out.println(a);	
}
public void m1(int a,int b)
{
System.out.println(a+b);	
}
}
