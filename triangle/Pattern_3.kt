/*
Write a program to print below pattern
    *
   **
  ***
 ****
*****

*/


/*
  i = rows and j = columns

  i     j
  ====================
  1               5
  2             4 5
  3           3 4 5
  4         2 3 4 5
  5       1 2 3 4 5

  if(j<6-i) "*" else ""

 */


fun main() {
    for(i in 1..5){
        for(j in 1..5){
            if(j>=6-i){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}