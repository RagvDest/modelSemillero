package com.clearminds.rgv.dtos;

/**
 * @author RAGV
 *
 */
public class Estudiante {
	private String nombre;
	private String apellido;
	private int edad;
	private int id;

	public Estudiante() {
	}

	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Estudiante(String nombre, String apellido, int edad, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
