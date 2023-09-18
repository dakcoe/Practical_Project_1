import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    static ArrayList<Word> list; //last test
    static Scanner s;
    final String fname = "Dictionary.txt";
    WordCRUD(Scanner s){
        list =  new ArrayList<>();
        this.s=s;
    }
    @Override
    public Object add() {
        Scanner s = new Scanner(System.in);
        System.out.println("난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);
    }

    public void addItem() {
        Word one = (Word)add();
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

    public ArrayList<Integer> listAll(String keyword) {

        ArrayList<Integer> idlist = new ArrayList<>();
        int j = 0;
        System.out.println("_____________________________");
        for(int i = 0; i<list.size(); i++){
            String word = list.get(i).getWord();
            if(!word.contains(keyword)) continue;
            System.out.print((j+1) + " ");
            System.out.println(list.get(i).toString());
            idlist.add(i);
            j++;
        }
        System.out.println("_____________________________");
        return idlist;
    }


    public void updateItem() {
        System.out.print("=> 수정할 단어 검색 : ");
        String keyword = s.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.print("=> 수정할 번호 선택 : ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("=> 뜻 입력 : ");
        String meaning = s.nextLine();
        Word word = list.get(idlist.get(id-1));
        word.setMeaning(meaning);
        System.out.print("단어가 수정되었습니다.\n");
    }

    public void deleteItem() {
        System.out.print("=> 삭제할 단어 검색 : ");
        String keyword = s.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.print("=> 삭제할 번호 선택 : ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("=>정말로 삭제하시겠습니까? (y/n) : ");
        String ans = s.next();
        if(ans.equalsIgnoreCase("y")) {
            list.remove((int)idlist.get(id-1));
            System.out.print("단어가 삭제되었습니다.\n");
        }else
            System.out.print("취소되었습니다.\n");
    }
}

