
import java.util.ArrayList;
import java.util.List;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.Exportable;
import modele.Pays;
import vue.VueContinator;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueContinator.class);
		Fenetre.launch(Fenetre.class, parametres);	
		
		
	}

}
