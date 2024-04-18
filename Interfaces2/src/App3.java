import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App3 extends JFrame implements MouseListener, KeyListener{

    Container contenedor;
    int a, b = -1;
    int contador = 1;

    

    public App3(){
        contenedor = getContentPane();

        addMouseListener(this);
        addKeyListener(this);

        setSize(500,300);
        setTitle("INTERFACES 2");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){
        /*g.setColor(new Color(255,0,0));
        g.drawLine(50,70,100,120);
        g.setColor(new Color(0,255,0));
        g.drawRect(150,200,50,30);
        g.setColor(new Color(0,0,255));
    g.drawOval(300,100,30,60);*/
    g.drawLine(167,0,167,300);
    g.drawLine(334,0,334,300);
    g.drawLine(0,100,500,100);
    g.drawLine(0,200,500,200);

    
    if (a != -1 && b != -1){
        if (contador % 2 == 0){
            g.setColor(Color.RED);
            g.drawLine(167*a,100*b,167*(a+1),100*(b+1));
            g.drawLine(167*a,100*(b+1),167*(a+1),100*b);
        }else{
            g.setColor(Color.BLUE);
            g.drawOval((167*a),(100*b),167,100);
        }
        contador++;
    }
    

    }


    public static void main(String[] args) {
        App3 app = new App3();
    }

//METODOS ABSTRACTOS DEL MOUSE LISTENER
    @Override
    public void mouseClicked(MouseEvent e) {
        //String [] colors = {"RED", "GRAY", "GREEN", "BLUE"};
        //int valorDado = (int)Math.floor(Math.random()*5);
        //contenedor.setBackground(Color.decode(colors[valorDado]));

        int x = e.getX();
        int y = e.getY();

        if(x > 167 && y > 100 && x < 334 && y < 200){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 1;
            b = 1;
            repaint();
        }else if(x > 0 && y > 0 && x < 167 && y < 100){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 0;
            b = 0;
            repaint();
        } if(x > 167 && y > 0 && x < 334 && y < 100){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 1;
            b = 0;
            repaint();
        }else if(x > 334 && y > 0 && x < 500 && y < 100){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 2;
            b = 0;
            repaint();
        } else if(x > 0 && y > 100 && x < 167 && y < 200){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 0;
            b = 1;
            repaint();
        }else if(x > 334 && y > 100 && x < 500 && y < 200){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 2;
            b = 1;
            repaint();
        }else if(x > 0 && y > 200 && x < 167 && y < 300){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 0;
            b = 2;
            repaint();
        }else if(x > 167 && y > 200 && x < 334 && y < 300){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 1;
            b = 2;
            repaint();
        }else if(x > 334 && y > 200 && x < 500 && y < 300){
            //JOptionPane.showMessageDialog(this, "Presionaste el cuadrado del centro");
            a = 2;
            b = 2;
            repaint();
        }

        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //contenedor.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //contenedor.setBackground(Color.RED);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
