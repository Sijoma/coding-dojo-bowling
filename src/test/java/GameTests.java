import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTests {
    private final Game game = new Game();

    @Test
    void gameStart() {
        assertFalse(game.isOver());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void singleRolls(int roll) throws Exception {
        game.addRoll(roll);
        assertEquals(roll, game.getTotalScore());
    }

    @Test
    void firstRoll() throws Exception {
        game.addRoll(1);
        assertEquals(1, game.getTotalScore());
    }

    @Test
    void secondRoll() throws Exception {
        game.addRoll(1);
        game.addRoll(4);
        assertEquals(5, game.getTotalScore());
    }

    @Test
    void thirdRoll() throws Exception {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        assertEquals(9, game.getTotalScore());
    }

    @Test
    void fourthRoll() throws Exception {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        assertEquals(14, game.getTotalScore());
    }

    @Test
    void fifthRoll() throws Exception {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        assertEquals(20, game.getTotalScore());
    }

    @Test
    void sixthRoll() throws Exception {
        game.addRoll(1);
        game.addRoll(4);
        game.addRoll(4);
        game.addRoll(5);
        game.addRoll(6);
        game.addRoll(4);
        assertEquals(24, game.getTotalScore());
    }

    @Test
    void seventhRoll() throws Exception {
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
    void eighthRoll() throws Exception {
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
    void ninthRoll() throws Exception {
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
    void tenthRoll() throws Exception {
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
    void eleventhRoll() throws Exception {
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
    void twelfthRoll() throws Exception {
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
    void thirteenthRoll() throws Exception {
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
    void fourteenthRoll() throws Exception {
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
    void fifteenthRoll() throws Exception {
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
    void sixteenthRoll() throws Exception {
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
    void seventeenthRoll() throws Exception {
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
    void eighteenthRoll() throws Exception {
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
    void nineteenthRoll() throws Exception {
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
    void tooManyRolls() throws Exception {
        try{
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
        }
        catch (Exception e){
            assertEquals("Game is already over!", e.getMessage());
        }
    }

    @Test
    void tooManyPins() {
        try{
            game.addRoll(1);
            game.addRoll(10);
        }
        catch (Exception e){
            assertEquals("That many pins are not in the game! Lousy Cheater!", e.getMessage());
        }
    }

    @Test
    void tooManyPinsAtLastFrame() throws Exception {
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
        } catch(Exception e){
            assertEquals("That many pins are not in the game! Lousy Cheater!", e.getMessage());
        }

    }


    @Test
    void nineteenthRollWithoutExtraRoll() throws Exception {
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
        } catch (Exception e){
            assertEquals("Game is already over!", e.getMessage());
        }
    }

    // This test differentiates between calculating the score on the fly (with each frame) or after the game has finished
    @Test
    void testOtherScoreMethod() throws Exception {
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
    void strikeCalculation() throws Exception{
        rollStrike();
        game.addRoll(5);
        assertEquals(20, game.summariseScore());
        assertEquals(20, game.getTotalScore());
    }

    @Test
    void spareCalculation() throws Exception{
        rollSpare();
        game.addRoll(2);
        game.addRoll(5);
        assertEquals(19, game.summariseScore());
    }


    private void rollStrike() throws Exception {
        game.addRoll(10);
    }

    private void rollSpare() throws Exception {
        game.addRoll(6);
        game.addRoll(4);
    }








}