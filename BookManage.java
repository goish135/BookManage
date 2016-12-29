import java.util.Scanner;
import java.util.*;
import java.io.*;
public class BookManage
{
	public static void main(String[] args) throws Exception
	{
		
		//check id pw
		String ID,PW;
		String UserID="cis",UserPW="1234";
		Scanner keyin = new Scanner(System.in);
		/*
		System.out.print("Please enter ID:");
		ID = keyin.nextLine();
		System.out.print("Please enter password:");
		PW = keyin.nextLine();
		//Astring.equals(Bstring) return true false
		
		if(UserID.equals(ID)&&UserPW.equals(PW))
		{
			System.out.println("log in success!");
		}
		else
		{
			System.out.println("log in failed!");
		}
		*/
		System.out.print("Choose one action:Add data(1)precent all data(2)sorting(3)show all data by one colum sort(4)");
		
		while(true)
		{	
		String respond = keyin.next();
		if(respond.equals("1")) 
		{
			//add one data (book's name ,auther,publisher,number,class,year)+data checking
			PrintWriter outputstream = null;
			outputstream = 
						new PrintWriter(new FileOutputStream("database.txt",true));
			int i=1;
			while(true)
			{
				if(i>1)
				{
					System.out.println("End of addition or not?(y/n)");
					String reply = keyin.next();
					if(reply.equals("y")||reply.equals("Y"))
					{
						outputstream.close();
						break;
					}
					else if(reply.equals("n")||reply.equals("N"))
					{
						System.out.println("go on adding");
					}	
					else 
					{
						System.out.println("Please input Y or y or N or n !!!");
					}
				}	
				System.out.print("input book's name:");
				String BookName = keyin.next();
			
				System.out.print("input auther's name:");
				String auther = keyin.next();
			
				System.out.print("input publisher:");
				String publisher = keyin.next();
			
				System.out.print("input number:");
				String number = keyin.next();
				while(!number.matches("[a-zA-Z][0-9]{5}"))
				{
					System.out.print("Format is not correct,enter again");
					number = keyin.next();
					if(number.matches("[a-zA-Z][0-9]{5}")) break;
				}
			
				System.out.print("input class:");
				String type = keyin.next();
			
				System.out.print("input year:");
				String year = keyin.next();
				while(!year.matches("[0-9]{4}"))
				{
					System.out.println("Format is not correct,enter again");
					year = keyin.next();
					if(year.matches("[0-9]{4}")) break;
				}	
				outputstream.println(BookName+" "+auther+" "+publisher+" "+number+" "+type+" "+year);
				i++;
		    }
			break;
	   }
    else if(respond.equals("2"))
	{
		//read data from database.txt
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		while(inputStream.hasNext())
		{	
			
			String c1 = inputStream.next();System.out.print(c1+" ");
			String c2 = inputStream.next(); System.out.print(c2+" ");
			String c3 = inputStream.next(); System.out.print(c3+" ");
			String c4 = inputStream.next(); System.out.print(c4+" ");
			String c5 = inputStream.next(); System.out.print(c5+" ");
			String c6 = inputStream.next(); System.out.println(c6);
			
		}
		
		break;
	}
	else if(respond.equals("3"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		int i=0,j=0,a=0,b=0,c=0,d=0,e=0;
		String[] array1 = new String[1000];
		String[] array2 = new String[1000];
		String[] array3 = new String[1000];
		String[] array4 = new String[1000];
		String[] array5 = new String[1000];
		String[] array6 = new String[1000];
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1[j++]=c1;
			String c2 = inputStream.next(); array2[a++]=c2;
			String c3 = inputStream.next(); array3[b++]=c3;
			String c4 = inputStream.next(); array4[c++]=c4;
			String c5 = inputStream.next(); array5[d++]=c5;
			String c6 = inputStream.next(); array6[e++]=c6;
			i++;
		}
		
		/*System.out.print(i);
		for(int m=0;m<i;m++)
		{
			System.out.print(array1[m]+" ");
		}*/
		String[] NewArray1 = new String[i];
		String[] NewArray2 = new String[i];
		String[] NewArray3 = new String[i];
		String[] NewArray4 = new String[i];
		String[] NewArray5 = new String[i];
		String[] NewArray6 = new String[i];
		for(int n=0;n<i;n++)
		{
			String temp1=array1[n];
			String temp2=array2[n];
			String temp3=array3[n];
			String temp4=array4[n];
			String temp5=array5[n];
			String temp6=array6[n];
			NewArray1[n]=temp1;
			NewArray2[n]=temp2;
			NewArray3[n]=temp3;
			NewArray4[n]=temp4;
			NewArray5[n]=temp5;
			NewArray6[n]=temp6;
		}
		
		/*System.out.println();
		for(int h=0;h<i;h++)
		{
			System.out.print(NewArray1[h]+" ");
		}*/
		
		//after sorting
		//System.out.println();
		Arrays.sort(NewArray1);//sort by library
		Arrays.sort(NewArray2);
		Arrays.sort(NewArray3);
		Arrays.sort(NewArray4);
		Arrays.sort(NewArray5);
		Arrays.sort(NewArray6);
		System.out.println("show(1)book's name (2)auther (3)publisher (4)number (5)class (6)year");
		String answer = keyin.next();
		if(answer.equals("1"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray1[j]);
			}
		}
		else if(answer.equals("1"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray1[j]);
			}
		}
		else if(answer.equals("2"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray2[j]);
			}
		}
		else if(answer.equals("3"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray3[j]);
			}
		}
		else if(answer.equals("4"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray4[j]);
			}
		}
		else if(answer.equals("5"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray5[j]);
			}
		}
		else if(answer.equals("6"))
		{
			for(j=0;j<i;j++)
			{
				System.out.println(NewArray6[j]);
			}
		}
		break;
	}
	
	else if(respond.equals("4"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		int i=0,j=0,a=0,b=0,c=0,d=0,e=0;
		String[] array1 = new String[1000];
		String[] array2 = new String[1000];
		String[] array3 = new String[1000];
		String[] array4 = new String[1000];
		String[] array5 = new String[1000];
		String[] array6 = new String[1000];
		
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1[j++]=c1;
			String c2 = inputStream.next(); array2[a++]=c2;
			String c3 = inputStream.next(); array3[b++]=c3;
			String c4 = inputStream.next(); array4[c++]=c4;
			String c5 = inputStream.next(); array5[d++]=c5;
			String c6 = inputStream.next(); array6[e++]=c6;
			i++;
		}
		
		/*System.out.print(i);
		for(int m=0;m<i;m++)
		{
			System.out.print(array1[m]+" ");
		}*/
		String[] NewArray1 = new String[i];
		String[] NewArray2 = new String[i];
		String[] NewArray3 = new String[i];
		String[] NewArray4 = new String[i];
		String[] NewArray5 = new String[i];
		String[] NewArray6 = new String[i];
		for(int n=0;n<i;n++)
		{
			String temp1=array1[n];
			String temp2=array2[n];
			String temp3=array3[n];
			String temp4=array4[n];
			String temp5=array5[n];
			String temp6=array6[n];
			NewArray1[n]=temp1;
			NewArray2[n]=temp2;
			NewArray3[n]=temp3;
			NewArray4[n]=temp4;
			NewArray5[n]=temp5;
			NewArray6[n]=temp6;
		}
		
		/*System.out.println();
		for(int h=0;h<i;h++)
		{
			System.out.print(NewArray1[h]+" ");
		}*/
		
		//after sorting
		//System.out.println();
		Arrays.sort(NewArray1);//sort by library
		Arrays.sort(NewArray2);
		Arrays.sort(NewArray3);
		Arrays.sort(NewArray4);
		Arrays.sort(NewArray5);
		Arrays.sort(NewArray6);
		
		String[] rowChange1 = new String[i];
		String[] rowChange2 = new String[i];
		String[] rowChange3 = new String[i];
		String[] rowChange4 = new String[i];
		String[] rowChange5 = new String[i];
		String[] rowChange6 = new String[i];
		for(int z=0;z<i;z++)
		{
			String str = NewArray1[z];
			for(int w=0;w<i;w++)
			{
				String str1 = array1[w];
				if(str.equals(str1))
				{
					rowChange2[z] = array2[w];
					rowChange3[z] = array3[w];
					rowChange4[z] = array4[w];
					rowChange5[z] = array5[w];
					rowChange6[z] = array6[w];
				}
			}
		}
		//print
		for(int y=0;y<i;y++)
		{	
			//for(int q=0;q<6;q++)
			//{
				System.out.println(NewArray1[y]+" "+rowChange2[y]+" "+rowChange3[y]+" "+rowChange4[y]+" "+rowChange5[y]+" "+rowChange6[y]+"\t");
			//}
			//System.out.println();
		}
			break;
	}
	else 
	{
		System.out.print("Plese enter 1 or 2:");
		//String respond = keyin.next();
	}
}	
}
}