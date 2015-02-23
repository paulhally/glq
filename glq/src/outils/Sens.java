package outils;

public enum Sens 
{
	MONTEE("^"), DESCENTE("v"), INDEFINI("-");
	
	private String symbole;
	
	private Sens(String symbole)
	{
		this.symbole = symbole;
	}
	
	@Override
	public String toString()
	{
		return this.symbole;				
	}
}
