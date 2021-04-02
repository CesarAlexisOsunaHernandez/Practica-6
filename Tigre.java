public class Tigre extends Animal{
	
	public Tigre(String nombre, int edad, String genero){
		super(nombre, edad, genero);
		especie = "Tigre";
	}
	
	@Override
	public void comer(){
		System.out.println("Comiendo filete ...");
	}
	
	@Override
	public void hacerUnSonido(){
		System.out.println("RAWR ...");
	}
}