import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import animales.mamiferos.Perro;
import animales.mamiferos.Raza;
import animales.mamiferos.Pulga;
import animales.mamiferos.Canino;;

public class App {
    public static void main(String[] args) throws Exception {
        /*int cedula = 1115185464;
        short edad = 2024;
        int edadT = edad;
        /* la forma correcta es*/
        /*int edadT2 = (int)edad;
        System.out.println(cedula+edad);
        System.out.println(cedula+edadT);
        System.out.println(cedula+edadT2);
        System.out.println("Hola"+ "Mundo");
        System.out.println((char)49);
        //imprimo el numero 1 con ASCII//
        String nombre = "pepe";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos Años tienes: ");
        byte edadpersona = scanner.nextByte();
        if(edadpersona < 0){
            System.out.println("No has nacido wey");    
        }
        else if(edadpersona < 18){
            System.out.println("Estas pollo");
        }
        else if(edadpersona > 18 && edadpersona < 30){
            System.out.println("Joven adulto");
        }
        else if(edadpersona > 30){
            System.out.println("Eres cucho");
        }
        int [] lista = {1,2,3,4};
        System.out.println(Arrays.toString(lista));


        ArrayList <Byte> lista2 = new ArrayList<Byte>();

        lista2.add((byte)1);


        Persona Jaimito = new Persona(); 
        
        JOptionPane.showMessageDialog(null, "hola");/* */
        Pulga pulga2 = new Pulga(6);
        Perro <String, Double> perro = new Perro<String, Double>(pulga2,1.2,"123","perro", Raza.pug, true, "nose que pedo es pedigree", "lider", "O+");

        Canino canino2 = new Canino(true,"medio","balto","o+");


        ArrayList <Canino> listaCaninos = new ArrayList<Canino>();
        listaCaninos.add(perro);
        listaCaninos.add(canino2);

        for (Canino caninofor:listaCaninos){
            caninofor.comen();
            if(caninofor.getClass().equals(Perro.class)){
                Perro perrito = (Perro)caninofor;
                perrito.juegan();
            }
        }
    }
}
