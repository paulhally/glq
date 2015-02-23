

package outils;

/**
 * Classe repr�sentant une demande d'un utlisateur sur l'ascenseur
 */
public class Demande 
{
	private int numEtage;
	private Sens sens;
	
	/**
	 * Constructeur initialisant l'ascenseur � l'�tage 0 � l'arret
	 */
	public Demande()
	{
		this.numEtage = 0;
		this.sens = Sens.INDEFINI;
	}
	
	/**
	 * Constructeur initialisant l'ascenseur � un �tage donn� avec un sens pr�d�fini
	 * @param num
	 * @param sens
	 */
	public Demande(int num,Sens sens)
	{
		this.numEtage =num;
		this.sens = sens;
	}
	
	/**
	 * @return l'�tage o� l'ascenseur se trouve
	 */
	public int etage()
	{
		return this.numEtage;
	}
	
	/**
	 * @return le sens de l'ascenseur (mont�e, descente, ind�fini)
	 */
	public Sens sens()
	{
		return this.sens;
	}
	
	/**
	 * Passe � l'ascenseur � l'�tage suivant par rapport � son sens.
	 * Si l'ascenseur est arret� on l�ve une exception.
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
			throw new ExceptionCabineArretee("La cabine est arr�t�e");
		}	
	}
	
	/**
	 * Teste la mont�e de l'ascenseur 
	 * @return true si l'ascenseur est en mont�e sinon false
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
	 * @return true si l'ascenseur est � l'arret, sinon false
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
	 * Change le sens de l'ascenseur ou le met � l'arret.
	 * @param newSens
	 */
	public void changeSens(Sens newSens)
	{
		this.sens = newSens;
	}
	@Override
	/**
	 * Renvoie en chaine de caract�re l'�tage et le sens de l'ascenseur
	 * @return le sens et l'�tage de l'ascenseur
	 */
	public String toString()
	{
		String chaine;	
		chaine = this.numEtage + this.sens.toString();
		return chaine;
	}
	@Override
	/**
	 * Teste l'�quivalence de deux objets.
	 * @return true si les deux objets sont �quivalents
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
