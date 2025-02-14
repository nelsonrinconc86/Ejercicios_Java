/*Pasos a desarrollar:
1. Crear la Clase 
2. Crear atributos.
3. crear metodo constructor
4. Crear los metodos.
5. crear el objeto
6. llamar al objeto
7. llmar a los metodos
8. hacer retornos si es necesario
9. si hay retorno en los metodos hacer almacenamiento

*/

/* observaciones de codigo:
- Estar estructurado minimo en 3 funciones
    1. Tomar datos
    2. Procesar datos
    3. Mostrar resultados
*/
package tiendaejercicios;

//se crea la clase
import java.util.Scanner;

public class Ejercicio1 {
    //se crea el constructo
    public Ejercicio1(){
        System.out.println("*** Bienvenido el ejemplo 1 ***");
    }
    public void tomarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Escriba un numero: ");
        int num2 = teclado.nextInt();
        //se llama metodo de la misma clase
        int resul = Ejercicio1.calcularSuma(num1, num2);
        System.out.println("el resultado es: " + resul);
    }
    public static int calcularSuma(int num1 , int num2){
        int resultado = num1+ num2;
        return resultado;
    }
}
