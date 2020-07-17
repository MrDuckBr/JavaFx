package basico;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB); 
		box.getChildren().add(botaoC);
		
		botaoC.setOnAction(e ->{
			System.out.println("Sair");
			System.exit(0);
		});
		
		
		Scene unicaCena = new Scene(box,150,100);
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);/*recebi por heranca de aplication*/
		
	}

}
 