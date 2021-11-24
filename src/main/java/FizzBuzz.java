import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    List<String> saida = new ArrayList<>();
    public List<String>  processarEntrada(List<Integer> entrada) {

        for(int i=0;i<entrada.size();i++){
            System.out.println(entrada.get(i) %3+" e "+entrada.get(i)%5);
            if(entrada.get(i) %3==0 && entrada.get(i) %5==0){
                saida.add(i,"FizzBuzz");

            }
            if(entrada.get(i) %3==0 && entrada.get(i) %5!=0){
                saida.add(i,"Fizz");
            }
            if(entrada.get(i) %3!=0 && entrada.get(i) %5==0){
                saida.add(i,"Buzz");
            }
            if(entrada.get(i) %3!=0 && entrada.get(i) %5!=0){
                saida.add(i,entrada.get(i).toString());
            }
        }

        return saida;
    }
}
