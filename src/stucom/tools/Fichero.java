package stucom.tools;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Arnau on 05/10/16.
 */
public class Fichero {

    //Atributo para guardar el nombre del fichero
    private String nombre;

    public Fichero(String nombre) {
        this.nombre = nombre;
    }

    //Graba cualquier objeto JavaBean que le pasen
    public void grabar(Object o){
        try {
            //Instanciamos objeto para codificar en XML y escribirlo en el fichero
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
            //Escribimos el objeto en el fichero
            codificador.writeObject(o);
            //Cerramos el canal
            codificador.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error no se ha podido grabar: " + ex.getMessage());
        }
    }

    //Lee un objeto JavaBean de un fichero XML y lo devuleve
    // Devuelve NULL en caso de que el fichero no exista
    public Object leer(){
        try{
            XMLDecoder decodificador = new XMLDecoder(new FileInputStream(new File(nombre)));
            return decodificador.readObject();
        }catch (FileNotFoundException ex){
            System.out.println("No existe el fichero todavía " + ex.getMessage());
            return null;
        }
    }
}
