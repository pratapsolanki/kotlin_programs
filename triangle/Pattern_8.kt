/*
Write a program to print below pattern

*********
**** ****
***   ***
**     **
*       *

*/


/*
  i = rows and j = columns


 if(j<=6-i && j>=4+i ) "*" else " "

 */



fun main() {

    for (i in 1..5) {
        for (j in 1..9) {
            if (j <= 6 - i || j >= 4 + i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}