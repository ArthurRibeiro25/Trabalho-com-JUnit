import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTests{
    @Test
    public void RED(){
        Main calculadora = new Main();
        int a = 1;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = calculadora.somar(a, b);
        Assertions.assertEquals(resultadoEsperado, resultado , "2 + 2 é 4");
    }

    @Test
    public void GREEN(){
        Main calculadora = new Main();
        int a = 2;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = calculadora.somar(a, b);
        Assertions.assertEquals(resultadoEsperado, resultado, "A soma de 2 + 2 é 4");
    }

    @Test
    public void REDDIVISION() {
        Main calculadora = new Main();
        int a = 2;
        int b = 0;

        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(10, 0),
                "Esperava que uma ArithmeticException fosse lançada"
        );
    }

    @Test
    public void GREENDIVISION(){
        Main calculadora = new Main();

        float resultado = calculadora.dividir(10, 2);

        Assertions.assertEquals(5.0f, resultado, "10 dividido por 2 deve ser 5.0");
    }
}