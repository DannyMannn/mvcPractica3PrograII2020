public class Vuelo {
	private String aerolinea;
	private String destino;
	private int numAsiento;
	private int numVuelo;
	private EnumVuelo tipo;

	public Vuelo(String aerolinea,
			String destino,
			int numAsiento,
			int numVuelo,
			EnumVuelo tipo) {
		initMethod(aerolinea,destino,numAsiento,numVuelo,tipo);
	}
	public Vuelo(){};
	public void setAtributes(String aerolinea,String destino,int numAsiento,int numVuelo,EnumVuelo tipo){
		initMethod(aerolinea,destino,numAsiento,numVuelo,tipo);
	}

	private void initMethod(String aerolinea,String destino,int numAsiento,int numVuelo,EnumVuelo tipo){
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.numAsiento = numAsiento;
		this.numVuelo = numVuelo;
		this.tipo = tipo;
	}
	public String getAerolinea() {
		return this.aerolinea;
	}

	public String getDestino() {
		return this.destino;
	}

	public int getNumAsiento() {
		return this.numAsiento;
	}

	public int getNumVuelo() {
		return this.numVuelo;
	}

	public EnumVuelo getTipo() {
		return this.tipo;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public void setNumero(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public void setTipo(EnumVuelo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("Aerolinea: %s\nDestino: %s\nN. asiento: %d\nN. vuelo: %d\nT. vuelo: %s\n",
				this.aerolinea,
				this.destino,
				this.numAsiento,
				this.numVuelo,
				this.tipo);
	}
}



