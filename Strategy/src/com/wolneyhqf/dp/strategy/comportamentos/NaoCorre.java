package com.wolneyhqf.dp.strategy.comportamentos;

public class NaoCorre implements Corrida {

	@Override
	public void correr() {
		System.out.println("N�o consegue correr.");
	}

}
