import java.util.Objects;

public class Saldo {

    public static int Saldo;
    public static void viewSaldo(String user){
        for (int i = (SiBangApp.trx1.length); i > 0; i--) {
            if(Objects.equals(SiBangApp.trx1[(i-1)], user)){
                Saldo = SiBangApp.getTrx4()[(i-1)];
                System.out.println("Saldo Anda : "+Saldo);
                break;
            } else if (i == 0) {
                System.out.println("Saldo Anda : 0");
            }
        }
    }
}
