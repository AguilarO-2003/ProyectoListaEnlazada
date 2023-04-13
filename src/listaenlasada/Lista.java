package listaenlasada;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Lista {

    protected nodo inicio, fin;
//hacemos el constructor

    public Lista() {
        inicio = null;
        fin = null;
    }
    //Método para saber 11 la lista está vacia

    public boolean estaVacia() {

        if (inicio == fin) {
            return true;
        } else {
            return false;
        }
    }

//metodo para agregar un nodo al inicio de 10 lista
    public void agregarAlInicio(String d) {
        //creat el nodo
        inicio = new nodo(d, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
// metodo para mostrar los datos

    public void mostrarLista() {
        nodo recorrer = inicio;

        while (recorrer != null) {
            JOptionPane.showMessageDialog(null, "[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }

    }
//metodo para buscar un elemento

    public boolean estaEnLaLista(String d) {
        nodo temporal = inicio;
        while (temporal == null && temporal.dato != d) {
            temporal = temporal.siguiente;

        }
        return temporal != null;
    }

    public String borraDelInicio() {
        String d = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;

        } else {
            inicio = inicio.siguiente;
        }
        return d;
        
    }
    public void guardarElemento()
    {
        try{
    FileWritter writter = new FileWritter("datos.txt");}
        writer.write("amongus");
        catch(IOException e){e.printStackTrace();}
    
    
    
    }
    
    
    
}//Fin de la clase
