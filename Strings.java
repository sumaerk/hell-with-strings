class Strings {

	public static void main(String[] args) {
		// String str = new String("A string");
		// String s = "A string";

		// if (str.equals(s)) {
		// 	System.out.println("A");
			
		// }else{
		// 	System.out.println("B");
		// }

		//return 2
		//System.out.println(count("people", "e"));
		//System.out.println(hasAnA("pineapple", "a"));
		System.out.println(isAbecedarian("abcde"));
	}

	public static int count (String s, String t){
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(t.equals(s.substring(i, i+1))){
				count ++;
			}
			
		}
		return count;
	}

	public static boolean hasAnA(String s, String c){
		for (int i = 0; i < s.length(); i++) {
			if(c.equals(s.substring(i, i+1))){
				return true;
			}else{
				return false;
			}

			
		}
	}

	public static boolean isAbecedarian(String str){
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < str.charAt(i + 1)) {
				return true;
			} else {
			return false;
			}
		}

	}
	
}