import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.Icon;



public class App extends JFrame implements ActionListener, ItemListener {

    Container contenedor;
    JTextField campo1;
    JButton boton1;
    JCheckBox check1,check2;
    JRadioButton radio1,radio2;
    ButtonGroup grupo1;
    JComboBox combo;
    String listaColores [] = {"rojo", "negro", "azul"};

    public App(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenedor = getContentPane();
        FlowLayout layout = new FlowLayout();
        contenedor.setLayout(layout);

        Font fuente = new Font("Arial", Font.BOLD, 50);


        JLabel etiqueta1 = new JLabel("Eventos");
        etiqueta1.setFont(fuente);
        contenedor.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Jueves 9 a 12");
        contenedor.add(etiqueta2);

        Icon icono = new ImageIcon("Topaz.jpg");
        JLabel etiqueta3 = new JLabel(icono);
        contenedor.add(etiqueta3);

        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        contenedor.add(campo1);

        boton1 = new JButton("Aceptar");
        boton1.addActionListener(this);
        contenedor.add(boton1);

        JPasswordField password = new JPasswordField(8);
        contenedor.add(password);

        
        combo = new JComboBox<String>(listaColores);
        contenedor.add(combo);


        
        

        setSize(500,300);
        setTitle("MEJOR VENTANA EMERGENTE DEL MUNDO");
        setVisible(true);
        
    }



    public static void main(String[] args) {
        App app = new App();

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String texto_campo1 = campo1.getText();
            JOptionPane.showMessageDialog(contenedor, "digiste: " + texto_campo1);
            campo1.setText("");
            if(check1.isSelected()){
                campo1.setText("HOLA MI NEGRO");
            }
            System.out.println(listaColores[combo.getSelectedIndex()]);
        }else if(e.getSource() == campo1){
            JOptionPane.showMessageDialog(contenedor, (campo1.getText()),"Nombre",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("TEXT");
    }
}
