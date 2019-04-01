package test;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Youssouf IBRAHIM
 *
 */
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Instanciation
		Personne [] p = new Personne[4];
		 p[0] = new Personne("Ibrahim",26);
		 p[1] = new Personne("Lucas",36);
		 p[2] = new Personne("Ahmed",40);
		 p[3] = new Personne("Philip",18);
		
		
		//créer un fichier 
		File f = new File("t1.txt");
		
		//verification du fichier
		if (f.exists()) {
			System.out.println("------> Le fichier existe !!! ");
		}
		else {
			f.createNewFile();
			System.out.println("------> Il est crée ");
		}
		System.out.println("/**Chemin du fichier: " + f.getAbsolutePath());
		
		//affichage
				for (int i=0; i<p.length; i++) {
					System.out.println(p[i].toString());
				}
		
		 
		//ecrire
		PrintWriter lucasibrahim = new PrintWriter(f);
		lucasibrahim.write(p[0].toString() +  '\n' + p[1].toString() + '\n' +p[2].toString() +  '\n' + p[3].toString());
		lucasibrahim.close();
		System.out.println("------> Ajoute reussi ");
		
		
		
		//lire un fichier à l'ecran
		//  FileReader fr = new FileReader(f)
		FileReader fr = new FileReader(f);
		char [] a = new char[300];
		fr.read(a);
		
		for( char t : a) {
			System.out.print(t);
		}
		fr.close();
		
		
		
		
		//Swing
		Fenetre ft = new Fenetre(p);
		ft.setVisible(true);
		
		
		
		Copie.sauve(f, p);
		
		

	}

}

class Copie{
	public static void sauve(File f, Personne [] p) throws FileNotFoundException {
		PrintWriter lb = new PrintWriter(f);
		lb.write(p[0].toString() +  '\n' + p[1].toString() + '\n' +p[2].toString() +  '\n' + p[3].toString());
		lb.close();
		System.out.println("------> Enregistrement reussi dans le nouveau fichier ");
	}
}
