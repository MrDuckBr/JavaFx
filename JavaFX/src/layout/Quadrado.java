package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {
	private static int i = 0;
	private String[] cores = {
			"#c33c5e","#39aac6","#28d79a",
			"#fb750e","#6657a8","#f9060e"
	};
	
	public Quadrado() {
		this(100,100);
	}
	
	public Quadrado(int largura,int altura) {
		setWidth(largura);
		setHeight(altura);
		
		//fill preenchimento de background
		setFill(Color.web(cores[i]));
		//valor e um paint que e uma cor
		i++;
	
	if(i == 6)  i = 0;
	}
	
	
	
}