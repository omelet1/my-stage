import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UEFACommissioner member = new UEFACommissioner("진행요원");
        UEFACommissioner commissioner = new UEFACommissioner("프란체스코 토티");

        member.dividePort();
        member.setShuffle();

        commissioner.drawPort1();
//        commissioner.drawPort2();
//        commissioner.drawPort3();
//        commissioner.drawPort4();

//        member.showResult();

    }
}