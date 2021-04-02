public class Tortuga extends Animal{
	
	public Tortuga(String nombre, int edad, String genero){
		super(nombre, edad, genero);
		especie = "Tortuga";
	}
	
	@Override
	public void comer(){
		System.out.println("Comiendo alga ...");
	}
	
	@Override
	public void hacerUnSonido(){
		System.out.println("...");
	}
}