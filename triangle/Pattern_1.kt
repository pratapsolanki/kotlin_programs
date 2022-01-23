/*
Write a program to print below pattern

*****
*****
*****
*****
*****


*/

/*
  i = rows and j = columns

   (j)    1 2 3 4 5
 (i)===================
    1     1 2 3 4 5
    2     1 2 3 4 5
    3     1 2 3 4 5
    4     1 2 3 4 5
    5     1 2 3 4 5       
 */

fun main() {
    for(i in 1..5){
        for(j in 1..5){
            print("*")
        }
        println()
    }
}