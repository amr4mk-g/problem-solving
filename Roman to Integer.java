class Solution {
    public int romanToInt(String s) {
        int n=0;
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                   if(i==s.length()-1){n+=1;} else{
                   if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')
                   {n-=1;} else{n+=1;}}
                break;   
                case 'V':
                   n+=5;
                break;
                case 'X':
                   if(i==s.length()-1){n+=10;} else{
                   if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')
                   {n-=10;} else{n+=10;}}
                break;
                case 'L':
                   n+=50;
                break;
                case 'C':
                   if(i==s.length()-1){n+=100;} else{
                   if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')
                   {n-=100;} else{n+=100;}}
                break;
                case 'D':
                   n+=500;
                break;
                case 'M':
                   n+=1000;
                break;
        }}
        return n;
    }
}