package MisClases;

public class Coche {

		private String marca="", modelo="";
		private int anyo=0;
		
		public Coche(String marca, String modelo, int anyo)
		{
			this.marca = marca;
			this.modelo = modelo;
			this.anyo = anyo;
		}
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAnyo() {
			return anyo;
		}

		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}


}
