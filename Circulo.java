
public class Circulo {
	double radio;
	Circulo(double radio)
	{
		this.radio = radio;
	}
	double getRadio()
	{
		return radio;
	}
	
	void setRadio(double radio)
	{
		this.radio = Math.PI;
	}

	double getPerimetro()
	{
		return 2*Math.PI*radio;
	}
	
	double getArea()
	{
		return Math.PI*Math.pow(radio,2);
	}
}
