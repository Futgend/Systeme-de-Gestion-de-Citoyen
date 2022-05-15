package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Femme extends Personne implements Serializable {

	String sexe;
	public Vector<Naissance> listEnfants;
    /**
     * Default constructor
     */

    public Femme(int id, String n, String pn, Date dn, String s) {    	
    	super(id, n, pn, dn);
    	this.sexe = s;
    }

    /**
     * 
     */
  
    public void ajoutNaissance(Naissance n) {	//ajout d'un enfant dans la liste des enfants d'un citoyen
    	listEnfants.add(n);
    }
    
    public boolean estParentDe(Femme x) {		
    	for (int i=0; i<listEnfants.size(); i++) {
    		if (numero == x.listEnfants.get(i).mere.numero) {
    			return true;
    		}
    	}
    	return false;
    }
    
}