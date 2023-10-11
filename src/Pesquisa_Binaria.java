import java.util.ArrayList;
import java.util.List;

public class Pesquisa_Binaria {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(1);  //0
        minhaLista.add(3);  //1
        minhaLista.add(5);  //2
        minhaLista.add(7);  //3
        minhaLista.add(9);  //4

        

        System.out.println(adicionarItemALista(minhaLista, 1));
    }

    public static Object adicionarItemALista(List<Integer> lista, int item) {
        int baixo = 0;
        int alto = lista.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista.get(meio);

            if (chute == item) {
                return meio;
            } else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }

        }
        return null;
    }
}