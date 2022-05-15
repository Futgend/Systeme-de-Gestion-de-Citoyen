package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.control;
import javax.swing.JTextField;

public class InterfaceEtat extends JPanel {

	
	control control;
	InterfaceMenu panelMenu;
	
	/**
	 * Create the panel.
	 */
	public InterfaceEtat(control control) {
		
		this.control = control;
		
		
		// initialisation panel état
		setBackground(new Color(40,43,48));
		setBounds(0, 0, 800, 622);
		setLayout(null);
		
		
		//initialisation panel central	
		JPanel panelCentreEtat = new JPanel();
		panelCentreEtat.setBounds(0, 82, 800, 450);
		add(panelCentreEtat);
		panelCentreEtat.setBackground(new Color(204, 204, 255));
		panelCentreEtat.setLayout(null);
		
		
		//initialisation zone de texte
		JTextField tIdCitoyen = new JTextField();
		tIdCitoyen.setBounds(321, 68, 157, 35);
		panelCentreEtat.add(tIdCitoyen);
		tIdCitoyen.setColumns(10);	
		
		
		//initialisation bouton
		JButton btnRetour = new JButton();
		btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
		btnRetour.setBounds(25, 544, 100, 50);
		add(btnRetour);
		
		JButton btnValider = new JButton();
		btnValider.setIcon(new ImageIcon(Interface.class.getResource("/media/37-approve-checked-simple-outline.gif")));
		btnValider.setBounds(362, 115, 76, 40);
		panelCentreEtat.add(btnValider);
		
		//initialisation label
		JLabel lblNewLabel = new JLabel("N° citoyen :");
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel.setBounds(352, 40, 95, 16);
		panelCentreEtat.add(lblNewLabel);
		
		JLabel sousTitre = new JLabel("ETAT D'UNE PERSONNE");
		add(sousTitre);
		sousTitre.setBounds(284, 48, 232, 22);					
		sousTitre.setForeground(new Color(0, 204, 153));
		sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
		
		JLabel titre = new JLabel("GESTION DES CITOYENS");
		titre.setBounds(249, 6, 302, 36);
		add(titre);
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
		
		JLabel lblNewLabel_2 = new JLabel("Valider");
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_2.setBounds(375, 155, 49, 16);
		panelCentreEtat.add(lblNewLabel_2);
											
		JLabel lblNewLabel_3 = new JLabel("Retour");
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(51, 590, 48, 16);
		add(lblNewLabel_3);
		
		/*
		*	Action des boutons
		*/
		
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
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
