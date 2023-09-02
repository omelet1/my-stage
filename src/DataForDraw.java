// 포트 및 축구 팀 데이터, 포트별 팀 지정 메소드 선언한 클래스
public class DataForDraw {

    private int port; // 팀 포트 지정 변수 선언
    private String team; // 축구 팀 이름 변수 선언

    // 생성자
    public DataForDraw(int port, String team) {
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
}
