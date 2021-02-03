public class Aviao {

    private String nome;
    private  String sexo;
    private  String status;


    public void comoEsta(int opcao) {

        if (opcao == 1) {
            status = "Cansado";

        }

        if (opcao == 2) {
            status = "Tranquilo";

        }
    }
}
