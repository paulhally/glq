package outils;

public class Demande 
{
	private int numEtage;
	private Sens sens;
	
	public Demande()
	{
		this.numEtage = 0;
		this.sens = Sens.INDEFINI;
	}
	public Demande(int num,Sens sens)
	{
		this.numEtage =num;
		this.sens = sens;
	}
	
	public int etage()
	{
		return this.numEtage;
	}
	public Sens sens()
	{
		return this.sens;
	}
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
	public boolean enMontee()
	{
		boolean monte = false;
		if(this.sens.equals(Sens.MONTEE))
		{
			return monte = true;
		}
		return monte;
	}
	public boolean enDescente()
	{
		boolean descente = false;
		if(this.sens.equals(Sens.DESCENTE))
		{
			return descente = true;
		}	
		return descente;
	}
	public boolean estIndefini()
	{
		boolean estIndefini = false;
		if(this.sens.equals(Sens.INDEFINI))
		{
			return estIndefini = true;
		}
		return estIndefini;
	}
	public void changeSens(Sens newSens)
	{
		this.sens = newSens;
	}
	@Override
	public String toString()
	{
		String chaine;	
		chaine = this.numEtage + this.sens.toString();
		return chaine;
	}
	@Override
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
