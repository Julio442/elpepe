package elpepe;

public class elden extends quierodinero{
	private int Base;
	private int Altura;
	
	public elden() {}
	
	public elden(String Nom, char Re, int base, int altura) {
		super(Nom, Re);
		Base=base;
		Altura=altura;
	}
	
	public String ToString() {
		return super.ToString()+"\t"+Base+"\t"+Altura;
	}
	
	public int CalcularArea() {
		return Base * Altura /2;
	}
	public int CalcularPerimetro() {
		return Base * 3;
	}
	public void Dibujar() {}
	

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	

}
