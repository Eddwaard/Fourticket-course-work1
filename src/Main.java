import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] serialNumber = {"Первый", "Второй", "Третий", "Четвертый", "Второй", "Пятый", "Шесстой", "Третий", "Седьмой", "Первый",};
        System.out.println(Arrays.toString(serialNumber));

        for (int i = 0; i < serialNumber.length-1; i++) {
            for (int i1 = i+1; i1 < serialNumber.length; i1++) {
                if (serialNumber[i].equals(serialNumber[i1])) {
                    serialNumber[i1] = "";
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(Arrays.toString(serialNumber));
    }
}