package io.github.mariazevedo88.javaoca.chp.three.caelum.operators;

/**
 * @author Mariana Azevedo
 * @since 23/06/2019
 * 
 * Question 1.3.5 (page 119) - The following expression can be reduced, how can we do it?
 * 
 * if ((train && !car) || (!train && car)) {
 *   // ...
 * } 
 * 
 * a) Switching to use an operator & and |.
 * b) Switching to use two operators & and |.
 * c) Switching to use an operator ! and a ^.
 * d) Switching to use an operator a ^. (x)
 * e) Removing parentheses.
 * f) Removing the || the middle one.
 * g) Removing the !.
 */
class Question05 {
	public static void main(String[] args) {
		boolean car = true; boolean train = false;
		if ((train && !car) || (!train && car)) {
		   // ...
		} 
		//if(train ^ car) {
		//	System.out.println("Teste");
		//}
	}
}
