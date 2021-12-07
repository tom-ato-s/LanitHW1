import animals.Kotik;

public class Application {

    private static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        String vois1 = kotik1.getVoice();
        String vois2 = kotik2.getVoice();
        if(vois1.equals(vois2) == true)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Max", "Mew", 10, 8);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Kity");
        kotik2.setVoice("Mew-Mew");
        kotik2.setSatiety(2);
        kotik2.setWeight(6);

        for(String s: kotik1.liveAnotherDay()) {
            System.out.println(s);
        }

        System.out.println(kotik1.getName() + " " + kotik1.getWeight());

        System.out.println("Голоса одинаковые: " + compareVoice(kotik1, kotik2));

        System.out.println("Количество созданных котиков " + Kotik.getCount());
    }
}
