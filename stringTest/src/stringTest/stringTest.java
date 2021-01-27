package stringTest;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean gflag = false;
		
		//boolean gflag = gHappy("xxgggxyg");
		//System.out.print(gflag);
		
		//int triplets = tripletCount("222abyyycdXXX");
		//System.out.print(triplets);
		
		//int sum = sumDigits ("aa11b33");
		//System.out.print(sum);
		
		//String endsSame = sameEnds("xx");
		//System.out.println(endsSame);
		

		//String endsMirror = mirrorEnds("xxx");
		//System.out.println(endsMirror);
		
		//int blocksMax = maxBlock("");
		//System.out.print(blocksMax);
		
		//int numret = sumNumbers("aa11b33");
		//System.out.print(numret);
		
		
}
		
	public static boolean gHappy(String str) {
		  boolean ghappy = false;
		  char ch[] = new char[str.length()];
		  for (int j=0; j<(str.length()); j++)
	      {
	       ch[j] = str.charAt(j);
	      }
		  if ((str.length()==0) )
		  {
		    return true;
		  }
		  else if ((str.length()==1))
		  {
		    return false;
		  }
		  else
		  {
			//System.out.println("I am here");
		    for (int i=0; i<(str.length()); i++)
		      {
		    	//System.out.println(ch[i]);
		    	
		       if (i==0)
		       {
		         if ((ch[0]=='g') && (ch[1]=='g'))
		         {
		        	 
		            ghappy = true;
		         }
		        else
		        {
		            ghappy = false;
		        }
		       }
		     else if (i==str.length()-1)
		       {
		    	   if ((ch[i] == 'g'))
		    	   {
		    		   if ((ch [i-1] == 'g'))
		    		//System.out.println("I came here");
		    			   ghappy = true;
		    		   else
		    			   ghappy = false;
		    	   }
		       }
		     else if (ch[i] == 'g')
		          {
	    	    	   if ((ch[i+1] == 'g') || (ch[i-1] == 'g'))
		    	    	   {
		            	 // System.out.println("yes, it is true"); 
		            	/*System.out.println("**********************");
		            	System.out.println(ch[i]);
		   		    	System.out.println(ch[i-1]);
		   		    	System.out.println(ch[i+1]); */
		            	   ghappy = true;
		    	    	   }
		                else
		                {
		                  //System.out.println("yes, it is true now");
		                  ghappy = false;
		                }
		        }
		      }
		  }
		    return ghappy;
		}

	public static int tripletCount(String str)

	{
		int tripletC=0;
		char ch[] = new char[str.length()];
		  for (int j=0; j<(str.length()); j++)
	      {
	       ch[j] = str.charAt(j);
	      }
		  if ((str.length()==0) || (str.length()==1) || (str.length()==2) )
		  {
		    return 0;
		  }
		  else
		  {
			  for (int i=1; i<(str.length()-2); i++)
			  {
				 if (i==1)
				  {
					  if ((ch [1] == ch [0]) && (ch[1] == ch[2])) 
					  {
						 // System.out.println("count at first" + i + tripletC);
						  tripletC++;
					  }
					  if ((ch [1] == ch [2]) && (ch[1] == ch[3]))
					  {
						 // System.out.println("count at second" + i + tripletC);
						  tripletC++;
					  }
				  }
				 else 
				 {
					 if ((ch [i] == ch [i+1]) && (ch[i] == ch[i+2]))
					 {
						// System.out.println("count at fifth"+ i + tripletC);
						 tripletC++;
					 }
						  
				 }
				 
			  }
		  }
		  
		
		return tripletC;
	}

	public static int sumDigits (String str) {
		int sum = 0;
		char ch[] = new char[str.length()];
		  for (int j=0; j<(str.length()); j++)
	      {
	       ch[j] = str.charAt(j);
	       if (Character.isDigit(ch[j]))
	       {
	    	   sum = sum + Character.getNumericValue(ch[j]);	    	   
	       }
	      }
		return sum;
	}

	public static String sameEnds(String str)
	{
		String ends = "";
		//int x = (str.length()/2);
		//System.out.println(x);
		for(int j=1; j<((str.length()/2)+1); j++)
		  {
			//System.out.println(str.substring(0,j) + "******first****");
			 // System.out.print("Here I am now" + ch[j]);
			  //System.out.println(str.substring(0, j));
			 // System.out.println(str.substring((str.length()-j), (str.length())));
			 // System.out.println("******************************************");
			  if ((str.substring(0, j).equals(str.substring((str.length()-j), (str.length())))))
			  {
				  //System.out.print("Here I am now" + ends);
				  //System.out.print(str.substring(0,j) + " ");
				  ends = str.substring(0, j);
				  
				  //System.out.println(ends);
			  }
			  
		  }
		//System.out.println(ends);
		  
		return ends;
	}

	public static String mirrorEnds(String str)
	{
		String ends= "";
		//int x = (str.length()/2);
				//System.out.println(x);
		StringBuilder input1 = new StringBuilder();
				for(int j=1; j<=((str.length())); j++)
				  {
					//System.out.println(str.substring(0,j) + "******first****");
					//System.out.print("Here I am now" + ch[j]);
					 input1=new StringBuilder();
					 System.out.println(str.substring(0, j));
					 input1.append(str.substring((str.length()-j), (str.length())));
					 //System.out.println(input1);
					 input1.reverse();
					 System.out.println(input1);
					 System.out.println("******************************************");
					 //System.out.println((str.substring(0, j).equals(input1.toString())));
					  if ((str.substring(0, j).equals(input1.toString())))
					  {
						  
						  //System.out.print("Here I am now" + ends);
						  //System.out.print(str.substring(0,j) + " ");
						  ends = str.substring(0, j);
						  
						  //System.out.println(ends);
					  }	
				  }
				//System.out.println(ends);		
		return ends;
	}

	public static int maxBlock(String str) {
		int max =1;
		int finalmax = 0;
		if (!str.isEmpty())
		 finalmax = 1;
		char ch[] = new char[str.length()];
		  for (int j=0; j<(str.length()); j++)
	      {
	       ch[j] = str.charAt(j);
	      }
		for (int i=1; i<str.length(); i++)  
		{
	//		System.out.println(ch[i]);
	//		System.out.println(ch[i-1]);
	//		System.out.println("*************************");
			if ((Character.compare(ch[i],ch[i-1])) == 0) 
				{
				//System.out.println("I am here");
				max++;
	//			System.out.println(max);
	//			System.out.println(finalmax);
				if(max>finalmax)
				{
					finalmax = max;
				}
				}
			else
			{
				max = 1;
			}
		}
		
		
		
		return finalmax;
		  
		  
	}
	public static int sumNumbers(String str)
	{
		int sum = 0;
		int intcon = 0;
		String con="";
		char ch[] = new char[str.length()];
		  for (int j=0; j<(str.length()); j++)
	      {
	       ch[j] = str.charAt(j);
	      }
		  for(int i=0; i<str.length(); i++)
		  {
	       if (Character.isDigit(ch[i]))
	       {
	    	   con = Character.toString(ch[i]);
	    	   //System.out.println("i  "+i);
	    	   //System.out.println("con1  "+con);
	    	   intcon  = Character.getNumericValue(ch[i]);
	    	   for(i=i+1;i<(str.length());i++)
	    	   {
	    		   if (Character.isDigit(ch[i]))
	    		   {
	    			  // System.out.println("i  "+i);
	    			   //System.out.println("con2  "+con);
	    			   con=con+Character.toString(ch[i]);
	    			   intcon=Integer.parseInt(con);
	    			   //System.out.println("intcon  "+intcon);
	    			   //System.out.println("*******************************************");
	    		   }
	    		   else
	    		   {
	    			   break;
	    		   }
	    		   
	    	   		//intcon.append(Character.getNumericValue(ch[i]));
	    	   }
	    	   sum = sum + intcon;
	    	   intcon=0;
	       }
		  }
	      
		return sum;
	}
	public static String notReplace(String str) {
		String replaced ="";
		
		return replaced;
		  
	}

}
