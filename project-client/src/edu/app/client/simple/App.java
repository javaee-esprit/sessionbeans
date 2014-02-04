package edu.app.client.simple;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.app.services.CalculatorServiceRemote;

public class App {
	
	public static void main(String[] args) throws NamingException {
		CalculatorServiceRemote remote = null;
		Context ctx = new InitialContext();
		remote = (CalculatorServiceRemote) ctx.lookup("ejb:/project-ejb/CalculatorService!edu.app.services.CalculatorServiceRemote");
		int z = remote.sum(10, 14);
		System.out.println(z);
	}

}
