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

public class InterfaceMenu extends JPanel {
	
	 control control;
	 InterfaceMenu panelMenu;
	 InterfaceMariage panelMariage;
	 InterfaceDivorce panelDivorce;
	 InterfaceNaissance panelNaissance;
	 InterfaceEtat panelEtat;
	 InterfaceListe panelListe;
	 InterfaceSaisie panelSaisie;
	 
	/**
	 * Create the panel.
	 */
	 
	public InterfaceMenu(control control) {
		this.control = control;
		
			//initialisation panel menu
				setBackground(new Color(40,43,48));
				setBounds(0, 0, 800, 622);
				setLayout(null);			
				
				
			//initialisation bouton Quitter	
				JButton btnQuitter = new JButton();
				btnQuitter.setBounds(350, 549, 100, 50);
				add(btnQuitter);
				btnQuitter.setIcon(new ImageIcon(Interface.class.getResource("/media/29-cross-outline.gif")));
			
				
			//initialisation panel central	
				JPanel panelCentre = new JPanel();
				panelCentre.setBounds(0, 82, 800, 450);
				add(panelCentre);
				panelCentre.setBackground(new Color(204, 204, 255));
				panelCentre.setLayout(null);
				
				
			//initialisation bouton enregistrement mariage
				JButton btnMariage = new JButton();
				btnMariage.setBounds(50, 62, 200, 100);
				btnMariage.setIcon(new ImageIcon(Interface.class.getResource("/media/20-love-heart-outline.gif")));
				panelCentre.add(btnMariage);
				
				
			//initialisation bouton enregistrement divorce	
				JButton btnDivorce = new JButton();
				btnDivorce.setBounds(300, 62, 200, 100);
				btnDivorce.setIcon(new ImageIcon(Interface.class.getResource("/media/1468-morale-outline.gif")));
				panelCentre.add(btnDivorce);
				
				
			//initialisation bouton enregistrement naissance
				JButton btnNaissance = new JButton();
				btnNaissance.setIcon(new ImageIcon(Interface.class.getResource("/media/1270-fetus-outline.gif")));
				btnNaissance.setBounds(550, 62, 200, 100);
				panelCentre.add(btnNaissance);
				
				
			//initialisation bouton recherche état d'une personne
				JButton btnEtat = new JButton();
				btnEtat.setIcon(new ImageIcon(Interface.class.getResource("/media/19-magnifier-zoom-search-outline.gif")));
				btnEtat.setBounds(50, 287, 200, 100);
				panelCentre.add(btnEtat);
				
				
			//initialisation bouton liste des personnes
				JButton btnListe = new JButton();
				btnListe.setIcon(new ImageIcon(Interface.class.getResource("/media/153-bar-chart-growth-outline.gif")));
				btnListe.setBounds(300, 287, 200, 100);
				panelCentre.add(btnListe);
					
					
			//initialisation bouton saisie d'une personne
				JButton btnSaisie = new JButton();
				btnSaisie.setIcon(new ImageIcon(Interface.class.getResource("/media/245-edit-document-outline.gif")));
				btnSaisie.setBounds(550, 287, 200, 100);
				panelCentre.add(btnSaisie);						
							
				
			//initialisation label menu principal
					JLabel titre = new JLabel("GESTION DES CITOYENS");
					titre.setBounds(249, 6, 302, 36);
					add(titre);
					titre.setForeground(new Color(255, 255, 255));
					titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
				
				
					JLabel sousTitre = new JLabel("MENU PRINCIPAL");
					sousTitre.setBounds(316, 54, 168, 16);
					add(sousTitre);
					sousTitre.setForeground(new Color(0, 204, 153));
					sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
					
					
					JLabel labelQuitter = new JLabel("Quitter");
					labelQuitter.setBounds(372, 605, 56, 11);
					add(labelQuitter);
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
		*	Action des boutons du menu principal
		*/
					
				// action du bouton mariage
					btnMariage.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							removeAll();
							repaint();
							
							panelMariage = new InterfaceMariage(control);
							add(panelMariage);
							
							
						}
					});
					
				// action du bouton divorce
					btnDivorce.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							removeAll();
							repaint();
							
							panelDivorce = new InterfaceDivorce(control);
							add(panelDivorce);
							
						
							
						}
					});
					
					// action du bouton naissance
					btnNaissance.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							removeAll();
							repaint();
							
							panelNaissance = new InterfaceNaissance(control);
							add(panelNaissance);
							
							
						}
					});
					
					// action du bouton etat
					btnEtat.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							
							removeAll();
							repaint();
							
							panelEtat = new InterfaceEtat(control);
							add(panelEtat);
							
						}
					});
					
					// action du bouton liste
					btnListe.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							removeAll();
							repaint();
							
							panelListe = new InterfaceListe(control);
							add(panelListe);
							
						}
					});
					
					// action du bouton saisie
					btnSaisie.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							removeAll();
							repaint();
							
							panelSaisie = new InterfaceSaisie(control);
							add(panelSaisie);
							
						}
					});
					
					// action du bouton quitter
					btnQuitter.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							System.exit(0);
						} 
							});

	}

}
