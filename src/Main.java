import org.omg.Messaging.SyncScopeHelper;

import java.awt.peer.ListPeer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // 조 추첨을 위한 데이터를 list에 삽입
        SetForDraw sfd = new SetForDraw();
        sfd.addList();

        // 데이터 확인
        System.out.println(sfd.list1.size());
        System.out.println(sfd.list1.get(0).toString());

        // 랜덤 추출 - 우선 1포트만
        Iterator<DataForDraw> iterator = sfd.list1.iterator();
        while(iterator.hasNext()) {
            DataForDraw element = iterator.next();
            System.out.println(element);
        }




    }
}