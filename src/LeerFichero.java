import java.io.File;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\usuario\\Desktop\\Acceso a datos\\Ejercicio1_T2\\VerInf.java");
        System.out.println("Nombre del fichero: "+file.getName());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Ruta absoluta: " +file.getAbsolutePath());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede leer: "+file.canRead());
        System.out.println("Tamaño: "+file.length());
        System.out.println("Es un directorio: "+file.isDirectory());
        System.out.println("Es un fichero: "+file.isFile());

    }
}