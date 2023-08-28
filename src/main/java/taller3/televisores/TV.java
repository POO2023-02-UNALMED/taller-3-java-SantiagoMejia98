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
		
		if(estado == true) {
			
			this.canal = canal;
		}
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
		
		if(estado == true) {
			this.volumen = volumen;
		}
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
		
		estado = true;
	}
	
	public void turnOff() {
		
		estado = false;
	}
	
	public boolean getEstado() {
		
		return estado;
	}
	
	public void canalUp() {
		
		if(canal < 120 && estado == true) {
			canal++;
		}
	}
	
	public void canalDown() {
		
		if(canal > 1 && estado == true) {
			canal--;
		}
	}
	
	public void volumenUp() {
		
		if(volumen < 7 && estado == true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		
		if(volumen > 0 && estado == true) {
			volumen--;
		}
	}
}
