package JavaCore.HW4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Человек-Паук");
        wordList.add("Бэтман");
        wordList.add("Человек-Паук");
        wordList.add("Робин");
        wordList.add("Бэтман");
        wordList.add("Сорвиголова");
        wordList.add("Плющь");
        wordList.add("Аквамен");
        wordList.add("Рассомаха");
        wordList.add("Осминог");
        wordList.add("Блэйд");
        wordList.add("Каратель");
        wordList.add("Человек-Паук");

        countUniqueWordsIn(wordList);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhoneName("Человек Паук","831-60-98");
        phoneBook.addPhoneName("Кошка","555-66-99");
        phoneBook.addPhoneName("Человек Паук","789-66-88");
        phoneBook.addPhoneName("Блэйд","256-98-45");
        phoneBook.addPhoneName("Крэйвен","546-97-85");
        phoneBook.addPhoneName("Кошка","555-55-66");

        System.out.println("Телефон Паучка " + phoneBook.getPhonesBy("Человек Паук"));
        System.out.println("Телефон Кошки " + phoneBook.getPhonesBy("Кошка"));
        System.out.println("Телефон Блэйда " + phoneBook.getPhonesBy("Блэйд"));
        System.out.println("Телефон Крэйвена " + phoneBook.getPhonesBy("Крэйвен"));


    }

    public static void countUniqueWordsIn(ArrayList<String> array) {
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firstTimeSee = 1;
        for (String word : array) {
            if (wordsToCount.containsKey(word)) {
                int count = wordsToCount.get(word);
                wordsToCount.put(word, count + 1);
            } else {
                wordsToCount.put(word, firstTimeSee);
            }
        }
        System.out.println("Вывод уникальных слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            if (wordEntry.getValue() == firstTimeSee) {
                System.out.println(wordEntry.getKey());
            }
        }

        System.out.println("Вывод повторений слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            System.out.println(wordEntry.getKey() + " : " + wordEntry.getValue());
        }
    }
}
