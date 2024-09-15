package org.newway;

public class DiamondKata {

  public static String generateDiamond(char letter) {
    if (letter < 'A' || letter > 'Z') {
      return "Invalid input. Please enter a letter between A and Z.";
    }

    StringBuilder diamond = new StringBuilder();
    int n = letter - 'A';  // Calculate the number of rows above the center

    // Build top part of the diamond
    for (int i = 0; i <= n; i++) {
      diamond.append(buildLine(i, n));
    }

    // Build bottom part of the diamond
    for (int i = n - 1; i >= 0; i--) {
      diamond.append(buildLine(i, n));
    }

    return diamond.toString();
  }

  private static String buildLine(int currentRow, int totalRows) {
    StringBuilder line = new StringBuilder();
    char currentLetter = (char) ('A' + currentRow);

    // Add leading spaces
    for (int i = 0; i < totalRows - currentRow; i++) {
      line.append(" ");
    }

    // Add first letter
    line.append(currentLetter);

    // Add spaces between letters if necessary
    if (currentRow > 0) {
      for (int i = 0; i < 2 * currentRow - 1; i++) {
        line.append(" ");
      }
      // Add second letter
      line.append(currentLetter);
    }

    // Move to the next line
    line.append("\n");
    return line.toString();
  }

  public static void main(String[] args) {
    char input = 'C';
    System.out.println(generateDiamond(input));
  }
}


