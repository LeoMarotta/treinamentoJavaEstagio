/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java07_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author leomarotta
 */
public class Java07_Collections {

    public static void main(String[] args) {
        
        List l1 = new ArrayList();
        
        l1.add("teste4");
        l1.add("teste1");
        l1.add("teste2");
        l1.add("teste5");
        l1.add("teste1");
        l1.add("teste1");
        
        Iterator it=l1.iterator();
        
        while (it.hasNext()){
            String resultado=(String)it.next();
            System.out.println("Resultado: " + resultado);
        }
        
        System.out.println(" --- ");
  
        Collections.sort(l1);
        it=l1.iterator();
        
        while (it.hasNext()){
            String resultado=(String)it.next();
            System.out.println("Resultado: " + resultado);
        }
        
    }   
}
