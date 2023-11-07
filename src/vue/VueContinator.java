package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurContinator;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import modele.Continent;
import modele.Continent.DRAPEAU;
import modele.Pays;
import modele.Pays.PAYS;

public class VueContinator extends Vue {

	
	protected ControleurContinator controleur;
	protected static VueContinator instance = null; 
	public static VueContinator getInstance() {if(null==instance)instance = new VueContinator();return VueContinator.instance;}; 
	
	private VueContinator() 
	{
		super("continator.fxml", VueContinator.class, 1294,743);
		super.controleur = this.controleur = new ControleurContinator();
		Logger.logMsg(Logger.INFO, "new VueJardinator()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		
		Button choisirMali = (Button) lookup("#choisir-mali");
		choisirMali.setOnAction(new EventHandler<ActionEvent>() 
		{
            
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Clic choisir Mali");
				controleur.notifierChoixPays(Pays.PAYS.MALI);
				
			}});
		
		Button choisirCanada = (Button) lookup("#choisir-canada");
		choisirCanada.setOnAction(new EventHandler<ActionEvent>() 
		{
            
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Clic choisir Canada");
				controleur.notifierChoixPays(Pays.PAYS.CANADA);
				
			}});
		
		Button choisirChine = (Button) lookup("#choisir-chine");
		choisirChine.setOnAction(new EventHandler<ActionEvent>() 
		{
            
			@Override
			public void handle(ActionEvent e) {
				
				System.out.println("Clic choisir Chine");
				controleur.notifierChoixPays(Pays.PAYS.CHINE);
				
			}});
		
		Button choisirAllemagne = (Button) lookup("#choisir-allemagne");
		choisirAllemagne.setOnAction(new EventHandler<ActionEvent>() 
		{
            
			@Override
			public void handle(ActionEvent e) {
				
				System.out.println("Clic choisir Allemagne");
				controleur.notifierChoixPays(Pays.PAYS.ALLEMAGNE);
				
			}});
		
		Rectangle jardin = (Rectangle) lookup("#afrique");
		jardin.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent clic) {
				
				System.out.println("Clic pour découvrir un pays");
				double x = clic.getX();
				double y = clic.getY();
				
				System.out.println("Clic a ("+x+", "+y+")");
				
				
				controleur.notifierClicContinant(x, y);
				
			}});
		
		
		
		Button actionChoisirContinentMali= (Button)lookup("#action-choix-continent-mali");
	    Button actionChoisirContinentCanada = (Button)lookup("#action-choix-continent-canada");
		Button actionChoisirContinentChine = (Button)lookup("#action-choix-continent-chine");
		Button actionChoisirContinentAllemagne = (Button)lookup("#action-choix-continent-chine");
		Button actionSauvegarder = (Button)lookup("#action-sauvegarder");
		
		actionSauvegarder.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Actoin de choisir");
				controleur.notifierSauvegarder();
				
			}});

		

		actionChoisirContinentMali.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir la carte Mali");
				controleur.notifierChoixDrapeau(Continent.DRAPEAU.Mali);
				
			}});
		
		
		
		actionChoisirContinentCanada.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir la carte Canada");
				controleur.notifierChoixDrapeau(Continent.DRAPEAU.Canada);
				
			}});

		
		actionChoisirContinentChine.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir la carte Chine");
				controleur.notifierChoixDrapeau(Continent.DRAPEAU.Chine);
				
				
			}});
		 
		actionChoisirContinentAllemagne.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir la carte Allemagne");
				controleur.notifierChoixDrapeau(Continent.DRAPEAU.Allemagne);
				
			}});
	
		
	}
	
	
	public void afficherPays(DRAPEAU drapeau)
	{
		System.out.println("Vuecontinentor.afficherTerrain()");
		AnchorPane cloture = (AnchorPane)lookup("#continant");
		System.out.println(cloture);
		switch(drapeau)
		{
		case Mali:// afrique
			cloture.setStyle("-fx-background-image:url('vue/decoration/maliCarte.png');");
			break;
		case Canada: // europe
			cloture.setStyle("-fx-background-image:url('vue/decoration/cartecanada.png');");
			break;
		case Chine: // amerique
			cloture.setStyle("-fx-background-image:url('vue/decoration/cartechine.png');");
			break;
		case Allemagne: // asie
			cloture.setStyle("-fx-background-image:url('vue/decoration/carteallemagne.jpg');");
			break;
		default:
			cloture.setStyle("-fx-background-image:url('vue/decoration/terre.png');");
		break;
			
		}
	}
	 // decouvrir d'autres pays
	public void decouvrirPays(PAYS paysChoisi, double x, double y) 
	{
		
		// Ajouter un pays dans le monde
		ImageView paysDecouvert = new ImageView();
		if(paysChoisi == PAYS.MALI) 
		{
			paysDecouvert.setImage(new Image("vue/decoration/drapeau.png"));
		}

		if(paysChoisi == PAYS.CANADA)
		{
			paysDecouvert.setImage(new Image("vue/decoration/CanadaFlag.png"));
		}
		
		if(paysChoisi == PAYS.CHINE)
		{
			paysDecouvert.setImage(new Image("vue/decoration/drapeauChine.png"));
		}
		
		if(paysChoisi == PAYS.ALLEMAGNE)
		{
			paysDecouvert.setImage(new Image("vue/decoration/drapeauAllemagne.png"));
		}
		
		paysDecouvert.setPreserveRatio(true);
		paysDecouvert.setFitHeight(100);
		paysDecouvert.setX(x - 15);
		paysDecouvert.setY(y - 50);
		
		AnchorPane cloture = (AnchorPane) lookup("#continant");
		cloture.getChildren().add(paysDecouvert);
		
	}

	
	}




