public class Boleto {
	private Pasajero pasajero;
	private Vuelo vuelo;
	
	public Boleto(Pasajero pasajero, Vuelo vuelo) {
		this.pasajero = pasajero;
		this.vuelo = vuelo;
	}
	
	public Pasajero getPasajero() {
		return this.pasajero;
	}
	
	public Vuelo getVuelo() {
		return this.vuelo;
	}
	
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	@Override
	public String toString() {
		String linea = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
		String encabezado = "\t\t\t\t\t\t\t\t\tBoleto\n";
		return String.format(linea + encabezado + linea + this.vuelo + this.pasajero);
	}
}
