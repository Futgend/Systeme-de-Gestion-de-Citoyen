package model;

import java.io.Serializable;
import java.util.*;


public class Deces implements Serializable {

	//attributes
	
	public Date dateDeces;
	public Personne personne;
	public Mairie mairie;
	

	// constructor
	
	public Deces(Personne x, Date dd) {
		this.personne = x;
		this.dateDeces = dd;
	}

    public Deces(Personne x) {
		personne = x;
	}
    
    // methods

    public void setMairie(Mairie m) {		//place la mairie où a eu lieu le décès
    	mairie = m;
    }
    
    public Mairie getMairie() {				//recherche la mairie o� a eu lieu le d�c�s
    	return mairie;
    }


}
