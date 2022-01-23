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

  i     j               j       j<=i
  ================================
  1     1               j<=1    j<=1
  2     1 2             j<=2    j<=2
  3     1 2 3           j<=3    j<=3
  4     1 2 3 4         j<=4    j<=4
  5     1 2 3 4 5       j<=5    j<=5


 */


fun main() {
    for(i in 1..5){
        for(j in 1..5){
            if(j<=i){
                print("*")
            }
        }
        println()
    }
}