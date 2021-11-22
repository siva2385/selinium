package org.magnitia.abdulkalam;

public class Test1 {

	public static void main(String[] args) 
	{
		String x = "siva";
		String temp="";
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			temp=y+temp;
		}
		
		System.out.println(temp);

	}

}
