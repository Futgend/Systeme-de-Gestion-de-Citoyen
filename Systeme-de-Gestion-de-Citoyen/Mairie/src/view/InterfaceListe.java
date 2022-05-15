package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controler.control;
import javax.swing.JTable;

public class InterfaceListe extends JPanel {

	
	control control;
	InterfaceMenu panelMenu;
	private JTable table;
	
	/**
	 * Create the panel.
	 */
	public InterfaceListe(control control) {
		
		this.control = control;
		
		
		// initialisation panel liste
		setBackground(new Color(40,43,48));
		setBounds(0, 0, 800, 622);
		setLayout(null);

		
		//initialisation panel central	
		JPanel panelCentreListe = new JPanel();
		panelCentreListe.setBounds(0, 82, 800, 450);
		add(panelCentreListe);
		panelCentreListe.setBackground(new Color(204, 204, 255));
		panelCentreListe.setLayout(null);
		
		
		//initialisation table
		table = new JTable();
		table.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 12));
		table.setForeground(Color.WHITE);
		table.setBackground(Color.RED);
		table.setBounds(6, 6, 788, 438);
		panelCentreListe.add(table);
		JScrollPane scroller = new JScrollPane(table);
		panelCentreListe.add(scroller);
		
		//initialisation label
		JLabel titre = new JLabel("GESTION DES CITOYENS");
		titre.setBounds(249, 6, 302, 36);
		add(titre);
		titre.setForeground(new Color(255, 255, 255));
		titre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 23));
		
		JLabel sousTitre = new JLabel("LISTE DES PERSONNES");
		add(sousTitre);
		sousTitre.setBounds(287, 48, 225, 22);					
		sousTitre.setForeground(new Color(0, 204, 153));
		sousTitre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
		
		JLabel lblNewLabel_3 = new JLabel("Retour");
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(51, 590, 48, 16);
		add(lblNewLabel_3);
		
		
		//initialisation bouton
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

	}

}
