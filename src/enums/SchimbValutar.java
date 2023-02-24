package enums;

public class SchimbValutar {

    // Nested - poate fi accesata din main fara metoda

    static int n;

    static class Paza {
        void method() {

        }
    }

    public static void myMethod() {
        Paza paza = new Paza();
        paza.method();
    }

    private Valuta valuta = Valuta.USD;

    public static String x = "";

    public Valuta getValuta() {

        int v;

        final int z = 2;
        class Inner {

            int[] y = {2};
            int x;

            void method2() {

            }
            void method() {
                System.out.println(z);

                System.out.println(valuta);
            }
        }

        Inner inner = new Inner();
        inner.method();

        return Valuta.USD;
    }

    public void method2() {

    }

    public abstract class Vinzator {

    }

    public interface Reducere {

        void calculeazaReducere();

    }

    public void getReducere() {
        Reducere reducere = new Reducere() {
            @Override
            public void calculeazaReducere() {

            }
        };
    }

    public void accessMethod() {
        Bancomat bancomat = new Bancomat();
        bancomat.method();
    }

    public class Bancomat extends Vinzator implements Reducere {
       int x;

        public void method() {
            System.out.println(valuta);
        }

        @Override
        public void calculeazaReducere() {

        }
    }

}