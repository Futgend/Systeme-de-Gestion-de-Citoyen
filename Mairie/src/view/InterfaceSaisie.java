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

public class InterfaceSaisie extends JPanel {

	control control;
	InterfaceMenu panelMenu;
	
	/**
	 * Create the panel.
	 */
	public InterfaceSaisie(control control) {
		
		this.control = control;
		
		
		// initialisation panel saisie
		setBackground(new Color(40,43,48));
		setBounds(0, 0, 800, 622);
		setLayout(null);
				
		
		//initialisation panel central	
		JPanel panelCentreSaisie = new JPanel();
		panelCentreSaisie.setBounds(0, 82, 800, 450);
		add(panelCentreSaisie);
		panelCentreSaisie.setBackground(new Color(204, 204, 255));
		panelCentreSaisie.setLayout(null);
		
		
		//initialisation bouton
		JButton btnValider = new JButton();
		btnValider.setIcon(new ImageIcon(Interface.class.getResource("/media/37-approve-checked-simple-outline.gif")));
		btnValider.setBounds(345, 364, 100, 50);
		panelCentreSaisie.add(btnValider);
		
		JButton btnRetour = new JButton();
		btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
		btnRetour.setBounds(25, 544, 100, 50);
		add(btnRetour);
		
		
		//initialisation label
		JLabel titre = new JLabel("GESTION DES CITOYENS");
		titre.setBounds(249, 6, 302, 36);
		add(titre);
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
		
		JLabel sousTitre = new JLabel("SAISIE DES PERSONNES");
		add(sousTitre);
		sousTitre.setBounds(283, 48, 234, 22);					
		sousTitre.setForeground(new Color(0, 204, 153));
		sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Valider");
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_2.setBounds(368, 414, 54, 16);
		panelCentreSaisie.add(lblNewLabel_2);					
		
		JLabel lblNewLabel_3 = new JLabel("Retour");
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(51, 590, 48, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nom :");
		lblNewLabel_4.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_4.setBounds(54, 119, 42, 16);
		panelCentreSaisie.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prénom :");
		lblNewLabel_5.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_5.setBounds(54, 173, 71, 16);
		panelCentreSaisie.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sexe :");
		lblNewLabel_6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_6.setBounds(54, 227, 42, 16);
		panelCentreSaisie.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Date de naissance :");
		lblNewLabel_7.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_7.setBounds(54, 273, 145, 16);
		panelCentreSaisie.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Jour (jj) :");
		lblNewLabel_8.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_8.setBounds(54, 301, 71, 16);
		panelCentreSaisie.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Mois (mm) :");
		lblNewLabel_9.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_9.setBounds(289, 301, 85, 16);
		panelCentreSaisie.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Année (aaaa) :");
		lblNewLabel_10.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_10.setBounds(516, 301, 101, 16);
		panelCentreSaisie.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("N° personne :");
		lblNewLabel_11.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_11.setBounds(54, 56, 107, 16);
		panelCentreSaisie.add(lblNewLabel_11);
		
		
		//initialisation zone de texte
		JTextField tIdPersonne = new JTextField();
		tIdPersonne.setBounds(173, 46, 260, 36);
		panelCentreSaisie.add(tIdPersonne);
		tIdPersonne.setColumns(10);
		
		JTextField tnom = new JTextField();
		tnom.setBounds(173, 109, 260, 36);
		panelCentreSaisie.add(tnom);
		tnom.setColumns(10);
		
		JTextField tprenom = new JTextField();
		tprenom.setBounds(173, 163, 260, 36);
		panelCentreSaisie.add(tprenom);
		tprenom.setColumns(10);
		
		JTextField tjour = new JTextField();
		tjour.setBounds(173, 296, 80, 26);
		panelCentreSaisie.add(tjour);
		tjour.setColumns(10);
		
		JTextField tmois = new JTextField();
		tmois.setBounds(394, 296, 80, 26);
		panelCentreSaisie.add(tmois);
		tmois.setColumns(10);
		
		JTextField tannee = new JTextField();
		tannee.setBounds(629, 296, 80, 26);
		panelCentreSaisie.add(tannee);
		tannee.setColumns(10);
		
		//initialisation radio bouton
		ButtonGroup hommeFemme = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Homme");
		rdbtnNewRadioButton.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		hommeFemme.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(173, 223, 93, 23);
		panelCentreSaisie.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femme");
		rdbtnNewRadioButton_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		hommeFemme.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(289, 223, 85, 23);
		panelCentreSaisie.add(rdbtnNewRadioButton_1);


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
