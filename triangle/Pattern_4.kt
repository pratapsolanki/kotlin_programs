/*
Write a program to print below pattern

*****
 ****
  ***
   **
    *

*/


/*
  i = rows and j = columns

  i                 j
  ====================
  1    1 2 3 4 5
  2      2 3 4 5
  3        3 4 5
  4          4 5
  5            5

  if(j<=i) "*" else " "

 */


fun main() {
    for (i in 1..5) {
        for (j in 1..5) {
            if (j >= i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}