package poo.model;

public class Endereco {
    public enum TipoEnderecoEnum {RESIDENCIAL, ENTREGA, TRABALHO}

    public Integer codigo;
    public String logradouro;
    public String numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String cep;
    public TipoEndereco tipoEndereco;
    public TipoEnderecoEnum tipoEnderecoEnum;
    public String contato;
}
