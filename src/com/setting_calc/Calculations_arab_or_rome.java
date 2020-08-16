package com.setting_calc;

import static com.setting_calc.Arabtorome.*;

public class Calculations_arab_or_rome {

    //расчет для Римских цифр
    public static String rome_answer(String rome_num_one, String rome_num_two, char symbol_rome){
        String rome_ans_str = "";
        int arab_ans_int = 0;
        int rome_one = 0;
        int rome_two = 0;
        char symbol_for_rome = ' ';
        try{
            rome_one = rome_to_arab(rome_num_one);
            rome_two = rome_to_arab(rome_num_two);
            symbol_for_rome = symbol_rome;
        }catch (Exception e){
            System.out.println("Неверно введены цифры или обратитесь к администратору");
            System.exit(0);
        }finally {
            if(rome_one <= 10 && rome_two <= 10){
                if(symbol_for_rome == '+'){
                    arab_ans_int = rome_one + rome_two;

                }else if(symbol_for_rome == '-'){
                    arab_ans_int = rome_one - rome_two;

                }else if(symbol_for_rome == '/'){
                    try{
                        arab_ans_int = rome_one / rome_two;

                    }catch (Exception e){
                        System.out.println("Делить на ноль нельзя или обратитесь к администратору");
                        System.exit(0);
                    }
                }else if(symbol_for_rome == '*'){
                    arab_ans_int = rome_one * rome_two;

                }
            }else if(rome_one > 10 || rome_two > 10){
                System.out.println("Вы ввели число(а) больше 10");
                System.exit(0);
            }else{
                System.out.println("Неверно выполнены условия, введите римские цифры и правильный символ");
            }
        }


        rome_ans_str = ArabToRome(arab_ans_int);

        return rome_ans_str;
    }

    //Расчет для арабских цифр
    public static int arabic_answer(String rome_num_one, String rome_num_two, char symbol_rome){
        int arab_ans_int = 0;
        int arab_one = 0;
        int arab_two = 0;
        char symbol_for_arab = ' ';

        try {
            arab_one = Integer.parseInt(rome_num_one);
            arab_two = Integer.parseInt(rome_num_two);
            symbol_for_arab = symbol_rome;
        }catch (Exception e){
            System.out.println("Неверно введены цифры или обратитесь к администратору");
            System.exit(0);
        }finally {
            if(arab_one <= 10 && arab_two <= 10){
                if(symbol_for_arab == '+'){
                    arab_ans_int = arab_one + arab_two;

                }else if(symbol_for_arab == '-'){
                    arab_ans_int = arab_one - arab_two;

                }else if(symbol_for_arab == '/'){
                    try{
                        arab_ans_int = arab_one / arab_two;

                    }catch (Exception e){
                        System.out.println("Делить на ноль нельзя или обратитесь к администратору");
                        System.exit(0);
                    }
                }else if(symbol_for_arab == '*'){
                    arab_ans_int = arab_one * arab_two;

                }
            }else if(arab_one > 10 || arab_two > 10){
                System.out.println("Вы ввели число(а) больше 10");
                System.exit(0);
            }
        }
        return arab_ans_int;
    }

    public static void main(String[] args){

    }
}
