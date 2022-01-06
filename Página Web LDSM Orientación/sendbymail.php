<?php
if(isset($_POST['email'])) {

$email_to = "equipopsicosocialldsm@gmail.com";
$email_subject = "https://index741.000webhostapp.com/";

if(!isset($_POST['name']) ||
!isset($_POST['email']) ||
!isset($_POST['message'])) {

echo "<b>Ocurrió un error y el formulario no ha sido enviado. </b><br />";
echo "Por favor, vuelva atrás y verifique la información ingresada<br />";
die();
}

$email_message = "Detalles del formulario de contacto:\n\n";
$email_message .= "Nombre: " . $_POST['name'] . "\n";
$email_message .= "Email: " . $_POST['email'] . "\n";
$email_message .= "Mensaje: " . $_POST['message'] . "\n\n";


$headers = 'From: '.$email_from."\r\n".
'Reply-To: '.$email_from."\r\n" .
'X-Mailer: PHP/' . phpversion();
@mail($email_to, $email_subject, $email_message, $headers);

echo "¡El formulario se ha enviado con éxito!";
}
?>