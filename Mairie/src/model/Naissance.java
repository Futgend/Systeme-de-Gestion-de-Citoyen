package model;

import java.io.Serializable;
import java.util.*;


public class Naissance implements Serializable {

	//attributes
	public Mairie mairie;
	public Date dateNaissance;
	public Homme pere;
	public Femme mere;
	public Personne nouveauNé;
      
	//constructor
	
    public Naissance(Homme p, Femme m, Date dn) {
		this.pere=p;
		this.mere=m;
		this.dateNaissance = dn;
    }

   



}