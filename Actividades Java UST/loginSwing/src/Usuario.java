public class Usuario {
    private String usuario;
    private String password;

    public Usuario() {
        setUsuario("root");
        setPassword("1234");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int ValidarUsuario(String usuario, String password) {
        System.out.println(password);
        if (getPassword().equals(password) && getUsuario().equals(usuario)) {
            return 1;
        } else {
            return 0;
        }

    }

}
