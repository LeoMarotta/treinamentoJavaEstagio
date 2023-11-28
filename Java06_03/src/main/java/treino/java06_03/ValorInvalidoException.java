// Linguagem: Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treino.java06_03;

/**
 *
 * @author leomarotta
 */
public class ValorInvalidoException extends Exception {

    public ValorInvalidoException() {
        super("Valor inválido");
    }

    public ValorInvalidoException(String message) {
        super(message);
    }

    public ValorInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}