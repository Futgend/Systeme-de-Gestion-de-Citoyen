package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controler.control;

public class InterfaceMariage extends JPanel {

	control control;
	InterfaceMenu panelMenu;
	
	/**
	 * Create the panel.
	 */
	public InterfaceMariage(control control) {

	this.control = control;
	
	
// initialisation panel mariage
	
	setBackground(new Color(40,43,48));
	setBounds(0, 0, 800, 622);
	setLayout(null);
	
	
//initialisation panel central mariage
	JPanel panelCentreMariage = new JPanel();
	panelCentreMariage.setBounds(0, 82, 800, 450);
	add(panelCentreMariage);
	panelCentreMariage.setBackground(new Color(204, 204, 255));
	panelCentreMariage.setLayout(null);
	add(panelCentreMariage);
	
	
//initialisation sous titre
	JLabel sousTitre = new JLabel("ENREGISTREMENT MARIAGE");
	add(sousTitre);
	sousTitre.setBounds(257, 48, 275, 22);					
	sousTitre.setForeground(new Color(0, 204, 153));
	sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
	
	
//initialisation zone de texte
	JTextField tIdEpoux1 = new JTextField();
	tIdEpoux1.setBounds(278, 99, 244, 42);
	panelCentreMariage.add(tIdEpoux1);
	tIdEpoux1.setColumns(10);
	
	
	JTextField tIdEpoux2 = new JTextField();
	tIdEpoux2.setBounds(278, 259, 244, 42);
	panelCentreMariage.add(tIdEpoux2);
	tIdEpoux2.setColumns(10);
	
	
//initialisation bouton	
	JButton btnValider = new JButton();
	btnValider.setIcon(new ImageIcon(Interface.class.getResource("/media/37-approve-checked-simple-outline.gif")));
	btnValider.setBounds(345, 364, 100, 50);
	panelCentreMariage.add(btnValider);
	
	
	JButton btnRetour = new JButton();
	btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
	btnRetour.setBounds(25, 544, 100, 50);
	add(btnRetour);
	
	
// initialisation label	
	JLabel titre = new JLabel("GESTION DES CITOYENS");
	titre.setBounds(249, 6, 302, 36);
	add(titre);
	titre.setForeground(new Color(255, 255, 255));
	titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
	
	
	JLabel lblNewLabel = new JLabel("N° époux 1 :");
	lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
	lblNewLabel.setBounds(352, 50, 95, 26);
	panelCentreMariage.add(lblNewLabel);
	
	
	JLabel lblNewLabel_1 = new JLabel("N° époux 2 :");
	lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
	lblNewLabel_1.setBounds(352, 222, 102, 26);
	panelCentreMariage.add(lblNewLabel_1);
										
	
	JLabel lblNewLabel_2 = new JLabel("Valider");
	lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
	lblNewLabel_2.setBounds(368, 414, 54, 16);
	panelCentreMariage.add(lblNewLabel_2);
					
						
	JLabel lblNewLabel_3 = new JLabel("Retour");
	lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
	lblNewLabel_3.setForeground(new Color(255, 255, 255));
	lblNewLabel_3.setBounds(51, 590, 48, 16);
	add(lblNewLabel_3);
	
	
	/*
	*	Action des boutons
	*/
	
	btnRetour.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			removeAll();
			repaint();
			
			panelMenu = new InterfaceMenu(control);
			add(panelMenu);
			
			
		}
	});
	btnValider.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
																
		}
	});
	

}
	}
