package Services;

import java.util.HashMap;
import java.util.Scanner;

public class CiudadService {
	Scanner sc = new Scanner(System.in);

	HashMap<Integer, String> codigoCiudades = new HashMap<>();

	public void agregarCiudad() {
		System.out.println("Ingrese un codigo postal");
		int cp = sc.nextInt();
		if (!codigoCiudades.containsKey(cp)) {
			System.out.println("Ingrese la ciudad asosiada al codigo postal");
			String ciu = sc.next();

			codigoCiudades.put(cp, ciu);
			System.out.println("La ciudad fue agregada con exito");
		} else {
			System.out.println("El codigo postal ingresado ya esta asociado a una ciudad ingresada");
		}
	}

	// llaves[ "octavio", "viky"]
	// | |
	// valores["Es un capo", "genia" ]
	public void existeCiudad() {
		System.out.println("Ingrese un codigo postal");
		int cp = sc.nextInt();

		if (codigoCiudades.containsKey(cp)) {
			System.out.println("El codigo ingresado corresponde a una ciudad a�adida");
			System.out.println(codigoCiudades.get(cp));
		} else {
			System.out.println("El codigo ingresado no corresponde a una ciudad añadida");
		}
	}

	public void eliminarCiudad() {
		if (codigoCiudades.size() != 0) {
			System.out.println("Ingrese un codigo postal");
			int cp = sc.nextInt();
			if (codigoCiudades.containsKey(cp)) {
				codigoCiudades.remove(cp);
			} else {
				System.out.println("El codigo ingresado no corresponde a una ciudad añadida");
			}
		} else {
			System.out.println("No hay ciudades para eliminar");
		}
	}

	public HashMap<Integer, String> mostarCiudades() {
		return getCodigoCiudades();
	}

	private HashMap<Integer, String> getCodigoCiudades() {
		return codigoCiudades;
	}

	@Override
	public String toString() {
		return "CiudadService [codigoCiudades=" + codigoCiudades + "]";
	}

}
