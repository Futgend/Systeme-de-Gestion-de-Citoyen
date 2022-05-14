package model;

import java.util.*;


public class Naissance {

	//attributes
	
	public Date dateNaissance;
	public int pereId;
	public int mereId;
      
	//constructor
	
    public Naissance(int pId, int mId, Date dn) {
		this.pereId=pId;
		this.mereId=mId;
		this.dateNaissance = dn;
    }

    /**
     * 
     */
    public Date DateNaissance;

    /**
     * 
     */
    public Mairie mairie;

    /**
     * 
     */
    public Personne nouveauNé;

    /**
     * 
     */
    public Homme père;

    /**
     * 
     */
    public Femme mère;

}