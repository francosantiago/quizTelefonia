package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbNumero;
    private JLabel lbMinutos;
    private JLabel lbCosto;
    private JLabel lbOperador;
    private JTextField tfNumero;
    private JTextField tfMinutos;
    private JTextField tfCosto;
    private JTextField tfOperador;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/telefono.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,15,150,170);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNumero = new JLabel("# telefónico = ");
        lbNumero.setBounds(190,10,80,20);
        add(lbNumero);
        
        lbMinutos = new JLabel("Minutos deseados =");
        lbMinutos.setBounds(190,40,120,20);
        add(lbMinutos);
        
        lbCosto = new JLabel("Costo por minuto =");
        lbCosto.setBounds(190,70,120,20);
        add(lbCosto);
        
        lbOperador = new JLabel("Operador =");
        lbOperador.setBounds(190,100,100,20);
        add(lbOperador);
        
        //Creación y adición de campos de texto
        tfNumero = new JTextField("");
        tfNumero.setBounds(270, 10, 100, 20);
        add(tfNumero);
        
        tfMinutos = new JTextField("");
        tfMinutos.setBounds(305, 40, 60, 20);
        add(tfMinutos);
        
        tfCosto = new JTextField("");
        tfCosto.setBounds(305, 70, 60, 20);
        add(tfCosto);

        tfOperador = new JTextField("");
        tfOperador.setBounds(260, 100, 100, 20);
        add(tfOperador);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Entrada de Datos");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNumero()
    {
        return tfNumero.getText();
    }
    
    public String getMinutos()
    {
        return tfMinutos.getText();
    }
    
    public String getCosto()
    {
        return tfCosto.getText();
    }

    public String getOperador()
    {
        return tfOperador.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNumero.setText("");
        tfMinutos.setText("");
        tfCosto.setText("");       
        tfOperador.setText("");
    }
}