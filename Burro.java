public class Burro extends Animal{
	
	public Burro(String nombre, int edad, String genero){
		super(nombre, edad, genero);
		especie = "Burro";
	}
	
	@Override
	public void comer(){
		System.out.println("Comiendo heno ...");
	}
	
	@Override
	public void hacerUnSonido(){
		System.out.println("...");
	}
}