import java.util.ArrayList;
import java.util.List;

public class Pesquisa_Binaria {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(1);  //0
        minhaLista.add(3);  //1
        minhaLista.add(17);  //2
        minhaLista.add(29);  //3
        minhaLista.add(55);  //4
        minhaLista.add(71);  //5
        minhaLista.add(72);  //6
        minhaLista.add(74);  //7
        minhaLista.add(789);  //8

        int item = 74;
        Integer indice = adicionarItemALista(minhaLista, item);

        if (indice != null) {
            System.out.println("Item " + item + " encontrado no índice " + indice);
        } else {
            System.out.println("Item " + item + " não encontrado na lista.");
        }
    }

    public static Integer adicionarItemALista(List<Integer> lista, int item) {
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
