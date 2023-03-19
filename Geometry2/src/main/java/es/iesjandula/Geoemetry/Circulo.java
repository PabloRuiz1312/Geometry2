package es.iesjandula.Geoemetry;

public class Circulo implements IPolygon{
	private double radio;
	private final double PI = Math.PI;
	
	public Circulo (double radio)
	{
		this.radio = radio;
	}

	public int getNumberOfSides() {
		
		return 0;
	}

	public double calculateArea() {
		
		return PI*Math.pow(radio, 2);
	}

	public double calculatePerimetrer() {
	
		return 2*PI*radio;
	}
	
	
}
