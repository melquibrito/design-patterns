package com.wolneyhqf.dp.strategy.comportamentos;

public class NaoDefende implements Defesa {

	@Override
	public void defender() {
		System.out.println("N�o consegue defender");
	}
	
}
