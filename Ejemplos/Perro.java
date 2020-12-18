package Ejemplos;

import java.util.Random;

public class Perro {
	
	private String nombre;
	private int chip;
	private int edad;
	
	public Perro() {
		nombre="";
		edad=0;
		chip=0;
	}

	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		chip=0;
	}

	public Perro(String nombre, int chip, int edad) {
		this.nombre = nombre;
		this.chip = chip;
		this.edad = edad;
	}
	
	
	
	public boolean comprobarChip() {
		if (chip%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void ponerChip() {
		if (chip !=0) {
			System.out.println("Este perro ya tiene chip");
		}else {
			Random r = new Random();
			this.chip = r.nextInt(100)+1;
		}
	}
	
	
	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public String toString() {
		return "Perro de nombre " + nombre + ", chip " + chip + " y edad " + edad;
	}
	
	
	
	
	
}
