public class Veterinarian{
	public static void main(String args[]){
		int op1, op2;
		Zoo.iniciador();
		do{
			op1 = CapturaEntrada.capturarEntero("1)Agregar animales\n2)Eliminar animales\n3)Mostrar animales\n4)Salir\n");
			
			switch(op1){
				case 1:
					do{
						op2 = CapturaEntrada.capturarEntero("\n\nAnimal a agregar:\n1)Tigre\n2)Tortuga\n3)Oveja\n4)Burro\n5)Oso polar\n6)Salir\n");
						Zoo.agregarAnimales(op2);
					}while(op2 != 6);
					break;
				case 2:
					do{
						op2 = CapturaEntrada.capturarEntero("\n\nEliminar por:\n1)Animal\n2)Nombre\n3)Edad\n4)Indice\n5)Salir\n");
						Zoo.eliminarAnimales(op2);
					}while(op2 != 5);
					break;
				case 3:
					Zoo.mostrarAnimales();
					break;
				case 4:
				break;	
			}
		}while(op1 != 4);
	}
}