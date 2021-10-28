fun main(args: Array<String>) {

        var count=0
        var media:Float=0.0F
        while(count <4){
            var nota:Float
            println("Informe a nota")
            nota= readLine()!!.toFloat()
            media += nota
            count++
        }
        media /= 4
        println("O valor da media é igual a $media")
    }
