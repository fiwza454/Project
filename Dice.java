class Dice {
private static final int MAX_NUMBER = 6;
private static final int MIN_NUMBER = 1;
private static final int NO_NUMBER = 0;
private int number;
public Dice( ) {
number = NO_NUMBER;
}
//Rolls the dice
public void roll( ) {
number = (int) (Math.floor(Math.random() *
(MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER);
System.out.println(number);
}
//Returns the number on this dice
public int getNumber( ) {
return number;

}
}