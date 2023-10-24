package modele;

import donnee.Exportable;
public class Pays {

	public enum PAYS {MALI, CANADA, CHINE, ALLEMAGNE}
	
	protected PAYS pays;
	protected double x;
	protected double y;
	

	public Pays(PAYS pays) {
		super();
		this.pays = pays;
		this.x = 0;
		this.y = 0;
	}

	public void setX(double x) {
		this.x = x;
	}

	
	

	public Pays(PAYS pays, double x, double y) {
		super();
		this.pays = pays;
		this.x = x;
		this.y = y;
	}

	public PAYS getPays() {
		return pays;
	}



	public void setPays(PAYS pays) {
		this.pays = pays;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}

	public String exporterXML() 
	{
		String xml = "";
		xml += "<sorte>" + this.pays + "<sorte>";
		xml += "<coordonnees>" + this.x +";" + this.y +"</coordonnees>";
		return "<pays>" + xml + "</pays>";

	}
	public String exporterJSON() {
		return "NOM-IMPLEMENTE";	
	}
	
	
}
	
	
