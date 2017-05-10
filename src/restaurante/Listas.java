/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.DefaultListModel;
import javax.swing.JList;
/**
 *
 * @author yuye0
 */
 class Nodo{
        int numero;
        Nodo link;
    }
public class Listas {
  public  JList lista1 = new JList();
   public JList lista2 = new JList();
    Nodo ptr1, ptr2;
    
    
    public Listas (){
        
        DefaultListModel model = new DefaultListModel();
       lista1.setModel(model);
        model = new DefaultListModel();
        lista2.setModel(model);
        ptr1 = new Nodo();
        ptr2 = null;
 
    }
    
    int buscar(Nodo ptr, int elem) {
        int pos = -1;
        Nodo p = ptr;
        while (p != null) {
            pos++;
            if(p.numero == elem) {
                return pos;
            }
            p = p.link;
        }
        return -1;
    }
    Nodo agregarCola(Nodo ptr, int num){
        Nodo p = new Nodo();
        p.numero = num;
        if(ptr == null){
            ptr = p;
        }else{
            Nodo q = ptr;
            while(q.link != null){
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }
    
    
    
    
    
}
