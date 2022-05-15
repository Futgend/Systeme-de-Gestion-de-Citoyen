package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controler.control;

public class InterfaceNaissance extends JPanel {

	control control;
	InterfaceMenu panelMenu;
	
	/**
	 * Create the panel.
	 */
	public InterfaceNaissance(control control) {
		
		this.control = control;
		
		
		// initialisation panel naissance
		
		setBackground(new Color(40,43,48));
		setBounds(0, 0, 800, 622);
		setLayout(null);
				
		
		//initialisation panel central	
		JPanel panelCentreNaissance = new JPanel();
		panelCentreNaissance.setBounds(0, 82, 800, 450);
		add(panelCentreNaissance);
		panelCentreNaissance.setBackground(new Color(204, 204, 255));
		panelCentreNaissance.setLayout(null);
		
		
		//initialisation label
		JLabel titre = new JLabel("GESTION DES CITOYENS");
		titre.setBounds(249, 6, 302, 36);
		add(titre);
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
		
		JLabel sousTitre = new JLabel("ENREGISTREMENT NAISSANCE");
		add(sousTitre);
		sousTitre.setBounds(244, 48, 301, 22);					
		sousTitre.setForeground(new Color(0, 204, 153));
		sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("N° mère :");
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel.setBounds(54, 47, 76, 26);
		panelCentreNaissance.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N° père :");
		lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_1.setBounds(397, 47, 71, 26);
		panelCentreNaissance.add(lblNewLabel_1);									
		
		JLabel lblNewLabel_2 = new JLabel("Valider");
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_2.setBounds(368, 414, 54, 16);
		panelCentreNaissance.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Retour");
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(51, 590, 48, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nom :");
		lblNewLabel_4.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_4.setBounds(54, 163, 42, 16);
		panelCentreNaissance.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		lblNewLabel_5.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_5.setBounds(345, 163, 71, 16);
		panelCentreNaissance.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sexe :");
		lblNewLabel_6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_6.setBounds(54, 227, 42, 16);
		panelCentreNaissance.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Date de naissance :");
		lblNewLabel_7.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_7.setBounds(54, 279, 145, 16);
		panelCentreNaissance.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Jour (jj) :");
		lblNewLabel_8.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_8.setBounds(54, 312, 71, 16);
		panelCentreNaissance.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Mois (mm) :");
		lblNewLabel_9.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_9.setBounds(289, 312, 85, 16);
		panelCentreNaissance.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Année (aaaa) :");
		lblNewLabel_10.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_10.setBounds(480, 312, 101, 16);
		panelCentreNaissance.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("N° enfant :");
		lblNewLabel_11.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_11.setBounds(54, 112, 85, 16);
		panelCentreNaissance.add(lblNewLabel_11);
		
		
		//initialisation zone de texte
		JTextField tIdMere = new JTextField();
		tIdMere.setBounds(145, 45, 229, 33);
		panelCentreNaissance.add(tIdMere);
		tIdMere.setColumns(10);					
		
		JTextField tIdPere = new JTextField();
		tIdPere.setBounds(480, 45, 229, 33);
		panelCentreNaissance.add(tIdPere);
		tIdPere.setColumns(10);
		
		JTextField tIdEnfant = new JTextField();
		tIdEnfant.setBounds(145, 107, 130, 26);
		panelCentreNaissance.add(tIdEnfant);
		tIdEnfant.setColumns(10);
		
		JTextField tNomEnfant = new JTextField();
		tNomEnfant.setBounds(145, 158, 130, 26);
		panelCentreNaissance.add(tNomEnfant);
		tNomEnfant.setColumns(10);
		
		JTextField tPrenomEnfant = new JTextField();
		tPrenomEnfant.setBounds(449, 158, 130, 26);
		panelCentreNaissance.add(tPrenomEnfant);
		tPrenomEnfant.setColumns(10);
		
		JTextField tjour = new JTextField();
		tjour.setBounds(145, 307, 61, 26);
		panelCentreNaissance.add(tjour);
		tjour.setColumns(10);
		
		JTextField tmois = new JTextField();
		tmois.setBounds(380, 307, 65, 26);
		panelCentreNaissance.add(tmois);
		tmois.setColumns(10);
		
		JTextField tannee = new JTextField();
		tannee.setBounds(591, 307, 71, 26);
		panelCentreNaissance.add(tannee);
		tannee.setColumns(10);
		
		
		//initialisation radio bouton
		ButtonGroup hommeFemme = new ButtonGroup();
		
		JRadioButton RadioButtonHomme = new JRadioButton("Homme");
		RadioButtonHomme.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));				
		hommeFemme.add(RadioButtonHomme);
		RadioButtonHomme.setBounds(145, 223, 93, 23);
		panelCentreNaissance.add(RadioButtonHomme);
		
		JRadioButton RadioButtonFemme = new JRadioButton("Femme");
		RadioButtonFemme.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		hommeFemme.add(RadioButtonFemme);
		RadioButtonFemme.setBounds(289, 223, 85, 23);
		panelCentreNaissance.add(RadioButtonFemme);
												
		
		//initialisation bouton
		JButton btnValider = new JButton();
		btnValider.setIcon(new ImageIcon(Interface.class.getResource("/media/37-approve-checked-simple-outline.gif")));
		btnValider.setBounds(345, 364, 100, 50);
		panelCentreNaissance.add(btnValider);
		
		JButton btnRetour = new JButton();
		btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
		btnRetour.setBounds(25, 544, 100, 50);
		add(btnRetour);
		
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
