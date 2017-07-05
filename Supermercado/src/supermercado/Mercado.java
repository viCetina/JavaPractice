/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

public class Mercado {
    private int apertura;
    private int cierre;
    private String atencion;
    private char ciudad;
    private String nombre;
    private int superficie;
    
    private final int APERTURA_MIN = 7;
    private final int APERTURA_MAX = 10;
    
    private final int CIERRE_MIN = 23;
    private final int CIERRE_MAX = 24;
    
    private final int SUPERFICIE_MIN = 35;
    private final int SUPERFICIE_MAX = 1000;
    

    /**
     *
     * @param apertura
     * @param cierre
     * @param superficie
     * @param atencion
     * @param ciudad
     * @param nombre
     */

    // constructor
    public Mercado(int apertura, int cierre, int superficie, String atencion, char ciudad, String nombre){
           
            // apertura
            if (apertura < APERTURA_MIN || apertura > APERTURA_MAX){
            System.out.println("Horario Invalido");
            }else{
            this.apertura = apertura;
            System.out.println("Horario de apertura: " + apertura);
            }
            
            //cierre
            if (cierre < CIERRE_MIN || cierre > CIERRE_MAX){
            System.out.println("Horario Invalido");
            }else{
            this.cierre = cierre;
            System.out.println("Horario de cierre: " + cierre);
            }
            
            // Superficie
            if (superficie < SUPERFICIE_MIN || superficie > SUPERFICIE_MAX){
            System.out.println("Tamaño invalido");
            }else{
            this.superficie = superficie;    
            System.out.println("Superficie: " + superficie);
            } 
           
            //atencion
            switch(atencion) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
            case "Sabado":
                this.atencion = atencion;
                System.out.println("Lo esperamos de Lunes a Viernes");
                break;
            default:
                System.out.println("Dia de atención invalido");
            }
            
            //ubicacion
            switch(ciudad){
            case 'B':
            case 'C':
            case 'J':
            case 'M':
            case 'R':
            case 'S':
            case 'T':
                this.ciudad = ciudad;
                System.out.println("Sucursal: " + ciudad);
                break;
            default:
                System.out.println("Ciudad Invalida");
            }
            
            //nombre
            switch(nombre) {
            case "COTO":
            case "DISCO":
            case "JUMBO":
            case "CHINO":
                this.nombre = nombre;
                System.out.println("Cadena Valida");
                break;
            default:
                System.out.println(nombre);
            }
 
    }

    public Mercado(int apertura, int cierre, int superficie){
            // apertura
            if (apertura < APERTURA_MIN || apertura > APERTURA_MAX){
            System.out.println("Horario Invalido");
            }else{
            this.apertura = apertura;
            System.out.println("Horario de apertura: " + apertura);
            }
            
            //cierre
            if (cierre < CIERRE_MIN || cierre > CIERRE_MAX){
            System.out.println("Horario Invalido");
            }else{
            this.cierre = cierre;
            System.out.println("Horario de cierre: " + cierre);
            }
            
            // Superficie
            if (superficie < SUPERFICIE_MIN || superficie > SUPERFICIE_MAX){
            System.out.println("Tamaño invalido");
            }else{
            this.superficie = superficie;    
            System.out.println("Superficie: " + superficie);
            } 
    }
    
    public Mercado(String atencion, String nombre){
            //atencion
            switch(atencion) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
            case "Sabado":
                this.atencion = atencion;
                System.out.println("Lo esperamos de Lunes a Viernes");
                break;
            default:
                System.out.println("Dia de atención invalido");
            }
            
            //nombre
            switch(nombre) {
            case "COTO":
            case "DISCO":
            case "JUMBO":
            case "CHINO":
                this.nombre = nombre;
                System.out.println(nombre);
                break;
            default:
                System.out.println("Cadena Invalida");
            }  
    }
    
    public Mercado(char ciudad){
            //ubicacion
            switch(ciudad){
            case 'B':
            case 'C':
            case 'J':
            case 'M':
            case 'R':
            case 'S':
            case 'T':
                this.ciudad = ciudad;
                System.out.println("Sucursal: " + ciudad);
                break;
            default:
                System.out.println("Ciudad Invalida");
            }
    }
    
}
