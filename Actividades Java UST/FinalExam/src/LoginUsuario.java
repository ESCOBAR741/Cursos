public class LoginUsuario {
    private String usuario;
    private String password;

    LoginModelo ConexionPrueba = new LoginModelo();
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


    public int ValidarUsuario() {
        System.out.println(password);
        try {
            String [] datos = ConexionPrueba.Validar(getUsuario());
            if (getUsuario().equals(datos[0]) && getPassword().equals(datos[1])) {
                return 1;
            } else {
                System.out.println("No funciona");
                return 0;
            }
        }catch (Exception e) {
            System.out.println("aux");
        }
        /*if (getPassword().equals(password) && getUsuario().equals(usuario)) {
            System.out.println("11");
            return 1;
        } else {
            System.out.println("00");
            return 0;
        }*/

        return 0;
    }
}
