
package ArithmeticProgression;

import java.io.PrintStream;
import java.util.Scanner;


public class ArithmeticProgression {
    private final Scanner read = new Scanner(System.in);
    private final PrintStream write = System.out;

    public ArithmeticProgression() {
    }
    
    
     public void initArithmeticProgression(){
         
        int firstterm, amountterms,reason;
        
        firstterm = firsttermAp();
        
        amountterms = amounttermsAp() ;
        
        reason= reasonAp();
        
        sumPa(firstterm,amountterms,reason);
        
    }
    
    
    public int amounttermsAp(){
       int n ;
       
        do{
            
        write.println("Digite o número de termos da PA:");
        
        n = read.nextInt();
        
        }while(n < 2); 
        
        return n;
   }
    
    public int firsttermAp(){
       int a1 ;
       
        do{
        write.println("Digite o primeiro termo da PA:");
        
        a1 = read.nextInt();
        
        }while(a1 < 1); 
        
        return a1;
    }
    
    
    public int reasonAp(){
       int r;
       
        do{
            
        write.println("Digite a razao da PA:");
        
        r = read.nextInt();
        
        }while(r < 1); 
        
        return r;
    }
    
    
    public void sumPa(int firstterm,int amountterms ,int reason){
        int an, sum;
        
        an = firstterm + (amountterms -1) * reason;
        
        sum = ((firstterm + an) * amountterms)/2;
        
        sequencelistAp(firstterm,amountterms,reason);
        
       write.printf("A soma é:%d\n",sum);
    }
    
    public void sequencelistAp(int firstterm,int amountterms ,int reason){
        int t;
        for (int index = 1; index <= amountterms; index++) {
            
            t = firstterm + (index - 1) * reason;
            
            write.printf("a%d=%d\n",index,t);
        }
        
    }
}
