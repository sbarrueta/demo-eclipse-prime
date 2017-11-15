package com.tresct.controler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class MBean {
	
	private String saludo;
	

	private List<Persona> lista;
	
	@PostConstruct
	public void inicializa() {
		saludo = "Hola";
		lista = new ArrayList<>();
		
		lista.add(new Persona("Lunes"));
		lista.add(new Persona("Martes"));
		lista.add(new Persona("Miercoles"));
		lista.add(new Persona("Jueves"));
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	

}
