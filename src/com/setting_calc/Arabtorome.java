package com.setting_calc;

public class Arabtorome {

    /*создание массива римских цифр*/
    public static String[] list_num_rome(){
        String[] num_example_rome = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII",
                "XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII",
                "XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII",
                "XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII",
                "LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII",
                "LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV",
                "LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};//excel and word)
        return num_example_rome;
    }


    /*перевод из римской цифры в арабскую*/
    public static int rome_to_arab(String rome_numeral) {
        String[] list_n = list_num_rome();
        int Arabic_int = 0;
        for (int i = 0; i < list_n.length; i++) {
            if (rome_numeral.equals(list_n[i])) {
                Arabic_int = i+1;

            }

        }
        return Arabic_int;
    }


    /*перевод из арабской цифры в римскую*/
    public static String ArabToRome(int rome_num_int){
        String rome_nums = "";
        String[] num_example_rome = list_num_rome();
        if (rome_num_int > 0){
            rome_nums = num_example_rome[rome_num_int-1];
        }else if(rome_num_int<0){
            rome_num_int *= -1;
            rome_nums = num_example_rome[rome_num_int-1];
            rome_nums = "-" + rome_nums;
        }

        return rome_nums;
    }

    public static void main(String[] args){

        }



}