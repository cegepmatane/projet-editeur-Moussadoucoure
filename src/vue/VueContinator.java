package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurContinator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
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
		
		
		Button actionChoisirContinentAfriqueOuest= (Button)lookup("#action-choix-continent-afrique-ouest");
	    Button actionChoisirContinentAfriqueEst = (Button)lookup("#action-choix-continent-afrique-est");
		Button actionChoisirContinentAfriqueSud = (Button)lookup("#action-choix-continent-afrique-sud");
		Button actionChoisirContinentAfriqueNord = (Button)lookup("#action-choix-continent-afrique-nord");
		
		actionChoisirContinentAfriqueOuest.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir le Continent Afrique de l'ouest");
				controleur.notifierChoixPays(1);
				
			}});
		
		
		
		actionChoisirContinentAfriqueEst.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir le Continent Afrique de l'est");
				controleur.notifierChoixPays(2);
				
			}});

		
		 actionChoisirContinentAfriqueSud.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir le Continent Afrique du Sud ");
				controleur.notifierChoixPays(3);;
				
				
			}});
		 
		 actionChoisirContinentAfriqueNord.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("choisir le Continent Afrique du Nord");
				controleur.notifierChoixPays(4);;
				
			}});
	
		
	}
	
	
	public void afficherPays(int numeroPays)
	{
		System.out.println("Vuecontinentor.afficherTerrain()");
		AnchorPane cloture = (AnchorPane)lookup("#continant");
		System.out.println(cloture);
		switch(numeroPays)
		{
		case 1:// afrique
			cloture.setStyle("-fx-background-image:url('vue/decoration/maliCarte.png');");
			break;
		case 2: // europe
			cloture.setStyle("-fx-background-image:url('vue/decoration/europe2.jpg');");
			break;
		case 3: // amerique
			cloture.setStyle("-fx-background-image:url('vue/decoration/afrique2.png');");
			break;
		case 4: // asie
			cloture.setStyle("-fx-background-image:url('vue/decoration/afrique2.png');");
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
		
		paysDecouvert.setPreserveRatio(true);
		paysDecouvert.setFitHeight(100);
		paysDecouvert.setX(x - 15);
		paysDecouvert.setY(y - 50);
		
		AnchorPane cloture = (AnchorPane) lookup("#continant");
		cloture.getChildren().add(paysDecouvert);
		
	}

	
	}




