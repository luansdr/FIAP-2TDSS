package br.com.fiap.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, METHOD })
public @interface Coluna {

	String nome();
	int tamanho() default 0;
	boolean obrigatorio() default false;

}
