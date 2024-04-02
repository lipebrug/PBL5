public class Usuario {

    // Objeto Usuário
    private String nomeConta;
    private String nomeUsuario;
    private int idade;
    private String genero;
    private String local;

    public Usuario() {
        this.nomeConta = "Nome imutável da conta";
        this.nomeUsuario = "Nome mutável de usuário";
        this.idade = 0;
        this.genero = "Gênero do usuário";
        this.local = "Localização do usuário";
    }

    public Usuario(String nomeConta, String nomeUsuario, int idade, String genero, String local) {
        this.nomeConta = nomeConta;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.genero = genero;
        this.local = local;
    }

    // Ação "Ver dados do usuário"

    public String getNomeConta() {return nomeConta;}

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getLocal() {
        return local;
    }

    // Ação "Editar" (edita as informações mutáveis de uma conta, como o nome de usuário e a localização)
    public void setNomeUsuario(String NomeUsuario) {
        this.nomeUsuario = NomeUsuario;
    }

    public void setLocal(String Local) {
        this.local = Local;
    }

}
