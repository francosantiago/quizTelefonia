package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("añadir"))
        {   
            try
            {
                String Operador = venPrin.miPanelEntradaDatos.getOperador();
                int Numero1 = Integer.parseInt(venPrin.miPanelEntradaDatos.getNumero());
                int Minutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos());
                int Costo = Integer.parseInt(venPrin.miPanelEntradaDatos.getCosto());
                double Numero = Numero1;

                model = new PlanTelefonia(Operador, Numero, Minutos, Costo);
                
                venPrin.miPanelResultado.mostrarResultado("Se ha creado un plan Telefonico");
                venPrin.miPanelResultado.mostrarResultado("Su número es " + model.getNumero());
                venPrin.miPanelResultado.mostrarResultado("los minutos deseados son: " + model.getMinutos());
                venPrin.miPanelResultado.mostrarResultado("El costo por minuto seleccionado es:" + model.getCostoMinuto());
                venPrin.miPanelResultado.mostrarResultado("Su Operador es " + model.getOperador());
                
                //Desactivar boton crear
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();  
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        
        else if(comando.equals("Saldo"))
        {
            int Minutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos());
            int Costo = Integer.parseInt(venPrin.miPanelEntradaDatos.getCosto());
            model.CalcularSaldo(Minutos, Costo);

            String Operador = venPrin.miPanelEntradaDatos.getOperador();
            model.Descuento(Operador);

            venPrin.miPanelResultado.mostrarResultado("\nEl saldo a pagar por este plan es de: " + model.getSaldo());
        }

        else if(comando.equals("Salir"))
        {
            System.exit(0);
        }
    }    
}