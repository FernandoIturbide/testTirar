import java.util.Scanner;

public class Tarea{
    public static void main(String[]args){
        String Entrada;
        Scanner i = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos en este orden: Nombre Profesión País");
        Entrada=i.nextLine();
        String[] Separado=Entrada.trim().split(" ");
        System.out.println("Nombre: "+Separado[0]+"\nProfesión: "+Separado[1]+"\nPaís: "+Separado[2]) ;
    }
}

