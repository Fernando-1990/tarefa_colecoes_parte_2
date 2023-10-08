import java.util.*;

public class Lista {
    public static void nomes() {
        System.out.println("<<<<<<<<<< PARTE II >>>>>>>>>>");

        Scanner s = new Scanner(System.in);

        System.out.println("Digite nomes e o sexo separados por vírgula, exemplo:'Fernando-m,Andressa-f'");

        String nome = s.next();

        List<String> lista = new ArrayList<>(Arrays.asList(nome.split(",")));

        List<Pessoa> pessoas = new ArrayList<>();

        for (String elementoArray : lista) {

            String[] partes = elementoArray.split("-");


            Pessoa pessoa = new Pessoa(partes[0], partes[1]);
            pessoas.add(pessoa);
        }

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equals("m")) {
                masculino.add(pessoa.getNome());
            } else {
                feminino.add(pessoa.getNome());
            }

        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Nomes masculinos" + masculino);
        System.out.println("Nomes femininos" + feminino);

    }


}
