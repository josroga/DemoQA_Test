Feature: Formulario de inscripcion
  yo como usuario de la palicacion demoqa
  quiero llenar el formulario de inscripcion
  para obtener los beneficios de la pagina
#autor: Jorge

  #escenarios 1 y 2 son ruta critica

  @rutacritica
    @test1
  Scenario Outline: inscripcion correcta
    Given que el usuario esta en la pagina de registro <navegador>
    When ingresa su informacion correctamente
    And envia el formulario
    Then deberia observar un mensaje de registro exitoso
    Examples:
    |navegador|
    |1        |
    |2        |


  @Rutacritica
  @test2

  Scenario: inscripcion no correcta

    When ingresa su informacion imcompleta
    Then deberia recibir un mensaje de error
