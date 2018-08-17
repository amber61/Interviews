

public String ReverseWord(String s) {

	StringBuilder sb = new StringBuilder();

	for(int i=s.length(); i>0; i--) {
		sb.append(s.substring(i-1, i)); 		
	}
	return sb.toString();
}
