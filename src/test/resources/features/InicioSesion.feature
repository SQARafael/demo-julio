#language:es
  Característica: Inicio de sesión  usuario
    Yo como usuario quiero loguearme en la pagina demo
    para administrar mi cuenta.

    @smokeTest @sesionExitosa
  Esquema del escenario: Inicio de sesión exitoso.
    Dado que el usuario abre la pagina demo
    Cuando el usuario ingresa las credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
      Y de clic en ingresar
    Entonces el usuario podrá ver un mensaje de plataforma.
      Ejemplos:
        | Usuario | Clave     |
        | admin   | serenity  |
        | admin   | serenity  |
        | admin   | serenity1 |