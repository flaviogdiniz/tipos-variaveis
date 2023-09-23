public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        int idade = 39;
        String nome = "Flavio";
        char sexo ='M';
        double peso = 79.5;
        boolean doadorOrgao = false;
        System.out.println("Ola! Meu nome é  " + nome + " e tenho " + idade + " anos");
        System.out.println("Meu peso é " + peso);
        System.out.println("Meu sexo é " + sexo);

        if(doadorOrgao) {
            System.out.println("Sou doador de orgãos!");
        }else {
            System.out.println("Não sou doador de orgâos.");
        }
    }
}
