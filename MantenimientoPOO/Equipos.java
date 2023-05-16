
/**
 * Write a description of class Equipos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Equipos
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numare;
        AreaPOO[] lasAreas = new AreaPOO[50];
        String areas;
        int numeq;
        int promedio = 0;
        System.out.println("Digite la cantidad de areas administrativas: ");
        numare = sc.nextInt();
        for(int i = 0; i < numare; i++){
            System.out.println("Digite el nombre del area administrativa: ");
            areas = sc.next();
            System.out.println("Digite el numero de equipos asignados al area: ");
            numeq = sc.nextInt();
            AreaPOO unArea = new AreaPOO();
            unArea.areas = areas;
            unArea.numare = numare;
            unArea.numeq = numeq;
            lasAreas[i] = unArea;
        }
        for(int i = 0; i < numare; i++){
        int sum = ((lasAreas[i].numeq)/ 20);
        promedio = promedio + sum;
                }
        System.out.println("El promedio de equipos diarios a realizar actualizaciones y mantenimiento preventivo es: " + promedio);
    }
}