

package outils;

/**
 * Classe représentant une demande d'un utlisateur sur l'ascenseur
 */
public class Demande 
{
	private int numEtage;
	private Sens sens;
	
	/**
	 * Constructeur initialisant l'ascenseur à l'étage 0 à l'arret
	 */
	public Demande()
	{
		this.numEtage = 0;
		this.sens = Sens.INDEFINI;
	}
	
	/**
	 * Constructeur initialisant l'ascenseur à un étage donné avec un sens prédéfini
	 * @param num
	 * @param sens
	 */
	public Demande(int num,Sens sens)
	{
		this.numEtage =num;
		this.sens = sens;
	}
	
	/**
	 * @return l'étage où l'ascenseur se trouve
	 */
	public int etage()
	{
		return this.numEtage;
	}
	
	/**
	 * @return le sens de l'ascenseur (montée, descente, indéfini)
	 */
	public Sens sens()
	{
		return this.sens;
	}
	
	/**
	 * Passe à l'ascenseur à l'étage suivant par rapport à son sens.
	 * Si l'ascenseur est arreté on lève une exception.
	 * @throws ExceptionCabineArretee
	 */
	public void passeEtageSuivant() throws ExceptionCabineArretee
	{
		if(this.sens.equals(Sens.MONTEE))
		{
			this.numEtage++;
		}
		else if(this.sens.equals(Sens.DESCENTE))
		{
			this.numEtage--;
		}
		else
		{
			throw new ExceptionCabineArretee("La cabine est arrêtée");
		}	
	}
	
	/**
	 * Teste la montée de l'ascenseur 
	 * @return true si l'ascenseur est en montée sinon false
	 */
	public boolean enMontee()
	{
		boolean monte = false;
		if(this.sens.equals(Sens.MONTEE))
		{
			return monte = true;
		}
		return monte;
	}
	
	/**
	 * Teste la descente de l'ascenseur
	 * @return true si l'ascenseur est en descente sinon false
	 */
	public boolean enDescente()
	{
		boolean descente = false;
		if(this.sens.equals(Sens.DESCENTE))
		{
			return descente = true;
		}	
		return descente;
	}
	
	/**
	 * Teste l'arret de l'ascenseur
	 * @return true si l'ascenseur est à l'arret, sinon false
	 */
	public boolean estIndefini()
	{
		boolean estIndefini = false;
		if(this.sens.equals(Sens.INDEFINI))
		{
			return estIndefini = true;
		}
		return estIndefini;
	}
	
	/**
	 * 
	 * Change le sens de l'ascenseur ou le met à l'arret.
	 * @param newSens
	 */
	public void changeSens(Sens newSens)
	{
		this.sens = newSens;
	}
	@Override
	/**
	 * Renvoie en chaine de caractère l'étage et le sens de l'ascenseur
	 * @return le sens et l'étage de l'ascenseur
	 */
	public String toString()
	{
		String chaine;	
		chaine = this.numEtage + this.sens.toString();
		return chaine;
	}
	@Override
	/**
	 * Teste l'équivalence de deux objets.
	 * @return true si les deux objets sont équivalents
	 */
	public boolean equals(Object obj) 
	{
		if (obj == null)
		{
			return false;
		}	
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		Demande other = (Demande) obj;
		if (numEtage != other.numEtage)
		{
			return false;
		}
		if (sens != other.sens)
		{
			return false;
		}		
		return true;
	}
}
