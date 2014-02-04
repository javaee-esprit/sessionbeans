package edu.app.services;

import javax.ejb.Remote;

@Remote
public interface CalculatorServiceRemote {
	int sum(int x, int y);
}
