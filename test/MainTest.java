import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldAnswerTrue() {
        assertTrue(true);
    }

    @Test
    void shouldAnswerFalse() {
        assertFalse(false);
    }

    @Test
    void testFront11() {
        assertArrayEquals(new int[]{1, 7}, Main.front11(new int[]{1, 2, 3}, new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{1, 2}, Main.front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, Main.front11(new int[]{1, 7}, new int[]{}));
    }

    @Test
    void testHasBad() {
        assertTrue(Main.hasBad("badxx"));
        assertTrue(Main.hasBad("xbadxx"));
        assertFalse(Main.hasBad("xxbadxx"));
    }

    @Test
    void testWithoutX() {
        assertEquals("Hi", Main.withoutX("xHix"));
        assertEquals("Hi", Main.withoutX("xHi"));
        assertEquals("Hxi", Main.withoutX("Hxix"));
    }

    @Test
    void testWithoutX2() {
        assertEquals("Hi", Main.withoutX2("xHi"));
        assertEquals("Hi", Main.withoutX2("Hxi"));
        assertEquals("Hi", Main.withoutX2("Hi"));
    }

    @Test
    void testStartWord() {
        assertEquals("hi", Main.startWord("hippo", "hi"));
        assertEquals("hip", Main.startWord("hippo", "xip"));
        assertEquals("h", Main.startWord("hippo", "i"));
    }

    @Test
    void testDeFront() {
        assertEquals("llo", Main.deFront("Hello"));
        assertEquals("va", Main.deFront("java"));
        assertEquals("aay", Main.deFront("away"));
    }

    @Test
    void testWithout2() {
        assertEquals("lloHe", Main.without2("HelloHe"));
        assertEquals("HelloHi", Main.without2("HelloHi"));
        assertEquals("", Main.without2("Hi"));
    }

    @Test
    void testMinCat() {
        assertEquals("loHi", Main.minCat("Hello", "Hi"));
        assertEquals("ellojava", Main.minCat("Hello", "java"));
        assertEquals("javaello", Main.minCat("java", "Hello"));
    }

    @Test
    void testNear10() {
        assertTrue(Main.near10(12));
        assertFalse(Main.near10(17));
        assertTrue(Main.near10(19));
    }

    @Test
    void testTeaParty() {
        assertEquals(1, Main.teaParty(6, 8));
        assertEquals(0, Main.teaParty(3, 8));
        assertEquals(2, Main.teaParty(20, 6));
    }

    @Test
    void testFizzString() {
        assertEquals("Fizz", Main.fizzString("fig"));
        assertEquals("Buzz", Main.fizzString("dib"));
        assertEquals("FizzBuzz", Main.fizzString("fib"));
        assertEquals("none", Main.fizzString("none"));
    }

    @Test
    void testFizzString2() {
        assertEquals("1!", Main.fizzString2(1));
        assertEquals("2!", Main.fizzString2(2));
        assertEquals("Fizz!", Main.fizzString2(3));
    }

    @Test
    void testTwoAsOne() {
        assertTrue(Main.twoAsOne(1, 2, 3));
        assertTrue(Main.twoAsOne(3, 1, 2));
        assertFalse(Main.twoAsOne(3, 2, 2));
    }

    @Test
    void testInOrder() {
        assertTrue(Main.inOrder(1, 2, 4, false));
        assertFalse(Main.inOrder(1, 2, 1, false));
        assertTrue(Main.inOrder(1, 1, 2, true));
    }

    @Test
    void testInOrderEqual() {
        assertTrue(Main.inOrderEqual(2, 5, 11, false));
        assertFalse(Main.inOrderEqual(5, 7, 6, false));
        assertTrue(Main.inOrderEqual(5, 5, 7, true));
    }

    @Test
    void testLastDigit() {
        assertTrue(Main.lastDigit(23, 19, 13));
        assertFalse(Main.lastDigit(23, 19, 12));
        assertTrue(Main.lastDigit(23, 19, 3));
    }

    @Test
    void testLessBy10() {
        assertTrue(Main.lessBy10(1, 2, 11));
        assertFalse(Main.lessBy10(11, 2, 10));
        assertTrue(Main.lessBy10(1, 10, 0));
    }

    @Test
    void testWithoutDoubles() {
        assertEquals(5, Main.withoutDoubles(2, 3, true));
        assertEquals(7, Main.withoutDoubles(3, 3, true));
        assertEquals(6, Main.withoutDoubles(3, 3, false));
    }

    @Test
    void testMaxMod5() {
        assertEquals(3, Main.maxMod5(2, 3));
        assertEquals(6, Main.maxMod5(6, 2));
        assertEquals(3, Main.maxMod5(3, 2));
    }

    @Test
    void testRedTicket() {
        assertEquals(10, Main.redTicket(2, 2, 2));
        assertEquals(0, Main.redTicket(2, 2, 1));
        assertEquals(5, Main.redTicket(0, 0, 0));
    }

    @Test
    void testGreenTicket() {
        assertEquals(0, Main.greenTicket(1, 2, 3));
        assertEquals(20, Main.greenTicket(2, 2, 2));
        assertEquals(10, Main.greenTicket(1, 1, 2));
    }

    @Test
    void testBlueTicket() {
        assertEquals(10, Main.blueTicket(9, 1, 0));
        assertEquals(0, Main.blueTicket(9, 2, 0));
        assertEquals(10, Main.blueTicket(6, 1, 4));
    }

    @Test
    void testShareDigit() {
        assertTrue(Main.shareDigit(12, 23));
        assertFalse(Main.shareDigit(12, 43));
        assertFalse(Main.shareDigit(12, 44));
    }

    @Test
    void testSum13() {
        assertEquals(Main.sum13(new int[]{1, 2, 3, 13, 5}), 6);
        assertEquals(Main.sum13(new int[]{1, 1}), 2);
        assertEquals(Main.sum13(new int[]{1, 2, 13, 3, 3}), 6);
    }

    @Test
    void testCenteredAverage() {
        assertEquals(Main.centeredAverage(new int[]{1, 2, 3, 4, 100}), 3);
        assertEquals(Main.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}), 5);
        assertEquals(Main.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}), -3);
    }

    @Test
    void testSum67() {
        assertEquals(Main.sum67(new int[]{1, 2, 2}), 5);
        assertEquals(Main.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}), 5);
        assertEquals(Main.sum67(new int[]{1, 1, 6, 7, 2}), 4);
        assertEquals(Main.sum67(new int[]{6, 7, 2}), 2);
        assertEquals(Main.sum67(new int[]{1, 6, 7, 6, 7}), 1);
        assertEquals(Main.sum67(new int[]{1, 6, 7, 2, 6, 99, 7}), 3);
        assertEquals(Main.sum67(new int[]{1, 6, 99, 7, 7}), 8);
        assertEquals(Main.sum67(new int[]{6, 7, 7}), 7);
    }

    @Test
    void testHas22() {
        assertTrue(Main.has22(new int[]{1, 2, 2}));
        assertFalse(Main.has22(new int[]{1, 2, 1, 2}));
        assertFalse(Main.has22(new int[]{1, 1, 2}));
    }
    
    @Test
    void testLucky13() {
        assertTrue(Main.lucky13(new int[]{0, 2, 4}));
        assertFalse(Main.lucky13(new int[]{1, 2, 3}));
        assertFalse(Main.lucky13(new int[]{1, 1, 4}));
    }
    
    @Test
    void testSum28() {
        assertTrue(Main.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(Main.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(Main.sum28(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testMore14() {
        assertTrue(Main.more14(new int[]{1, 4, 1}));
        assertFalse(Main.more14(new int[]{1, 4, 1, 4}));
        assertTrue(Main.more14(new int[]{1, 1}));
    }

    @Test
    void testFizzArray() {
        assertArrayEquals(Main.fizzArray(4), new int[]{0, 1, 2, 3});
        assertArrayEquals(Main.fizzArray(1), new int[]{0});
        assertArrayEquals(Main.fizzArray(10), new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
    
    @Test
    void testOnly14() {
        assertTrue(Main.only14(new int[]{1, 4, 1, 4}));
        assertFalse(Main.only14(new int[]{1, 4, 2, 4}));
        assertTrue(Main.only14(new int[]{1, 1}));
    }
    
    @Test
    void testFizzArray2() {
        assertArrayEquals(Main.fizzArray2(4), new String[]{"0", "1", "2", "3"});
        assertArrayEquals(Main.fizzArray2(1), new String[]{"0"});
        assertArrayEquals(Main.fizzArray2(10), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
    }

    @Test
    void testNo14() {
        assertTrue(Main.no14(new int[]{1, 2, 3}));
        assertFalse(Main.no14(new int[]{1, 2, 3, 4}));
        assertTrue(Main.no14(new int[]{2, 3, 4}));
    }
    
    @Test
    void testIsEverywhere() {
        assertTrue(Main.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(Main.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(Main.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
    }

    @Test
    void testEither24() {
      assertTrue(Main.either24(new int[]{1, 2, 2}));
      assertTrue(Main.either24(new int[]{4, 4, 1}));
      assertFalse(Main.either24(new int[]{4, 4, 1, 2, 2}));
    }

    @Test
    void testMatchUp() {
        assertEquals(Main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}), 2);
        assertEquals(Main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}), 3);
        assertEquals(Main.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}), 2);
    }
}
