import java.util.*;


    public class Home_Work3 {
        public static void main(String[] args) {
            number1();
            System.out.println("++++++++++++++++++++++++++++++++++");
            number2();

        }

        private static void number1() {
            List<String> cities = Arrays.asList("Москва", "Вологда", "Казань", "Мурманск", "Саратов", "Пенза",
                    "Самара", "Оренбург", "Екатеринбург", "Нижний Тагил", "Балахна", "Киров", "Саратов", "Пенза");
            System.out.println("Список городов: ");
            cities.forEach(System.out::println);

            System.out.println("_______________________________");
            System.out.println("Колличество элементов в списке: ");


            Map<String, Integer> wordsCount = new HashMap<>();
            for (String s : cities) {
                wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
            }
            for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
            System.out.println("____________________ ");
            System.out.println("Города без повторов: ");

            Set<String> unique = new HashSet<>(cities);
            unique.forEach(System.out::println);

        }


        private static void number2() {

            TelephoneDirectory telephonedirectory = new TelephoneDirectory();

            telephonedirectory.add("Mihael", "123456");
            telephonedirectory.add("Mihael", "654321");
            telephonedirectory.add("Kostya", "5231364");
            telephonedirectory.add("Zahar", "987254");
            telephonedirectory.add("Sasha", "854756");

            System.out.println(telephonedirectory.get("Mihael"));
            System.out.println(telephonedirectory.get("Sasha"));
            System.out.println(telephonedirectory.get("Kostya"));
            System.out.println(telephonedirectory.get("Zahar"));
            System.out.println(telephonedirectory.get("Aleksey"));

        }

    }


