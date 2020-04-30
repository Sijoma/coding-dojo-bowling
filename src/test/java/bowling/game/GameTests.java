package bowling.game;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GameTests {
    private final Game game = new Game();

    @Test
    void gameStart() {
        assertFalse(game.isOver());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void singleRolls(int roll) {
        game.addRoll(roll);
        assertEquals(roll, game.getTotalScore());
    }

    @Test
    void firstRoll() {
        game.addRoll(1);
        assertEquals(1, game.getTotalScore());
    }

    @Test
    void secondRoll() {
        game.addRoll(1);
        game.addRoll(4);
        assertEquals(5, game.getTotalScore());
    }

    @Test
    void thirdRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        assertEquals(9, game.getTotalScore());
    }

    @Test
    void fourthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        assertEquals(14, game.getTotalScore());
    }

    @Test
    void fifthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        assertEquals(20, game.getTotalScore());
    }

    @Test
    void sixthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        assertEquals(24, game.getTotalScore());
    }

    @Test
    void seventhRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        assertEquals(34, game.getTotalScore());
    }

    @Test
    void eighthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        assertEquals(39, game.getTotalScore());
    }

    @Test
    void ninthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        assertEquals(59, game.getTotalScore());
    }

    @Test
    void tenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        assertEquals(59, game.getTotalScore());
    }

    @Test
    void eleventhRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        assertEquals(61, game.getTotalScore());
    }

    @Test
    void twelfthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        assertEquals(68, game.getTotalScore());
    }

    @Test
    void thirteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        assertEquals(71, game.getTotalScore());
    }

    @Test
    void fourteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        assertEquals(83, game.getTotalScore());
    }

    @Test
    void fifteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        assertEquals(87, game.getTotalScore());
    }

    @Test
    void sixteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(10);
        assertEquals(107, game.getTotalScore());
    }

    @Test
    void seventeenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(10);
        game.addRoll(2);
        assertEquals(111, game.getTotalScore());
    }

    @Test
    void eighteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(10);
        game.addRoll(2);
        game.addRoll(8);
        assertEquals(127, game.getTotalScore());
    }

    @Test
    void nineteenthRoll() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(10);
        game.addRoll(2);
        game.addRoll(8);
        game.addRoll(6);
        assertEquals(133, game.getTotalScore());
        assertTrue(game.isOver());
    }

    @Test
    void tooManyRolls() {
        try {
            game.addRoll(1);
            game.addRoll(4);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(5);
            game.addRoll(10);
            game.addRoll(0);
            game.addRoll(1);
            game.addRoll(7);
            game.addRoll(3);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(10);
            game.addRoll(2);
            game.addRoll(8);
            game.addRoll(6);
            game.addRoll(8);
        } catch (Exception e) {
            assertEquals("Game is already over!", e.getMessage());
        }
    }

    @Test
    void tooManyPins() {
        try {
            game.addRoll(1);
            game.addRoll(10);
        } catch (Exception e) {
            assertEquals("That many pins are not in the game! Lousy Cheater!", e.getMessage());
        }
    }

    @Test
    void tooManyPinsAtLastFrame() {
        try {
            game.addRoll(1);
            game.addRoll(4);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(5);
            game.addRoll(10);
            game.addRoll(0);
            game.addRoll(1);
            game.addRoll(7);
            game.addRoll(3);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(10);
            game.addRoll(2);
            game.addRoll(8);
            game.addRoll(11);
        } catch (Exception e) {
            assertEquals("That many pins are not in the game! Lousy Cheater!", e.getMessage());
        }

    }


    @Test
    void nineteenthRollWithoutExtraRoll() {
        try {
            game.addRoll(1);
            game.addRoll(4);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(5);
            game.addRoll(5);
            game.addRoll(10);
            game.addRoll(0);
            game.addRoll(1);
            game.addRoll(7);
            game.addRoll(3);
            game.addRoll(6);
            game.addRoll(4);
            game.addRoll(10);
            game.addRoll(2);
            game.addRoll(7);
            game.addRoll(6);
        } catch (Exception e) {
            assertEquals("Game is already over!", e.getMessage());
        }
    }

    // This test differentiates between calculating the score on the fly (with each frame) or after the game has finished
    @Test
    void testOtherScoreMethod() {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(5);
        game.addRoll(10);
        game.addRoll(0);
        game.addRoll(1);
        game.addRoll(7);
        game.addRoll(3);
        game.addRoll(6);
        game.addRoll(4);
        game.addRoll(10);
        game.addRoll(2);
        game.addRoll(8);
        game.addRoll(6);
        assertEquals(133, game.getTotalScore());
        assertEquals(game.summariseScore(), game.getTotalScore());
        assertTrue(game.isOver());
    }

    @Test
    void strikeCalculation() {
        rollStrike();
        game.addRoll(5);
        assertEquals(20, game.summariseScore());
        assertEquals(20, game.getTotalScore());
    }

    @Test
    void spareCalculation() {
        rollSpare();
        game.addRoll(2);
        game.addRoll(5);
        assertEquals(19, game.summariseScore());
    }


    private void rollStrike() {
        game.addRoll(10);
    }

    private void rollSpare() {
        game.addRoll(6);
        game.addRoll(4);
    }


}