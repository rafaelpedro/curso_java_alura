import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void deveSomarOValorNoSaldo(){
        Conta contaTest = new Conta();
        contaTest.saldo = 500;
        contaTest.deposita(20);
        Assertions.assertEquals(520,contaTest.saldo);
    }

    @Test
    public void devePermitirOSaqueQuandoOValorDoSaqueForMenorQueOSaldo(){
        Conta contaTest = new Conta();
        contaTest.saldo = 200;
        Boolean resultado = contaTest.saca(20);
        Assertions.assertEquals(true, resultado);
        Assertions.assertEquals(180,contaTest.saldo);
    }

    @Test
    public void devePermitirOSaqueQuandoOSaldoEOValorDoSaqueForemIguais(){
        Conta contaTest = new Conta();
        contaTest.saldo = 200;
        Boolean resultado = contaTest.saca(200);
        Assertions.assertEquals(true, resultado);
        Assertions.assertEquals(0,contaTest.saldo);
    }

    @Test
    public void deveRetornarFalsoParaSaldoMenorQueOValorASerSacado(){
        Conta contaTest = new Conta();
        contaTest.saldo = 10;
        Boolean resultado = contaTest.saca(11);
        Assertions.assertEquals(false, resultado);
        Assertions.assertEquals(10,contaTest.saldo);
    }
}

