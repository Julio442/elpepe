package elpepe;

public abstract class quierodinero{
	
	private String Nombre;
	private char Relleno;
	
	public quierodinero() {}
	
	public quierodinero(String Nom, char Relleno) {
		Nombre=Nom;
		this.Relleno=Relleno;
	}
	
	public String ToString() {
		return Nombre+"\t"+Relleno;
	}
	
	public abstract int CalcularArea();
	public abstract int CalcularPerimetro();
	public abstract void Dibujar();
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public char getRelleno() {
		return Relleno;
	}

	public void setRelleno(char relleno) {
		Relleno = relleno;
	}
}
