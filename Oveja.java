public class Oveja extends Animal{
	
	public Oveja(String nombre, int edad, String genero){
		super(nombre, edad, genero);
		especie = "Oveja";
	}
	
	@Override
	public void comer(){
		System.out.println("Comiendo pasto ...");
	}
	
	@Override
	public void hacerUnSonido(){
		System.out.println("Baaah ...");
	}
}