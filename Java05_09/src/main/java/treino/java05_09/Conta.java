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

public class Conta {
    private int numConta;
    private double saldo;
    
    public Conta(int numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public double getConta(){
        return numConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setConta(int x){
        this.numConta = x;
    }
    
    public void setSaldo(double x){
        this.saldo = x;
    }
    
    public void deposito(double valorD){
        this.saldo = this.saldo + valorD;
        System.out.println("Depósito efetuado! Valor na conta:" + this.saldo);
    }
    
    public void saque(double valorS){
        this.saldo = this.saldo - valorS;
        System.out.println("Saque efetuado! Valor na conta: " + this.saldo);
    }
    
    public void atualiza(double taxa){
        this.saldo = this.saldo * taxa;
    }
    
    @Override
    public String toString(){
        return ("Conta Numero: " + this.numConta);
    }
    
    public boolean equals(Conta x){
        if(this.numConta == x.numConta){
            return true;
        }else{
            return false;
        }
    }
}
