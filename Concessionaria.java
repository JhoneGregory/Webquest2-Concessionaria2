import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Adicionando 3 carros
        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2020, 95000, 4));
        veiculos.add(new Carro("XYZ-5678", "Honda", "Civic", 2021, 110000, 4));
        veiculos.add(new Carro("JDK-9988", "Fiat", "Argo", 2019, 60000, 2));

        // Adicionando 2 motos
        veiculos.add(new Moto("MOT-2025", "Yamaha", "MT-07", 2022, 45000, 700));
        veiculos.add(new Moto("BKE-4321", "Honda", "CG 160", 2023, 15000, 160));

        // Adicionando caminhões
        veiculos.add(new Caminhao("CAM-1001", "Volvo", "FH", 2020, 300000, 8));
        veiculos.add(new Caminhao("CAM-2002", "Mercedes", "Atego", 2021, 250000, 4.5));

        System.out.println("==== SISTEMA DA CONCESSIONÁRIA ====");
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }
}

