package Productos_concretos;

import Fabricas_abstractas.Paladin;
import cliente.GUI;

public class Orco_paladin implements Paladin{

	@Override
	public void saludar(GUI a) {
		a.getRespuesta3().setText("� Has creado un Orco paladin");
		
	}

	@Override
	public void pintarP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equipar() {
		// TODO Auto-generated method stub
		
	}


}
