/*
Write a program to print below pattern

    *
   ***
  *****
 *******
*********

*/


/*
  i = rows and j = columns

      1 2 3 4 5 6 7 8 9
  i ================================j
  1 =         5
  2 =       4 5 6
  3 =     3 4 5 6 7
  4 =   2 3 4 5 6 7 8
  5 = 1 2 3 4 5 6 7 8 9

  if(j>=6-i && j<=4+i) "*" else " "

 */


for(i in 1..5){
    for (j in 1..9) {
        if (j >= 6 - i && j <= 4 + i) {
            print("*")
        } else {
            print(" ")
        }
    }
    println()
}
}