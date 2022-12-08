package patika;
import java.util.Scanner;
public class ChineseZodiac {

 public static void main (String[]args) {
	 
int year;
	 System.out.print("Enter your birth year : ");
	 Scanner input = new Scanner(System.in);
     
	 year = input.nextInt();
	 
	switch (year % 12) {
	
	case 0 : 
		System.out.print("Your chinese zodiac is Monkey !!!");
		break;
		
	case 1 : 
		System.out.print("Your chinese zodiac is Rooster !!!");
		break;
	
	case 2 : 
		System.out.print("Your chinese zodiac is Dog !!!");
		break;
	
	case 3 : 
		System.out.print("Your chinese zodiac is Pig !!!");
		break;
	
	case 4 : 
		System.out.print("Your chinese zodiac is Mouse !!!  ");
		break;
	
	case 5 : 
		System.out.print("Your chinese zodiac is Bull !!!");
		break;
		
	case 6 : 
		System.out.print("Your chinese zodiac is Tiger !!! ");
		break;
	
	case 7 : 
		System.out.print("Your chinese zodiac is Rabbit !!! ");
		break;
	
	case 8 : 
		System.out.print("Your chinese zodiac is Dragon !!! ");
		break;
	
	case 9 : 
		System.out.print("Your chinese zodiac is Snake !!! ");
		break;
		
	case 10 : 
		System.out.print("Your chinese zodiac is Horse !!!");
		break;	
		
	case 11 : 
		System.out.print("Your chinese zodiac is Sheep !!! ");
		break;
	
	
	}
 }
 
}
