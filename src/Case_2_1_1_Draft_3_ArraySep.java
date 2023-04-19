import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Case_2_1_1_Draft_3_ArraySep {
    // Кейс «Анализатор курса валют».
    // Задание 2. - Пользователь вводит месяц и год. Вывести курс рубля за этот месяц, найти наибольший и наименьшие значения
    // Инфо здесь: Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
    // https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
    public static void main(String[] args) throws IOException, ParseException {
//        03/2023 ""cv
//        [74.8932, 75.2513, 75.4729, 75.4592, 75.4728, 75.4577, 75.9028, 75.9406, 75.4609, 75.1927, 75.7457, 76.4095, 76.6044, 77.2422, 76.8373, 76.9561, 76.3072, 76.4479, 76.5662, 76.5939, 76.9781, 77.0863]

        Double[] array = {74.8932, 75.2513, 75.4729, 75.4592, 75.4728, 75.4577, 75.9028, 75.9406, 75.4609, 75.1927, 75.7457, 76.4095, 76.6044, 77.2422, 76.8373, 76.9561, 76.3072, 76.4479, 76.5662, 76.5939, 76.9781, 77.0863};
        List<Double> list = new ArrayList<>(Arrays.asList(array));

        System.out.println(list);
        System.out.println(list.get(1));

//        Нахождение наибольшего значения.
//        Задаем исходную переменную: от которой начинаем считать.
        Double min = list.get(0);
        Double max = list.get(0);
//        Задаем переменную: длина (или размер) массива.
        int n = list.size();

//        Задаем цикл перебора массива для поиска наибольшего и наименьшего значений.
        for (int i = 1; i < n; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        for (int i = 1; i < n; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Наибольшее значение курса : " + max);
        System.out.println("Наименьшее значение курса : " + min);


    }
}