package edu.app.services;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccumulatorService
 */
@Stateful
public class AccumulatorService implements AccumulatorServiceRemote {
	
	private int x = 0;

    /**
     * Default constructor. 
     */
    public AccumulatorService() {
        // TODO Auto-generated constructor stub
    }

	public int add(int dx) {
		x = x+dx;
		return x;
	}

}
