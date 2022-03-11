fun main(){
    people("maureen","makosi","kamau","nzula")
    cities("harare","mumbai","dodoma","jakarta")
    number()
    person("mutheu","kanini","mwaloka")


}
fun people(a:String,b:String,c:String,d:String){
    var names = arrayOf(a,b,c,d)
    println(names.contentToString())

}
fun cities(a:String,b:String,c: String,d: String){
    var cities = arrayOf(a,b,c,d)
    cities.sortedArray().forEach { y ->
        println(y.capitalize())
    }

}
fun number(){
    var numbers1 = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers1[1] + numbers1[4]
    println(sum)
    println(numbers1.indexOf(158))
    var sordedNum = numbers1.sortedArray()
    println(sordedNum.contentToString())

}
fun person(a:String,b:String,c:String){
    var names = arrayOf(a,b,c)
    println(names.contentToString())

}
