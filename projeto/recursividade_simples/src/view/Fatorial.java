package view;

import controller.FatorialController;

public class Fatorial{
	public static void main(String[] args){
		FatorialController obj = new FatorialController();

		System.out.println("Resultado: "+ obj.calcular(6));
	}
}