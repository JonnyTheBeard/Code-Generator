
/**
 * Write a description of class secret here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

class secretCode {

    private int check = 1;
    Scanner scan = new Scanner(System.in);
    private String secretCode = "";
    private String englishText = "";

    public void start(){
        System.out.println("Press 1 to enter text, 2 to enter code, or 0 to exit");
    }

    public void checkMode(){
        int mode = scan.nextInt();
        if(mode == 1){
            System.out.println("Enter text to be translated to secret code with no spaces or punctuation");
            scan.nextLine();
            String text = scan.nextLine();
            toCode(text);
        }else if(mode == 2){
            System.out.println("Enter secret code to be translated to text");
            scan.nextLine();
            String code = scan.nextLine();
            toText(code);
        }else if(mode == 0){
            check = 0;
        }else{
            System.out.println("Please select 1 or 2");
        }
    }
    
    public void run(){
        
        while( check != 0){
        start();
        checkMode();
        }
        
        if(check == 0){
            System.out.println("Goodbye");
        }
    }
    
    public String toCode(String s){
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); ++i){
            switch(s.charAt(i)){
                case 'a': secretCode = secretCode + "01";
                break;
                case 'b': secretCode = secretCode + "02";
                break;  
                case 'c': secretCode = secretCode + "03";
                break;
                case 'd': secretCode = secretCode + "04";
                break;
                case 'e': secretCode = secretCode + "05";
                break;
                case 'f': secretCode = secretCode + "06";
                break;
                case 'g': secretCode = secretCode + "07";
                break;
                case 'h': secretCode = secretCode + "08";
                break;
                case 'i': secretCode = secretCode + "09";
                break;
                case 'j': secretCode = secretCode + "10";
                break;
                case 'k': secretCode = secretCode + "11";
                break;
                case 'l': secretCode = secretCode + "12";
                break;
                case 'm': secretCode = secretCode + "13";
                break;
                case 'n': secretCode = secretCode + "14";
                break;
                case 'o': secretCode = secretCode + "15";
                break;
                case 'p': secretCode = secretCode + "16";
                break;
                case 'q': secretCode = secretCode + "17";
                break;
                case 'r': secretCode = secretCode + "18";
                break;
                case 's': secretCode = secretCode + "19";
                break;
                case 't': secretCode = secretCode + "20";
                break;
                case 'u': secretCode = secretCode + "21";
                break;
                case 'v': secretCode = secretCode + "22";
                break;
                case 'w': secretCode = secretCode + "23";
                break;
                case 'x': secretCode = secretCode + "24";
                break;
                case 'y': secretCode = secretCode + "25";
                break;
                case 'z': secretCode = secretCode + "26";
                break;
                case ' ': secretCode = secretCode + "27";
            }
        }

        System.out.println("Your text translates to: " + secretCode);
        secretCode = "";
        return secretCode;
    }
    
    public String toText(String s){
        for(int i = 0; i < s.length() - 1; ++i){
            switch (s.substring(i, i + 2)){
                case "01": englishText = englishText + "a";
                break;
                case "02": englishText = englishText + "b";
                break;  
                case "03": englishText = englishText + "c";
                break;
                case "04": englishText = englishText + "d";
                break;
                case "05": englishText = englishText + "e";
                break;
                case "06": englishText = englishText + "f";
                break;
                case "07": englishText = englishText + "g";
                break;
                case "08": englishText = englishText + "h";
                break;
                case "09": englishText = englishText + "i";
                break;
                case "10": englishText = englishText + "j";
                break;
                case "11": englishText = englishText + "k";
                break;
                case "12": englishText = englishText + "l";
                break;
                case "13": englishText = englishText + "m";
                break;
                case "14": englishText = englishText + "n";
                break;
                case "15": englishText = englishText + "o";
                break;
                case "16": englishText = englishText + "p";
                break;
                case "17": englishText = englishText + "q";
                break;
                case "18": englishText = englishText + "r";
                break;
                case "19": englishText = englishText + "s";
                break;
                case "20": englishText = englishText + "t";
                break;
                case "21": englishText = englishText + "u";
                break;
                case "22": englishText = englishText + "v";
                break;
                case "23": englishText = englishText + "w";
                break;
                case "24": englishText = englishText + "x";
                break;
                case "25": englishText = englishText + "y";
                break;
                case "26": englishText = englishText + "z";
                break;
                case"27": englishText = englishText + " ";
                break;
            }
            ++i;
        }
        
        System.out.println("Your code tranlates to: " + englishText);
        englishText = "";
        return englishText;
    }

  
  
  
    public static void main(String[] args) {
        secretCode test = new secretCode();

        test.run();
        

    }
}
