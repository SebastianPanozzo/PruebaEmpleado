package Humano; // Declara el paquete donde se encuentra la clase UsoEmpleado
import java.util.*; // Importa todas las clases del paquete java.util, que incluye clases como GregorianCalendar y Date

public class UsoEmpleado {
    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
        Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15);

        // Llama al método subeSueldo para aumentar el sueldo de cada empleado en un 5%
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        // Imprime los datos de cada empleado, incluyendo su nombre, sueldo y fecha de alta
        System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
                + " Fecha de Alta: " + empleado1.dameFechaContrato());
        System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
                + " Fecha de Alta: " + empleado2.dameFechaContrato());
        System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
                + " Fecha de Alta: " + empleado3.dameFechaContrato());
        */

        // Se crea un array de objetos Empleado llamado misEmpleados con 3 elementos
        Empleado[] misEmpleados = new Empleado[4];

        // Se inicializan los elementos del array misEmpleados con objetos Empleado
        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado("Martin Tetaz");//sobrecarga de metodos
        /*
        // Incrementa el sueldo de cada empleado en el array misEmpleados usando un bucle for normal
        for(int i = 0; i < 3; i++){
            misEmpleados[i].subeSueldo(5);
        }
        */

        // Incrementa el sueldo de cada empleado en el array misEmpleados usando un bucle for-each
        for (Empleado e : misEmpleados) {
            e.subeSueldo(5); // Aumenta el sueldo en un 5%
        }

        /*
        // Imprime los datos de cada empleado usando un bucle for normal
        for(int i = 0; i < 3; i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()
                    + " Sueldo: " + misEmpleados[i].dameSueldo()
                    + " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
        }
        */

        // Imprime los datos de cada empleado usando un bucle for-each
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo()
                    + " Fecha de Alta: " + e.dameFechaContrato());
        }
    }
}

class Empleado {
    // Constructor de la clase Empleado que inicializa los atributos nombre, sueldo y altaContrato
    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime(); // Se inicializa altaContrato con la fecha especificada
        /*
public Empleado(String nom, double sue, int agno, int mes, int dia) {:
Este es el constructor de la clase Empleado.
Un constructor es un método especial que se invoca automáticamente al crear una instancia de la clase.
Su propósito es inicializar los atributos del objeto.

String nom, double sue, int agno, int mes, int dia:
Estos son los parámetros que recibe el constructor.
nom es el nombre del empleado, sue es el sueldo inicial, agno, mes, y dia son la fecha de alta del empleado.
nombre = nom;: Este es el primer atributo que se inicializa.
nombre es una variable de instancia (atributo de la clase) que almacena el nombre del empleado.
Aquí se le asigna el valor pasado como argumento nom.

sueldo = sue;:
Similar al anterior, sueldo es otro atributo de la clase que almacena el sueldo del empleado, y aquí se le asigna el valor pasado como argumento sue.

GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);:
Aquí se crea una instancia de GregorianCalendar, que es una clase de Java utilizada para manejar fechas.
Se pasa como parámetros el año, mes y día para crear la fecha de alta del contrato.
Importante: el mes se resta por uno porque en Java los meses en GregorianCalendar empiezan desde 0 (enero = 0, febrero = 1, etc.).

altaContrato = calendario.getTime();:
Aquí se obtiene la fecha exacta (como un objeto Date) de la instancia de GregorianCalendar y se asigna al atributo altaContrato.
Este atributo almacenará la fecha de alta del empleado en la empresa.
         */
    }
    /*
    public Empleado(String nom) {
        nombre = nom;
    }//sobrecarga de metodos
     */

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }//sobrecarga de metodos

    public String dameNombre() { // Método getter para obtener el nombre del empleado
        return nombre;
    }

    public double dameSueldo() { // Método getter para obtener el sueldo del empleado
        return sueldo;
    }

    public Date dameFechaContrato() { // Método getter para obtener la fecha de alta del empleado
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) { // Método para aumentar el sueldo del empleado en un porcentaje
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento; // Se actualiza el sueldo con el aumento calculado
    }

    // Atributos privados de la clase Empleado
    private String nombre; // Almacena el nombre del empleado
    private double sueldo; // Almacena el sueldo del empleado
    private Date altaContrato; // Almacena la fecha de alta del empleado
}