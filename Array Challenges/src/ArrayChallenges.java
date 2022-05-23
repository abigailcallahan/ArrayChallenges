import java.util.Scanner;

public class ArrayChallenges
	{
		static Scanner input = new Scanner(System.in);
		static String name;
		static int number;
		static String[] sweets; 
		static String answer;
		static int first;
		static int [] eightNums = new int[8];
		static int even;
		static int odd;
		static int randomGenerator;
		static int [] random = new int[5];
		static int fourDigit;
		static int [] backwards = new int[4];
		static int digit;
		
		public static void main(String[] args)
			{
			//1
			introduction();
			askHowMany();
			getSweets();
			printArray();
				
			//2
 			askNumbers();
 			//printNums();
 			decideEvenOrOdd();
 			printOddAndEven();
				
			//3
			generateNumbers();
				
			//4
			enter4Digit();
			strip();
			printOut();
			}

		public static void introduction()
		{
			System.out.println("Hi what is your name?");
			name = input.nextLine();
			System.out.println("Hi, " + name);
		}
		public static void askHowMany()
		{
			System.out.println("How many favorite sweets do you have?");
			number = input.nextInt();
			sweets = new String[number];
		}
		public static void getSweets()
		{
			String fake = input.nextLine();
			for(int i = 0; i < sweets.length; i++)
				{
					System.out.println("enter your " + (i + 1) + " favorite sweet");
					answer = input.nextLine();
					sweets[i] = answer;
				}
		}
		public static void printArray()
		{
			System.out.println();
			System.out.println("Your " + number + " favorite sweets are:");
			for(int i = 0; i < sweets.length; i++)
				{
					System.out.println(sweets[i]);
				}
		}
		
		public static void askNumbers()
		{
			for(int i = 0; i < 8; i++)
				{
					System.out.println("Enter your number");
					first = input.nextInt();
					eightNums[i] = first;
				}	
		}	
		public static void printNums()
		{
			System.out.println();
			for(int i = 0; i < eightNums.length; i++)
				{
					System.out.println(eightNums[i]);
				}
		}
		public static void decideEvenOrOdd()
		{
			for(int i = 0; i < eightNums.length; i++)
				{
					if(eightNums[i] % 2 == 0)
						{
						even += eightNums[i];
						}
					else if(eightNums[i] % 2 == 1)
						{
						odd += eightNums[i];
						}
				}
		}
		public static void printOddAndEven()
		{
			System.out.println("The total of the even numbers is " + even);
			System.out.println("The total of the odd numbers is " + odd);
			System.out.println();
		}
		
		public static void generateNumbers()
		{
			for(int i = 4; i >= 0; i--)
				{
			randomGenerator = (int) (Math.random() * 90) + 10;
			System.out.println(randomGenerator);
			random[i] = randomGenerator;
				}
			System.out.println();
			
			for(int i = 0; i < 5; i ++)
				{
					System.out.println(random[i]);
				}
			

		}
		public static void enter4Digit()
		{
			System.out.println("Enter a 4 digit number");
			fourDigit = input.nextInt();
		}
		public static void strip()
		{
			
			for(int i = 0; i < 4; i++)
				{
					int digit = fourDigit % 10;
					fourDigit = fourDigit / 10;
					backwards[i] = digit;
				}
		}
		public static void printOut()
		{
			System.out.println();
			for(int i = 0; i < 4; i++)
				{
					System.out.println(backwards[i]);
				}
		}
	
	}




























