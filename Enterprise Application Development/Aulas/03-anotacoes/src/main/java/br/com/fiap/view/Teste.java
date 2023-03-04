package br.com.fiap.view;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.model.Pessoa;

public class Teste {

	public static void main(String[] args) {

		Pessoa people = new Pessoa();

		String nome = people.getClass().getName();

		System.out.println("\n\n**Pegar todos os metodos**\n");

		// Pegar todos os metodos

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

<<<<<<< HEAD:Enterprise Application Development/Aulas/03-anotacoes/src/main/java/br/com/fiap/view/Teste.java
		
=======
>>>>>>> d21fe155bdfbf3437adcfc3f30700e0b7f785399:Enterprise Application Development/07-02-revisao/03-anotacoes/src/main/java/br/com/fiap/view/Teste.java
		Field[] declaredFields2 = people.getClass().getDeclaredFields();
		for (Field field : declaredFields2) {
			System.out.println("Atributo: " + field.getName() + " -> tipo: " + field.getType());
			
			// Recuperar a anotação @Coluna
			
			Coluna annotation = field.getAnnotation(Coluna.class);
			
			System.out.println(
					annotation.nome() + " |  " +  annotation.obrigatorio() + " | " + annotation.tamanho());
			
			
		}

	}

}
