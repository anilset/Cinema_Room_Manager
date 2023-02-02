import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// put your code here
        List<String> list = new ArrayList<>(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
        List<String> listSorted = new ArrayList<>(list);
        Collections.sort(listSorted);
        System.out.println(listSorted.equals(list));

    }
}