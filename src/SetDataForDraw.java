import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 포트 및 축구 팀 데이터, 포트별 팀 지정 메소드 선언한 클래스
public class SetDataForDraw {

    private int port; // 팀 포트 지정 변수 선언
    private String team; // 축구 팀 이름 변수 선언
    private SetDataForDraw result;

    // 생성자
    public SetDataForDraw() {
    }

    public SetDataForDraw(int port, String team) {
        this.port = port;
        this.team = team;
    }

    // 랜덤 조 추첨시 1포트, 2포트, 3포트, 4포트 각각 지정해서 랜덤으로 추첨해야 함
    public int getPort() {
        return port;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "포트 : " + port + " // 팀 : " + team;
    }

    public List<SetDataForDraw> port1 = new ArrayList<>(); // 1포트
    public List<SetDataForDraw> port2 = new ArrayList<>(); // 2포트
    public List<SetDataForDraw> port3 = new ArrayList<>(); // 3포트
    public List<SetDataForDraw> port4 = new ArrayList<>(); // 4포트

    private void insertPort1() {
        port1.add(new SetDataForDraw(1, "바이에른 뮌헨"));
        port1.add(new SetDataForDraw(1, "나폴리"));
        port1.add(new SetDataForDraw(1, "벤피카"));
        port1.add(new SetDataForDraw(1, "페예노르트"));
        port1.add(new SetDataForDraw(1, "파리 생제르맹"));
        port1.add(new SetDataForDraw(1, "맨체스터 시티"));
        port1.add(new SetDataForDraw(1, "FC 바르셀로나"));
        port1.add(new SetDataForDraw(1, "세비야"));
    }

    private void insertPort2() {
        port2.add(new SetDataForDraw(2, "맨유"));
        port2.add(new SetDataForDraw(2, "아스날"));
        port2.add(new SetDataForDraw(2, "브라가"));
        port2.add(new SetDataForDraw(2, "도르트문트"));
        port2.add(new SetDataForDraw(2, "레알 마드리드"));
        port2.add(new SetDataForDraw(2, "인터 밀란"));
        port2.add(new SetDataForDraw(2, "FC 포르투"));
        port2.add(new SetDataForDraw(2, "라이프치히"));
    }

    private void insertPort3() {
        port3.add(new SetDataForDraw(3, "FC 코펜하겐"));
        port3.add(new SetDataForDraw(3, "PSV 아인트호벤"));
        port3.add(new SetDataForDraw(3, "우니온 베를린"));
        port3.add(new SetDataForDraw(3, "잘츠부르크"));
        port3.add(new SetDataForDraw(3, "아틀레티코 마드리드"));
        port3.add(new SetDataForDraw(3, "AC밀란"));
        port3.add(new SetDataForDraw(3, "츠르베나 즈베즈다 "));
        port3.add(new SetDataForDraw(3, "샤흐타르 도네츠크"));
    }

    private void insertPort4() {
        port4.add(new SetDataForDraw(4, "갈라타사라이"));
        port4.add(new SetDataForDraw(4, "랑스"));
        port4.add(new SetDataForDraw(4, "레알 소시에다드"));
        port4.add(new SetDataForDraw(4, "라치오"));
        port4.add(new SetDataForDraw(4, "셑틱"));
        port4.add(new SetDataForDraw(4, "뉴캐슬 유나이티드"));
        port4.add(new SetDataForDraw(4, "영보이스"));
        port4.add(new SetDataForDraw(4, "로열 앤트워프"));
    }

    // ---------------------------------- 메서드 정리

    List<SetDataForDraw> groupA = new ArrayList<>();
    List<SetDataForDraw> groupB = new ArrayList<>();
    List<SetDataForDraw> groupC = new ArrayList<>();
    List<SetDataForDraw> groupD = new ArrayList<>();
    List<SetDataForDraw> groupE = new ArrayList<>();
    List<SetDataForDraw> groupF = new ArrayList<>();
    List<SetDataForDraw> groupG = new ArrayList<>();
    List<SetDataForDraw> groupH = new ArrayList<>();

    public void setList() {
        insertPort1();
        insertPort2();
        insertPort3();
        insertPort4();
    }

    public void setShuffle() {
        Collections.shuffle(port1);
        Collections.shuffle(port2);
        Collections.shuffle(port3);
        Collections.shuffle(port4);
    }

    public SetDataForDraw drawPort1(String y) {
        System.out.println("1포트입니다. (추첨)");

        if (y.equals("y")) {
            Iterator<SetDataForDraw> iterator1 = port1.iterator();
            while (iterator1.hasNext()) {
                groupA.add(iterator1.next());
                groupB.add(iterator1.next());
                groupC.add(iterator1.next());
                groupD.add(iterator1.next());
                groupE.add(iterator1.next());
                groupF.add(iterator1.next());
                groupG.add(iterator1.next());
                groupH.add(iterator1.next());
            }
    
            System.out.println("-----A조-----");
            System.out.println(groupA.get(0).getTeam());
            System.out.println("-----B조-----");
            System.out.println(groupB.get(0).getTeam());
            System.out.println("-----C조-----");
            System.out.println(groupC.get(0).getTeam());
            System.out.println("-----D조-----");
            System.out.println(groupD.get(0).getTeam());
            System.out.println("-----E조-----");
            System.out.println(groupE.get(0).getTeam());
            System.out.println("-----F조-----");
            System.out.println(groupF.get(0).getTeam());
            System.out.println("-----G조-----");
            System.out.println(groupG.get(0).getTeam());
            System.out.println("-----H조-----");
            System.out.println(groupH.get(0).getTeam());
        }
        else System.out.println("다시");

        System.out.println("---------------1포트----------------");

        return result;
    }

    public SetDataForDraw drawPort2(String y) {
        System.out.println("2포트입니다. (추첨)");

        Iterator<SetDataForDraw> iterator2 = port2.iterator();

        while (iterator2.hasNext()) {
            groupA.add(iterator2.next());
            groupB.add(iterator2.next());
            groupC.add(iterator2.next());
            groupD.add(iterator2.next());
            groupE.add(iterator2.next());
            groupF.add(iterator2.next());
            groupG.add(iterator2.next());
            groupH.add(iterator2.next());
        }
        System.out.println("-----A조-----");
        System.out.println(groupA.get(0).getTeam());
        System.out.println(groupA.get(1).getTeam());
        System.out.println("-----B조-----");
        System.out.println(groupB.get(0).getTeam());
        System.out.println(groupB.get(1).getTeam());
        System.out.println("-----C조-----");
        System.out.println(groupC.get(0).getTeam());
        System.out.println(groupC.get(1).getTeam());
        System.out.println("-----D조-----");
        System.out.println(groupD.get(0).getTeam());
        System.out.println(groupD.get(1).getTeam());
        System.out.println("-----E조-----");
        System.out.println(groupE.get(0).getTeam());
        System.out.println(groupE.get(1).getTeam());
        System.out.println("-----F조-----");
        System.out.println(groupF.get(0).getTeam());
        System.out.println(groupF.get(1).getTeam());
        System.out.println("-----G조-----");
        System.out.println(groupG.get(0).getTeam());
        System.out.println(groupG.get(1).getTeam());
        System.out.println("-----H조-----");
        System.out.println(groupH.get(0).getTeam());
        System.out.println(groupH.get(1).getTeam());

        System.out.println("---------------2포트----------------");
        return result;

    }

    public void drawPort3() {
        System.out.println("3포트입니다. (추첨)");

        Iterator<SetDataForDraw> iterator3 = port3.iterator();

        while (iterator3.hasNext()) {
            groupA.add(iterator3.next());
            groupB.add(iterator3.next());
            groupC.add(iterator3.next());
            groupD.add(iterator3.next());
            groupE.add(iterator3.next());
            groupF.add(iterator3.next());
            groupG.add(iterator3.next());
            groupH.add(iterator3.next());
        }
        System.out.println("-----A조-----");
        System.out.println(groupA.get(2).getTeam());
        System.out.println("-----B조-----");
        System.out.println(groupB.get(2).getTeam());
        System.out.println("-----C조-----");
        System.out.println(groupC.get(2).getTeam());
        System.out.println("-----D조-----");
        System.out.println(groupD.get(2).getTeam());
        System.out.println("-----E조-----");
        System.out.println(groupE.get(2).getTeam());
        System.out.println("-----F조-----");
        System.out.println(groupF.get(2).getTeam());
        System.out.println("-----G조-----");
        System.out.println(groupG.get(2).getTeam());
        System.out.println("-----H조-----");
        System.out.println(groupH.get(2).getTeam());

        System.out.println("---------------3포트----------------");

    }

    public void drawPort4() {
        System.out.println("4포트입니다. (추첨)");

        Iterator<SetDataForDraw> iterator4 = port4.iterator();

        while (iterator4.hasNext()) {
            groupA.add(iterator4.next());
            groupB.add(iterator4.next());
            groupC.add(iterator4.next());
            groupD.add(iterator4.next());
            groupE.add(iterator4.next());
            groupF.add(iterator4.next());
            groupG.add(iterator4.next());
            groupH.add(iterator4.next());
        }
        System.out.println("-----A조-----");
        System.out.println(groupA.get(3).getTeam());
        System.out.println("-----B조-----");
        System.out.println(groupB.get(3).getTeam());
        System.out.println("-----C조-----");
        System.out.println(groupC.get(3).getTeam());
        System.out.println("-----D조-----");
        System.out.println(groupD.get(3).getTeam());
        System.out.println("-----E조-----");
        System.out.println(groupE.get(3).getTeam());
        System.out.println("-----F조-----");
        System.out.println(groupF.get(3).getTeam());
        System.out.println("-----G조-----");
        System.out.println(groupG.get(3).getTeam());
        System.out.println("-----H조-----");
        System.out.println(groupH.get(3).getTeam());

        System.out.println("---------------4포트----------------");

    }

    public void showResult() {
        System.out.println("-----------최종 조 편성-----------");
        System.out.println("-----A조-----");
        System.out.println(groupA.get(0).getTeam());
        System.out.println(groupA.get(1).getTeam());
        System.out.println(groupA.get(2).getTeam());
        System.out.println(groupA.get(3).getTeam());
        System.out.println("-----B조-----");
        System.out.println(groupB.get(0).getTeam());
        System.out.println(groupB.get(1).getTeam());
        System.out.println(groupB.get(2).getTeam());
        System.out.println(groupB.get(3).getTeam());
        System.out.println("-----C조-----");
        System.out.println(groupC.get(0).getTeam());
        System.out.println(groupC.get(1).getTeam());
        System.out.println(groupC.get(2).getTeam());
        System.out.println(groupC.get(3).getTeam());
        System.out.println("-----D조-----");
        System.out.println(groupD.get(0).getTeam());
        System.out.println(groupD.get(1).getTeam());
        System.out.println(groupD.get(2).getTeam());
        System.out.println(groupD.get(3).getTeam());
        System.out.println("-----E조-----");
        System.out.println(groupE.get(0).getTeam());
        System.out.println(groupE.get(1).getTeam());
        System.out.println(groupE.get(2).getTeam());
        System.out.println(groupE.get(3).getTeam());
        System.out.println("-----F조-----");
        System.out.println(groupF.get(0).getTeam());
        System.out.println(groupF.get(1).getTeam());
        System.out.println(groupF.get(2).getTeam());
        System.out.println(groupF.get(3).getTeam());
        System.out.println("-----G조-----");
        System.out.println(groupG.get(0).getTeam());
        System.out.println(groupG.get(1).getTeam());
        System.out.println(groupG.get(2).getTeam());
        System.out.println(groupG.get(3).getTeam());
        System.out.println("-----H조-----");
        System.out.println(groupH.get(0).getTeam());
        System.out.println(groupH.get(1).getTeam());
        System.out.println(groupH.get(2).getTeam());
        System.out.println(groupH.get(3).getTeam());
    }

}
