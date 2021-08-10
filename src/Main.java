
//############ CHALLENGE 1 ######################


import java.util.*;

//public class Program {
//    public static int[] arrayOfMultiples(int num, int length) {
//        int[] result = new int[length];
//        for (int i = 0; i < length; i++){
//            result[i] = (num * (i + 1));
//        }
//        return result;
//    }
//}


//############ CHALLENGE 2 ######################



//public class Challenge {
//    public static int[][] squarePatch(int n) {
//        int[][] result = new int[n][n];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                result[i][j] = n;
//            }
//        }
//        return result;
//    }
//}


//############ CHALLENGE 3 ######################

//public class Challenge {
//    public static String specialReverseString(String str) {
//        StringBuilder result = new StringBuilder(str.toLowerCase().replaceAll(" ", "")).reverse();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                result.insert(i, " ");
//            }else {
//                if (Character.isUpperCase(str.charAt(i))) {
//                    result.replace(i, i + 1, Character.toString(Character.toUpperCase(result.charAt(i))));
//                }
//            }
//        }
//        return result.toString();
//    }
//}


//############ CHALLENGE 4 ######################

public class Challenge {
    public static String atbash(String str) {
        String[] stringArray = str.split("");
        String result = "";
        for(int i = 0; i < stringArray.length; i++){
            switch(stringArray[i])
            {
                case "a":
                    result += "z";
                    break;
                case "b":
                    result += "y";
                    break;
                case "c":
                    result += "x";
                    break;
                case "d":
                    result += "w";
                    break;
                case "e":
                    result += "v";
                    break;
                case "f":
                    result += "u";
                    break;
                case "g":
                    result += "t";
                    break;
                case "h":
                    result += "s";
                    break;
                case "i":
                    result += "r";
                    break;
                case "j":
                    result += "q";
                    break;
                case "k":
                    result += "p";
                    break;
                case "l":
                    result += "o";
                    break;
                case "m":
                    result += "n";
                    break;
                case "n":
                    result += "m";
                    break;
                case "o":
                    result += "l";
                    break;
                case "p":
                    result += "k";
                    break;
                case "q":
                    result += "j";
                    break;
                case "r":
                    result += "i";
                    break;
                case "s":
                    result += "h";
                    break;
                case "t":
                    result += "g";
                    break;
                case "u":
                    result += "f";
                    break;
                case "v":
                    result += "e";
                    break;
                case "w":
                    result += "d";
                    break;
                case "x":
                    result += "c";
                    break;
                case "y":
                    result += "b";
                    break;
                case "z":
                    result += "a";
                    break;
                case "A":
                    result += "Z";
                    break;
                case "B":
                    result += "Y";
                    break;
                case "C":
                    result += "X";
                    break;
                case "D":
                    result += "W";
                    break;
                case "E":
                    result += "V";
                    break;
                case "F":
                    result += "U";
                    break;
                case "G":
                    result += "T";
                    break;
                case "H":
                    result += "S";
                    break;
                case "I":
                    result += "R";
                    break;
                case "J":
                    result += "Q";
                    break;
                case "K":
                    result += "P";
                    break;
                case "L":
                    result += "O";
                    break;
                case "M":
                    result += "N";
                    break;
                case "N":
                    result += "M";
                    break;
                case "O":
                    result += "L";
                    break;
                case "P":
                    result += "K";
                    break;
                case "Q":
                    result += "J";
                    break;
                case "R":
                    result += "I";
                    break;
                case "S":
                    result += "H";
                    break;
                case "T":
                    result += "G";
                    break;
                case "U":
                    result += "F";
                    break;
                case "V":
                    result += "E";
                    break;
                case "W":
                    result += "D";
                    break;
                case "X":
                    result += "C";
                    break;
                case "Y":
                    result += "B";
                    break;
                case "Z":
                    result += "A";
                    break;
                default:
                    result += stringArray[i];
            }
        }
        return result;
    }
}