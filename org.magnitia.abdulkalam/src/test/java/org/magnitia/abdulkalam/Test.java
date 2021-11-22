package org.magnitia.abdulkalam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Automationtesting";
		s1=s1.toLowerCase();
		String temp="";
		
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			int temp1=0;
			for(int j=0;j<temp.length();j++)
			{
				char x=temp.charAt(j);
				if(a==x)
				{
					temp1=1;
					
				}
				
			}
			if(temp1==0)
			{
				temp=temp+a;
				
			}
			System.out.println(temp);
			}
			
			
		}

	}


