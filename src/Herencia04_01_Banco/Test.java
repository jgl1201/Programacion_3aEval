package Herencia04_01_Banco;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta(1250.87f, 0.01f);
		CuentaAhorros c2 = new CuentaAhorros(5400f, 0.10f, false);
		CuentaCorriente c3 = new CuentaCorriente(400f, 0.15f, 12f);
		
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(c1);
		cuentas.add(c2);
		cuentas.add(c3);
		
		for (Cuenta c : cuentas) System.out.println(c.toString());
		
	}

}
