import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SetDataForDraw sdfd = new SetDataForDraw();
        Scanner scan = new Scanner(System.in);

        System.out.println("23/24 Season UEFA Champions League Draw ");
        System.out.println();
        sdfd.setList();
        sdfd.setShuffle();

        System.out.println("조 추첨을 시작합니다.");
        System.out.println("각 포트 순서로 추첨을 진행합니다. ==> " + scan.nextLine());
       
        String y = scan.nextLine();
        sdfd.drawPort1(y);

        System.out.println("커밋 테스트1");
        System.out.println("커밋 테스트1");

        // y = scan.nextLine();
        // sdfd.drawPort2(y);
        
        // y = scan.nextLine();
        // sdfd.drawPort3(y);
        
        // y = scan.nextLine();
        // sdfd.drawPort4(y);



        sdfd.showResult();

    }
}