package com.clearminds.rgv.dtos;

/**
 * @author RAGV
 *
 */
public class Estudiante {
	private String nombre;
	private String apellido;
	private int id;

	public Estudiante() {
	}

	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Estudiante(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
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
