
public class Circulo {
	double radio;
	Circulo(double radio)
	// Declaramos el radio que nos pide
	{
		this.radio = radio;
	}
	double getRadio()
	// Devolvemos el radio con return 
	{
		return radio;
	}
	
	void setRadio(double radio)
	// utilizamos el radio via la oparacion matematica de PI
	{
		this.radio = Math.PI;
	}

	double getPerimetro()
	// Utilizaremos Return
	// Multiplicamos Pi*radio
	{
		return 2*Math.PI*radio;
	}
	
	double getArea()
	// Volvemos a utilizar return
	// HAcemos la multiplicacion
	{
		return Math.PI*Math.pow(radio,2);
	}
}
