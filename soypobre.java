package elpepe;

public class soypobre extends quierodinero{
	
	private int Lado;
	
	public soypobre() {}
	
	public soypobre(String Nom, char Re, int Lado) {
		super(Nom, Re);
		this.Lado=Lado;
	}
	public String ToString() {
		return super.ToString()+"\t"+Lado;
	}
	
	public int CalcularArea() {
		return Lado * Lado;
	}
	public int CalcularPerimetro() {
		return Lado * 4;
	}
	public void Dibujar() {
		char Re=super.getRelleno();
		for (int R=1;R<=Lado;R++) {
		for(int C=1;C<=Lado;C++) {
			System.out.print(Re+"");
		}
		System.out.println();
		}
	}	

	public int getLado() {
		return Lado;
	}

	public void setLado(int lado) {
		Lado = lado;
	}
	

}
