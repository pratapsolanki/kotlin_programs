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

  i    j
  ====================
  1    1 2 3 4 5
  2    1 2 2 4
  3    1 2 3
  4    1 2
  5    1


  if(j<=i) "*"

 */


fun main() {
    for(i in 1..5){
        for(j in 1..5){
            if(j>=i){
                print("*")
            }
        }
        println()
    }
}