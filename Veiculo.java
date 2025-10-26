// ============================================================================
// Webquest 2 - Programação II
// Integrantes da equipe: 
// - Isaac Gabriel de Almeida Gomes
// - Christyan Fernando Milanez Lima
// - Jacielton Jhone Gregório da Silva
// - Eryclison Davidson Pereira da Silva
// - Andre Cleber Pena Silva
//
// Professor: Augusto César Ferreira de Miranda Oliveira
// Curso: Licenciatura em Ciência da Computação
// Disciplina: Programação II
// ============================================================================

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para calcular IPVA (4% do valor)
    public double calcularIpva() {
        return valor * 0.04;
    }

    // Método para exibir informações do veículo
    public String toString() {
        return "Placa: " + placa +
               " | Marca: " + marca +
               " | Modelo: " + modelo +
               " | Ano: " + ano +
               " | Valor: R$ " + String.format("%.2f", valor) +
               " | IPVA: R$ " + String.format("%.2f", calcularIpva());
    }
}
