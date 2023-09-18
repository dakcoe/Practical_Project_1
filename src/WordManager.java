import java.util.Scanner;

public class WordManager {
    static Scanner s = new Scanner(System.in);
    static WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public static int selectMenu(){
        System.out.print("""
                *** 영단어 마스터 ***
                ******************
                1. 모든 단어 보기
                2. 수준별 단어 보기
                3. 단어 검색
                4. 단어 추가
                5. 단어 수정
                6. 단어 삭제
                7. 파일 저장
                0. 나가기
                ******************
                => 원하는 메뉴는?\s""");
        return s.nextInt();
    }
    public static void start() {

        wordCRUD.loadFile();
        while (true) {
            int menu = selectMenu();
            if(menu==0) break;
            if(menu==1){
                //all-list
                wordCRUD.listAll();
            } else if (menu==2) {
                //level-list
                wordCRUD.searchLevel();
            } else if (menu==3) {
                //search
                wordCRUD.searchWord();
            } else if (menu==4) {
                //add-word
                wordCRUD.addItem();
            } else if (menu==5) {
                //change
                wordCRUD.updateItem();
            } else if (menu==6) {
                //remove
                wordCRUD.deleteItem();
            } else if (menu==7) {
                //save
                wordCRUD.saveFile();
            }
        }
    }

}
