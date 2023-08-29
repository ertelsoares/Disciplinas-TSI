package poo;

import java.util.Scanner;

public class TextUserInterface {
    
    
    Scanner console = new Scanner(System.in);

    public TextUserInterface() {
    }
    
    //--------------------------------------------------------------------
       public int readAllTerms(String msg , int numbermin, int numbermax){
		do 
		{
		   System.out.println(msg);
		   numbermax = console.nextInt();	   
		} while(numbermax < numbermin);
                
                return numbermax;
       }
    
    
	 public int readNumberOfTerms()
	{
	   return readAllTerms("Digite o número de termos da PA:",2,Integer.MAX_VALUE);
	}

	//--------------------------------------------------------------------
	public int readFirstTerm()
	{
		
            return readAllTerms("Digite o primeiro termo da PA:",1,Integer.MAX_VALUE);
	}
	
	//--------------------------------------------------------------------
	public int readReason()
	{
		
		return readAllTerms("Digite a razao da PA:",1,Integer.MAX_VALUE);
	}
        
        public void printAllTerms(ArithmeticProgression pa,int numberOfTerms)
	{
		for(int i=1; i<=numberOfTerms; i++)
		{
		       int ithTerm = pa.termOfIndex(i);
		       System.out.printf("a%d=%d\n",i, ithTerm);
		}
	}
}
