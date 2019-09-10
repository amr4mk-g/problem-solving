class Solution {
    public int reverse(int x) {
       if(x==0){return 0;}
       String t=(x+"").replace("-", "");
	   String d="";
       for(int i=t.length()-1; i>=0; i--){
    	  if(t.charAt(i)!='0'||!d.equals(""))
          {d=d+(t.charAt(i));}
        }
        if((x+"").charAt(0)=='-'){d="-"+d;}
       try{return Integer.parseInt(d);} 
        catch(Exception e){return 0;}
    }
}