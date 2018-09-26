
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelCsvuno;
import views.ViewCsv;
public class ControllerCsvuno implements ActionListener{
    ModelCsvuno modelCsvuno;
    ViewCsv viewCsv;   
    private Object jTF_nombres;
    private Object jTF_email;
    
public ControllerCsvuno(ModelCsvuno modelCsvuno, ViewCsv viewCsv) {
        this.modelCsvuno = modelCsvuno;
        this.viewCsv = viewCsv;
        this.viewCsv.jTF_nombres.addActionListener(this);
        this.viewCsv.jTF_email.addActionListener(this);
        this.viewCsv.jB_guardar.addActionListener(this);
        this.viewCsv.jB_limpiar.addActionListener(this);
        initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == viewCsv.jB_guardar){
            jB_guardar_action_performed();
        }
         if(e.getSource() == viewCsv.jB_limpiar){
            jB_limpiar_action_performed();
        }
    }
    private void guardarRegistro() {
        try{
            String nombre=this.jTF_nombres.getText(); 
            String email=this.jTF_email.getText();
        }
        
            String nombre=jTF_nombres.getText(); 
            String email=jTF_email.getText(); 
         String datos=("Insert into datos (nombre, email)"+" values ('"+ jTF_nombres +"','"+jTF_email+"');"); 
         
       }
    
    public void jB_guardar_action_performed(){
       modelCsvuno.setNombre(String.valueOf(viewCsv.jTF_nombres.getText()));
       modelCsvuno.setEmail(String.valueOf(viewCsv.jTF_email.getText()));
        modelCsvuno.writeFile();
        JOptionPane.showMessageDialog(null, "Registro guardado");
    }
    public void jB_limpiar_action_performed(){
       viewCsv.jTF_nombres.setText(" " + modelCsvuno.getGuardar());
       viewCsv.jTF_email.setText(" " + modelCsvuno.getGuardar());
               
    }
    public void initComponets(){
        viewCsv.setVisible(true);
        viewCsv.jTF_nombres.setText(String.valueOf(modelCsvuno.getNombre()));
        viewCsv.jTF_email.setText(String.valueOf(modelCsvuno.getEmail()));
    }
}
