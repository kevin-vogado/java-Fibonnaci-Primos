package primo;

import javax.swing.JOptionPane;

public class Primo {

    public static void main(String[] args) {

       int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); 
        int[] primos = new int[n]; 
        int contador = 0; 

        for (int i = 2; i <= n; i++) {
            if (Primo(i)) {
                primos[contador] = i;
                contador++;
            }
        }

        System.out.println("Números primos até " + n + ":");
        for (int i = 0; i < contador; i++) {
            System.out.print(primos[i] + " ");
        }

    }
    
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
