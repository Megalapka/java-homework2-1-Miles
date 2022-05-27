/*
Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
Формула расчета следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
Дробные мили не начисляются.
 */
public class Main {
    public static void main(String[] args) {
        int cost = 1019;
        int rubsForMile = 20;
        int bonus = cost / rubsForMile;
        System.out.println(bonus + " бонус(ов) за купленный билет");
    }
}
