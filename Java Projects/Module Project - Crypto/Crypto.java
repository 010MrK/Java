public class Crypto {

public static void main(String[]args){
    String text = "This is some \\\"really\\\" great. (Text)!?";
    String normalizedText = normalizeText(text);
    System.out.println(caesar(normalizedText,2));
    System.out.println(normalizedText);
}

static String normalizeText(String text){
    text = text.replace(" ","").replaceAll("[^A-Za-z]+","").toUpperCase();
    return text;
}

static String caesar(String text, int key){
    String shiftedStr = shift(key);
    String normalStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String result = "";
    for(int i=0; i<text.length(); i++){
        char currChar = text.charAt(i);
        char shiftedChar = shiftedStr.charAt(normalStr.indexOf(currChar));
        result=result+shiftedChar;
    }
    return result;
}

static String gropify(String text, int space){
    if(text.length()<=space){
        return text;
    }else{
        //while(){
        //    text = text+"x";
        //}
        String shortStr = text.substring(0,space);
        text = text.substring(space);
        while(text.length()<space&&text.length()>0){
            text=text+"x";
        }

        return shortStr+" "+gropify(text, space);
    }

}

static String shift(int key){
    int start=0;
    if(key>0){
        start = (int)'A'+key;
    }else if(key<0){
        start = (int)'Z'+key;
    }
    String resultstr="";
    char currChar = (char)start;
    while(currChar<='Z'){
        resultstr=resultstr+currChar;
        currChar++;
    }
    currChar='A';
    while(resultstr.length()<26){
        resultstr+=currChar;
        currChar++;
    }
    return resultstr;
}

}