
public class Gerente extends Funcionario {

  public Gerente(String nome, int idade, String cpf) {
    super(nome, idade, cpf);
  }

  // sobre-escrita do metodo que permite exibir informaçoes no console
  // (adicionando os novos valores)
  @Override
  public void exibirDados() {
    super.exibirDados();
    System.out.println("Funcionarios gerenciados: " + funcionariosGerenciados);
  }

  private int funcionariosGerenciados;

  public int getFuncionariosGerenciados() {
    return funcionariosGerenciados;
  }

  public void setFuncionariosGerenciados(int funcionariosGerenciados) {
    this.funcionariosGerenciados = funcionariosGerenciados;
  }

}