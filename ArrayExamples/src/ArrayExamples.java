public class ArrayExamples {
    public static void main(String[] args) {
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] deck = new String [suits.length * rank.length];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " of " + suits[j];
                System.out.println(rank[i] + " of " + suits[j]);

            }

        }
        int numberOfCards = deck.length;
        for (int i = 0; i < numberOfCards; i++) {
            int randomCardNumber = i + (int) (Math.random() * (numberOfCards - i));
            String temp = deck[randomCardNumber];
            deck [randomCardNumber] = deck[i];
            deck[i] = temp;
        }
        System.out.println("--------------------------");
        for (int i = 0; i < numberOfCards; i++) {
            System.out.println(deck[i]);
        }
    }

}
