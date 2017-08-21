package ZadaniaDomowe;

public class Zad2_Flamaster {
    public static void main(String[] args) {
        String[] input = new String[]{"Nazwa Alg", "OPSS", "ABCDEF", "ABBCCCDDDDEEEEE"};

        for (int i = 1; i < input.length; i++) {

            String word = input[i]; //Zapisujemy do zmiennej word aktualnie przetwarzane słowo
            StringBuilder text = new StringBuilder(word);
            String result = "";

            while (text.length() != 0) {
                int count = 0;
                char test = text.charAt(0);

                while (text.indexOf(test + "") != -1) {
                    text.deleteCharAt(text.indexOf(test + ""));
                    count++;
                }
                result = result + test + count;
            }
            System.out.printf("%s \n", result);
        }
    }
}

// Napisz jeszcze jedna pętle while która bedzie przechodzić po wszystkich znakach i jak zobaczy zmiane znamu to ...
