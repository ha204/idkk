import java.util.Scanner;
public class HelloWorld	{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		
		String A = "Hello World!";
		System.out.println(A);
		annoyingMethod(A);
		String b;
		b = annoyingMethod("fillip five fears");
		System.out.println(b);
		System.out.println(Adding(32,48));
		System.out.println(condition(6,8));
		System.out.println(condition(6,0));
		System.out.println(condition(0,8));
		for (int i = 0; i<10; i++)
		{
		System.out.println(condition(i,0));
		//System.out.println(condition(0,0));
		}
		
		{
		int[] arrayOfInts = {13,16,0,7,21,17,3,5,9,6};
		for (int i = 0; i<arrayOfInts.length; i++)
		{
		System.out.println(condition(arrayOfInts[i],12));
		}
		
		for (int i=0; i<arrayOfInts.length; i++)
		{
			System.out.println(arrayOfInts[i]); 
		}
		{
		Scanner bigMan = new Scanner(System.in);
		System.out.print("How big is array?");
		int arraySize = bigMan.nextInt();
			
		int[] bunchOfInts = new int[arraySize];
		for(int i =0; i<arraySize;i++){
			bunchOfInts[i]=i;
		}
		/*bunchOfInts[0] = 2;
		bunchOfInts[1] = 6;
		bunchOfInts[2] = 10;
		bunchOfInts[3] = 14;
		bunchOfInts[4] = 18;
		bunchOfInts[5] = 1;
		bunchOfInts[6] = 8;
		bunchOfInts[7] = 34;
		bunchOfInts[8] = 65;
		bunchOfInts[9] = 43;
		bunchOfInts[10] = 83;
		bunchOfInts[11] = 17;*/
		{
			for (int i = 0; i<bunchOfInts.length; i++)
			{
			System.out.println((bunchOfInts[i])*10);
			}
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
	}	
	public static String annoyingMethod(String people)
	{
		System.out.println(people);
		return people;
	}
	public static int Adding(int x, int y)
	{
    return x+y;
	}
	public static int condition(int ValueA, int ValueB)
	{
	if(ValueA==0)
	{
		return ValueB;
	}
	else{
		if(ValueB==0)
		{
			return ValueA;
		}
		else {
			return ValueA+ValueB;
			
		}
			
	}
	

	
	//////////	System.out.println(myPerson0.getName()+" "+ myPerson0.getAge()+" "+ myPerson0.getJobTitle());		
	
	
	
	
	
	
	
	
	
}
}