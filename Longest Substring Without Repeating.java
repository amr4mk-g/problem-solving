class Solution {
    public int lengthOfLongestSubstring(String s) { 
      String y="",l="";
    for(int i=0; i<s.length(); i++){
     if(y!=null){
    	char e=s.charAt(i);
        if(y.indexOf(e)==-1){
        y=y+e;
        }else{
        if(y.length()>l.length()){l=y;}	
         y=y.substring(y.indexOf(e)+1)+e+"";
        }}else{y=s.charAt(i)+"";}
       }
	if(y.length()>l.length()){l=y;}
        return l.length();   
       }
}