package model;

import java.util.*;

public class Personne {

	//Attributes
	
    public int numero;
    public String nom;
    public String prenom;
    public Date datedeNaissance;
    public Deces deces;
    public String etatCivil;


    //Constructor
    
public Personne(int id, String n, String pn, Date dn) {
		this.numero = id;
		this.nom = n;
		this.prenom = pn;
		this.datedeNaissance = dn;
		
		
	}
	//Methods
    
public boolean isDead() {
    return deces != null;
}

public void valEtatpardéfaut() {
	etatCivil = "célibataire";
}

public boolean isMajeur() {
	return dn < 
}
    /**
     * 
     */

public Vector<Mariage> listMariage;

public Mairie mairie;

public Naissance naiss;
}
