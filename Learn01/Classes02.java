
class Computer {
    public void playMusic(String musicName) {
        if (musicName.length() > 0) {
            System.out.println("Music " + musicName + " Playing...");
        }
    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            return "Fountain Pen";
        }
        return "No Pen Found in this Price Range";
    }
}

public class Classes02 {
    public static void main(String[] args) {
        Computer comp = new Computer();

        comp.playMusic("O re piya");

        String pen = comp.getMePen(4);
        System.out.println(pen);
    }
}
