public class Cliente  {
    private String marca;
    private  int lugares;
    private  String status = "Está em solo";


    public void levantarVoo(int opcao){

        if (opcao == 1){
            status = "Decolando";

        }
        if (opcao == 2){
            status = "Pousando";

        }


    }

}
