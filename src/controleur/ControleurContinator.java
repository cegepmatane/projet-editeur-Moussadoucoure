package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.Exportable;
import donnee.Exporteur;
import modele.Continent;
import modele.Pays;
import modele.Pays.PAYS;
import vue.VueContinator;

public class ControleurContinator extends Controleur{
	

	private Pays.PAYS paysChoisi;

	//private List<Exportable> paysContinent = null;
	
	private Continent continent = new Continent(); 
	
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

	public void notifierChoixDrapeau(Continent.DRAPEAU drapeau)  
	 {
		System.out.println("ControleurContinator.notifierChoixDrapeau()");
		VueContinator.getInstance().afficherPays(drapeau);
		this.continent.setDrapeau(drapeau);
		
		//Exporteur exporteur = new Exporteur();
		//exporteur.sauvegarder(paysContinent);
		
	}
	
	public void notifierClicContinant(double x, double y)
	{	
		System.out.println("ControleurContinator.notifierClicContinant()");
		VueContinator.getInstance().decouvrirPays(this.paysChoisi, x, y);
		Pays pays = new Pays(this.paysChoisi, x,y);
		this.continent.ajouterPays(pays);
	}
	
	public void notifierSauvegarder() 
	{
		System.out.println("ControleurContinator.notifierSauvegarder()");
		Exporteur exporteur = new Exporteur();
		//exporteur.sauvegarder(paysContinent);
		exporteur.sauvegarder(continent);
	}
}
