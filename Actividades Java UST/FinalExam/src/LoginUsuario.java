public class LoginUsuario {
    private String usuario;
    private String password;

    LoginModelo ClaseLoginModelo = new LoginModelo();


    public int ValidarUsuario(String usuario, String password) {
        System.out.println(usuario);
        System.out.println(password);
        try {
            String [] datos = ClaseLoginModelo.Validar(usuario);
            /*if (datos.equals(datos[0]) && password().equals(datos[1])) {
                System.out.println("Flag2");
                return 1;
            } else {
                System.out.println("Flag3");
                System.out.println("No funciona");
                return 0;
            } */
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


}
