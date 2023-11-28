// Linguagem: Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.java05_09;
/**
 *
 * @author leomarotta
 */

public class ContaEspecial extends Conta{
    private int numConta;
    private double saldo;
    
    public ContaEspecial(int numConta, double saldo){
        super(numConta, saldo);
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    @Override
    public void atualiza(double taxa){
        this.saldo = this.saldo * (taxa*2);
    }
    
    public void saque(double valorS){
        this.saldo = this.saldo - (valorS+0.10);
        System.out.println("Saque efetuado! Valor na conta: " + this.saldo);
    }
}