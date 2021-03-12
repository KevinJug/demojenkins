package com.epsi.mycal;

public class Calculator {

  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }
  
  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }
  
  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }
  
  /** Division entre 2 chiffres.
   * 
   * @param valueA Dividende
   * @param valueB Diviseur
   * @return retourne le r�sultat.
   * @throws Exception Erreur si disivion par 0
   */
  public int div(int valueA, int valueB) throws Exception {
    if (valueB == 0) {
      throw new Exception("Not division by 0");
    }
    return valueA / valueB;
  }
  
  public boolean pair(int valueA) {
    return valueA % 2 == 0;
  }
  
  /** V�rifier si la donn�e est un nombre premier.
   * 
   * @param valueA valeur � tester
   * @return retourne un boolean
   */
  public boolean first(int valueA) {
    if (valueA <= 1) {
      return false;
    }
    for (int i = 2; i <= valueA / 2; i++) {
      if (valueA % i == 0) {
        return false;
      }
    }
    return true;
  }
}
