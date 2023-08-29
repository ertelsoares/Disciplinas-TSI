package poo;

public class App {

    public void go() {
        TextUserInterface txtUserInterface = new TextUserInterface();
        
        int numberofterms = txtUserInterface.readNumberOfTerms();
        
        int firstterm = txtUserInterface.readFirstTerm();
        
        int commonDifference = txtUserInterface.readReason();
        
        ArithmeticProgression po1 = new ArithmeticProgression(firstterm, commonDifference);
        
        txtUserInterface.printAllTerms(po1, numberofterms);
        
        int sum = po1.sumOfAllTerms(numberofterms);
        
        System.out.println("A soma da pa1 é: " + sum);
        
        numberofterms = txtUserInterface.readNumberOfTerms();
        
        firstterm = txtUserInterface.readFirstTerm();
        
        commonDifference = txtUserInterface.readReason();
        
        ArithmeticProgression po2 = new ArithmeticProgression(firstterm, commonDifference);
        
        txtUserInterface.printAllTerms(po1, numberofterms);
        
        sum = po2.sumOfAllTerms(numberofterms);
        
        System.out.println("A soma da pa2 é: " + sum);

    }

    public static void main(String[] args) {
        App app = new App();
        app.go();
    }

}
