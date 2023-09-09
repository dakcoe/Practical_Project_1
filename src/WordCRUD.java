import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list; //ming
    Scanner s;
    WordCRUD(Scanner s){
        list =  new ArrayList<>();
        this.s=s;
    }
    @Override
    public Object add() {
        System.out.println("난이도(1,2,3) & 새 단어 입력 : ");
        System.out.println("뜻 입력 : ");
        return null;
    }

    public void addWord() {

    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
