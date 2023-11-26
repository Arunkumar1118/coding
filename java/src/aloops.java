/*
public class aloops {                                  // Normal hi with while loop

	public static void main(String[] args) {
		{
			int i = 1;
			while(i<=4)
			{
				System.out.println("Hi" + i);
				i++;
		   }
		   System.out.println("Bye" + i);
		}
	}
}  */






/*
public class aloops {                                   // extend like in a week we have days 

	public static void main(String[] args) {
		{
			int i = 1;
			while(i<=4)
			{
				System.out.println("Hi" + i);
				int j = 1;
				while(j<=3)
				{
					System.out.println("Hello" + j);
					j++;
				}
				i++;
		   }
			System.out.println("Bye" + i);
		}
	}
}   */







/*
public class aloops {                                  // Hi with msg. using while loop

	public static void main(String[] args) {
		{
			int i = 1;
			while(i<=2)
			{
				System.out.println("Hi Arun" + i);
				int j = 1;
				while(j<=1)
				{
					System.out.println("How are you ??" + j);
					System.out.println("i'm fine thankyou" + j);
					j++;
				}

				i++;
		   }
			System.out.println("Bye" + i);
		} 
		
	}
} */






/*
public class aloops {                                  // DO While loop

	public static void main(String[] args) {
		{
			int i = 5;
			do
			{
				System.out.println("Hi" + i);
				i++;
		   }while(i<=4);
		   System.out.println("Bye" + i);
		}
	}
}  */









/*
public class aloops {                                  // For loop

	public static void main(String[] args) {
		{
		//	for(int i=4;i>=1;i--)                            // 4-1 decrement
     	//	for(int i=1;i<=4;i++)                            //  normal 1-4
		//	for(int i=0;i<=3;i++)                            // 0-3 (=) is increment 
			for(int i=0;i<4;i++)                            //  0-4 <() increment
			{
				System.out.println("Hi" + i);
		   }
		}
	}
}  */







/*
public class aloops {                                  // For loop another way to write for loop

	public static void main(String[] args) {
		{
		     int i=1;
		     for(;i<5;)
			{
				System.out.println("DAY" + i);
				i++;
		   }
		}
	}
}   */








public class aloops {                                  // In one day time start 9am to 6pm using for loop

	public static void main(String[] args) {
		{
		  for(int i=1;i<=5;i++)
		     {
				System.out.println("DAY" + i);
				for(int j=1;j<=9;j++)
				{
					System.out.println(" " + (j+8) + "-" + (j+9));
				}
		   }
		}
	}
}