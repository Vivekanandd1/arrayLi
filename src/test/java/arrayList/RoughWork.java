package arrayList;

public class RoughWork {
	
	     String name = "vivek";
	     
		public static void main(String[] args) 
	{
		String a = "we will we will rock you";
		String[] splitwords = a.split(" ");
		
		for(int i=splitwords.length-1;i>=0;i--)
		{
			System.out.println("*****");
			System.out.println(splitwords[i]);
		}
		
		System.out.println("______________________________");
		
		int test[] = new int[3];
		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
	
		for(int j1=0; j1<=2;j1++)
		{
			if(test[j1] == 20)
			{
				System.out.println(" i found 20");
			}
			else 
			{
				System.out.println("not found");
			}
		}
	   System.out.println("__________________");
	   
	   int arr[]={50,60,70,80};
	   for(int i=0;i<=3;i++) //for indexoutofboundexception we have to mention arr.length in match condition
	   {
	   System.out.println(arr[i]);
	   }
	   
	   System.out.println("__________________");
	   
	    String mess = "get into";
	    System.out.println(mess.length());

	   System.out.println("______________________");
	   
	}
 }



