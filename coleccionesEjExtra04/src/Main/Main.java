package Main;

import java.util.Scanner;

import Services.CiudadService;

//Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//número.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//• Muestra por pantalla los datos
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CiudadService cs = new CiudadService();
		
		do {
			System.out.println(
					"Ingrese opcion de menu:\n1: Agregar ciudad\n2. Mostrar ciudades\n3. Eliminar ciudad\n4. Buscar Ciudad\n5. Salir");
			switch (sc.nextInt()) {
			case 1:
				cs.agregarCiudad();
				break;
			case 2:
				System.out.println(cs.mostarCiudades());
				break;
			case 3:
				cs.eliminarCiudad();
				break;
			case 4:
				cs.existeCiudad();
				break;
			default:
				System.out.println("Fin");
			}
			System.out.println("Desea continuar?\n1.Seguir\n Otro Salir");
		} while (sc.nextInt() == 1);
	}
}
