public class Animal{
	protected String nombre, especie, genero;
	protected int edad;
	
	public Animal(String nombre, int edad, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		especie = "";
	}
	
	public void comer(){
		System.out.println("Comiendo ...");
	}
	
	public void dormir(){
		System.out.println("Durmiendo ...");
	}
	
	public void hacerUnSonido(){
		System.out.println("...");
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEspecie(){
		return especie;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEspecie(String especie){
		this.especie = especie;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
}