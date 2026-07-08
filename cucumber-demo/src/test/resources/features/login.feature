# language: en

Feature: Inicio de sesión
    Como usuario registrado de FISCorp
    Quiero iniciar sesión con mis credenciales
    Para acceder al sistema

    Scenario: Login exitoso con credenciales válidas
        Given que el usuario "admin" existe con contraseña "1234"
        When intento iniciar sesión con usuario "admin" y contraseña "1234"
        Then el sistema me da acceso

    Scenario: Login fallido con contraseña incorrecta
        Given que el usuario "admin" existe con contraseña "1234"
        When intento iniciar sesión con usuario "admin" y contraseña "wrong"
        Then el sistema me niega el acceso