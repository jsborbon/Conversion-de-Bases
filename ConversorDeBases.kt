fun main() {

	println("Ingrese el numero a convertir")
    val num=readLine()!!
    do{
        println("Convertir a:\n1. Decimal\n2. Otra base")
        val opt=readLine()!!.toInt()
        println("Ingrese la base del numero")
        val baseN=readLine()!!.toInt()
        if(opt==1){
            println(convertirADecimal(num,baseN))
        }else if(opt==2){
            println("Ingrese la base a convertir")
            val baseC=readLine()!!.toInt()
            println(convertirABaseN(num,baseN,baseC))
        }else{
            println("Ingrese una opción valida")
        }
    }while(opt>0 && opt<3)
}


fun convertirABaseN(num: String, baseN: Int, baseC: Int):String{
    val convertido:String
    if(baseN==10){
        val numero=num.toInt()
        convertido=numero.toString(baseC)
    }else if(baseC==10){
        val num10= convertirADecimal(num,baseN).toInt()
        convertido= num10.toString(baseC)
    }else{
        val num10= convertirADecimal(num,baseN).toInt()
        convertido=num10.toString(baseC)
    }


    return convertido
}

fun convertirADecimal(num: String, baseN: Int): String{

    val numTo10=num.toLong(baseN)
    val convertido=numTo10.toString()
    return convertido

}