public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            // Forçando erro com CEP inválido (ex: 7 dígitos)
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP não corresponde com a regra de negócio.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // Simula formatação real
        return "23.765-064";
    }
}
