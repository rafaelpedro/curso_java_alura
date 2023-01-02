public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoRafael = new Conta();
        contaDoRafael.saldo = 100;
        contaDoRafael.deposita(50);

        System.out.println(contaDoRafael.saldo);
        boolean conseguiuRetirar = contaDoRafael.saca(20);
        System.out.println(contaDoRafael.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMayza = new Conta();
        contaDaMayza.deposita(1000);
        boolean sucessoTransferencia = contaDaMayza.transfere(30000, contaDoRafael);


        if(sucessoTransferencia) {
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Faltou dinheiro");
        }


        System.out.println(contaDaMayza.saldo);
        System.out.println(contaDoRafael.saldo);

        contaDoRafael.titular = "Rafael Alencar Pedro";
        System.out.println(contaDoRafael.titular);
        }
    }

