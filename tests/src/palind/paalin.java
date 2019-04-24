package palind;
import java.util.Scanner;
public class paalin {
    
    public static boolean Palindromo(String Frase)
    {
        for(int i = 0; i < Frase.length(); i++)
        {
            if (Frase.charAt(i) != Frase.charAt(Frase.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Frase;
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Escriba la frase ");
        Frase = Teclado.next();
        
        if (Palindromo(Frase) == true)
        {
            System.out.printf("La frase \"%s\" es un palindromo%n", Frase);
        } else
        {
            System.out.printf("La frase \"%s\" no es un palindromo%n", Frase);
        }
        
    }
}
