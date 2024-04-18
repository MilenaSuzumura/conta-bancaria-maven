package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanMenu = new Scanner(System.in);
    System.out.println("Informe o número da conta:");

    String account = scanMenu.next();

    if (StringUtils.isNumericSpace(account)) {
      Integer number = Integer.parseInt(account);
      String numberAccount = AccountNumberFormatter.formatAccountNumber(number);
      System.out.println("Número da conta: " + numberAccount);
    } else {
      System.out.println("Número da conta inválido!");
    }
  }

}
