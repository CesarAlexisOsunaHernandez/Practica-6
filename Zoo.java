public class Zoo{
	private static Animal varios[] = new Animal[5];
	
	
	public static void agregarAnimales(int op){
		String nombre = "", genero = "";
		int edad = 0;
		if(op < 6){
			nombre = CapturaEntrada.capturarString("Nombre: ");
			edad = CapturaEntrada.capturarEntero("Edad: ");
			genero = CapturaEntrada.capturarString("Genero: ");
		}
		
		switch(op){
			case 1:
			varios[Zoo.buscarIndiceVacio()] = new Tigre(nombre, edad, genero);
			break;
			case 2:
			varios[Zoo.buscarIndiceVacio()] = new Tortuga(nombre, edad, genero);
			break;
			case 3:
			varios[Zoo.buscarIndiceVacio()] = new Oveja(nombre, edad, genero);
			break;
			case 4:
			varios[Zoo.buscarIndiceVacio()] = new Burro(nombre, edad, genero);
			break;
			case 5:
			varios[Zoo.buscarIndiceVacio()] = new Oso_polar(nombre, edad, genero);
			break;
		}
	}
	
	public static void eliminarAnimales(int op){
		int num, i = 0;
		String cad;
		switch(op){
			case 1:
				cad = CapturaEntrada.capturarString("Animal(es) a eliminar: ");
				while(i < 5){
					if(varios[i].getEspecie().equalsIgnoreCase(cad)){
						varios[i].setEspecie("");
					}
					
					i++;
				}
			break;
			case 2:
				cad = CapturaEntrada.capturarString("Nombre(s) a eliminar: ");
				while(i < 5){
					if(varios[i].getNombre().equalsIgnoreCase(cad)){
						varios[i].setEspecie("");
					}
					
					i++;
				}
			break;
			case 3:
				num = CapturaEntrada.capturarEntero("Edad a eliminar: ");
				while(i < 5){
					if(varios[i].getEdad() == num){
						varios[i].setEspecie("");
					}
					
					i++;
				}
			break;
			case 4:
				num = CapturaEntrada.capturarEntero("Indice a eliminar: ");
				varios[num].setEspecie("");
			break;
		}	
	} 
	
	public static void mostrarAnimales(){
		int i = 0, j = 0;
		System.out.println("");
		while(i < 5){
			if(!varios[i].getEspecie().equals("")){
				System.out.println("Indice: " + i);
				System.out.println("Nombre: " + varios[i].getNombre());
				System.out.println("Especie: " + varios[i].getEspecie());
				System.out.println("Genero: " + varios[i].getGenero());
				System.out.println("Edad: " + varios[i].getEdad() + "\n");
				j++;
			}
			
			i++;
		}
		
		if(j == 0){
			System.out.println("***Ningun animal registrado***\n");
		}
	}
	
	private static int buscarIndiceVacio(){
		int i = 0;
		while(i < 5){
			if(varios[i].getEspecie().equals("")){
				return i;
			}
			i++;
		}
		return i;
	}
	
	public static void iniciador(){
		for(int i = 0; i < 5; i++){
			 varios[i] = new Animal("", 0, "");
		}
	}
}