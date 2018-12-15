//Write a Program to Enter user name and Password
import java.io.*;
class UserId 					//User class 
{
	void username()
	{
	String s=null, u=null;
	File fn=null;
	FileReader fr=null;
	BufferedReader br=null;
	try
	{
		fn=new File("user.txt");
		fr=new FileReader(fn);
		
		br=new BufferedReader(fr);
		
		s=br.readLine();
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your User name");
		u=br1.readLine();
		if(s.equals(u))
		{
		PassWord p=new PassWord();
		p.pasw();	
		}
		else 
		{
			System.out.println("Invalid Your User Name  please re-enter your user name");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
// Password class
class PassWord
{
	
	void pasw()
	{
	String p1=null, p2=null;
	File fn=null;
	FileReader fr=null;
	BufferedReader br=null;
	try
	{
		fn=new File("password.txt");
		br=new BufferedReader(new FileReader(fn));
		
		p1=br.readLine();
		
		
		System.out.println("Enter your PassWord");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		p2=br1.readLine();
		if(p1.equals(p2))
		{
			Txt t=new Txt();
			t.ab();
		}
		else 
		{
			System.out.println("Invalid Your password please re-enter your User name or  PassWord name");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
//=====================================Writing in the txt file class====================
class Txt
{
	void ab()
	{
		char ch='a';
		File fout=null;
		FileWriter fw=null;
		
		try
		{
			fout=new File("abc.txt");
			fw=new FileWriter(fout);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a char data");
			while(ch!='*');
			{
				ch=(char)br.read();
				fw.write(ch);
				
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}	}
}
//======Main class========================
class Mainp
{
	public static void main(String arg[])
	{
		UserId u=new UserId();
		u.username();
		
		
	}
}