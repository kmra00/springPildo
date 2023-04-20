package cl.pildoras.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados{
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender bender y vender maássss";
	}
//	@Autowired
//	public void quemasdaelNombre(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
//		return "Informe generado por un comercial eXP";
		return nuevoInforme.getInformeFinanciero();
	}
	@Autowired
	@Qualifier("informeFinancieroTrim4")// beam id que debem utilizar
	private CreacionInformeFinanciero nuevoInforme;

}
