import enums.*;

public class Main {



    public static void main(String[] args) {
//        System.out.println("Valuta: "  + Valuta.LEI);
//        System.out.println("Valuta: "  + Valuta.USD);
//
//        System.out.println(SchimbValutar.x);

//        SchimbValutar schimbValutar = new SchimbValutar();
//        schimbValutar.accessMethod();

        SchimbValutar schimbValutar1 = new SchimbValutar();

        SchimbValutar.Bancomat bancomat = schimbValutar1.new Bancomat();

        bancomat.method();
        bancomat.calculeazaReducere();


        SchimbValutar.Reducere reducere = new SchimbValutar.Reducere() {
            @Override
            public void calculeazaReducere() {
                System.out.println("Calculez reducere");
            }
        };


//        Calculabil calculabil = new Calculabil() {
//            @Override
//            public void calculeaza() {
//                System.out.println("Calculeaza, Anonymous !");
//            }
//        };
//        calculabil.calculeaza();
//        calculabil.method();
//
//
//        Calculabil calculabil4 = new Calculabil() {
//            @Override
//            public void calculeaza() {
//                System.out.println("Calculeaza, Anonymous method 2 !");
//            }
//        };
//        calculabil4.calculeaza();
//        calculabil4.method();
//
//
//        Calculabil calculabil1 = new Produs();
//        Calculabil calculabil2 = new Produs();
//        Calculabil calculabil3 = new Produs();
//        calculabil3.calculeaza();


//        Amprenta amprenta = new Amprenta() {  // nu are nume, si nici nu are nevoie, pentru ca se utilizeaza doar o singura data
//            @Override
//            public void getAmprenta() {
//                System.out.println("Amprenta tipul 1231342342");
//            }
//        };
//
//
//        Amprenta amprenta2 = new Amprenta() {
//            @Override
//            public void getAmprenta() {
//                System.out.println("Amprenta tipul 425345645645");
//            }
//        };
//
//        amprenta2.getAmprenta();
//
//
//
//        amprenta.getAmprenta();



//        StocAmprente stoc = new StocAmprente();
//
//        stoc.stocheazaAmprenta(new AmprentaTipul1());
//
        Amprenta amprenta = new Amprenta() {
            @Override
            public void getAmprenta() {
                System.out.println("Amprenta tipul 234234");
            }
        };
//
//        stoc.stocheazaAmprenta(amprenta);

        




        SchimbValutar.myMethod();

    }
}