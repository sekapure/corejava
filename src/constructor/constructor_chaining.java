package constructor;

public class constructor_chaining 
{
public static void main(String[] args)
{
	
	constructor_chaining s=new constructor_chaining(100,200,300);
	
}
public constructor_chaining(int a)
{

System.out.println("constructor using single argument"+a);	
}
public constructor_chaining(int p,int q)
{
	this(10);
System.out.println("constructor using 2 argument"+p+" " +q);	
}
public constructor_chaining(int x,int y,int z)
{
	this(20,30);
System.out.println("constructor using 3 argument"+x+" "+y+" "+z);
}
}


