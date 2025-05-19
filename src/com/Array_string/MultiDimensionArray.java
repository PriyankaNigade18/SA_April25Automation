package com.Array_string;

public class MultiDimensionArray {

	public static void main(String[] args)
	{
/*
		int sid[][]=new int[2][3];
		
		sid[0][0]=10;
		sid[0][1]=20;
		sid[0][2]=30;
		
		sid[1][0]=40;
		sid[1][1]=50;
		sid[1][2]=60;*/
		
		int sid[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		System.out.println("Number of Rows: "+sid.length);//4
		System.out.println("Number of columns are: "+sid[0].length);//2
		
		//System.out.println(sid[1][2]);//60
		System.out.println(sid[1][0]);//300
		
		//System.out.println(sid[0][3]);//ArrayIndexOutOfBoundsException
		System.out.println("*********Iteration for-loop*********");
		
		for(int r=0;r<sid.length;r++)
		{
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c]+" ");
			}
			System.out.println();//next row
		}
		
		
		System.out.println("*********Iteration for each loop*********");

		
		for(int i[]:sid)//Type mismatch: cannot convert from element type int[] to int
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next row
			
		}
		
		
		
		
		
		
		
		

	}

}
