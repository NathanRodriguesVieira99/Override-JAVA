
public class Main {
  public static void main(String[] args) {

    Funcionario Nathan = new Funcionario("Nathan Rodrigues", 19, "123.456.789-00");
    Nathan.exibirDados();

    System.out.println("------------------------------");

    Gerente Piu = new Gerente("Piu", 99, "111.111.111-11");
    Piu.setFuncionariosGerenciados(90);
    Piu.exibirDados();

  }
}