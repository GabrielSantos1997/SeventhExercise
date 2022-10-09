package saojudas.seventhexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class SeventhExercise {
    public static void main(String[] args) {
        double side;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da lateral do quadrado: ");
        side = scanner.nextDouble();

        System.out.print("O dobro da area do quadrado é de: " + ((side * side) * 2) );
    }
}
