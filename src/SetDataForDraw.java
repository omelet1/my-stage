import java.util.ArrayList;
import java.util.List;

// 포트 및 축구 팀 데이터, 포트별 팀 지정 메소드 선언한 클래스
public class SetDataForDraw {

    private int port; // 팀 포트 지정 변수 선언
    private String team; // 축구 팀 이름 변수 선언

    // 생성자
    public SetDataForDraw() {}
    
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

    public void setList () {
        insertPort1();
        insertPort2();
        insertPort3();
        insertPort4();
    }

    private void insertPort1 () {
        port1.add(new SetDataForDraw(1,"바이에른 뮌헨"));
        port1.add(new SetDataForDraw(1,"나폴리"));
        port1.add(new SetDataForDraw(1,"벤피카"));
        port1.add(new SetDataForDraw(1,"페예노르트"));
        port1.add(new SetDataForDraw(1,"파리 생제르맹"));
        port1.add(new SetDataForDraw(1,"맨체스터 시티"));
        port1.add(new SetDataForDraw(1,"FC 바르셀로나"));
        port1.add(new SetDataForDraw(1,"세비야"));
    }

    private void insertPort2 () {
        port2.add(new SetDataForDraw(2, "맨유"));
        port2.add(new SetDataForDraw(2, "아스날"));
        port2.add(new SetDataForDraw(2, "브라가"));
        port2.add(new SetDataForDraw(2, "도르트문트"));
        port2.add(new SetDataForDraw(2, "레알 마드리드"));
        port2.add(new SetDataForDraw(2, "인터 밀란"));
        port2.add(new SetDataForDraw(2, "FC 포르투"));
        port2.add(new SetDataForDraw(2, "라이프치히"));
    }

    private void insertPort3 () {
        port3.add(new SetDataForDraw(3,"FC 코펜하겐"));
        port3.add(new SetDataForDraw(3,"PSV 아인트호벤"));
        port3.add(new SetDataForDraw(3,"우니온 베를린"));
        port3.add(new SetDataForDraw(3,"잘츠부르크"));
        port3.add(new SetDataForDraw(3,"아틀레티코 마드리드"));
        port3.add(new SetDataForDraw(3,"AC밀란"));
        port3.add(new SetDataForDraw(3,"츠르베나 즈베즈다 "));
        port3.add(new SetDataForDraw(3,"샤흐타르 도네츠크"));
    }

    private void insertPort4 () {
        port4.add(new SetDataForDraw(4,"갈라타사라이"));
        port4.add(new SetDataForDraw(4,"랑스"));
        port4.add(new SetDataForDraw(4,"레알 소시에다드"));
        port4.add(new SetDataForDraw(4,"라치오"));
        port4.add(new SetDataForDraw(4,"셑틱"));
        port4.add(new SetDataForDraw(4,"뉴캐슬 유나이티드"));
        port4.add(new SetDataForDraw(4,"영보이스"));
        port4.add(new SetDataForDraw(4,"로열 앤트워프"));
    }
    
}
