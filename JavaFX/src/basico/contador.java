package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class contador extends Application{
	
	private int contador=0;
	
	private void confere(Label labelNumero) {
		labelNumero.setText(Integer.toString(contador));//estudar essa linha
		if(contador >= 0) {
			labelNumero.getStyleClass().remove("vermelha");
			labelNumero.getStyleClass().add("verde");
		}else if(contador < 0) {
			labelNumero.getStyleClass().remove("verde");
			labelNumero.getStyleClass().add("vermelha");
		}
	}
	
	
	 @Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 
		 Label labelTitulo = new Label("Contador");
		 labelTitulo.getStyleClass().add("titulo");
		 Label labelNumero = new Label("0");
		 labelNumero.getStyleClass().add("numero");
		 
		 Button botaoIncremento = new Button("+");
		 Button botaoDecremento = new Button("-");
		 Button sairPrograma = new Button("Sair");
		 botaoIncremento.getStyleClass().add("botoes");
		 botaoDecremento.getStyleClass().add("botoes");
		 
		 sairPrograma.setOnAction(e ->{
			 System.out.println(contador);
			 System.exit(1);
		 });
		sairPrograma.setAlignment(Pos.BASELINE_CENTER);
		 
		botaoIncremento.setOnAction(e->{
			contador = contador+1;
			confere(labelNumero);
		});
		
		botaoDecremento.setOnAction(e->{
			contador = contador-1;
			confere(labelNumero);
		});
		
		
		
		
		 HBox boxBotoes = new HBox();
		 boxBotoes.setAlignment(Pos.CENTER);
		 boxBotoes.setSpacing(10);
		 boxBotoes.getChildren().add(botaoDecremento);
		 boxBotoes.getChildren().add(botaoIncremento);
		 //ctrl+1 para mudar o nome da variavel pra todos
		 VBox boxConteudo = new VBox();
		 boxConteudo.getStyleClass().add("conteudo");//ESTUDAR
		 boxConteudo.setSpacing(10);//spaco entre elementos
		 boxConteudo.setAlignment(Pos.CENTER);//define posicao
		 boxConteudo.getChildren().add(labelTitulo);//adiciona no box principal
		 boxConteudo.getChildren().add(labelNumero);
		 boxConteudo.getChildren().add(boxBotoes);
		 boxConteudo.getChildren().add(sairPrograma);
		 
		 String caminhoCss = getClass()
				 .getResource("/basico/contador.css").toExternalForm();
		 Scene cenaPrincipal = new Scene(boxConteudo,400,400);//cria a cena
		 
		 cenaPrincipal.getStylesheets().add(caminhoCss);//adicionei css na cena
		 cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Pacifico");
		 
		 primaryStage.setScene(cenaPrincipal);//define como cena principal
		 primaryStage.setTitle("Contador");
		 primaryStage.show();//que comece o show
	}
	 
	 public static void main(String[] args) {
		launch(args);// lancar argumentos
	}

}
