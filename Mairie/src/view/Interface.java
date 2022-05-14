package view;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import controler.control;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Interface extends JFrame {

	/**
	 * 
	 */
	
	 control control;
	 
	 JPanel contentPane;
	 JPanel panelMenu;
	 JPanel panelMariage;
	 JPanel panelDivorce;
	 JPanel panelNaissance;
	 JPanel panelEtat;
	 JPanel panelListe;
	 JPanel panelSaisie;
	 
	 JButton btnQuitter;
	 JPanel panelCentre;
	 JButton btnDivorce;
	 JButton btnListe;
	 JButton btnMariage;
	 JButton btnEtat;
	 JButton btnSaisie;
	 JButton btnNaissance;
	 JLabel titre;
	 JLabel sousTitre;
	 JLabel labelQuitter;
	
	
	

	/**
	 * Create the application.
	 */
	

	

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	//initialisation titre
		titre = new JLabel("GESTION DES CITOYENS");
		titre.setBounds(249, 6, 302, 36);
		contentPane.add(titre);
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
		
		
	//initialisation panel menu
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(40,43,48));
		panelMenu.setBounds(0, 0, 800, 622);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		
	//initialisation bouton Quitter	
		btnQuitter = new JButton();
		btnQuitter.setBounds(350, 549, 100, 50);
		panelMenu.add(btnQuitter);
		btnQuitter.setIcon(new ImageIcon(Interface.class.getResource("/media/29-cross-outline.gif")));
	
		
	//initialisation panel central	
		panelCentre = new JPanel();
		panelCentre.setBounds(0, 82, 800, 450);
		panelMenu.add(panelCentre);
		panelCentre.setBackground(new Color(204, 204, 255));
		panelCentre.setLayout(null);
		
		
	//initialisation bouton enregistrement mariage
		btnMariage = new JButton();
		btnMariage.setBounds(50, 62, 200, 100);
		btnMariage.setIcon(new ImageIcon(Interface.class.getResource("/media/20-love-heart-outline.gif")));
		panelCentre.add(btnMariage);
		
		
	//initialisation bouton enregistrement divorce	
		btnDivorce = new JButton();
		btnDivorce.setBounds(300, 62, 200, 100);
		btnDivorce.setIcon(new ImageIcon(Interface.class.getResource("/media/1468-morale-outline.gif")));
		panelCentre.add(btnDivorce);
		
		
	//initialisation bouton enregistrement naissance
		btnNaissance = new JButton();
		btnNaissance.setIcon(new ImageIcon(Interface.class.getResource("/media/1270-fetus-outline.gif")));
		btnNaissance.setBounds(550, 62, 200, 100);
		panelCentre.add(btnNaissance);
		
		
	//initialisation bouton recherche état d'une personne
		btnEtat = new JButton();
		btnEtat.setIcon(new ImageIcon(Interface.class.getResource("/media/19-magnifier-zoom-search-outline.gif")));
		btnEtat.setBounds(50, 287, 200, 100);
		panelCentre.add(btnEtat);
		
		
	//initialisation bouton liste des personnes
		btnListe = new JButton();
		btnListe.setIcon(new ImageIcon(Interface.class.getResource("/media/153-bar-chart-growth-outline.gif")));
		btnListe.setBounds(300, 287, 200, 100);
		panelCentre.add(btnListe);
			
			
	//initialisation bouton saisie d'une personne
		btnSaisie = new JButton();
		btnSaisie.setIcon(new ImageIcon(Interface.class.getResource("/media/245-edit-document-outline.gif")));
		btnSaisie.setBounds(550, 287, 200, 100);
		panelCentre.add(btnSaisie);						
					
		
		//initialisation label menu principal
			sousTitre = new JLabel("MENU PRINCIPAL");
			sousTitre.setBounds(316, 54, 168, 16);
			panelMenu.add(sousTitre);
			sousTitre.setForeground(new Color(0, 204, 153));
			sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
			
			
			labelQuitter = new JLabel("Quitter");
			labelQuitter.setBounds(372, 605, 56, 11);
			panelMenu.add(labelQuitter);
			labelQuitter.setForeground(new Color(255, 255, 255));
			labelQuitter.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		
			
			JLabel lblNewLabel_2 = new JLabel("Enregistrement Mariage");
			lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_2.setBounds(60, 174, 175, 16);
			panelCentre.add(lblNewLabel_2);
			
			
			JLabel lblNewLabel_3 = new JLabel("Enregistrement Divorce");
			lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_3.setBounds(317, 174, 166, 16);
			panelCentre.add(lblNewLabel_3);
			
			
			JLabel lblNewLabel_4 = new JLabel("Enregistrement Naissance");
			lblNewLabel_4.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_4.setBounds(560, 174, 185, 16);
			panelCentre.add(lblNewLabel_4);
			
			
			JLabel lblNewLabel_5 = new JLabel("État d'une personne");
			lblNewLabel_5.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_5.setBounds(74, 399, 143, 16);
			panelCentre.add(lblNewLabel_5);
			
			
			JLabel lblNewLabel_6 = new JLabel("Affichage de la liste des personnes");
			lblNewLabel_6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_6.setBounds(277, 399, 246, 16);
			panelCentre.add(lblNewLabel_6);
			
			
			JLabel lblNewLabel_7 = new JLabel("Saisie des personnes");
			lblNewLabel_7.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
			lblNewLabel_7.setBounds(574, 399, 148, 16);
			panelCentre.add(lblNewLabel_7);
			
			
			
/*
	Action des boutons du menu principal
*/
			
		// action du bouton mariage
			btnMariage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					remove(panelMenu);
					repaint();
					
					
				// initialisation panel mariage
					panelMariage = new JPanel();
					panelMariage.setBackground(new Color(40,43,48));
					panelMariage.setBounds(0, 0, 800, 622);
					panelMariage.setLayout(null);
					contentPane.add(panelMariage);
					
					
				//initialisation panel central	
					JPanel panelCentreMariage = new JPanel();
					panelCentreMariage.setBounds(0, 82, 800, 450);
					panelMariage.add(panelCentreMariage);
					panelCentreMariage.setBackground(new Color(204, 204, 255));
					panelCentreMariage.setLayout(null);
					panelMariage.add(panelCentreMariage);
					
					
				//initialisation sous titre
					sousTitre = new JLabel("ENREGISTREMENT MARIAGE");
					panelMariage.add(sousTitre);
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
					panelMariage.add(btnRetour);
					
					
				// initialisation label
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
					panelMariage.add(lblNewLabel_3);
									
					
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							remove(panelMariage);
							contentPane.add(panelMenu);
							repaint();
							
						}
					});
					btnValider.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
																				
						}
					});
					
				}
			});
			
			
			btnDivorce.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					remove(panelMenu);
					repaint();
					
				// initialisation panel divorce
					panelDivorce = new JPanel();
					panelDivorce.setBackground(new Color(40,43,48));
					panelDivorce.setBounds(0, 0, 800, 622);
					panelDivorce.setLayout(null);
					contentPane.add(panelDivorce);
					
					
				//initialisation panel central	
					JPanel panelCentreDivorce = new JPanel();
					panelCentreDivorce.setBounds(0, 82, 800, 450);
					panelDivorce.add(panelCentreDivorce);
					panelCentreDivorce.setBackground(new Color(204, 204, 255));
					panelCentreDivorce.setLayout(null);
					panelDivorce.add(panelCentreDivorce);
					
					
				//initialisation sous titre
					sousTitre = new JLabel("ENREGISTREMENT DIVORCE");
					panelDivorce.add(sousTitre);
					sousTitre.setBounds(257, 48, 275, 22);					
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
				//initialisation zone de texte
					JTextField tIdEpoux1 = new JTextField();
					tIdEpoux1.setBounds(278, 99, 244, 42);
					panelCentreDivorce.add(tIdEpoux1);
					tIdEpoux1.setColumns(10);
					
					
					JTextField tIdEpoux2 = new JTextField();
					tIdEpoux2.setBounds(278, 259, 244, 42);
					panelCentreDivorce.add(tIdEpoux2);
					tIdEpoux2.setColumns(10);
					
					
				//initialisation bouton	
					JButton btnValider = new JButton();
					btnValider.setIcon(new ImageIcon(Interface.class.getResource("/media/37-approve-checked-simple-outline.gif")));
					btnValider.setBounds(345, 364, 100, 50);
					panelCentreDivorce.add(btnValider);
					
					
					JButton btnRetour = new JButton();
					btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
					btnRetour.setBounds(25, 544, 100, 50);
					panelDivorce.add(btnRetour);
					
					
				// initialisation label
					JLabel lblNewLabel = new JLabel("N° époux 1 :");
					lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
					lblNewLabel.setBounds(352, 50, 95, 26);
					panelCentreDivorce.add(lblNewLabel);
					
					
					JLabel lblNewLabel_1 = new JLabel("N° époux 2 :");
					lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
					lblNewLabel_1.setBounds(352, 222, 102, 26);
					panelCentreDivorce.add(lblNewLabel_1);
														
					
					JLabel lblNewLabel_2 = new JLabel("Valider");
					lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					lblNewLabel_2.setBounds(368, 414, 54, 16);
					panelCentreDivorce.add(lblNewLabel_2);
									
										
					JLabel lblNewLabel_3 = new JLabel("Retour");
					lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					lblNewLabel_3.setForeground(new Color(255, 255, 255));
					lblNewLabel_3.setBounds(51, 590, 48, 16);
					panelDivorce.add(lblNewLabel_3);
									
					
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							remove(panelDivorce);
							contentPane.add(panelMenu);
							repaint();
							
						}
					});
					btnValider.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
																				
						}
					});
					
				}
			});
			
			
			btnNaissance.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					remove(panelMenu);
					repaint();
					
					
					// initialisation panel naissance
					panelNaissance = new JPanel();
					panelNaissance.setBackground(new Color(40,43,48));
					panelNaissance.setBounds(0, 0, 800, 622);
					panelNaissance.setLayout(null);
					contentPane.add(panelNaissance);
					
					//initialisation sous titre 
					JLabel sousTitre = new JLabel("ENREGISTREMENT NAISSANCE");
					panelNaissance.add(sousTitre);
					sousTitre.setBounds(244, 48, 301, 22);					
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
					//initialisation panel central	
					JPanel panelCentreNaissance = new JPanel();
					panelCentreNaissance.setBounds(0, 82, 790, 450);
					panelNaissance.add(panelCentreNaissance);
					panelCentreNaissance.setBackground(new Color(204, 204, 255));
					panelCentreNaissance.setLayout(null);
					
					
					//initialisation label
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
					panelNaissance.add(lblNewLabel_3);
					
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
					ButtonGroup buttonGroup = new ButtonGroup();
					
					JRadioButton RadioButtonHomme = new JRadioButton("Homme");
					RadioButtonHomme.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));				
					buttonGroup.add(RadioButtonHomme);
					RadioButtonHomme.setBounds(145, 223, 93, 23);
					panelCentreNaissance.add(RadioButtonHomme);
					
					JRadioButton RadioButtonFemme = new JRadioButton("Femme");
					RadioButtonFemme.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					buttonGroup.add(RadioButtonFemme);
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
					panelNaissance.add(btnRetour);
					
					
					
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							
							remove(panelNaissance);
							contentPane.add(panelMenu);
							repaint();
						}
					});
				}
			});
			
			
			btnEtat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					
					remove(panelMenu);
					repaint();
					
					
					// initialisation panel état
					panelEtat = new JPanel();
					panelEtat.setBackground(new Color(40,43,48));
					panelEtat.setBounds(0, 0, 800, 622);
					panelEtat.setLayout(null);
					contentPane.add(panelEtat);
					
					//initialisation sous titre 
					JLabel sousTitre = new JLabel("ETAT D'UNE PERSONNE");
					panelEtat.add(sousTitre);
					sousTitre.setBounds(244, 48, 301, 22);					
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
					//initialisation panel central	
					JPanel panelCentreEtat = new JPanel();
					panelCentreEtat.setBounds(0, 82, 790, 450);
					panelEtat.add(panelCentreEtat);
					panelCentreEtat.setBackground(new Color(204, 204, 255));
					panelCentreEtat.setLayout(null);
					
					
					//initialisation bouton
					JButton btnRetour = new JButton();
					btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
					btnRetour.setBounds(25, 544, 100, 50);
					panelEtat.add(btnRetour);
					
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							
							remove(panelEtat);
							contentPane.add(panelMenu);
							repaint();
						}
					});
					
				}
			});
			
			
			btnListe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					remove(panelMenu);
					repaint();
					
					// initialisation panel liste
					panelListe = new JPanel();
					panelListe.setBackground(new Color(40,43,48));
					panelListe.setBounds(0, 0, 800, 622);
					panelListe.setLayout(null);
					contentPane.add(panelListe);
					
					//initialisation sous titre 
					JLabel sousTitre = new JLabel("LISTE DES PERSONNES");
					panelListe.add(sousTitre);
					sousTitre.setBounds(244, 48, 301, 22);					
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
					//initialisation panel central	
					JPanel panelCentreListe = new JPanel();
					panelCentreListe.setBounds(0, 82, 790, 450);
					panelListe.add(panelCentreListe);
					panelCentreListe.setBackground(new Color(204, 204, 255));
					panelCentreListe.setLayout(null);
					
					
					//initialisation bouton
					JButton btnRetour = new JButton();
					btnRetour.setIcon(new ImageIcon(Interface.class.getResource("/media/41-home-outline.gif")));
					btnRetour.setBounds(25, 544, 100, 50);
					panelListe.add(btnRetour);
					
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							
							remove(panelListe);
							contentPane.add(panelMenu);
							repaint();
						}
					});
					
				}
			});
			
			
			btnSaisie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					remove(panelMenu);
					repaint();
					
					// initialisation panel saisie
					JPanel panelSaisie = new JPanel();
					panelSaisie.setBackground(new Color(40,43,48));
					panelSaisie.setBounds(0, 0, 800, 622);
					panelSaisie.setLayout(null);
					contentPane.add(panelSaisie);
					
					
					//initialisation sous titre
					JLabel sousTitre = new JLabel("SAISIE DES PERSONNES");
					panelSaisie.add(sousTitre);
					sousTitre.setBounds(278, 48, 234, 22);					
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
					//initialisation panel central	
					JPanel panelCentreSaisie = new JPanel();
					panelCentreSaisie.setBounds(0, 82, 790, 450);
					panelSaisie.add(panelCentreSaisie);
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
					panelSaisie.add(btnRetour);
					
					
					//initialisation label
					JLabel lblNewLabel_2 = new JLabel("Valider");
					lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					lblNewLabel_2.setBounds(368, 414, 54, 16);
					panelCentreSaisie.add(lblNewLabel_2);					
					
					JLabel lblNewLabel_3 = new JLabel("Retour");
					lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					lblNewLabel_3.setForeground(new Color(255, 255, 255));
					lblNewLabel_3.setBounds(51, 590, 48, 16);
					panelSaisie.add(lblNewLabel_3);
					
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
					ButtonGroup buttonGroup = new ButtonGroup();
					
					JRadioButton rdbtnNewRadioButton = new JRadioButton("Homme");
					rdbtnNewRadioButton.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					buttonGroup.add(rdbtnNewRadioButton);
					rdbtnNewRadioButton.setBounds(173, 223, 93, 23);
					panelCentreSaisie.add(rdbtnNewRadioButton);
					
					JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femme");
					rdbtnNewRadioButton_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
					buttonGroup.add(rdbtnNewRadioButton_1);
					rdbtnNewRadioButton_1.setBounds(289, 223, 85, 23);
					panelCentreSaisie.add(rdbtnNewRadioButton_1);


					// action bouton
					btnRetour.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							
							remove(panelSaisie);
							contentPane.add(panelMenu);
							repaint();
						}
					});
				}
			});
			
			
			btnQuitter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
				} 
					});
			
			

	}
}
