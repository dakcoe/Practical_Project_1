import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    static ArrayList<Word> list; //last test
    static Scanner s;
    WordCRUD(Scanner s){
        list =  new ArrayList<>();
        this.s=s;
    }


    public static void addWord() {
        Word one = (Word)ICRUD.add();
        list.add(one);
        System.out.println("단어장에 새 단어가 추가되었습니다.");
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

    public void listAll() {
        System.out.println("_____________________________");
        for(int i = 0; i<list.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("_____________________________");
    }


}
