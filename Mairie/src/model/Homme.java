package model;

import java.util.*;

/**
 * 
 */
public class Homme extends Personne {

	String sexe;
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
    
    public Set<Naissance> listEnfants;

}