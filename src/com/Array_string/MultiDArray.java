package com.Array_string;

public class MultiDArray {

	public static void main(String[] args)
	{
		Object data[][]= {{"username","password"},{"Amit","test123"},{"Rahul","test123"},{"Manisha","test123"},{"Kiran","test123"}};
		
		System.out.println("Number of rows: "+data.length);//5
		
		System.out.println("Number of columns: "+data[0].length);//2
		
		for(int i=1;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
