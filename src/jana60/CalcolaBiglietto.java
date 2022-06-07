package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int numeroDiKilometri;
	int etaDelPassegero;
	double prezzoBigliettoAlKilometro= 0.21;
	
	
	Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci numero di kilometri che vuoi percorrere: ");
		numeroDiKilometri = scan.nextInt();
		
        System.out.print("Prezzo biglietto senza sconto ");
    	
        double prezzoBigliettoSenzaSconto= numeroDiKilometri*prezzoBigliettoAlKilometro;
System.out.println(prezzoBigliettoSenzaSconto + "€");
        
System.out.print("Inserisci età del passeggero: ");
        etaDelPassegero = scan.nextInt();
//sconto    
 double prezzoTotaleDelViaggio;
 double scontoMinorenni= 0.20;
 double scontoOver65= 0.40;
 double scontoSulPrezzoMinorenni = prezzoBigliettoSenzaSconto * scontoMinorenni;
 double scontoSulPrezzoOver65 = prezzoBigliettoSenzaSconto * scontoOver65;
 double prezzoTotaleViaggioMinorenni = prezzoBigliettoSenzaSconto - scontoMinorenni;
 double prezzoTotaleViaggioOver65 = prezzoBigliettoSenzaSconto - scontoOver65;
 
if(etaDelPassegero < 18) {
	System.out.println("Prezzo totale viaggio per minorenne: ");

}else	if(etaDelPassegero > 65)
	System.out.println("Prezzo totale viaggio per over65: ");


 
 
 
		
    scan.close();
	}

}
