#language: es
Característica: Trazabilidad de creacion de usuario
  Yo como tester deseo validar la funcionalidad de crear usuario en el aplicativo web

  Antecedentes: 
    Dado que el usuario entra al home del aplicativo

  @TrazabilidadCorrecta
  Escenario: Verificar la trazabilidad de creacion de usuario
    Y desea crear un usuario
    Cuando crea el usuario desea validar el correcto login y logout
    Entonces podra ver que su usuario se loguea y hace logout correctamente

  @UserIncorrecto @LoginErroneo
  Esquema del escenario: Verificar el login fallido por usuario erroneo
    Y desea loguearse con <user> <password>
    Entonces podra ver el mensaje de error <mensaje>

    Ejemplos: 
      | user                 | password | mensaje                                    |
      | userErroneo@test.com | Asdf1234 | Invalid credentials or access not granted. |

  @PasswordIncorrecta @LoginErroneo
  Esquema del escenario: Verificar el login fallido por contrasenia erronea
    Y desea loguearse con <user> <password>
    Entonces podra ver el mensaje de error <mensaje>

    Ejemplos: 
      | user                  | password          | mensaje                                    |
      | userCorrecto@test.com | contraseñaErronea | Invalid credentials or access not granted. |

  @UserFaltante @LoginErroneo
  Esquema del escenario: Verificar el login fallido por usuario faltante
    Y desea loguearse con <user> <password>
    Entonces podra ver el mensaje de error <mensaje>

    Ejemplos: 
      | user | password | mensaje                                    |
      | null | Asdf1234 | Invalid credentials or access not granted. |

  @PasswordFaltante @LoginErroneo
  Esquema del escenario: Verificar el login fallido por contrasenia faltante
    Y desea loguearse con <user> <password>
    Entonces podra ver el mensaje de error <mensaje>

    Ejemplos: 
      | user                  | password | mensaje                                    |
      | userCorrecto@test.com | null     | Invalid credentials or access not granted. |
