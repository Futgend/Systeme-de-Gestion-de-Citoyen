package model;

import java.util.*;

/**
 * 
 */
public class Femme extends Personne {

	String sexe;
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
    public Vector<Naissance> listEnfants;

}