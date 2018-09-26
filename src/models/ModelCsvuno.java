
package models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class ModelCsvuno {
     private String nombre = " ";
    private String email = " ";
    private String guardar = " ";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuardar() {
        return guardar;
    }

    public void setGuardar(String guardar) {
        this.guardar = guardar;
    }

public void readFile(){
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jfc);
        try{
            String row;
            String path = jfc.getSelectedFile().getAbsolutePath();
            try (FileReader file = new FileReader(path)){
                BufferedReader bufferedReader = new BufferedReader(file);
                while((row = bufferedReader.readLine()) !=null){
                    
                    System.out.println(row);
                }
                
                bufferedReader.close();    
            }   
            }
            catch(FileNotFoundException err){
                System.err.println("El archivo no ha sido encontrado:" + err.getMessage()); 
            }//catch
            catch(IOException err){
                System.err.println("Error de entrada y salida:" + err.getMessage());
            }
        }//readFile
            public void writeFile(){
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(jfc);
            
            try{
                String path = jfc.getSelectedFile().getAbsolutePath();
                
                File file = new File(path);
                FileWriter fileWriter = new FileWriter (file, true);
                
                
                try(PrintWriter printWriter = new PrintWriter (fileWriter))
                {
                    printWriter.println();
                    printWriter.close();
                }
                }//try
                catch(FileNotFoundException err){
                    System.err.println("El archivo no ha sido encontrado:" + err.getMessage());
                }
                catch(IOException err){
                    System.err.println("Error de Entrada y Salida: " + err.getMessage());
                
            }
    }
}


    



 