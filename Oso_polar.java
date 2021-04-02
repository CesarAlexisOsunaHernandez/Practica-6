public class Oso_polar extends Animal{
	
	public Oso_polar(String nombre, int edad, String genero){
		super(nombre, edad, genero);
		especie = "Oso polar";
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