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
        prezzoBigliettoSenzaSconto= scan.nextDouble();		

		
		
		
		
    scan.close();
	}

}
