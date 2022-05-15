package view;

import javax.swing.JFrame;
import controler.control;




public class Interface extends JFrame{

	/**
	 * 
	 */
		
	 control control;
	 
	 InterfaceMenu panelMenu;
	 
	 	
	/**
	 * Initialize the contents of the frame.
	 */


	public Interface(control control) {
		this.control = control;
		
			
	//initialisation fenetre	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		setResizable(false);
		setTitle("Système de Gestion des Citoyens");
		setLocationRelativeTo(null);
		
	// initialisation du menu	
		panelMenu = new InterfaceMenu(control);
		add(panelMenu);
			
			

	}
} 
