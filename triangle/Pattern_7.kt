/*
Write a program to print below pattern

    *
   * *
  * * *
 * * * *
* * * * *

*/


/*
  i = rows and j = columns


 if(j>=6-i && j<=4+i && f) "*" else " "

 */



fun main() {

    var f =false
    for(i in 1..5){
        var k=1
        for(j in 1..9){
            f = if(k==1) true else false
            if(j>=6-i && j<=4+i && f){
                print("*")
                k=0
            }else{
                print(" ")
                k=1
            }
        }
        println()
    }
}