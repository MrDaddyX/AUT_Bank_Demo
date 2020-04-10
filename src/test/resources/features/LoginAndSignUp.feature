#language: es
Característica: Trazabilidad de creacion de usuario
  Yo como tester deseo validar la funcionalidad de crear usuario en el aplicativo web

  Antecedentes: 
    Dado que el usuario entra al home del aplicativo

  Esquema del escenario: Verificar la trazabilidad de creacion de usuario
    Y desea crear un usuario <user> <password>
    Cuando crea el usuario desea validar el correcto logueo
    Entonces podra ver que su usuario se loguea correctamente
    
    Ejemplos: 
      | user            | password |
      | aut-test-Bank-1 | Asdf1234 |
	