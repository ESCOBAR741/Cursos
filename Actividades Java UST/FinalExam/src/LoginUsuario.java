public class LoginUsuario {
    private String usuario;
    private String password;

    public LoginUsuario() {
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
            System.out.println("11");
            return 1;
        } else {
            System.out.println("00");
            return 0;
        }

    }
}
