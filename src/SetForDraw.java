import java.util.ArrayList;
import java.util.List;

public class SetForDraw {

    // 포트별 팀을 저장할 ArrayList 객체 선언
    List<DataForDraw> list1 = new ArrayList<>(); // 1포트
    List<DataForDraw> list2 = new ArrayList<>(); // 2포트
    List<DataForDraw> list3 = new ArrayList<>(); // 3포트
    List<DataForDraw> list4 = new ArrayList<>(); // 4포트

    public void addList () {
        insertPort1();
        insertPort2();
        insertPort3();
        insertPort4();
    }

    private void insertPort1 () {
        list1.add(new DataForDraw(1,"바이에른 뮌헨"));
        list1.add(new DataForDraw(1,"나폴리"));
        list1.add(new DataForDraw(1,"벤피카"));
        list1.add(new DataForDraw(1,"페예노르트"));
        list1.add(new DataForDraw(1,"파리 생제르맹"));
        list1.add(new DataForDraw(1,"맨체스터 시티"));
        list1.add(new DataForDraw(1,"FC 바르셀로나"));
        list1.add(new DataForDraw(1,"세비야"));
    }

    private void insertPort2 () {
        list2.add(new DataForDraw(2, "맨유"));
        list2.add(new DataForDraw(2, "아스날"));
        list2.add(new DataForDraw(2, "브라가"));
        list2.add(new DataForDraw(2, "도르트문트"));
        list2.add(new DataForDraw(2, "레알 마드리드"));
        list2.add(new DataForDraw(2, "인터 밀란"));
        list2.add(new DataForDraw(2, "FC 포르투"));
        list2.add(new DataForDraw(2, "라이프치히"));
    }

    private void insertPort3 () {
        list3.add(new DataForDraw(3,"FC 코펜하겐"));
        list3.add(new DataForDraw(3,"PSV 아인트호벤"));
        list3.add(new DataForDraw(3,"우니온 베를린"));
        list3.add(new DataForDraw(3,"잘츠부르크"));
        list3.add(new DataForDraw(3,"아틀레티코 마드리드"));
        list3.add(new DataForDraw(3,"AC밀란"));
        list3.add(new DataForDraw(3,"츠르베나 즈베즈다 "));
        list3.add(new DataForDraw(3,"샤흐타르 도네츠크"));
    }

    private void insertPort4 () {
        list4.add(new DataForDraw(4,"갈라타사라이"));
        list4.add(new DataForDraw(4,"랑스"));
        list4.add(new DataForDraw(4,"레알 소시에다드"));
        list4.add(new DataForDraw(4,"라치오"));
        list4.add(new DataForDraw(4,"셑틱"));
        list4.add(new DataForDraw(4,"뉴캐슬 유나이티드"));
        list4.add(new DataForDraw(4,"영보이스"));
        list4.add(new DataForDraw(4,"로열 앤트워프"));
    }
}
