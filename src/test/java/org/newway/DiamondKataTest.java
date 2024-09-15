package org.newway;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DiamondKataTest {

  @Test
  void generates_diamond_for_A_correctly() {
    // given
    var expected = """
        A
        """;

    // then
    assertEquals(expected, DiamondKata.generateDiamond('A'));
  }

  @Test
  void generates_diamond_for_B_correctly() {
    // given
    var expected = """
         A
        B B
         A
        """;

    // then
    assertEquals(expected, DiamondKata.generateDiamond('B'));
  }

  @Test
  void generates_diamond_for_C_correctly() {
    // given
    var expected = """
          A
         B B
        C   C
         B B
          A
        """;

    // then
    assertEquals(expected, DiamondKata.generateDiamond('C'));
  }

  @Test
  void handles_invalid_input_gracefully() {
    // given
    var expected = "Invalid input. Please enter a letter between A and Z.";

    // then
    assertEquals(expected, DiamondKata.generateDiamond('1')); // invalid input
  }
}
