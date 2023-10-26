package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Pays;
import modele.Pays.PAYS;
import vue.VueContinator;

public class ControleurContinator extends Controleur{
	
	private Pays.PAYS paysChoisi;

	private List<Pays> paysContinent = null;
	
	public ControleurContinator()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
		this.paysContinent = new ArrayList<Pays>();
		
	}
	
	public void initialiser()
	{
		
	}

	public void notifierChoixPays (PAYS pays)
	{
		
		this.paysChoisi = pays;
	}

	public void notifierChoixPays(int numeroPays)  
	 {
		System.out.println("ControleurContinator.notifierChoixPays()");
		VueContinator.getInstance().afficherPays(numeroPays);
		
	}
	
	public void notifierClicContinant(double x, double y)
	{	
		System.out.println("ControleurContinator.notifierClicContinant()");
		VueContinator.getInstance().decouvrirPays(this.paysChoisi, x, y);
		Pays pays = new Pays(this.paysChoisi, x,y);
		this.paysContinent.add(pays);
	}
}
