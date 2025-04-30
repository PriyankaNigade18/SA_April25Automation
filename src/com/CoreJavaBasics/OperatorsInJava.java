package com.CoreJavaBasics;

public class OperatorsInJava {

	public static void main(String[] args)
	{
		//BODMAS: Bracket,order,division,multiplication,addition,subtraction

		System.out.println("*****************Arithmetic Operators**************");

		int a=10,b=2;
		
		//int c=a+b;
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println("*****************Unary Operators**************");

			/*
			 * Unary
			 * =======
			 * Increment ++      Decrement --
			 * 
			 * postIncrement	PostDecrement (store data first and perform operation)
			 * a++					a--
			 * 
			 * PreIncrement		PreDecrement (perform operation first and then store value)
			 *  ++a				--a
			 * 
			 * 
			 * int a=100;
			 * a++ = a=a+1 a=101
			 * 
			 * a-- = a=a-1 a=99
			 * 
			 */
		
		//post operation
		int a1=100;
		System.out.println(a1);//100
		System.out.println(a1++);//100
		System.out.println(a1);//101
		
		
		int b1=200;
		System.out.println(b1);//200
		System.out.println(b1--);//200
		System.out.println(b1);//199
		
		//pre Operation
		int c=90;
		System.out.println(c);//90
		System.out.println(++c);//91
		
		int d=78;
		System.out.println(d);//78
		System.out.println(--d);//77
		
		int c1=189;
		int d1=c1++;//value assign first and then incremented by 1
		System.out.println(d1);//189
		System.out.println(c1);//190
		
		int e=698;
		int f=e++;
		System.out.println(e);//699
		System.out.println(f);//698
		
		int i=457;
		int j=i++;
		
		System.out.println(i);//458
		System.out.println(j);//457
		

		int x=190;
		int y=x--;
		System.out.println(x);//189
		System.out.println(y);//190
		
		int u=578;
		int v=u--;
		System.out.println(v);//578
		System.out.println(u);//577
		
		
		int r=78;
		int s=++r;//value incremented by 1 and then it assign
		System.out.println(s);//79
		System.out.println(r);//79
		
		
		int n=90;
		int m=++n;
		System.out.println(n);//91
		System.out.println(m);//91
		
		int j1=45;
		int k=--j1;
		System.out.println(j1);//44
		System.out.println(k);//44
		
		System.out.println("*************Relational Operators************");
		//j1=k=44 n=m=91 x=189 y=190
		
		//With string + will act as concat operation
		System.out.println("leass than <: "+(k<m));//true
		System.out.println("greater than >: "+(y>x));//true
		System.out.println("less than equal to <= : "+(n<=m));//true
		System.out.println(y<=x);//false
		System.out.println("greater than equal to >= : "+(m>=k));//true
		System.out.println(y>=n);//true
		System.out.println(k>=x);//false
	/*
	 *  == comparison operator
	 *  
	 *  a=100 b=100
	 *  a==b boolean(t/f)
	 *  
	 *  = Assignment operator
	 *  r=100
	 *  
	 *  
	 */
		
		System.out.println("Comparison operator == :"+(n==m));//true
		System.out.println("not equal != : "+(x!=y));//true
		System.out.println(n!=m);//false
		
		System.out.println("***********Logical Operators*************");
		/*
		 * 	c1       c1         c1&&c2(AND)      c1||c2(OR)    !c1(NOT)   
		 * 
		 * true 	true		true				true			false
		 * true		false		false				true			false
		 * false	true		false				true			true
		 * false 	false		false				false			true
		 * 
		 * 
		 */
		
		System.out.println((k<m) && (y>x));//true
		System.out.println((k<m) && (y==x));//false
		System.out.println((n!=m) && (y>x));//false
		System.out.println((y==x) && (m!=n));//false
		
		System.out.println("**************");
		//OR
		System.out.println((k<m) || (y>x));//true
		System.out.println((k<m) || (y==x));//true
		System.out.println((n!=m) || (y>x));//true
		System.out.println((y==x) || (m!=n));//false
		
		System.out.println("**************");

		//!(NOT)
		
		System.out.println(n==m);//true
		System.out.println(!(n==m));//false
		
		
		System.out.println(m<k);//false
		System.out.println(!(m<k));//true
		
		
		
		
		System.out.println((k<m) && (y>x));//true
		
		System.out.println(!((k<m) && (y>x)));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
