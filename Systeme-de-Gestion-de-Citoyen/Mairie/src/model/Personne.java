package model;

import java.io.Serializable;
import java.util.*;

public class Personne implements Serializable {

	//Attributes
	
    public int numero;
    public String nom;
    public String prenom;
    public Date datedeNaissance;
    public Deces deces;
    public String etatCivil;
    public Vector<Mariage> listMariage;
    public Mairie mairie;
    public Naissance naissance;
  


    //Constructor
    
public Personne(int id, String n, String pn, Date dn) {
		this.numero = id;
		this.nom = n;
		this.prenom = pn;
		this.datedeNaissance = dn;
		listMariage = new Vector<Mariage>();
		deces = new Deces(this);
		
		
	}
	//Methods
    
public boolean isDead() {
    return deces != null;
}

public void valEtatpardéfaut() {
	etatCivil = "célibataire";
}


    /**
     * 
     */


public void setNaissance(Naissance n) {		//permet de rentrer la date de naissance
	naissance = n;
}

public Naissance getNaissance() {			//recherche la date de naissance
	return naissance;
}

public void setMort(Deces m) {				//permet d'appliquer l'attribut mort � une personne qui vient de d�c�der
	deces = m;
} 

public Deces getMort() {					//recherche les informations du d�c�s
	return deces;
}

public void setMairie(Mairie m) {			//place la ville dans laquelle habite la citoyen
	mairie = m;
}

public Mairie getMairie() {					//recherche la ville dans laquelle habite la citoyen
	return mairie;
}

public void ajoutMariage(Mariage m) {		//ajout d'un mariage dans la liste des mariages du citoyen
	listMariage.add(m);
}


public boolean estMarie() {					//v�rification si un citoyen est en ce moment m�me mari�
	if (listMariage.isEmpty()) { 				//si sa liste de mariages est vide
		return false;						//la m�thode retourne faux
		}
	int i = listMariage.size()-1;				//si l'emplacement est vide dans la liste des divorces � l'indice correspondant celui du dernier mariage dans la liste des marriages 
	if ((listMariage.get(i).divorce==null)&&(estVeuf()==false)) { //et que la personne n'est pas veuve
		return true;						//alors le m�thode retourne vrai
	} 
	else {return false;}					//en dehors de ces conditions, la m�thode retourne faux
}

public boolean ageLegal(int age) {			//v�rification de l'�ge de la personne en fonction d'une limitation appliqu�e
	if(calculAge()>=age) {					//calcul de l'�ge du citoyen, si sup�rieur ou �gal � la limitation
		return true;						//on retourne vrai
	}
	return false;							//sinon on retourne faux, le citoyen est plus jeune que l'�ge l�gal pour effectuer une action
}

public boolean estMort() {					//on v�rifie si un citoyen est d�c�d�
	if(deces.dateDeces==null) {				//si il n'existe pas de date de d�c�s, le citoyen est en vie
		return false;						//la m�thode retourne faux
	}
	else {
		return true;						//sinon, le citoyen est bien mort, la m�thode retourne vrai
	}
}

public boolean estVeuf() { 					//on v�rifie si une personne est veuve
	if (listMariage.isEmpty()) { 				//c'est automatiquement faux si le citoyen n'a jamais �t� mari�
		return false;
		}
	int i = listMariage.size()-1;				//si le conjoint du dernier mariage n'a pas de date de d�c�s
		if (listMariage.get(i).epoux2.deces.dateDeces == null) {
			return false;					//alors le citoyen n'est pas veuf
		}     	else {
    		return true;					//si il y a une date de d�c�s, alors la m�thode retourne vrai
    	}
}


public boolean estDivorce() {				//on v�rifie si une personne est divorc�e
	if (listMariage.isEmpty()) { 				//si sa liste de mariage est vide, il n'y a eu automatiquement aucun divorce
		return false;						//la m�thode retourne faux
		}
	int i = listMariage.size()-1;
	if (listMariage.get(i).divorce==null) {		//si l'emplacement est vide dans la liste des divorces � l'indice correspondant celui du dernier mariage dans la liste des marriages
		return false;						//alors aucun divorce n'est associ� au dernier mariage, retourne faux
	} else {return true;}					//sinon, retourne vrai
}



public boolean estEnfantDe(Personne x) {		//on v�rifie si l'identifiant de l'enfant est le m�me que ???
	if((numero == x.naissance.pere.numero)|| (numero == x.naissance.mere.numero) ) {
			return true;
	} 
	return false;
	
}

public int getIdentifiant() {				//r�cup�re l'identifiant national du citoyen
	return numero;
}

public void setIdentifiant(int id) {		//permet d'entrer l'identifiant national du citoyen
	numero=id;

}


public int calculAge(){				//on calcule la diff�rence entre la date du jour et la date de naissance du citoyen
	Date dateDuJour = new Date();
    
	//on r�cup�re les variables qui vont permettre de d�duire l'�ge r�el de la personne
	int annee = (dateDuJour.getYear()+1916) - (naissance.dateNaissance.getYear()+1916);
	int mois = (dateDuJour.getMonth()+1) - (naissance.dateNaissance.getMonth()+1);
    int jour = (dateDuJour.getDay()) - (naissance.dateNaissance.getDay());
    int heures = (dateDuJour.getHours()) - (naissance.dateNaissance.getHours());
    int min = (dateDuJour.getMinutes()) - (naissance.dateNaissance.getMinutes());
    
    //en fonction de la date de naissance, si elle a eu lieu avant le jour actuel dans l'annee, une simple soustraction ne suffit pas
    if (min<0) {
    	heures = heures - 1;
    	min = 60 + min;
    }
    if(heures<0) {
    	jour = jour-1;
    	heures = 24 + heures;
    }
    if(jour<0) {
    	if((mois==1)||(mois==3)||(mois==5)||(mois==7)||(mois==8)||(mois==10)||(mois==12)) {
    	 	jour = 31 + jour;
    	}else if((mois==4)||(mois==6)||(mois==9)||(mois==11)){
    		jour = 30 + jour;
    	}else {
    		jour = 28 + jour;
    	}
    mois = mois - 1;
    }
    if(mois<0) {
    	annee = annee - 1;
    	mois = 12 - mois;
    }
    if(annee<0) {				//si annee est <0, cela veut dire que l'ann�e de la date de naissance �tait sup�rieure
    							//� l'ann�e de la date actuelle, et c'est impossible
    	System.out.println("L'ann�e de naissance est mauvaise");
    }
    return annee;				//on retourne l'ann�e de l'�ge car seule cette valeur nous int�resse
	}
}
