public class main{
	public static void main(String args[]){
		int op;
		Zoo.iniciador();
		do{
			op = CapturaEntrada.capturarEntero("Animal a agregar:\n1)Tigre\n2)Tortuga\n3)Oveja\n4)Burro\n5)Oso polar\n6)Salir\n");
			Zoo.agregarAnimales(op);
		}while(op != 6);
		
		Zoo.mostrarAnimales();
		Zoo.eliminarAnimales();
		Zoo.mostrarAnimales();
	}
}