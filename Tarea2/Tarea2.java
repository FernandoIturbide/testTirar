import java.util.Scanner;

public class Tarea2 {
    public static void main(String[]args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres (Mayor a 1 caracter): ");
        String Entrada=i.nextLine();
        char letra;
        int codigo, larg=Entrada.length(),control=0,control2=0;
        if (larg>1) {
            for (int j = 0; j < larg+1; j++) {
                letra=Entrada.charAt(j);
                codigo=(int)letra;
                control=codigo;
                letra=Entrada.charAt(j+1);
                codigo=(int)letra;
                control-=codigo;
                if(control==-1){
                    control2+=1;
                }
                if (j==larg-2) {
                    System.out.println(control2==larg-1);
                }
            }
            
        }
        else
        System.out.println("La cadena es muy pequeña");
    }
}
