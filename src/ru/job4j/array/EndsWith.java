package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        for (int i = 0; i < word.length; i++) {
            if (i >= post.length) {
                break;
            }

            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}