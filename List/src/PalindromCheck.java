
public class PalindromCheck {
    static boolean palindrome(String str) {
        str = str.toLowerCase().replaceAll("[^а-яёА-ЯЁ0-9]", ""); // Приводим строку к нижнему регистру и удаляем все, кроме букв и цифр
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Если символы не совпадают, строка не палиндром
            }
            left++;
            right--;
        }
        return true; // Если все символы совпали, строка палиндром
    }

    public static void main(String[] args) {
        String palindrome = "А в Енисее - синева";
        String nonPalindrome = "Сон";

        System.out.println("\"" + palindrome + "\" Это палиндром: " + palindrome(palindrome));
        System.out.println("\"" + nonPalindrome + "\" Это палиндром: " + palindrome(nonPalindrome));
    }
}

