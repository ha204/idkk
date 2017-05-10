import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {
	
	@Test
	public void testCondition1(){
	BlackJack testing = new BlackJack();
	assertEquals(21, testing.condition(1, 21));
	}
	@Test
	public void testCondition2(){
		BlackJack testing = new BlackJack();
		assertEquals(0, testing.condition(22,22));
	}
	@Test
	public void testConition3(){
		BlackJack redBalloon = new BlackJack();
		assertEquals(num1, redBalloon.condition(21, 1));
	}
}