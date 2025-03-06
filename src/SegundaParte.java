import java.util.*;

public class SegundaParte {
    Scanner s = new Scanner(System.in);
    Map<String, List<String>> arrayListNames = new HashMap<>();

    private String[] listNames;
    private String[] parts;

    public void executandoSegundaParte() {
        System.out.println("EXEMPLI: nome-sexo, segundoNome-sexo, terceiroNome-sexo...");
        System.out.print("Informe o nome e sexo(masculino e feminino) do seus usarios separando por (-) e por (,), seguindo o exemplo acima: ");
        String names = s.nextLine();

        listNames = names.split(",");

        arrayListNames.put("masculino", new ArrayList<>());
        arrayListNames.put("feminino", new ArrayList<>());

        for (int i = 0; i < listNames.length; i++) {
            listNames[i] = listNames[i].trim();
        }

        for (String entry : listNames) {
            entry = entry.trim();
            parts = entry.split("-");

            if (parts.length == 2) {
                String name = parts[0].trim();
                String sexo = parts[1].trim().toLowerCase(Locale.ROOT);

                if(arrayListNames.containsKey(sexo)) {
                    arrayListNames.get(sexo).add(name);
                } else {
                    System.out.println("sexo invalido" + name);
                }

            } else {
                System.out.println("Formato invalido" + entry);
            }
        }

        System.out.println("\nLista de Nomes Masculinos:");
        System.out.println(arrayListNames.get("masculino"));

        System.out.println("\nLista de Nomes Femininos:");
        System.out.println(arrayListNames.get("feminino"));
    }
}