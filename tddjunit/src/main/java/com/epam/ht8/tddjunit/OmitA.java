package com.epam.ht8.tddjunit;

public class OmitA {


	public String removeA(String string) {
		String res="";
		if(string.length()<=2)
		{
			if(string.length()<=1)
			{
				if(string.charAt(0)=='A' || string.charAt(0)==' ')
				{
					res=" ";
				}
				else
				{
					res=string;
				}
			}
			else
			{
				if(string.charAt(0)=='A' && string.charAt(1)=='A')
				{
					res=" ";
				}
				else if(string.charAt(0)=='A')
				{
					res=string.substring(1);
				}
				else if(string.charAt(1)=='A')
				{
					res=string.substring(0,1);
				}
				else
				{
					res=string;
				}
			}
		}
		else
			
		{
		      if(string.charAt(0)=='A' && string.charAt(1)=='A')
		      {
			    res=string.substring(2);
		      }
		      else if(string.charAt(0)=='A')
		      {
			    res=string.substring(1);
		      }
		      else if(string.charAt(1)=='A')
		      {
			    res=string.charAt(0)+string.substring(2);
		      }
		      else
		      {
			    res=string;
		      }
	    
	    }
		return res;	
		
	
	}
}
