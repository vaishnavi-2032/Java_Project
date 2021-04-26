package Answer;
import java.util.*;
public class AnswerCheck1
{

public String answer1[]={"B","B","D","A","C","A","B","C","B","A"};
public String answer[]={"B","A","B","B","A","B","B"};
public static int score=0;
public static int score1=0;

	public void checkAnswer1(int qno)
    	{	  
		Scanner s=new Scanner(System.in);
	 	System.out.println("Enter Ans's option:");
		String ans=s.next();
        	if(ans.equals(answer1[qno]))
           	{ 
			score=score+10;
			System.out.println("Correct answer..!!");	
		}
        	else
		{
	    		System.out.println("wrong answer..");
		}
    	}
public void checkAnswer2(int qno)
    	{	  
		Scanner s=new Scanner(System.in);
	 	System.out.println("Enter Ans's option:");
		String ans=s.next();
        	if(ans.equals(answer[qno]))
           	{ 
			score1=score1+10;
			System.out.println("Correct answer..!!");	
		}
        	else
		{
            		score1=score1-5;
	    		System.out.println("wrong answer..");
		}
    	}

	public int Result()
    	{
        	return score;
    	}
	public int Result1()
	{
		return score1;
	}

}