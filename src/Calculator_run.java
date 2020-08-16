import static com.setting_calc.Preparatory_calculations.*;

public class Calculator_run {
    public static void main(String[] args) {
        String info_data_input = "";//наша задача
        char symbol =' ';//наш математический символ
        String[] our_nums_str_mass = {};//массив из str наших цифр
        int rome_check_nums = 0;//cколько римских цифр в массиве our_nums_str_mass
        String answer_num_str = "";// наш ответ

        info_data_input = data_input();//Вводим нашу задачу
        symbol = defining_the_symbol(info_data_input);//находим наш математический символ
        our_nums_str_mass = Looking_our_num_mass(info_data_input, symbol);//находим наши цифры и добавляем их в массив
        rome_check_nums = checking_Roman_num(our_nums_str_mass);//проверяем cколько римских цифр в массиве our_nums_str_mass
        answer_num_str = calculation_path(rome_check_nums, our_nums_str_mass, symbol);//в зависимости от числа римских цифр, выбирает путь вычисления

        System.out.println(answer_num_str);











    }
}
