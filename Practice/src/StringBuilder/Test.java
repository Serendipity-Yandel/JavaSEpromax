package StringBuilder;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2020, 0504, 1101};
        Order order = new Order(arr[0], arr[1], arr[2]);
        System.out.println( order.getYear() + ""+ order.getMonthday()
                +""+ order.getSecond());
    }
}
