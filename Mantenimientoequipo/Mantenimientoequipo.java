
/**
 * Write a description of class Mantenimientoequipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Mantenimientoequipo
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] areas = new String[50];
        int[] numequipos = new int[50];
                
        int numeroareas;
        String area;
        int numeq;
        int promedio = 0;
        System.out.println("Digite la cantidad de areas administrativas: ");
        numeroareas = sc.nextInt();
        for(int i = 0; i < numeroareas; i++){
            System.out.println("Digite el nombre del area administrativa: ");
            area = sc.next();
            System.out.println("Digite la cantidad de equipos asignados al area: ");
            numeq = sc.nextInt();
            areas[i] = area;
            numequipos[i] = numeq;
           
        }
        for(int i = 0; i < numeroareas; i++){
            promedio = promedio + ((numequipos[i]) / 20);
            
        }
        System.out.println("El promedio de equipos diarios a realizar actualizaciones y mantenimiento preventivo es: " + promedio);
    }
    
}
    