package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Pays;
import modele.Pays.PAYS;
import vue.VueContinator;

public class ControleurContinator extends Controleur{
	
	private Pays.PAYS paysChoisi;

	public ControleurContinator()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
	}
	
	public void initialiser()
	{
		
	}

	public void notifierChoixPays (PAYS pays)
	{
		
		this.paysChoisi = pays;
	}

	public void notifierChoixPays(int numeroPays) {
		VueContinator.getInstance().afficherPays(numeroPays);
	}
	
	public void notifierClicContinant(double x, double y)
	{	
		VueContinator.getInstance().decouvrirPays(this.paysChoisi, x, y);
	}
}
