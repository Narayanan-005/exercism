class SqueakyClean {
    static String clean(String identifier) {
        String res="";
        for(int i=0;i<identifier.length();i++){
            if(identifier.charAt(i)==' '){
                res+="_";
            }else if(identifier.charAt(i)=='-'){
                res+=(""+identifier.charAt(i+++1)).toUpperCase();
            }else if(identifier.charAt(i)=='0'){
                res+="o";
            }else if(identifier.charAt(i)=='1'){
                res+="l";
            }else if(identifier.charAt(i)=='3'){
                res+="e";
            }else if(identifier.charAt(i)=='4'){
                res+="a";
            }else if(identifier.charAt(i)=='7'){
                res+="t";
            }else if(Character.isLetter(identifier.charAt(i))){
                res+=identifier.charAt(i);
            }
        }
        return res;
    }
}
