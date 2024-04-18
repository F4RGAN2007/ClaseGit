import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App4 extends JFrame{

    Container contenedormain;

    public App4(){
        contenedormain = getContentPane();
        BorderLayout layout2 = new BorderLayout();
        contenedormain.setLayout(layout2);

        JPanel panel1 = new JPanel();

        GridLayout layout1 = new GridLayout(1,3);
        panel1.setLayout(layout1);

        JButton boton1 = new JButton("1");
        panel1.add(boton1);

        JButton boton2 = new JButton("2");
        panel1.add(boton2);

        JPanel panel2 = new JPanel();
        GridLayout layout3 = new GridLayout(2,2);
        panel2.setLayout(layout3);

        JLabel etiqueta1 = new JLabel("1");
        panel2.add(etiqueta1);
        JLabel etiqueta2 = new JLabel("2");
        panel2.add(etiqueta2);
        JLabel etiqueta3 = new JLabel("3");
        panel2.add(etiqueta3);
        JLabel etiqueta4 = new JLabel("4");
        panel2.add(etiqueta4);

        panel1.add(panel2);

        contenedormain.add(panel1, BorderLayout.CENTER);



        




        JTextField campo1 = new JTextField();
        contenedormain.add(campo1,BorderLayout.SOUTH);



        setSize(500,300);
        setTitle("INTERFACES 2");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        App4 app = new App4();
    }
}