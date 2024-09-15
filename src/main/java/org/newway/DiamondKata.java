package org.newway;

public class DiamondKata {

  public static String generateDiamond(char letter) {
    if (letter < 'A' || letter > 'Z') {
      return "Invalid input. Please enter a letter between A and Z.";
    }

    final var diamond = new StringBuilder();
    final var n = letter - 'A';  // Calculate the number of rows above the center

    // Build top part of the diamond including center
    for (int i = 0; i <= n; i++) {
      diamond.append(buildLine(i, n));
    }

    // Build bottom part of the diamond excluding center
    for (int i = n - 1; i >= 0; i--) {
      diamond.append(buildLine(i, n));
    }

    return diamond.toString();
  }

  private static String buildLine(int currentRow, int totalRows) {
    final var line = new StringBuilder();
    final var currentLetter = (char) ('A' + currentRow);

    // Add leading spaces
    line.append(" ".repeat(Math.max(0, totalRows - currentRow)));

    // Add first letter
    line.append(currentLetter);

    // Add spaces between letters if necessary
    if (currentRow > 0) {
      line.append(" ".repeat(Math.max(0, 2 * currentRow - 1)));
      // Add second letter
      line.append(currentLetter);
    }

    // Move to the next line
    line.append("\n");
    return line.toString();
  }

}


