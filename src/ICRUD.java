import java.util.Scanner;

public interface ICRUD {
    public static Object add() {
        Scanner s = new Scanner(System.in);
        System.out.println("난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);
    }

    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}