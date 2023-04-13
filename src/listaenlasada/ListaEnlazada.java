package listaenlasada;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ListaEnlazada {

    public static void main(String[] args) {
        Lista enlista = new Lista();
        int opcion = 0;
        String elem;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "***Lista de tareas***\n"+
                        "1)Agregar tarea \n"
                        + "2)Mostrar las tareas ingresadas \n"
                        + "3)Buscar tareas ingresadas \n"
                        + "4)Eliminar ulitma tarea digitada \n"
                        + "5)Salir del programa"));
                switch (opcion) {
                    case 1:
                        try {
                        elem = JOptionPane.showInputDialog(null, "Ingrese la tarea ");
                        enlista.agregarAlInicio(elem);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                    }
                    break;
                    case 2:
                        enlista.mostrarLista();
                        break;
                    case 3:
                        elem = JOptionPane.showInputDialog(null, "Ingrese la tarea a buscar ", JOptionPane.INFORMATION_MESSAGE);
                        if (enlista.estaEnLaLista(elem) == true) {
                            JOptionPane.showMessageDialog(null, "El elemento " + elem + " Si esta", "Nodo encontrado", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + elem + " No esta", "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        elem = enlista.borraDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento " + elem, "Eliminado nodo del inicio", 2);
                    case 5:
                        JOptionPane.showMessageDialog(null, "Finalizando el programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "error " + e.getMessage());
            }
        } while (opcion != 5);
    }
    try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by Bro)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}//Fin de la clase
