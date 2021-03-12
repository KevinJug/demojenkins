package com.epsi.mycal;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

  /** Point d'entrée de l'application.
   * 
   * @param args tableau d'argument
   */
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);) {
      Calculator calc = new Calculator();
      int valueA = 0;
      int valueB = 0;
      System.out.println("Veuillez choisir votre opération");
      System.out.println("\t -Addition");
      System.out.println("\t -Soustraire");
      System.out.println("\t -Mutliplication");
      System.out.println("\t -Division");
      System.out.println("\t -Pair");
      System.out.println("\t -Premier");
      System.out.println("\t -Stop");
      boolean stop = false;
      do {
        System.out.println("------------");
        System.out.print("Choix : ");
        String choice = scanner.next();
        switch (choice.toLowerCase()) {
          case "soustraire":
            System.out.println("*******");
            System.out.print("Value 1 : ");
            valueA = scanner.nextInt();
            System.out.println("*******");
            System.out.print("Value 2 : ");
            valueB = scanner.nextInt();
            System.out.println(calc.sub(valueA, valueB));
            break;
          case "multiplication":
            System.out.println("*******");
            System.out.print("Value 1 : ");
            valueA = scanner.nextInt();
            System.out.println("*******");
            System.out.print("Value 2 : ");
            valueB = scanner.nextInt();
            System.out.println(calc.mul(valueA, valueB));
            break;
          case "addition":
            System.out.println("*******");
            System.out.print("Value 1 : ");
            valueA = scanner.nextInt();
            System.out.println("*******");
            System.out.print("Value 2 : ");
            valueB = scanner.nextInt();
            System.out.println(calc.add(valueA, valueB));
            break;
          case "division":
            System.out.println("*******");
            System.out.print("Value 1 : ");
            valueA = scanner.nextInt();
            System.out.println("*******");
            System.out.print("Value 2 : ");
            valueB = scanner.nextInt();
            System.out.println(calc.div(valueA, valueB));
            break;
          case "pair":
            System.out.println("*******");
            System.out.print("Value : ");
            valueA = scanner.nextInt();
            System.out.println(calc.pair(valueA));
            break;
          case "premier":
            System.out.println("*******");
            System.out.print("Value : ");
            valueA = scanner.nextInt();
            System.out.println(calc.pair(valueA));
            break;
          case "stop":
            stop = true;
            break;
          default:
            System.out.print("Choix invalide ");
            break;
        }
      } while (!stop);
    } catch (Exception e) {
      System.out.println("Erreur");
    }
  }
}
