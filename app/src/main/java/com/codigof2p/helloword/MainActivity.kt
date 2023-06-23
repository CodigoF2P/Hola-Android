package com.codigof2p.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //println("Hello, world!!!")

        //variablesYConstantes()

        //tiposDeDatos()

        sentenciaIf()
    }

    /*
Uso de variables y constantes
*/
    private fun variablesYConstantes(){
        //Variables
        //tipo de nomencleratura Camel Case,
        //primera palabra en minuscilas,
        //despues las siguientes palabras la primera letra es en mayuscula
        var myFirstVariable = "Hola... Que madres es esto!!! Es magia?"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Hola, esto es Codigo F2P"

        println(myFirstVariable)

        //No se puede insertar un valor de tipo entero a una variable de cadena de texto
        //myFirstVariable = 1
        //Error: The integer literal does not conform to the expected type String

        var mySecondVariable = "Bienvenido"

        myFirstVariable = mySecondVariable

        println(myFirstVariable)

        //Constantes
        val myFirstConstant = "Esto es una constante"

        println(myFirstConstant)

        //Las constantes no se les puede reasignar un valor ya establesido
        //myFirstConstant = "Las constantes no cambian"
        //Error: Val cannot be reassigned

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)
    }

    /*
    Uso de los principales tipos de datos
    */
    private fun tiposDeDatos(){
        //string. Cadena de texto
        //val constante
        val myString: String = "Cadena de texto"
        val myString2 = "Cadena de texto definida automaticamente"
        val myString3: String = myString + ", " + myString2

        println(myString3)

        //Numeros enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2

        println(myInt3)

        //Numeros con decimales (Float, Double)
        val myFloat: Float = 1.5f

        val myDouble: Double = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3

        println(myDouble4)

        //Boleanos (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //Error, los boleanos no se suman, se comparan
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)//falso
        println(myBool && myBool2)//falso
        println(myBool && myBool)//verdadero
    }

    private fun sentenciaIf(){
        val myNumber = 11

        //Operadores comunes
        //> Mayor que
        //< Menor que
        //>= Mayor o igual que
        //<= Menor o igual que
        //== Igual a
        //!= No es igual a

        if (myNumber <= 10){
            //Sentencia if
            println("$myNumber es menor o igual que 10")
        }
        else{
            //Sentencia else
            println("$myNumber es mayor que 10")
        }
    }
}