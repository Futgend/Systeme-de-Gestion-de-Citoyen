package controler;

import view.Interface;


public class control {

	Interface fenetre;
	
	
	public static void main(String[] args) {
		new control();

	}
	
	
	// constructor
	
	public control() {
		fenetre = new Interface(this);
		fenetre.setVisible(true);
	}

}
