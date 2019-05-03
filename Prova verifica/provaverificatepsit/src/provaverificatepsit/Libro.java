package provaverificatepsit;

public class Libro implements Cloneable{
	private String titolo;
	private String descrizione;
	private String codice;
	private String autore;
	
	public String getTitolo()
	{
		return this.titolo;
	}
	public String getDescrizione()
	{
		return this.descrizione;
	}
	public String getCodice()
	{
		return this.codice;
	}
	public String getAutore()
	{
		return this.autore;
	}
	public void setTitolo(String x)
	{
		this.titolo=x;
	}
	public void setDescrizione(String x)
	{
		this.descrizione=x;
	}
	public void setCodice(String x)
	{
		this.codice=x;
	}
	public void setAutore(String x)
	{
		this.autore=x;
	}
	
	public Libro()
	{
		this.titolo=null;
		this.descrizione=null;
		this.codice=null;
		this.autore=null;
	}
	
	public Libro(String t, String d, String code, String a)
	{
		this.titolo=t;
		this.descrizione=d;
		this.codice=code;
		this.autore=a;
	}
	
	public Libro clone()
	{
		Libro l = new Libro(this.titolo,this.descrizione,this.codice,this.autore);
		return l;
	}
	
	public String toString() {
		return "Titolo: " + this.titolo + ". Descrizione: " + this.descrizione + ". Codice: " + this.codice + ". Autore: " + this.autore + ". ";
	}
}
