import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Container;

public class App extends JFrame{
    
    Container contenedor;
    JButton boton1;
    JComboBox combo1;
    JTextField text1;
    public App(){
        setSize(500,300);
        setTitle("INTERFACES 2");
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenedor = getContentPane();
        BorderLayout layout = new BorderLayout(20,20);
        contenedor.setLayout(layout);

        boton1 = new JButton("ENTER");
        contenedor.add(boton1,BorderLayout.SOUTH);

        String [] equipos = {"Real", "Bayer", "Borrusia"};
        combo1 = new JComboBox<String>(equipos);
        contenedor.add(combo1,BorderLayout.CENTER);

        text1 = new JTextField();
        contenedor.add(text1, BorderLayout.NORTH);

    }
    
    
    
    public static void main(String[] args) throws Exception {
        App App = new App();
    }
}
