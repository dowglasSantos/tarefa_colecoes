import java.util.*;

public class PrimeiraParte {
    public void executandoPrimeiraParte() {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe alguns nomes separados por vírgula: ");
        String inputNames = s.nextLine();

        // Divide os nomes, remove espaços extras e coloca em uma lista
        List<String> nameList = Arrays.asList(inputNames.split("\\s*,\\s*"));

        // Ordena a lista
        Collections.sort(nameList);

        // Exibe a lista ordenada
        System.out.println("Lista de nomes ordenada: " + nameList);

        s.close();
    }
}