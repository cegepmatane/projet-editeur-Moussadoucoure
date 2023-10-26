
import java.util.ArrayList;
import java.util.List;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.Exportable;
import donnee.Exporteur;
import modele.Pays;
import vue.VueContinator;

public class App {

	public static void main(String[] parametres) {
		//Controleur.choisirVuePrincipale(VueContinator.class);
		//Fenetre.launch(Fenetre.class, parametres);	
		
		Pays paysA = new Pays(Pays.PAYS.CHINE, 4, 7);
		Pays paysB = new Pays(Pays.PAYS.MALI, 10, 10);
		Pays paysC = new Pays(Pays.PAYS.CANADA, 200, 200);
		List<Exportable> paysContinent = new ArrayList<Exportable>();
		paysContinent.add(paysA);
		paysContinent.add(paysB);
		paysContinent.add(paysC);

		Exporteur exporteur = new Exporteur();
		exporteur. sauvegarder(paysContinent);
		
	}

}
