package br.com.fiap.view;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.model.Pessoa;

public class Teste {

	public static void main(String[] args) {

		Pessoa people = new Pessoa("Luan", 27, 1.79f);

		String nome = people.getClass().getName();


		
		System.out.println("\n\n**Pegar todos os metodos**\n");
		
		//Pegar todos os metodos
		
		Method[] metodos = people.getClass().getDeclaredMethods();

		for (Method method : metodos) {
			System.out.println(method.getName());
		}

		
		System.out.println("\n\n**Recuperar os atributos da classes**\n");
		
		// Recuperar os atributos da classes

		Field[] declaredFields = people.getClass().getDeclaredFields();

		for (Field field : declaredFields) {
			field.setAccessible(true);
			System.out.println("Atributo: " + field.getName());

		}

		
		System.out.println("\n\n**Exibir o nome e o tipo dos atributos** \n");
		
		// Eibir o nome e o tipo dos atributos
		
		Field[] declaredFields2 = people.getClass().getDeclaredFields();
		for (Field field : declaredFields2) {
			field.setAccessible(true);
			System.out.println("Atributo: " + field.getName() + " -> tipo: " + field.getType());

		}
	}

}
