
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueContinator;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueContinator.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
