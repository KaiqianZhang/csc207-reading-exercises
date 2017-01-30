/**
 * 
 */

/**
 * @author zhangkai17
 *
 */
public class StringMethods {
	public static boolean endsWithRep(String s1, String s2, int n){
		String newSuffix = s2;
		for (int i = 0; i < (n - 1); i++){
			newSuffix += s2; 
		}
		return s1.endsWith(newSuffix);
	}
	
	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));
		System.out.println(endsWithRep("foobarbar", "ba2", 1));
	}

}
