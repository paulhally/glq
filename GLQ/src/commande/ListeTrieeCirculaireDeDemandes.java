package commande;
import java.util.ArrayList;

import outils.Demande;
import outils.Sens;

public class ListeTrieeCirculaireDeDemandes implements IListeTrieeCirculaire
{
	private ArrayList<Demande> listeDemandes;
	 
	public ListeTrieeCirculaireDeDemandes(int taille)
	{
		this.listeDemandes = new ArrayList<>(taille);
		
	}
	@Override
	public int taille() 
	{
		return this.listeDemandes.size(); 
	}

	@Override
	public boolean estVide() 
	{
		if(this.listeDemandes.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	@Override
	public void vider() 
	{
		this.listeDemandes.clear();
	}

	@Override
	public boolean contient(Object e)
	{
		if(this.listeDemandes.contains((Demande)e))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	@Override
	public void inserer(Object e) 
	{
		Demande suivant = (Demande) this.suivantDe(e);
		int index = this.listeDemandes.indexOf(suivant);
		this.listeDemandes.add(index, (Demande) e);
	}

	@Override
	public void supprimer(Object e) 
	{
		this.listeDemandes.remove((Demande)e);
	}

	@Override
	public Object suivantDe(Object courant) 
	{
		Demande obj = (Demande)courant;
		Object suivant = null;
		for(int i=0;i<= this.listeDemandes.size();i++)
		{
			if(obj.sens().equals(Sens.MONTEE) && this.listeDemandes.get(i).sens().equals(Sens.MONTEE))
			{
				if(obj.etage() > this.listeDemandes.get(i).etage())
				{
					suivant = this.listeDemandes.get(i);
				}
			}
			else if(obj.enMontee() && this.listeDemandes.get(i).enDescente())
			{
				suivant = this.listeDemandes.get(i);
			}
			else if(obj.enDescente() && this.listeDemandes.get(i).enDescente())
			{
				if(obj.etage() > this.listeDemandes.get(i).etage())
				{
					suivant = this.listeDemandes.get(i);
				}
			}
		}
		return suivant;
	}
	@Override
	public String toString()
	{
		String chaine="[";
		for(int i = 0; i <= this.listeDemandes.size(); i++)
		{
			chaine+= this.listeDemandes.get(i).toString();
			if(i != this.listeDemandes.size())
			{
				chaine+=",";
			}
		}
		chaine += "]";
		return chaine;
	}
}
