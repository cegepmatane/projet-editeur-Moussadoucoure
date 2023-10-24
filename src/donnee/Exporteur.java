package donnee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Exporteur {
	
	public static String NOM_FICHIER = "export.xml";
	
	public void sauvegarder(List<Exportable>objets) 
	{
		String texte = "";
		for(Exportable objet : objets) 
		{
			texte += objet.exporterXML();
		}
		texte = "<sauvegarde>" + texte + "</sauvegarde>";
		
		try
		{
			FileWriter fichier = new FileWriter(NOM_FICHIER,false);
			fichier.write(texte);
			fichier.close();
		}
		catch(IOException ioe) 
		{
			
		}
		
		
	}
	public void sauvegarder(Exportable objet) 
	{
		String texte = "<sauvegarde>" +objet.exporterXML() + "</sauvegarde>";
		try 
		{
			FileWriter fichier = new FileWriter(NOM_FICHIER,false);
			fichier.write(texte);
			fichier.close();
		}catch(IOException ioe) 
		{
			
		}
	}
}
