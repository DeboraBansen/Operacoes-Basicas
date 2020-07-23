package com.mod.dados;

public class CalculadoraInteiros implements IOperaçoesBasicas<Integer>{
	public Integer soma(Integer operador1,Integer operador2) {
		return operador1+operador2;
	}
	
	public Integer subtracao(Integer operador1,Integer operador2) {
		return operador1-operador2;
	}
}
