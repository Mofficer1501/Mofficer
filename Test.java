public class Test {
    public static void main (String args[]){
        Bus gb = new GorodBus();
        gb.GodVip(2000);
        gb.Marka("Ford");

        System.out.println("");

        Bus mgb = new MezhgorodBus();
        mgb.GodVip(1980);
        mgb.Marka("Chevrolet");

    }
}
