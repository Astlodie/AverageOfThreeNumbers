package averageofnumbers;
public class AverageOfNumbers {
	double a=2;
 	double b=4;
 	double c=6;
public static double average(double a, double b, double c){
	double sum = 0.0;
	double avg = 0.0;
	
	sum = (a + b + c);
	avg = sum/3;

System.out.println("The average is:" + avg );
return avg;
}
}
