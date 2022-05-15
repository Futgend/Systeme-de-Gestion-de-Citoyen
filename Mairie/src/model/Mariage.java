package model;

import java.io.Serializable;
import java.util.*;



public class Mariage implements Serializable {
	
	// Attributes
	
	public Personne epoux1;
    public Divorce divorce;
    public Personne epoux2;
    public Mairie mairie;


    /**
     * Default constructor
     */
    
    public Mariage(Personne x, Personne y) {
    	this.epoux1 = x;
    	this.epoux2 = y;
    }

    /**
     * 
     */
    public void setDivorce(Personne x, Personne y) {
    	divorce = new Divorce();		//cr�er le divorce de deux citoyens 
    }
    
    public Divorce getDivorce() {				//r�cup�re les informations du divorce
    	return divorce;
    }
    
    public void DateMariage;

    /**
     * 
     */
    
}