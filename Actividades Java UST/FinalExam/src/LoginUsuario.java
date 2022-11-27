public class LoginUsuario {
    private String usuario;
    private String password;

    LoginModelo ClaseLoginModelo = new LoginModelo();
    public LoginUsuario() {
    }

    public int ValidarUsuario(String usuario, String password) {
        System.out.println(usuario);
        System.out.println(password);
        try {
            String [] datos = ClaseLoginModelo.Validar(usuario);
            System.out.println("Flag1");
            if (usuario.equals(datos[0]) && password().equals(datos[1])) {
                System.out.println("Flag2");
                return 1;
            } else {
                System.out.println("Flag3");
                System.out.println("No funciona");
                return 0;
            }
        }catch (Exception e) {
            System.out.println("Exepcion del catch");
        }
        return 0;

    }

    private String usuario() {
        return null;
    }

    private Object password() {
        return null;
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
            String [] datos = ClaseLoginModelo.Validar(getUsuario());
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
