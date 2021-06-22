package grafoSVG;

public class AristasUbicacion {
	private int posicionOrigenX;
	private int posicionOrigenY;
	private int posicionDestinoX;
	private int posicionDetinoY;
	
	
	public AristasUbicacion(int posicionOrigenX, int posicionOrigenY, int posicionDestinoX, int posicionDestinoY) {
		this.posicionOrigenX = posicionOrigenX;
		this.posicionOrigenY = posicionOrigenY;
		this.posicionDestinoX = posicionDestinoX;
		this.posicionDetinoY = posicionDestinoY;
	}
	
	public AristasUbicacion() {
		this.posicionOrigenX = 0;
		this.posicionOrigenY = 0;
		this.posicionDestinoX = 0;
		this.posicionDetinoY = 0;
	}

	public int getPosicionOrigenX() {
		return posicionOrigenX;
	}

	public void setPosicionOrigenX(int posicionOrigenX) {
		this.posicionOrigenX = posicionOrigenX;
	}

	public int getPosicionOrigenY() {
		return posicionOrigenY;
	}

	public void setPosicionOrigenY(int posicionOrigenY) {
		this.posicionOrigenY = posicionOrigenY;
	}

	public int getPosicionDestinoX() {
		return posicionDestinoX;
	}

	public void setPosicionDestinoX(int posicionDestinoX) {
		this.posicionDestinoX = posicionDestinoX;
	}

	public int getPosicionDetinoY() {
		return posicionDetinoY;
	}

	public void setPosicionDetinoY(int posicionDetinoY) {
		this.posicionDetinoY = posicionDetinoY;
	}
	
}
