/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author yuye0
 */
public class NodoMesero {
    int Mesero;
    boolean Trabajando;
    NodoMesero link;
    NodoMesero AgregarNodo(NodoMesero ptr, int M, boolean T){
        NodoMesero m = new NodoMesero();
        m.Mesero = M;
        m.Trabajando = T;
        if (ptr == null) {
          ptr = m;  
        }else{
         NodoMesero q = ptr;
            while(q.link != null){
                q = q.link;
            }
            q = m;
        }
    
    return ptr;
    }
}
