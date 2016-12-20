package appli;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Appli {
	public static final int nbAMultiplier = 10;
	
	public static void main(String[] args) throws Exception{
		double poidsLimite = 40;
		SacADos sac;
		try {
			sac = new SacADos("itemsEval.txt" ,poidsLimite);
		} 
		catch (FileNotFoundException e) {
			throw new FileNotFoundException("Fichier introuvable");
		}
		
		System.out.println("M�thode glouton tapez : glouton");
		System.out.println("M�thode dynamique tapez : dynamique");
		System.out.println("M�thode PSE tapez : pse");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		sac.r�soudre(cmd);		
		System.out.println(sac.toString());
		sc.close();
	}
}

