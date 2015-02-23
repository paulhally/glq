package outils;

/**
 * Sens est un type énuméré 
 *
 * 
 * Il existe trois types d'état : 
 * Montée
 * Descente
 * Indéfini
 * 
 *
 */

public enum Sens 
{
	/**
	 * 
	 * Enumération des états
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
	 * 				Le symbole de l'état
	 */
	private Sens(String symbole)
	{
		this.symbole = symbole;
	}
	
	/**
	 * Retourne la chaine de charatère correspondante au symbole
	 * @return symbole
	 */
	@Override
	public String toString()
	{
		return this.symbole;				
	}
}
