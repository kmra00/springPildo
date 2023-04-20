package cl.pildoras.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
	public static void main(String[] args) {
		
		//leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");	
		//pedir un bean al contenedor
		Empleados emp1 = contexto.getBean("comercialExperimentado",Empleados.class);
		//usar el beam
		System.out.println(emp1.getInforme());
		System.out.println(emp1.getTareas());
		//cerrar el contexto
		contexto.close();
	}
}
