import java.util.Scanner;
class IT26101681Lab7Q1B{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		int studentCount=1;
		
        while (studentCount <= 3) {
            System.out.println("Student " + studentCount);
            System.out.print("Enter marks: ");

            double[] marks = new double[4];
            
            marks[0] = scanner.nextDouble();
            marks[1] = scanner.nextDouble();
            marks[2] = scanner.nextDouble();
            marks[3] = scanner.nextDouble();

            double sum = marks[0] + marks[1] + marks[2] + marks[3];
            double average = sum / 4.0;

            System.out.println("Average is : " + average);

           
            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            studentCount++;
        }
		
		
		
		
		
	}
}