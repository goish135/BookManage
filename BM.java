import java.util.Scanner;
import java.util.*;
import java.io.*;
public class BM
{
	public static void main(String[] args) throws Exception
	{
		
		final int total = 128;
		String ID,PW;
		String UserID="cis",UserPW="1234";
		Scanner keyin = new Scanner(System.in);
		
		System.out.print("Please enter ID:");
		ID = keyin.nextLine();
		System.out.print("Please enter password:");
		PW = keyin.nextLine();
		
		
		if(UserID.equals(ID)&&UserPW.equals(PW))
		{
			System.out.println("log in success!");
		
		
		System.out.print("(1)User(2)Manager");
		String actor = keyin.next();
		if(actor.equals("2")||actor.equals("1"))
		{
			while(true)
			{	
			if(actor.equals("2"))
			{System.out.println("(1)新增一筆資料(2)顯示所有資料(3)分類排列(遞增/遞減)(4)顯示所有資料[依據書名排序");
			System.out.println("(5)分頁顯示所有資料(6)分類顯示(7)分頁分類顯示");
			System.out.print("(8)搜尋(9)修改(10)刪除(11)重整排列寫回檔案:(12)設定顯示欄位");}
		
		else if(actor.equals("1"))
		{
			System.out.println("(1)Add_data(2)show_all_data"+"\t");
			System.out.println("(5)show_by_page(6)show_by_class(7)SHOW_BY_PAGE"+"\t");
			System.out.print("(8)serch(9)amend(10)delete:");
		}	
		
		
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
			System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
			break;
			
				
	   }
    else if(respond.equals("2"))
	{
		
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
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		break;
	}
	else if(respond.equals("3"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		
		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		
		String[] NewArray1 = new String[i];
		String[] NewArray2 = new String[i];
		String[] NewArray3 = new String[i];
		String[] NewArray4 = new String[i];
		String[] NewArray5 = new String[i];
		String[] NewArray6 = new String[i];
		for(int n=0;n<i;n++)
		{
			String temp1=Array1[n];
			String temp2=Array2[n];
			String temp3=Array3[n];
			String temp4=Array4[n];
			String temp5=Array5[n];
			String temp6=Array6[n];
			NewArray1[n]=temp1;
			NewArray2[n]=temp2;
			NewArray3[n]=temp3;
			NewArray4[n]=temp4;
			NewArray5[n]=temp5;
			NewArray6[n]=temp6;
		}
		
		
		Arrays.sort(NewArray1);
		Arrays.sort(NewArray2);
		Arrays.sort(NewArray3);
		Arrays.sort(NewArray4);
		Arrays.sort(NewArray5);
		Arrays.sort(NewArray6);
		System.out.println("show(1)book's name (2)auther (3)publisher (4)number (5)class (6)year");
		String answer = keyin.next();
		if(answer.equals("1"))
		{
			System.out.println("Up:");
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray1[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray1, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray1[j]);
			}
		}
		
		else if(answer.equals("2"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray2[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray2, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray2[j]);
			}
		}
		else if(answer.equals("3"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray3[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray3, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray3[j]);
			}
		}
		else if(answer.equals("4"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray4[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray4, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray4[j]);
			}
		}
		else if(answer.equals("5"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray5[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray5, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray5[j]);
			}
		}
		else if(answer.equals("6"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray6[j]);
			}
			System.out.println("Down:");
			Arrays.sort(NewArray6, Collections.reverseOrder());
			for(int j=0;j<i;j++)
			{
				System.out.println(NewArray6[j]);
			}
		}
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		break;
	}
	
	else if(respond.equals("4"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		
	
		String[] NewArray1 = new String[i];
		String[] NewArray2 = new String[i];
		String[] NewArray3 = new String[i];
		String[] NewArray4 = new String[i];
		String[] NewArray5 = new String[i];
		String[] NewArray6 = new String[i];
		for(int n=0;n<i;n++)
		{
			String temp1=Array1[n];
			String temp2=Array2[n];
			String temp3=Array3[n];
			String temp4=Array4[n];
			String temp5=Array5[n];
			String temp6=Array6[n];
			NewArray1[n]=temp1;
			NewArray2[n]=temp2;
			NewArray3[n]=temp3;
			NewArray4[n]=temp4;
			NewArray5[n]=temp5;
			NewArray6[n]=temp6;
		}
		
	
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
				String str1 = Array1[w];
				if(str.equals(str1))
				{
					rowChange2[z] = Array2[w];
					rowChange3[z] = Array3[w];
					rowChange4[z] = Array4[w];
					rowChange5[z] = Array5[w];
					rowChange6[z] = Array6[w];
				}
			}
		}
		//print
		for(int y=0;y<i;y++)
		{	
				System.out.println(NewArray1[y]+" "+rowChange2[y]+" "+rowChange3[y]+" "+rowChange4[y]+" "+rowChange5[y]+" "+rowChange6[y]+"\t");
		}
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
			break;
	}
	else if(respond.equals("5"))
	{
		int n=0;
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		while(inputStream.hasNext())
		{	
	
			String c1 = inputStream.next(); System.out.print(c1+" ");
			String c2 = inputStream.next(); System.out.print(c2+" ");
			String c3 = inputStream.next(); System.out.print(c3+" ");
			String c4 = inputStream.next(); System.out.print(c4+" ");
			String c5 = inputStream.next(); System.out.print(c5+" ");
			String c6 = inputStream.next(); System.out.println(c6);
			n++;
			if(n%16==0) {
				System.out.print("next page? y/n");
				String a = keyin.next();
				if(a.equals("n")||a.equals("N"))
				{
					
					break;
				}	
			}
			
		}
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
	break;	
	}
	else if(respond.equals("6"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));	
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		while(true)
		{	
		System.out.println("show(1)book's name (2)auther (3)publisher (4)number (5)class (6)year");
		String answer = keyin.next();
		if(answer.equals("1"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array1[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
			
		}
		
		else if(answer.equals("2"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array2[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("3"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array3[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("4"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array4[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("5"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array5[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("6"))
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(Array6[j]);
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
	}
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		break;
	 
	}
	else if(respond.equals("7"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		while(true)
		{	
		System.out.println("show(1)book's name (2)auther (3)publisher (4)number (5)class (6)year");
		String answer = keyin.next();
		
		if(answer.equals("1"))
		{
			int n=0;
			while(true)
			{
				
				System.out.println(Array1[n]);
				n++;
				if(n%16==0)
				{
					System.out.print("Next page y/n?");
					String aa = keyin.next();
					if(aa.equals("n")||aa.equals("N"))
					break;
				}
					if(n>=i) break;
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		
		else if(answer.equals("2"))
		{
			int n=0;
			while(true)
			{
				System.out.println(Array2[n]);
				n++;
				if(n%16==0) 
				{
					System.out.print("Next page y/n?");
					String bb = keyin.next();
					if(bb.equals("n")||bb.equals("N"))
					break;
			    }
				if(n>=i) break;
		    }
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}	
		else if(answer.equals("3"))
		{
			int n=0;
			while(true)
			{
				System.out.println(Array3[n]);
				n++;
				if(n%16==0) 
				{
					System.out.print("Next page y/n?");
					String cc = keyin.next();
					if(cc.equals("n")||cc.equals("N"))
					break;
					
				}	
				if(n>=i) break;
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("4"))
		{
			int n=0;
			while(true)
			{
				System.out.println(Array4[n]);
				n++;
				if(n%16==0) 
				{
					System.out.print("Next page y/n?");
					String dd = keyin.next();
					if(dd.equals("n")||dd.equals("N"))
					break;
				}	
				if(n>=i) break;
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("5"))
		{
			int n=0;
			while(true)
			{
				System.out.println(Array5[n]);
				n++;
				if(n%16==0)
				{
					System.out.print("Next page y/n?");
					String ee = keyin.next();
					if(ee.equals("n")||ee.equals("N"))
					break;
				}	
				if(n>=i) break;
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		else if(answer.equals("6"))
		{
			int n=0;
			for(;;)
			{
				System.out.println(Array6[n]);
				n++;
				if(n%16==0)
				{
					System.out.print("Next page y/n?");
					String ff = keyin.next();
					if(ff.equals("n")||ff.equals("N"))
					break;
				}	
				if(n>=i) break;
			}
			System.out.print("Show another column?(y/n):");
			String yn = keyin.next();
			if(yn.equals("n")||yn.equals("N")) break;
		}
		}
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		break;
		
	}
	else if(respond.equals("8"))
	{
		while(true)
		{	
		System.out.print("(1)book's name(2)number");
		String choose = keyin.next();
		if(choose.equals("1"))
		{	
		String bk = keyin.next();
		
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		int flag = 1;
		for(int itt=0;itt<i;itt++)
		{
			String temp=Array1[itt];
			
			if(bk.equals(temp))
			{
				System.out.println("This is the information you want");
				System.out.println(Array1[itt]+" "+Array2[itt]+" "+Array3[itt]+" "+Array4[itt]+" "+Array5[itt]+" "+Array6[itt]);
				flag = 0;
				System.out.print("Do you want to serch another book(y/n):");
				String ans = keyin.next();
				if(ans.equals("n")||ans.equals("N")) break;
			}	
		
		}
		if(flag==1)
		{
			System.out.println("Sorry~Can't find this book");
			System.out.print("you can try another book's name or number!!");
		}
		System.out.print("Do you want to serch another book(y/n):");
				String ans = keyin.next();
				if(ans.equals("n")||ans.equals("N")) break;
		}
		else if(choose.equals("2"))
		{
			String bk = keyin.next();
		
		Scanner inputStream = null;
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		System.out.println("Contents of al: " + array1);
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		
		int flag = 1;
		for(int itt=0;itt<i;itt++)
		{
			String temp=Array4[i];
			
			if(bk.equals(temp))
			{
				System.out.println("This is the information you want");
				System.out.println(Array1[itt]+" "+Array2[itt]+" "+Array3[itt]+" "+Array4[itt]+" "+Array5[itt]+" "+Array6[itt]);
				flag = 0;
				System.out.print("Do you want to serch another book(y/n):");
				String ans = keyin.next();
				if(ans.equals("n")||ans.equals("N")) break;
			}	
			
		}
		
		if(flag==1)	{
			System.out.println("Sorry~Can't find this book");
			System.out.print("you can try another book's name or number!!");
		}
		System.out.print("Do you want to serch another book(y/n):");
				String ans = keyin.next();
				if(ans.equals("n")||ans.equals("N")) break;
		}
		}		
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		break;
		
	}	
	else if(respond.equals("9"))
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
		String str=null ; 
		try{ 
		FileInputStream fi=new FileInputStream("database.txt"); 
		byte by[]=new byte[fi.available()]; 
		fi.read(by); 
		str=new String(by); 
		fi.close(); 
		}catch(IOException e){} 
		System.out.print("Which data do you want to amend?");
		String s1 = keyin.next();
		System.out.print("the update data:");
		String s1new = keyin.next();
		String newstr=str.replace(s1,s1new);
		try{ 
		FileWriter fw=new FileWriter("database.txt"); 
		fw.write(newstr);  
		fw.close(); 
		}catch(IOException e){} 
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))	
		break;	
		
	}	
	else if(respond.equals("10"))
	{
		//read data from database.txt
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		int record=0,flag=1;
		System.out.print("Which book do you want to delete?");
		String s1 = keyin.next();
		for(int itt=0;itt<i;itt++)
		{
			String temp=Array1[itt];
			
			if(s1.equals(temp))
			{
				System.out.println("This is the information you want to delete");
				System.out.println(Array1[itt]+" "+Array2[itt]+" "+Array3[itt]+" "+Array4[itt]+" "+Array5[itt]+" "+Array6[itt]);
				flag = 0;
				record=itt;
			}	
			
		}
		if(flag==1)	System.out.println("Sorry~Can't find this book");
		
		Array1[record]="";
		Array2[record]="";
		Array3[record]="";
		Array4[record]="";
		Array5[record]="";
		Array6[record]="";
		
		String str=null ; 
		try{ 
		FileInputStream fi=new FileInputStream("database.txt"); 
		byte by[]=new byte[fi.available()]; 
		fi.read(by); 
		str=new String(by); 
		fi.close(); 
		}catch(IOException ex){} 
		
		try{ 
		FileWriter fw=new FileWriter("database.txt",false);
		int r=0;		
		for(int it=0;it<i;it++)
		{
			fw.write(Array1[it]+" "+Array2[it]+" "+Array3[it]+" "+Array4[it]+" "+Array5[it]+" "+Array6[it]);
			if(r%6==0) fw.write("\r\n");
		}	
		fw.close(); 
		}catch(IOException ex){} 
		
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		    break;	
	}
	else if(respond.equals("11"))
	{
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
		
		
		
		
	
		String[] NewArray1 = new String[i];
		String[] NewArray2 = new String[i];
		String[] NewArray3 = new String[i];
		String[] NewArray4 = new String[i];
		String[] NewArray5 = new String[i];
		String[] NewArray6 = new String[i];
		for(int n=0;n<i;n++)
		{
			String temp1=Array1[n];
			String temp2=Array2[n];
			String temp3=Array3[n];
			String temp4=Array4[n];
			String temp5=Array5[n];
			String temp6=Array6[n];
			NewArray1[n]=temp1;
			NewArray2[n]=temp2;
			NewArray3[n]=temp3;
			NewArray4[n]=temp4;
			NewArray5[n]=temp5;
			NewArray6[n]=temp6;
		}
		
	
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
			String str = NewArray4[z];
			for(int w=0;w<i;w++)
			{
				String str1 = Array4[w];
				if(str.equals(str1))
				{
					rowChange1[z] = Array1[w];
					rowChange2[z] = Array2[w];
					rowChange3[z] = Array3[w];
					//rowChange4[z] = array4[w];
					rowChange5[z] = Array5[w];
					rowChange6[z] = Array6[w];
				}
			}
		}
		//寫回檔案
		
		String str=null ; 
		try{ 
		FileInputStream fi=new FileInputStream("database.txt"); 
		byte by[]=new byte[fi.available()]; 
		fi.read(by); 
		str=new String(by); 
		fi.close(); 
		}catch(IOException ex){} 
		System.out.println("請選擇(1)由小到大(2)由大到小排序:");
		String sort = keyin.next();
		try{ 
		FileWriter fw=new FileWriter("database.txt");//true false 沒有差別
		if(sort.equals("1"))
		{
			int r=0;		
			for(int it=0;it<i;it++)
			{
				fw.write(rowChange1[it]+" "+rowChange2[it]+" "+rowChange3[it]+" "+NewArray4[it]+" "+rowChange5[it]+" "+rowChange6[it]);
				if(r%6==0) fw.write("\r\n");
			}	
			fw.close();
		}
		else if(sort.equals("2"))
		{
			Arrays.sort(NewArray4, Collections.reverseOrder());
			String[] RowChange1 = new String[i];
			String[] RowChange2 = new String[i];
			String[] RowChange3 = new String[i];
			//String[] RowChange4 = new String[i];
			String[] RowChange5 = new String[i];
			String[] RowChange6 = new String[i];
			for(int z=0;z<i;z++)
			{
				String str2 = NewArray4[z];
				for(int w=0;w<i;w++)
				{
					String str1 = Array4[w];
					if(str2.equals(str1))
					{
						RowChange1[z] = Array1[w];
						RowChange2[z] = Array2[w];
						RowChange3[z] = Array3[w];
						//RowChange4[z] = array4[w];
						RowChange5[z] = Array5[w];
						RowChange6[z] = Array6[w];
					}
				}
			}
			//print
			int r=0;		
			for(int it=0;it<i;it++)
			{
				fw.write(rowChange1[it]+" "+rowChange2[it]+" "+rowChange3[it]+" "+NewArray4[it]+" "+rowChange5[it]+" "+rowChange6[it]);
				if(r%6==0) fw.write("\r\n");
			}	
			fw.close();	
		}	
		}catch(IOException ex){} 
		
		System.out.print("(1)return main list or (2)end program:");
			String reply = keyin.next();
			if(reply.equals("2"))
		    break;	
	}
	else if(respond.equals("12"))
{
	    Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("database.txt"));
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		ArrayList<String> array5 = new ArrayList<String>();
		ArrayList<String> array6 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String c1 = inputStream.next(); array1.add(c1);
			String c2 = inputStream.next(); array2.add(c2);
			String c3 = inputStream.next(); array3.add(c3);
			String c4 = inputStream.next(); array4.add(c4);
			String c5 = inputStream.next(); array5.add(c5);
			String c6 = inputStream.next(); array6.add(c6);
		}
		int i = array1.size();
		//ex:String a[] = (String[]) al.toArray(new String[0]);
		String[] Array1 = (String[]) array1.toArray(new String[0]);
		String[] Array2 = (String[]) array2.toArray(new String[0]);
		String[] Array3 = (String[]) array3.toArray(new String[0]);
		String[] Array4 = (String[]) array4.toArray(new String[0]);
		String[] Array5 = (String[]) array5.toArray(new String[0]);
		String[] Array6 = (String[]) array6.toArray(new String[0]);
	int sum =0;	
	boolean aa1,aa2,aa3,aa4,aa5,aa6;
	System.out.print("(1)書名:");
	String a1 = keyin.next();
	if(a1.equals("y")||a1.equals("Y"))
	{
		aa1 = true;
		sum++;
	}
	else
	{
		aa1 = false;
	}		
	System.out.print("(2)作者");
	String a2 = keyin.next();
	if(a2.equals("y")||a2.equals("Y"))
	{
		aa2 = true;
		sum++;
	}
	else
	{
		aa2 = false;
	}
	
	System.out.print("(3)出版社");
	String a3 = keyin.next();
	if(a3.equals("y")||a3.equals("Y"))
	{
		aa3 = true;
		sum++;
	}
	else
	{
		aa3 = false;
		
	}
	System.out.print("(4)編號");
	String a4 = keyin.next();
	if(a4.equals("y")||a4.equals("Y"))
	{
		aa4 = true;
		sum++;
	}
	else
	{
		aa4 = false;
	}
	System.out.print("(5)類別:");
	String a5 = keyin.next();
	if(a5.equals("y")||a5.equals("Y"))
	{
		aa5 = true;
		sum++;
	}
	else
	{
		aa5 = false;
	}
	System.out.print("(6)出版年份:");
	String a6 = keyin.next();
	if(a6.equals("y")||a6.equals("Y"))
	{
		aa6 = true;
		sum++;
	}
	else
	{
		aa6 = false;
	}
	//====OUTPUT=====
	for(int m=0;m<i;m++)	
	{
		if(aa1) System.out.print(Array1[m]+" ");
		if(aa2) System.out.print(Array2[m]+" ");
		if(aa3) System.out.print(Array3[m]+" ");
		if(aa4) System.out.print(Array4[m]+" ");
		if(aa5) System.out.print(Array5[m]+" ");
		if(aa6) System.out.print(Array6[m]+" ");
		
		System.out.println();
	}	
}	
	else 
	{
		System.out.print("Plese enter 1-12:");
	
	}
  }	
}
}

else 
{	
System.out.println("log in failed!");
}
}
}