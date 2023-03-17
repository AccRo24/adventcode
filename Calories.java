import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calories {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "C:\\Users\\masse\\Documents\\IUT\\but_2\\adventcode\\AdventOfCodeDay1\\src\\Classeur1";
        File chemin = new File(path);
		Scanner data = new Scanner(chemin);
		
		int calories_max = 0;
		int calories_porte = 0;

		while (data.hasNext()) {
		   String line = data.nextLine();
		   if (line.isEmpty()) {
		      // fin inventaire elfe
		      if (calories_porte > calories_max) {
		    	  calories_max = calories_porte;
		      }
		      // reinitialise calories
		      calories_porte = 0;
		   } 
		   else {
			  // ajoute calories
		      int calories = Integer.parseInt(line);
		      calories_porte += calories;
		   }
		}

		// verifie si elfe qui finit son inventaire a + calories
		if (calories_porte > calories_max) {
			calories_max = calories_porte;
		}

		System.out.println("L'elfe qui porte le plus de calories en a " + calories_porte);	
	}
}
