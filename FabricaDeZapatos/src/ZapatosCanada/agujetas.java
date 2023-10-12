package ZapatosCanada;

public class agujetas {

	
	private String color;
	private String material;
	private int largo;
	
	public agujetas(String color, String material, int largo) {
		super();
		this.color = color;
		this.material = material;
		this.largo = largo;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "agujetas [color=" + color + ", material=" + material + ", largo=" + largo + "]";
	}

}