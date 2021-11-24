import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void imprimeValor(){
        Integer[] ints = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<Integer> entrada = Arrays.asList(ints);

        List<String> saida = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(saida,fizzBuzz.processarEntrada(entrada));

    }

}