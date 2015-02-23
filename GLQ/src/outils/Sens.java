package outils;

/**
 * Sens est un type �num�r� 
 *
 * 
 * Il existe trois types d'�tat : 
 * Mont�e
 * Descente
 * Ind�fini
 * 
 *
 */

public enum Sens 
{
	/**
	 * 
	 * Enum�ration des �tats
	 * 
	 */
	MONTEE("^"), DESCENTE("v"), INDEFINI("-");
	
	/**
	 * Symbole du sens
	 */
	private String symbole;
	
	
	/**
	 * Constructeur Sens
	 * @param symbole
	 * 				Le symbole de l'�tat
	 */
	private Sens(String symbole)
	{
		this.symbole = symbole;
	}
	
	/**
	 * Retourne la chaine de charat�re correspondante au symbole
	 * @return symbole
	 */
	@Override
	public String toString()
	{
		return this.symbole;				
	}
}
