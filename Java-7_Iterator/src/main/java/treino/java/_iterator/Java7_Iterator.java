/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package treino.java._iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author leomarotta
 */

public class Java7_Iterator {

    public static void main(String[] args) {
        Map m1 = new TreeMap();
        m1.put("key1", "teste4");
        m1.put("key4", "teste1");
        m1.put("key3", "teste2");
        m1.put("key1", "teste1");
        m1.put("key5", "teste3");
        Set s1 = m1.keySet();
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String resultado = (String) m1.get(key);
            System.out.println("Key= " + key + " Resultado: " + resultado);
        }
    }
}
