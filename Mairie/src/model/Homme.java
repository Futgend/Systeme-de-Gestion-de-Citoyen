package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Homme extends Personne implements Serializable {

	String sexe;
	public Vector<Naissance> listEnfants;
    /**
     * Default constructor
     */

    public Homme(int id, String n, String pn, Date dn, String s) {    	
    	super(id, n, pn, dn);
    	this.sexe = s;
    }
    /**
     * 
     */
    public void ajoutNaissance(Naissance n) {	//ajout d'un enfant dans la liste des enfants d'un citoyen
    	listEnfants.add(n);
    }
    
    public boolean estParentDe(Homme x) {		
    	for (int i=0; i<listEnfants.size(); i++) {
    		if (numero == x.listEnfants.get(i).pere.numero) {
    			return true;
    		}
    	}
    	return false;
    }
    
    
}