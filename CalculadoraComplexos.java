package com.mod.dados;

public class CalculadoraComplexos implements IOperaçoesBasicas<Complexo>{
	
	public Complexo soma(Complexo operador1,Complexo operador2) {
		return new Complexo(operador1.getReal()+operador2.getReal(),operador1.getImaginaria()+operador2.getImaginaria());
	}
	
	public Complexo subtracao(Complexo operador1, Complexo operador2) {
		return new Complexo(operador1.getReal()-operador2.getReal(),operador1.getImaginaria()-operador2.getImaginaria());
	}
}
