package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Mairie implements Serializable {

    /**
     * Default constructor
     */
    public Mairie() {
    }

    /**
     * 
     */
    public Vector<Personne> listPersonne=new Vector<Personne> ();

    /**
     * 
     */
    public Vector<Deces> listDécès = new Vector<Deces> ();

    /**
     * 
     */
    public Vector<Naissance> listNaissance = new Vector<Naissance> ();

    /**
     * 
     */
    public Vector<Mariage> listMariage = new Vector <Mariage> ();

}