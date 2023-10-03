package modele;

public class Pays {

	public enum PAYS {MALI, CANADA, CHINE, FRANCE}
	
	protected PAYS pays;
	
	

	public Pays() {
		
	}



	public PAYS getPays() {
		return pays;
	}



	public void setPays(PAYS pays) {
		this.pays = pays;
	}



	public Pays(PAYS pays) {
		super();
		this.pays = pays;
	}
}
	
	
