package layout;

import javafx.geometry.Pos;
//import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAncorPen extends AnchorPane {
	
	public TesteAncorPen() {
		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, 10.0);
		setLeftAnchor(q1, 10.0);
		
		
		Quadrado q2 = new Quadrado();
		setRightAnchor(q2, 10.0);
		setTopAnchor(q2, 10.0);
		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3, 10.0);
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);
		
		Quadrado q5 = new Quadrado();
		setTopAnchor(q5,250.0);
		setLeftAnchor(q5, 350.);
		
		
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro,110.0);
		setBottomAnchor(centro,110.0);
		setLeftAnchor(centro,110.0);
		setRightAnchor(centro,110.0);
		
		
		
		centro.getChildren().add(q5);
		
		
		getChildren().addAll(q1,q2,q3,q4,centro);
	}

}