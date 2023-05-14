# Actualizacion y Mantenimiento Preventivo Equipos de Computo
#
## Actividad a Realizar:
#
#### En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un tecnico en soporte sistemas, que desea calcular el promedio de equipos diarios a los que les debe realizar mantenimietno preventivo y actualizaciones. Esta empresa cuenta con varias areas adminsitrativas en las cuales se tiene que programar la intervencion de los equipos de computo para no interferir con las actividades de los usuarios.
#
## Aclaraciones:
#
### Se debe agendar con el usuario la fecha y hora de la intervencion del equipo de computo.
#
### El tiempo de intervencion del equipo no puede ser mayor a 3 horas.
#
### Hacer un cronograma por area para realizar dicho mantenimiento.
#
#
# Historia de Usuario
#
![image](https://github.com/carlfepe/mantenimiento.github.io/assets/132966562/1720bc02-d0d1-4756-8a33-c3c0583867ed)
#
#
# Caso de Uso
#
![image](https://github.com/carlfepe/mantenimiento.github.io/assets/132966562/2cc8c2d5-84e7-42db-829b-6047e780fdd4)
#
#
# Diagrama de Flujo
#
![image](https://github.com/carlfepe/mantenimiento.github.io/assets/132966562/fbfad582-117c-4fea-aef1-32483198be10)
#
#
# Seudocodigo
#
### Caracteres: area [30]
### Real: promedio <- 0
### entero: numar [10], i
### entero: numeq [10]
### Imprimir: ‘Digite el número de areas:’
### Asignar: numar
### Para i=0 hasta numar - 1, 1
### Imprimir: ‘Digite nombre del area:’
### Asignar: area
### Imprimir: ‘Digite numero de equipos:’
### Asignar: numeq
### area[i] <- area
### numeq [i] <- numero equipos
### finPara
### Para i=0 hasta numar - 1, 1
### promedio <-
### promedio +((numeq[i])/20)numar
### finPara
### Imprimir: ‘El promedio es:’ + promedio
### End
#
# Programacion estructurada Mantenimiento Equipos
#
![image](https://github.com/carlfepe/mantenimiento.github.io/assets/132966562/faacc72d-7919-429c-b1a9-136d50c45b22)
#
### /**
### * Write a description of class Mantenimientoequipo here.
### * 
### * @author (your name) 
### * @version (a version number or a date)
### */
### import java.util.Scanner;
### public class Mantenimientoequipo
### {
###     public static void main(String[] args){
###         
###         Scanner sc = new Scanner(System.in);
###         String[] areas = new String[50];
###         int[] numequipos = new int[50];
###                 
###         int numeroareas;
###         String area;
###         int numeq;
###         int promedio = 0;
###         System.out.println("Digite la cantidad de areas administrativas: ");
###         numeroareas = sc.nextInt();
###         for(int i = 0; i < numeroareas; i++){
###             System.out.println("Digite el nombre del area administrativa: ");
###             area = sc.next();
###             System.out.println("Digite la cantidad de equipos asignados al area: ");
###             numeq = sc.nextInt();
###             areas[i] = area;
###             numequipos[i] = numeq;
###            
###         }
###         for(int i = 0; i < numeroareas; i++){
###             promedio = promedio + ((numequipos[i]) / 20);
###             
###         }
###         System.out.println("El promedio de equipos diarios a realizar actualizaciones y mantenimiento preventivo es: " + promedio);
###     }
###     
### }
#
![image](https://github.com/carlfepe/mantenimiento.github.io/assets/132966562/fce59758-6ab5-4405-a0aa-57d46795c366)


