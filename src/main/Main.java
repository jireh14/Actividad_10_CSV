
package main;

import models.ModelCsvuno;
import views.ViewCsv;
import controllers.ControllerCsvuno;

public class Main {
    private static ViewCsv viewCsv;
    private static ModelCsvuno modelCsvuno;
    private static ControllerCsvuno controllerCsvuno;
    
    public static void main(String[] args) {
        ModelCsvuno modelCsvuno = new ModelCsvuno();
        ViewCsv  viewCsv= new ViewCsv();
        ControllerCsvuno controllerCsvuno = new ControllerCsvuno(modelCsvuno, viewCsv);
    }
    
}
