import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

class Cliente {
    private int idCliente;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(int idCliente, String nome, String endereco, String telefone, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

}

class Conta {
    private int idConta;
    private int idAgencia;
    private BigDecimal saldo;
    private Timestamp dataAbertura;
    private String tipoConta;
    private int idCliente;

    public Conta(int idConta, int idAgencia, BigDecimal saldo, Timestamp dataAbertura, String tipoConta, int idCliente) {
        this.idConta = idConta;
        this.idAgencia = idAgencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
        this.idCliente = idCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}

class Agencia {
    private int idAgencia;
    private String nome;
    private String endereco;
    private String telefone;
    private String gerente;
    private int idConta;

    public Agencia(int idAgencia, String nome, String endereco, String telefone, String gerente, int idConta) {
        this.idAgencia = idAgencia;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

}

class Transacao {
    private int idTransacao;
    private int idConta;
    private int idCliente;
    private Timestamp dataHora;
    private String tipoTransacao;
    private BigDecimal valor;
    private String descricao;

    public Transacao(int idTransacao, int idConta, int idCliente, Timestamp dataHora,
                     String tipoTransacao, BigDecimal valor, String descricao) {
        this.idTransacao = idTransacao;
        this.idConta = idConta;
        this.idCliente = idCliente;
        this.dataHora = dataHora;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Produto(int idProduto, String nome, String descricao, BigDecimal preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "João Silva", "Rua amendes, 123", "123456789", "joao@exemplo.com");
        Cliente cliente2 = new Cliente(2, "Maria Santos", "Av. babasauro, 456", "987654321", "maria@exemplo.com");

        Conta conta1 = new Conta(1, 1, new BigDecimal("1000.00"), Timestamp.valueOf("1999-01-01 00:00:00"),
                "Corrente", 1);
        Conta conta2 = new Conta(2, 2, new BigDecimal("5000.00"), Timestamp.valueOf("2022-02-01 00:00:00"),
                "Poupança", 2);

        Agencia agencia1 = new Agencia(1, "Agência Central", "Rua agamenon, 789", "111222333", "carlos", 1);
        Agencia agencia2 = new Agencia(2, "Agência Norte", "Av. conde da boa vista, 456", "444555666", "amorim", 2);

        Transacao transacao1 = new Transacao(1, 1, 1, Timestamp.valueOf("2022-01-01 10:00:00"),
                "Débito", new BigDecimal("100.00"), "Pagamento de conta");
        Transacao transacao2 = new Transacao(2, 2, 2, Timestamp.valueOf("2022-02-01 15:30:00"),
                "Crédito", new BigDecimal("500.00"), "Depósito em dinheiro");

        Produto produto1 = new Produto(1, "Smartphone", "Modelo avançado", new BigDecimal("999.99"));
        Produto produto2 = new Produto(2, "Notebook", "Ultrafino e potente", new BigDecimal("1499.99"));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);

        List<Agencia> agencias = new ArrayList<>();
        agencias.add(agencia1);
        agencias.add(agencia2);

        List<Transacao> transacoes = new ArrayList<>();
        transacoes.add(transacao1);
        transacoes.add(transacao2);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);


        System.out.println("Cliente 1: " + clientes.get(0).getNome());
        System.out.println("Conta 2: " + contas.get(1).getSaldo());
        System.out.println("Agência 1: " + agencias.get(0).getNome());
        System.out.println("Transação 1: " + transacoes.get(0).getDescricao());
        System.out.println("Produto 1: " + produtos.get(0).getNome());
        System.out.println("Produto 2: " + produtos.get(1).getNome());
    }
}
