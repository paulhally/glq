package outils;

/**
 * Classe permettant de lever une exception quand l'ascenseur est � l'arret
 *
 */
public class ExceptionCabineArretee extends Exception
{
	
	private static final long serialVersionUID = -6113222087863337510L;
	
	/**
	 * Affiche le message li� � l'exception.
	 * @param message
	 */
	public ExceptionCabineArretee(String message)
	{
		System.out.println(message);
	}
}
