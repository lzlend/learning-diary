package character;

public class CharacterTest {
    public static void main(String[] args) {
        //包装类Character为什么会出现警告？
        Character ch = 'A';
        Character chater = new Character('B');
        System.out.println(Character.isLetter(ch));
        //为何是Character类名来调用？
        System.out.println(chater.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isWhitespace(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.toString(ch));
        System.out.println("------------------------------");
        System.out.println(Character.isLetter(chater));
        System.out.println(Character.isDigit(chater));
        System.out.println(Character.isWhitespace(chater));
        System.out.println(Character.isUpperCase(chater));
        System.out.println(Character.isLowerCase(chater));
        System.out.println(Character.toUpperCase(chater));
        System.out.println(Character.toLowerCase(chater));
        System.out.println(Character.toString(chater));

    }
}
