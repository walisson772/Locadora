package entities;


import java.util.ArrayList;
import java.util.List;

public class Locadora {

    List<Carro> carros = new ArrayList<>();
    private Boolean disponivel = true;
    private final Double valorPorDia = 50.0;
    private Integer diasAlugado;

    public Locadora(){
    }

    public List<Carro> getCarros() {
        return carros;
    }
    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Double getValorPorDia() {
        return valorPorDia;
    }

    public Integer getDiasAlugado() {
        return diasAlugado;
    }

    public void setDiasAlugado(Integer diasAlugado) {
        this.diasAlugado = diasAlugado;
    }


    public void addCarro(String modelo, Integer codigo) {
        carros.add(new Carro(modelo, codigo));
    }

    public void listarCarros(){
        for (Locadora carro : getCarros()){
            System.out.println(carro);
        }
    }

    public Double valorTotal(){
        return getValorPorDia() * getDiasAlugado();
    }

    public void alugarCarro(Integer codigo, Integer diasAlugado) throws ErrosOrSucess{
        Locadora carro = carros.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
        if (carro == null){
            throw new ErrosOrSucess("Carro Não encontrado ou não disponivel");
        }
        else {
            System.out.println("Carro alugado com sucesso");
            carro.setDisponivel(false);
            setDiasAlugado(diasAlugado);
        }
    }
}
