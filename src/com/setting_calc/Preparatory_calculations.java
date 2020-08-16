package com.setting_calc;

import java.util.Scanner;

import static com.setting_calc.Arabtorome.list_num_rome;
import static com.setting_calc.Calculations_arab_or_rome.arabic_answer;
import static com.setting_calc.Calculations_arab_or_rome.rome_answer;

public class Preparatory_calculations {

    public static void main(String[] args){

    }


    //вводим нашу задачу
    public static String data_input(){

        Scanner input = new Scanner(System.in);
        Arabtorome rome = new Arabtorome();
        String calc_input = input.nextLine();
        calc_input = calc_input.replaceAll("\\s",""); //удаляет все пробелы из строки
        
        return calc_input;
    }


    //Определяем символ в строке
    public static char defining_the_symbol(String info_input){
        char symbol = ' ';//наш математический символ
        int check_num_symb = 0;//для подсчета математических символов
        String[] check_symbol = info_input.split("");//делаем массив из info_input

        for(int i = 0; i < check_symbol.length; i++) {
            if(check_symbol[i].equals("+") || check_symbol[i].equals("-") ||
                    check_symbol[i].equals("*") || check_symbol[i].equals("/")) {
                check_num_symb += 1;
            }
        }//Делаем перебор массива для подсчета математических символов

        if(check_num_symb == 0) {
            System.out.println("Вы не ввели математический символ");
            System. exit(0);//выход из программы
        }else if(check_num_symb >= 2) {
            System.out.println("Вы ввели 2 или больше математических символов");
            System. exit(0);//выход из программы
        }//остановка программы при невыполненном условии

        /*Узнаем какой символ в строке*/
        for(int i = 0; i < check_symbol.length; i++) {
            if(check_symbol[i].equals("+")) {
                symbol = check_symbol[i].charAt(0);
            }else if(check_symbol[i].equals("-")) {
                symbol = check_symbol[i].charAt(0);
            }else if(check_symbol[i].equals("*")) {
                symbol = check_symbol[i].charAt(0);
            }else if(check_symbol[i].equals("/")) {
                symbol = check_symbol[i].charAt(0);
            }
        }
        return symbol;
    }


    //Ищем наши цифры
    public static String[] Looking_our_num_mass(String info_input, char symbol){
        String first_str_num = "";
        String second_str_num = "";
        if(symbol == '+'){
            String[] init_str_num = info_input.split("\\+");
            first_str_num = init_str_num[0];
            second_str_num = init_str_num[1];
        }else if(symbol == '-'){
            String[] init_str_num = info_input.split("\\-");
            first_str_num = init_str_num[0];
            second_str_num = init_str_num[1];
        }else if(symbol == '*'){
            String[] init_str_num = info_input.split("\\*");
            first_str_num = init_str_num[0];
            second_str_num = init_str_num[1];
        }else if(symbol == '/'){
            String[] init_str_num = info_input.split("\\/");
            first_str_num = init_str_num[0];
            second_str_num = init_str_num[1];
        }
        return new String[] {first_str_num, second_str_num};
    }


    //Проверяем наличие Римских цифр и возвращает их число;
    public static int checking_Roman_num(String[] massive_info_input){
        String[] num_rome = list_num_rome();//создаем массив из римских цифр
        int rome_check = 0;
        for(String x : num_rome){
            if(x.equals(massive_info_input[0])){
                rome_check += 1;
            }
            if(x.equals(massive_info_input[1])) {
                rome_check += 1;
            }
        }//перебираем масив num_rome и сравниваем с нашими цифрами в строчном формате для определения нашего условия
        return rome_check;
    }


    //учитывает значение rome_check и выбираем путь вычисления
    public static String calculation_path(int number_of_Roman, String[] massive_info_input, char symbol){
        int answer_num_arab = 0;
        String answer_num_str = "";
        try {
            if (number_of_Roman == 2){
                answer_num_str = rome_answer(massive_info_input[0], massive_info_input[1], symbol);
            }else if(number_of_Roman == 1){
            System.out.println("Данные по цифрам введены некорректно, попробуйте ввести только арабские или только римские цифры");
            System.exit(0);
        }else if(number_of_Roman == 0){
                answer_num_arab = arabic_answer(massive_info_input[0], massive_info_input[1], symbol);
                answer_num_str = Integer.toString(answer_num_arab);
            }
        }catch (Exception e){
            System.out.println("Обратитесь к администратору");
            System.exit(0);
        }

        return answer_num_str;
    }


}
