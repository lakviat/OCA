public class IntConvertion {
    public static void main(String[] args) {
        int iVar = 100;
        float FVar = 100.100f;
        double dVar = 123;

        // iVar = FVar;
        FVar = iVar;
        dVar = FVar;
        FVar = iVar;
        // FVar = dVar;
        dVar  = iVar;
        // iVar = dVar;

        // in this examples bigger numbers can't go little
        // so in out case float can't go int because
        // it assinged explicitly
        // and double can't go integer
    }
}
