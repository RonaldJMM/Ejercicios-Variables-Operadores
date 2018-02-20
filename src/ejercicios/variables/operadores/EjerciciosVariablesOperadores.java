/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.variables.operadores;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class EjerciciosVariablesOperadores {

    /**
     * Metodo Principal
     */
    public static void main(String[] args) {
        Scanner lecturaVar = new Scanner(System.in);//funcion para escanear el dato del usuario
        byte opcionMenu;//variable para la opcion del menu
        do{//repeticion del menu de ejercicios
        System.out.println("Ejercicios Variables y Operadores.");
        System.out.println("1.Calculo de porcentaje de estudiantes menores.");
        System.out.println("2.Conversion de Horas a Semanas - Dias Y Horas totales.");
        System.out.println("3.Calculo del area de un circulo.");
        System.out.println("4.Calculo de una ecuacion de segundo grado.");
        System.out.println("5.Finalizar.");
        System.out.println("Digite el numero de la opcion que desea: ");
        
        opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
        switch(opcionMenu){
            
            case 1:
                //metodo del ejercicio 1
                porcentajeEstudiantes();
                break;
            
            case 2:
                //metodo del ejercicio 2
               conversionDeHoras();
               break;
               
            case 3:
                //metodo del ejercicio 3
               areaDeUnCirculo();
               break;
               
            case 4:
                //metodo del ejercicio 4
               ecuacionDeSegundoGrado();
               break;
            case 5:
                //salida del menu.
                System.out.println("Ha Finalizado.");
                break;
            default:
                //opcion no valida del menu.
                System.out.println("La opcion no es valida.");
                break;
        }
        
        }while(opcionMenu!=5);//condicional de salida del menu.
        
        
    }
    /**
    *Metodo ejercicio Numero 1
    */
     public static void porcentajeEstudiantes(){
         System.out.println("");
         System.out.println("Calculo de porcentaje de estudiantes menores.");
         System.out.println("Numero total de estudiantes: 240");
         System.out.println("Numero total de estudiantes menores: 35");
         System.out.println("");
         float totalEstudiantes = 240f;//total del estudiantes del curso
         float totalEstudiantesMenores = 35f;//total de estudiantes menores
         float porcentajeEstudiantesMenores;//resultado del porcentaje de estudiantes menores
         porcentajeEstudiantesMenores=(float)((100*totalEstudiantesMenores)/totalEstudiantes);
         System.out.println("El porcentajes de estudiantes menores en el curso es: " +porcentajeEstudiantesMenores +"%");
         System.out.println("");
     
     }
     /**
    *Metodo ejercicio Numero 2
    */
     public static void conversionDeHoras(){
         System.out.println("");
         Scanner lecturaVar = new Scanner(System.in);//funcion de lectura o escaner para el usuario.
         int numeroDeHorasDigitas;//horas digitadas por el usuario
         int totalSemanas;//total de horas en semanas
         byte totalDias;//total de horas en dias
         byte totalHoras;//total de horas restantes
         System.out.println("Conversion de numero de Horas a Semanas - Dias - Horas.");
         System.out.println("Porfavor digite valores enteros.");
         System.out.println("Digite el numero de horas que desea convertir: ");
         numeroDeHorasDigitas = lecturaVar.nextInt();//lectura de dato u horas.
         
         totalSemanas=(int)(numeroDeHorasDigitas/168);
         numeroDeHorasDigitas=numeroDeHorasDigitas-(totalSemanas*168);
         totalDias=(byte)(numeroDeHorasDigitas/24);
         numeroDeHorasDigitas=numeroDeHorasDigitas-(totalDias*24);
         totalHoras=(byte)(numeroDeHorasDigitas);
         System.out.println("");
         System.out.println("El total de semanas es: "+totalSemanas);
         System.out.println("El total de dias es: "+totalDias);
         System.out.println("El total de horas es: "+totalHoras);
         System.out.println("");
         
     }
     /**
    *Metodo ejercicio Numero 3
    */
     public static void areaDeUnCirculo(){
         System.out.println("");
         float radioCirculo = 3.4F;//radio del circulo
         float areaCirculo;//total area del circulo
         System.out.println("Calculo del area de un circulo.");
         System.out.println("Radio: 3.4");
         System.out.println("");
         areaCirculo = (float)(3.1416*(Math.pow(radioCirculo,2)));
         System.out.println("El area total del circulo es: "+areaCirculo);
         System.out.println("");
     
     
     }
     /**
    *Metodo ejercicio Numero 4
    */
     public static void ecuacionDeSegundoGrado(){
         System.out.println("");
         //declaracion de variables para la ecuacion de segundo grado.
         float a = 3f;
         float b = -5f;
         float c = -12f;
         //resultados de la ecuacion de segundo grado.
         float x1;
         float x2;
         
         System.out.println("Calculo de resultados de una ecuacion de segundo grado.");
         System.out.println("Ecuacion: 3x^2-5x-12");
         x1=(float)(((-b)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
         x2=(float)(((-b)-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
         System.out.println("");
         System.out.println("El valor de x1 es: "+x1);
         System.out.println("El valor de x2 es: "+x2);
         System.out.println("");
         
     }
}
