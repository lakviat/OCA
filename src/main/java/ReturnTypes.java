public class ReturnTypes {

    public static void swing(){
        System.out.println("swing");
    }
    public void clibm(){
        System.out.println("climb");
    }
    public static void play(){
        swing();

    }

    public static void main(String[] args) {
        ReturnTypes rt = new ReturnTypes();
        rt.play();
        ReturnTypes rt2 = null;
    }
}
