package grafoSVG;

public class NodosUbicacion {
	private int x;
	private int y;
	private String nombre;
	
	public NodosUbicacion(String nombre, int x, int y) {
		this.nombre = nombre;
		this.x = x;
		this.y = y;
	}
	
	public NodosUbicacion() {
		x = 0;
		y = 0;
		nombre  = "";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
