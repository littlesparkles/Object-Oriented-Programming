public class ConcatTester {
	public static void main(String[] args) 
	{
		String animal1 = "quick brown fox"; 
		String animal2 = "lazy dog"; 
		String article = "the"; 
		String action = "jumps over"; 
		
		/* 명령문 추가는 이 아래에 하세요 */ 
		article = article.concat(" " + animal1).concat(" " + action).concat(" " + animal2);
		System.out.println(article);
		
	 }
}
