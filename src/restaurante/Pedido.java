package restaurante;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pedido {
    public static void main(String[] args) {
        
       
    }
    void regitrarArchivo(String plato, String bebida, String postre, String precioPto, String precioBebi, String precioPos) throws IOException {

        File pedido;
        pedido = new File("pedido.txt");
        FileWriter escritor;
        PrintWriter linea;
        String pto, bebi, pos, prespto, presbebi, prespos;
        if (!pedido.exists()) {
            pedido.createNewFile();
            pto = plato;
            bebi = bebida;
            pos = postre;
            prespto = precioPto;
            presbebi = precioBebi;
            prespos = precioPos;
            escritor = new FileWriter(pedido, true);
            linea = new PrintWriter(escritor);
            linea.println(pto + "," + prespto);
            linea.println(bebi + "," + presbebi);
            linea.println(pos + "," + prespos);
            linea.close();
            escritor.close();
            try {
                pedido.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            pto = plato;
            bebi = bebida;
            pos = postre;
            prespto = precioPto;
            presbebi = precioBebi;
            prespos = precioPos;
            escritor = new FileWriter(pedido, true);
            linea = new PrintWriter(escritor);
            linea.println(pto + "," + prespto);
            linea.println(bebi + "," + presbebi);
            linea.println(pos + "," + prespos);
            linea.close();
            escritor.close();
            try {
                pedido.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}


