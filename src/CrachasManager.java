
public class CrachasManager {

    private CrachasManager() {};
    private static CrachasManager instance = new CrachasManager();
    public static CrachasManager getInstance() {
        return instance;
    }

    private String nomeFuncionario;
    private String codigoCracha;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCodigoCracha() {
        return codigoCracha;
    }

    public void setCodigoCracha(String codigoCracha) {
        this.codigoCracha = codigoCracha;
    }
}
