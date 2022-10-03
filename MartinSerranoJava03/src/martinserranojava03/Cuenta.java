
package martinserranojava03;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Rafae
 */
public class Cuenta {
    
    //Creamos la clase cuenta con sus atributos//
    
    private int numCuen; //para guardar el numero de la cuenta//
    private float sueld; //para guardar el sueldo//
    private GregorianCalendar fechap; //para guardar la fecha con formato//
    private String propi; //para guardar el nombre del propietario//

    //constructores//
    
    public Cuenta() {
        numCuen = 0;
        sueld = 0;
        propi = "";
        fechap = new GregorianCalendar();
    }
     
    public Cuenta(int numeroCuenta,float sueldo,String propie) {
        this();
        this.numCuen = numeroCuenta;
        this.sueld = sueldo;
        this.propi = propie;
    }
    
    public Cuenta(int numeroCuenta,float sueldo,GregorianCalendar fecha,String propie) {
        this(numeroCuenta,sueldo,propie);
        fechap = fecha;
    }
     //getter and setter para los campos//

    public int getNumCuen() {
        return numCuen;
    }

    public void setNumCuen(int numCuen) {
        this.numCuen = numCuen;
    }

    public float getSueld() {
        return sueld;
    }

    public void setSueld(float sueld) {
        this.sueld = sueld;
    }

 
    public String getFechap() {
        return this.fechap.get(Calendar.DAY_OF_MONTH) + "/" //Dia
                + (this.fechap.get(Calendar.MONTH) + 1) + "/" //Mes
                + this.fechap.get(Calendar.YEAR);            //Año
    }

    public void setFechap(int d, int m, int a) {
        this.fechap = new GregorianCalendar(d, m, a);
    }


    public String getPropi() {
        return propi;
    }

    public void setPropi(String propi) {
        this.propi = propi;
    }
    
     public String fechaGre(){
        return this.fechap.get(Calendar.DAY_OF_MONTH) + "/" + (this.fechap.get(Calendar.MONTH)+1) + "/" + this.fechap.get(Calendar.YEAR);
    }
    @Override
    public String toString() {
        return "Numero cuenta: " + numCuen + "\nSueldo: " + sueld + "\nFecha: " + fechaGre() + "\nPropietario: " + propi;
    }
     
     
}

