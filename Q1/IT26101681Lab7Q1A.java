import java.util.Scanner;
class IT26101681Lab7Q1A{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		double sum=0;
		int count = 1;
		
		
		System.out.println("Enter marks for four subjects:");
		 while(count<=4){
			 System.out.println("Enter Subject mark "+count+":");
			 double marks=input.nextDouble();
			 sum= sum+marks;
			 count++;
		 }
		
	double avg= sum/4;
		System.out.println("Average is :" +avg);
		
		if(avg>=75)
		{ System.out.println(" Overall grade is: Distinction");}
	
	else if(avg>=50)
		{ System.out.println(" Overall grade is: Credit");}
	
	else 
		{ System.out.println(" Overall grade is: Distinction");}
		
		
		
		}
		}