package ejecutable;

import modelo.PlanTelefonia;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miPlanTelefonia = null;
        Controlador miControlador = new Controlador(miVentana, miPlanTelefonia);
    }    
}
