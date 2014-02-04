package edu.app.services;

import javax.ejb.Local;

@Local
public interface CalculatorServiceLocal {
	int sum(int x, int y);
}
