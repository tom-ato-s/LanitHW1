package animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private static final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    public boolean wash() {
        if(satiety >0) {
            System.out.println("Котик умывается");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    public boolean walk() {
        if(satiety >0) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    public boolean hunt () {
        if(satiety >0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    public void eat(int satiety) {
        this.satiety += satiety;
    }

    public void eat(int satiety, String typeEat) {
        this.satiety += satiety;
    }

    public void eat() {
        int satietyIn =10;
        String tipeEatIn = "Мясо";
        eat(satietyIn, tipeEatIn);
    }

    public String[]  liveAnotherDay() {
        String[] arr = new String[24];
        for(int i = 0; i<24; i++) {
            int n = (int) ((int) (Math.random() * METHODS) + 1);
            switch(n) {
                case (1):
                    if (play() == true) {
                        arr[i] = (i + " - играл");
                    } else {
                        eat(n, "рыба");
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (2):
                    if (sleep() == true) {
                        arr[i] = (i + " -  спал");
                    } else {
                        eat(n);
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (3):
                    if (wash() == true) {
                        arr[i] = (i + " - умывался");
                    } else {
                        eat();
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (4):
                    if (walk() == true) {
                        arr[i] = (i + " - гулял");
                    } else {
                        eat(n);
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (5):
                    if (hunt() == true) {
                        arr[i] = (i + " - охотился");
                    } else {
                        eat();
                        arr[i] = (i + " - ел");
                    }
                    break;
            }
        }
        return arr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

}
