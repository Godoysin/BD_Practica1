package practica1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AppFutbol{
	
	static Scanner in = new Scanner (System.in);
	HashMap<Integer, Equipo> mEquipo; //el integer ser� el idequipo
	HashMap<Integer, Jugador> mJugadore; //Integer ser� idjugador
	HashMap<Integer, Arbitro> mArbitros; // ..igual
	HashMap<Integer, Estadio> mEstadios = new HashMap<Integer, Estadio>(); //..igual
	ArrayList<Partido> mpartidos;
	
	public AppFutbol(){//Aqu� se pueden cargar los datos o en un nuevo m�todo
		
	}
	public void AltaEquipo(){
		
	}
	public void BajaEquipo(){
		
	}
	public void AltaJugador(){ //Se da de alta en un equipo y si no est� en el sistema tambi�n
		
	}
	public void BajaJugador(){ // de un equipo, no del sistema
		
	}
	public void AltaArbitro(){
		
	}
	public void BajaArbitro(){
		
	}
	public void AltaEstadio(){ //del sistema
		
	}
	public void AltaPartido(){
		
	}
	public void BajaPartido(){
		
	}
	public void ListarEstadios(){
		
	}
	public void ListarEquipos(){
		
	}
	public void ListarArbitros(){
		
	}
	public void ContarPartidos(){
		
	}
	public void ListarPartidos(){ //devuelve info del partido dada una fecha
		
	}
	public void ListarPartidosEquipo(){//Devuelve la info del partido dado un equipo
		
	}
	public void ListarJugadores(){//dada una posici�n en el campo
		
	}
	public void listarJugadoresEquipo(){//dado un equipo
		
	}
	public void Salvar(){
		
	}
	public void CargarDatos(){
		
	}
	//+ void CalcularCampeonTemporada() **OPCIONAL**
	//+ void CalcularPosicionesEquipos(lequipos) **OPCIONAL**
	
	//M�todos
	public int EstadioId(){
		int id;
		try{
			System.out.println("Introduce la id del estadio:");
			id = in.nextInt();
		}
		catch(Exception e){
			System.out.println("Error");
			id = EstadioId();
		}
		return id;
	}
	public String EstadioDireccion(){
		String direccion;
		try{
			System.out.println("Introduce la direccion del estadio:");
			direccion = in.next();
		}
		catch(Exception e){
			System.out.println("Error");
			direccion = EstadioDireccion();
		}
		return direccion;
	}
	public String EstadioCiudad(){
		String ciudad;
		try{
			System.out.println("Introduce la ciudad del estadio:");
			ciudad = in.next();
		}
		catch(Exception e){
			System.out.println("Error");
			ciudad = EstadioCiudad();
		}
		return ciudad;
	}
	public int EstadioCapacidad(){
		int capacidad;
		try{
			System.out.println("Introduce la capacidad del estadio:");
			capacidad = in.nextInt();
		}
		catch(Exception e){
			System.out.println("Error");
			capacidad = EstadioCapacidad();
		}
		return capacidad;
	}
}