import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UEFACommissioner {
    private String name;
    public UEFACommissioner(String name) {
        this.name = name;
    }
    SetDataForDraw sdfd = new SetDataForDraw();

    Iterator<SetDataForDraw> iterator1 = sdfd.port1.iterator();
    Iterator<SetDataForDraw> iterator2 = sdfd.port2.iterator();
    Iterator<SetDataForDraw> iterator3 = sdfd.port3.iterator();
    Iterator<SetDataForDraw> iterator4 = sdfd.port4.iterator();

    List<SetDataForDraw> groupA = new ArrayList<>();
    List<SetDataForDraw> groupB = new ArrayList<>();
    List<SetDataForDraw> groupC = new ArrayList<>();
    List<SetDataForDraw> groupD = new ArrayList<>();
    List<SetDataForDraw> groupE = new ArrayList<>();
    List<SetDataForDraw> groupF = new ArrayList<>();
    List<SetDataForDraw> groupG = new ArrayList<>();
    List<SetDataForDraw> groupH = new ArrayList<>();

    public void dividePort () {
        sdfd.setList();
    }
    public void setShuffle () {
        Collections.shuffle(sdfd.port1);
        Collections.shuffle(sdfd.port2);
        Collections.shuffle(sdfd.port3);
        Collections.shuffle(sdfd.port4);
    }

    public void drawPort1 () {
        for (SetDataForDraw setDataForDraw : sdfd.port1) {
            while (iterator1.hasNext()) {
                groupA.add(iterator1.next());
                System.out.println(iterator1.next());
//                groupB.add(iterator1.next());
//                groupC.add(iterator1.next());
//                groupD.add(iterator1.next());
//                groupE.add(iterator1.next());
//                groupF.add(iterator1.next());
//                groupG.add(iterator1.next());
//                groupH.add(iterator1.next());
            }
        }
//        System.out.println("-----A조-----");
//        System.out.println(groupA.get(0).getTeam());
//        System.out.println("-----B조-----");
//        System.out.println(groupB.get(0).getTeam());
//        System.out.println("-----C조-----");
//        System.out.println(groupC.get(0).getTeam());
//        System.out.println("-----D조-----");
//        System.out.println(groupD.get(0).getTeam());
//        System.out.println("-----E조-----");
//        System.out.println(groupE.get(0).getTeam());
//        System.out.println("-----F조-----");
//        System.out.println(groupF.get(0).getTeam());
//        System.out.println("-----G조-----");
//        System.out.println(groupG.get(0).getTeam());
//        System.out.println("-----H조-----");
//        System.out.println(groupH.get(0).getTeam());
        System.out.println(groupA.toString());
    }

    public void drawPort2 () {
        for (SetDataForDraw setDataForDraw : sdfd.port2) {
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
        }
    }

    public void drawPort3 () {
        for (SetDataForDraw setDataForDraw : sdfd.port3) {
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
        }
    }
    public void drawPort4 () {
        for (SetDataForDraw setDataForDraw : sdfd.port4) {
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
        }
    }
//    public void showResult() {
//        System.out.println("-----A조-----");
//        System.out.println(groupA.get(0).getTeam());
//        System.out.println(groupA.get(1).getTeam());
//        System.out.println(groupA.get(2).getTeam());
//        System.out.println(groupA.get(3).getTeam());
//        System.out.println("-----B조-----");
//        System.out.println(groupB.get(0).getTeam());
//        System.out.println(groupB.get(1).getTeam());
//        System.out.println(groupB.get(2).getTeam());
//        System.out.println(groupB.get(3).getTeam());
//        System.out.println("-----C조-----");
//        System.out.println(groupC.get(0).getTeam());
//        System.out.println(groupC.get(1).getTeam());
//        System.out.println(groupC.get(2).getTeam());
//        System.out.println(groupC.get(3).getTeam());
//        System.out.println("-----D조-----");
//        System.out.println(groupD.get(0).getTeam());
//        System.out.println(groupD.get(1).getTeam());
//        System.out.println(groupD.get(2).getTeam());
//        System.out.println(groupD.get(3).getTeam());
//        System.out.println("-----E조-----");
//        System.out.println(groupE.get(0).getTeam());
//        System.out.println(groupE.get(1).getTeam());
//        System.out.println(groupE.get(2).getTeam());
//        System.out.println(groupE.get(3).getTeam());
//        System.out.println("-----F조-----");
//        System.out.println(groupF.get(0).getTeam());
//        System.out.println(groupF.get(1).getTeam());
//        System.out.println(groupF.get(2).getTeam());
//        System.out.println(groupF.get(3).getTeam());
//        System.out.println("-----G조-----");
//        System.out.println(groupG.get(0).getTeam());
//        System.out.println(groupG.get(1).getTeam());
//        System.out.println(groupG.get(2).getTeam());
//        System.out.println(groupG.get(3).getTeam());
//        System.out.println("-----H조-----");
//        System.out.println(groupH.get(0).getTeam());
//        System.out.println(groupH.get(1).getTeam());
//        System.out.println(groupH.get(2).getTeam());
//        System.out.println(groupH.get(3).getTeam());
//    }

}
