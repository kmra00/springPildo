package cl.pildoras.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer el xml de configuracion
				ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");	
				//pedir un bean al contenedor
				Empleados pepe2 = contexto.getBean("comercialExperimentado",Empleados.class);
				Empleados pepe3 = contexto.getBean("comercialExperimentado",Empleados.class);
				
				//validacion de memoria
				if(pepe2==pepe3) {System.out.println("apuntan al mismko lugar");
					System.out.println(pepe2+" \n"+pepe3);
				}else {
					System.out.println("no apuntan a la misma memoria");
					System.out.println(pepe2+"\n"+pepe3);
				}
				
				contexto.close();
	}

}
