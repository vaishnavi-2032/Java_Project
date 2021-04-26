import Answer.*;
import java.util.*;
import java.io.*;
interface Question
{
 void askQuestion(FileReader f1);
}
class MyClass
{
	String name;
	String lname;
	String type;

	public void login()
	{
		try
		{
			
			FileWriter f=new FileWriter("score.txt",true);
			Scanner s=new Scanner(System.in);

			System.out.println("Enter your first name:");
			name=s.next();
			f.write(" "+name);
			System.out.println("Enter your last name:");
			lname=s.next();
			f.write(" "+lname);
			System.out.println("Are you a teacher or student..??");
			type=s.next();
			f.write(" "+type);
			f.write("\n");
			System.out.println("Registered successfully...");
			f.close();
		}
		catch(Exception e)
		{
		}	
	}
	public void showResult()
	{
		try
		{			

			FileReader f2=new FileReader("score.txt");
			FileInputStream f3=new FileInputStream("score1.txt");
			BufferedReader b=new BufferedReader(f2);
			int c;

			String s;
			System.out.println("  Name\t Last Name  Teacher/Student\tScore"); 
			while(((c=f3.read())!=-1) && ((s=b.readLine())!=null))
			{
					System.out.print(s+"        ");
					System.out.println(c);
									
			}
			f2.close();
			f3.close();
		}
		catch(Exception e)
		{
		}
		
	}
}
class PlayQ implements Question
{
	public void askQuestion(FileReader f1)
	{ 
		try
		{
			int i;
			int qno=0;	
			String q;
			BufferedReader br=new BufferedReader(f1);
			AnswerCheck c=new AnswerCheck();

			while((q=br.readLine())!=null)
			{
				System.out.println("\n"+q);
				i=0;
				while(i<4)
				{
					System.out.println(br.readLine());
					i++;
				}
		  		c.checkAnswer1(qno);
		  		qno++;
			}
		}
		catch(Exception e)
		{
		}
	}
	public void askQuestion2(FileReader f1)
	{ 
		try
		{
			int i;
			int qno=0;	
			String q;
			BufferedReader br=new BufferedReader(f1);
			AnswerCheck1 c=new AnswerCheck1();

			while((q=br.readLine())!=null)
			{
				System.out.println("\n"+q);
				i=0;
				while(i<4)
				{
					System.out.println(br.readLine());
					i++;
				}
		  		c.checkAnswer1(qno);
		  		qno++;
			}
		}
		catch(Exception e)
		{
		}
	}

 	
	public void Quizs()
	{
		Scanner s=new Scanner(System.in);
			int ch;
			System.out.println("*********************************************************************************");
			
			System.out.println("Here two rounds for a game. In first round 10 questions are asked. There is no negative system in first round.You get +10 marks for each correct answer. IF your scpre will become greater than 50 then you crack the first round. YOu can go to seconnd round. IN second round 7 questions are asked and there is negative system. For each wrong answer your 5 marks will get reduced.");
System.out.println("*********************************************************************************");

System.out.println("\n\nReady to play a QUIZ....\nWhich Quiz you want to play..??");
			System.out.println("1.Technical Quiz\n2.General Knowdlege\nEnter Your choice:");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:TechnicalQuiz();
				       break;
				case 2:GeneralQuiz();
				       break;
			}
	}
	public void TechnicalQuiz()
	{
			
		try
		{
			FileReader f=new FileReader("round1.txt");
			FileOutputStream f4=new FileOutputStream("score1.txt",true);
			FileWriter f5=new FileWriter("score.txt",true);
			FileReader f1=new FileReader("round2.txt");
			Scanner s=new Scanner(System.in);
			PlayQ1 q1=new PlayQ1();
			AnswerCheck c=new AnswerCheck();
			
			askQuestion(f); 
			int res=c.Result();
			String ans="y",k;
			System.out.println("Result:"+res);
			if(res>=50)
			{
				System.out.println("Your have crack the first round..\n Are you ready for second round?? y/n");
				ans=s.next();
				if(ans.equals("y"))
				{		
					q1.askQuestion(f1);
				}
				else
				{
					return;
				}		
				
			}
			else
			{
				System.out.println("Quiz  endend..\n Congractulations..\n Your score is:"+res);
					f4.write(res);
				return;
			}
			res=c.Result1();
			System.out.println("Quiz ended.. \nCongractulations your score is:"+res);
			f4.write(res);

			f.close();
			f4.close();
			f1.close();
		}
		catch(Exception e)
		{
		}			
	}

	public void GeneralQuiz()
	{
		try
		{
			FileReader f=new FileReader("gkround1.txt");
			FileOutputStream f4=new FileOutputStream("score1.txt",true);
			FileWriter f5=new FileWriter("score.txt",true);
			FileReader f1=new FileReader("gkround2.txt");
			Scanner s=new Scanner(System.in);
			PlayQ1 q1=new PlayQ1();
			AnswerCheck1 c=new AnswerCheck1();
			
			askQuestion2(f); 
			int res=c.Result();
			String ans="y",k;
			System.out.println("Result:"+res);
			if(res>=50)
			{
				System.out.println("Your have crack the first round..\n Are you ready for second round?? y/n");
				ans=s.next();
				if(ans.equals("y"))
				{		
					q1.askQuestion3(f1);
				}
				else
				{
					return;
				}		
				
			}
			else
			{
				System.out.println("Quiz  endend..\n Congractulations..\n Your score is:"+res);
					f4.write(res);
				return;
			}
			res=c.Result1();
			System.out.println("Quiz ended..\nCongractulations your score is:"+res);
			f4.write(res);

			f.close();
			f4.close();
			f1.close();
		}
		catch(Exception e)
		{
		}			
	}


} 
class PlayQ1 implements Question 
{
	public void askQuestion(FileReader f1)
	{
	 	try
		{ 	int i;	
	  		int qno=0;
	  		String ans;
	 	 	String q;
	  		BufferedReader br=new BufferedReader(f1);
	  		AnswerCheck c=new AnswerCheck();

			while((q=br.readLine())!=null)
			{
				System.out.println("\n"+q);
				i=0;
				while(i<2)
				{
					System.out.println(br.readLine());
					i++;
				}
		  
		  		 c.checkAnswer2(qno);
		   		qno++;
			}
		}
		catch(Exception e)
		{
		}
	}

	public void askQuestion3(FileReader f1)
	{
	 	try
		{ 	int i;	
	  		int qno=0;
	  		String ans;
	 	 	String q;
	  		BufferedReader br=new BufferedReader(f1);
	  		AnswerCheck1 c=new AnswerCheck1();

			while((q=br.readLine())!=null)
			{
				System.out.println("\n"+q);
				i=0;
				while(i<2)
				{
					System.out.println(br.readLine());
					i++;
				}
		  		c.checkAnswer2(qno);
		   		qno++;
			}
		}
		catch(Exception e)
		{
		}
	}
}
class QuizPlay
{
	public static void main(String args[])
	{
		 MyClass m=new MyClass();
		PlayQ p=new PlayQ();
		Scanner s=new Scanner(System.in);

		int ch;
		String conti="y";

		do{
			System.out.println(".........................***********WELCOME TO QUIZ GAME**********...........................");
			System.out.println("1.Register\n2.Play Quiz\n3.View All Scores\n4.Exit\nEnter Your choice:");
			ch=s.nextInt();

			switch(ch)
			{
				case 1:m.login();
				       break;
				case 2:p.Quizs();
					break;
				case 3:m.showResult();
					break;
				case 4:System.exit(0);
				default:System.out.println("Enter Valid Choice..!!");
			}
			System.out.println("Do you want to continue: y/n");
			conti=s.next();
		}while(conti.equals("y"));;;
	}

}
