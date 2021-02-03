public class Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();
        f1.setNome("leo");
        f1.setEndereço("Rua Amanhece 122");
        f1.setTelefone("11 4992-0022");
        f1.setValorCredito(5000);
        f1.setValorDivida(4000);

        System.out.print(f1.obterSaldo(f1.getValorCredito(),f1.getValorDivida()));

    }
}
