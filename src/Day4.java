import java.util.*;
import java.io.*;
public class Day4 {
	
	public static void main(String args[])
	{
		try
		{
			int res=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured: Division by zero");
		}
		
		try
		{
			int arr[]=new int[5];
			arr[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Occured: Array Bound limit");
		}
		
		try
		{
			File file=new File("binary.txt");
			FileReader fr=new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception Occured: File not found!");
		}
	}
}
