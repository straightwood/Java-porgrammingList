package chapter7;

//±¸ÓÃÀà
public class RandomCharacter {
	public static char getRandomCharacter(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
		/**Get random lower case*/
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
}
