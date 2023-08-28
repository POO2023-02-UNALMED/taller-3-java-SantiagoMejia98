package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		
		this.marca = marca;
	}
	
	public Marca getMarca() {
		
		return marca;
	}

	public void setCanal(int canal) {
		
		this.canal = canal;
	}
	
	public int getCanal() {
		
		return canal;
	}

	public void setPrecio(int precio) {
		
		this.precio = precio;
	}
	
	public int getPrecio() {
		
		return precio;
	}

	public void setVolumen(int volumen) {
		
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		
		return volumen;
	}

	public void setControl(Control control) {
		
		this.control = control;
	}
	
	public Control getControl() {
		
		return control;
	}

	public static void setNumTV(int num) {
		
		numTV = num;
	}
	
	public static int getNumTV() {
		
		return numTV;
	}
	
	public void turnOn() {
		
		this.estado = true;
	}
	
	public void turnOff() {
		
		this.estado = false;
	}
	
	public boolean getEstado() {
		
		return estado;
	}
	
	public void canalUp() {
		
		if(this.canal < 120 && this.estado == true) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		
		if(this.canal > 1 && this.estado == true) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		
		if(this.volumen < 7 && this.estado == true) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		
		if(this.volumen > 0 && this.estado == true) {
			this.volumen--;
		}
	}
}
