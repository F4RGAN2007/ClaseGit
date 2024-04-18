import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;

public class App2 extends JFrame{
    
    Container contenedor;
    JButton boton1;
    JComboBox combo1;
    JTextField text1;
    JLabel label;
    public App2(){
        setSize(500,300);
        setTitle("INTERFACES 2");
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        contenedor = getContentPane();
        GridLayout layout = new GridLayout(2,3,30,30);
        contenedor.setLayout(layout);

        //1 fila 1 coumna
        Icon icon = new ImageIcon("Topaz_image1.jpg");
        JLabel imagen1 = new JLabel(icon);
        contenedor.add(imagen1);

        //1 fila 2 columna
        boton1 = new JButton("ENTER");
        contenedor.add(boton1);

        //1 fila 3 columna
        String [] equipos = {"Real", "Bayer", "Borrusia"};
        combo1 = new JComboBox<String>(equipos);
        contenedor.add(combo1);

        //2 fila 1 columna
        text1 = new JTextField("INSERTE TEXTO");
        contenedor.add(text1);

        //2 fila 2 columna
        label =  new JLabel("COMO TA MUCHACHOS");
        contenedor.add(label);

        //2 fila 3 coumna
        Icon icon2 = new ImageIcon("Topaz_image2.jpg");
        JLabel imagen2 = new JLabel(icon2);
        contenedor.add(imagen2);
    }
    
    
    
    public static void main(String[] args) throws Exception {
        App2 App = new App2();
    }
}
