package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public static String formatAccountNumber(int literalAccountNumber) {
    String numberAccount = Integer.toString(literalAccountNumber);
    if (numberAccount.length() < 6) {
      return StringUtils.leftPad(numberAccount, 6, "0");
    } else if (numberAccount.length() > 6) {
      return StringUtils.right(numberAccount, 6);
    } else {
      return numberAccount;
    }
  }

}