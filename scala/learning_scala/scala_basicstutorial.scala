// Databricks notebook source

var x = 1 + 2
println(x)    

// COMMAND ----------

var x = 3 * 4   
println(x)

// COMMAND ----------

val x = (1)+(2)
println(x)

// COMMAND ----------

val x = (2).+(2)
println(x)

// COMMAND ----------

val x = 3*4

// COMMAND ----------

val x = (3)*(4)

// COMMAND ----------

println("Hello World") 

// COMMAND ----------

import scala.math._  
val Tau = Pi*2  
println(s"Happy $Tau Day") 

// COMMAND ----------

printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))  


// COMMAND ----------

//Number operations
val range = 1 to 10

// COMMAND ----------

//creates a range between 1 to 10 exclusive
val range2 = 1 until 10 

// COMMAND ----------

//from 2 to 10 with jumps of 3  
val range3 = 2 until 10 by 3 

// COMMAND ----------

println(range3.toList) //List(2, 5, 8)

// COMMAND ----------

//Number convinience methods   
val num = -5  
val numAbs = num.abs //absolute value  
val max5or7 = numAbs.max(7)  
val min5or7 = numAbs.min(7)  
println(numAbs) //5  
println(max5or7) //7   
println(min5or7) //5  


// COMMAND ----------

//String operations   

val reverse = "Waseem".reverse //reverse a string   
println(reverse) 


// COMMAND ----------

val cap = "waseem".capitalize //make first char caps  
println(cap)

// COMMAND ----------

val multi = "Waseem!" * 7 //repeat n times   
println(multi)   


// COMMAND ----------

val int = "123".toInt //parse as Int  
println(int) 

// COMMAND ----------

//Useful methods on collections   

//filter - keep only items larger than 4   
val moreThan4 = range.filter(_ > 4)  
println(moreThan4) //Vector(5, 6, 7, 8, 9, 10)

// COMMAND ----------

//map - transform each item in the collection   
val doubleIt = range2.map(_ * 2)  
println(doubleIt) //Vector(2, 4, 6, 8, 10, 12, 14, 16, 18)

// COMMAND ----------

//Method Definition

def add(x:Int, y:Int):Int = {  
  return x + y  
}  
println(add(12,13))  


// COMMAND ----------

//2nd Method Definition
def add(x:Int, y:Int) = { //result type is inferred   
  x + y //"return" keyword is optional  
}  
println(add(42,13)) 


// COMMAND ----------

//Method Defintion 3
//Curly braces are optional on single line blocks  
def add(x:Int, y:Int) = x + y  
println(add(42,13))  


// COMMAND ----------

//Anonymous Functions
def doWithOneAndTwo(f: (Int, Int) => Int) = {  
  f(1, 2)  
}  

// COMMAND ----------

//Explicit type declaration  
val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y) 


// COMMAND ----------

//The compiler expects 2 ints so x and y types are inferred  
val call2 = doWithOneAndTwo((x, y) => x + y)

// COMMAND ----------

//Even more concise syntax  
val call3 = doWithOneAndTwo(_ + _)  

println(call1, call2, call3)  


// COMMAND ----------

//Anonymous Functions 1
def add1(x:Int, y:Int) = x + y //method  
val add2 = (x:Int, y:Int) => x + y //anonymous function  
val add3:(Int,Int)=>Int = _ + _ //alternate way  
val add4 = (_ + _):(Int,Int)=>Int //alternate way, rare   
    
println(add1(11,13))  
println(add2(11,13))  
println(add3(11,13))  
println(add4(11,13))  


// COMMAND ----------

//Return Multiple Variables
def swap(x:String, y:String) = (y, x)  
val (a,b) = swap("scala","learning")  
println(a, b) 

// COMMAND ----------

//Declare Multiple Variables
var x, y, z = 0  
var c, python, java = false  
println(x, y, z, c, python, java)  


// COMMAND ----------

//Assign Multiple Variables
var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")  
println(x, y, z, c, python, java)  


// COMMAND ----------

//Loops using while  

var i, sum = 0  
while ( i < 10) {  
  sum += i  
  i+=1  
}  
println(sum)  


// COMMAND ----------

//Loops using for  
var sum = 0  
for ( i <- 0 until 10) {  
  sum += i  
}  
println(sum)  


// COMMAND ----------

//loops without loops
//Or, neither while nor for  
(0 until 10).sum  


// COMMAND ----------

//if (true)   
  println("no braces on a single expression")  
if (1 + 1 == 2) {  
  println("multiple")  
  println("statements")  
  println("require")  
  println("braces")  
} else {  
  println("new math is found!")  
  println("or your CPU went crazy")  
}  





// COMMAND ----------

val likeEggs = false  
val breakfast =  
  if (likeEggs) "scrambled eggs"  
  else "Apple"  

println(breakfast)  


// COMMAND ----------

val selection = "One"  
selection match {  
  case "One" => println("You selected option one!")  
  case "Two" => println("You selected option two!")  
  case _ => println("You selected something else: ")  
}  


// COMMAND ----------

//Immutable list of type List[Int]  
val list1 = List(1, 2, 3)

// COMMAND ----------

var list1 = List(1,2,3)

// COMMAND ----------

//Simple class that does nothing   
class Person(fname:String, lname:String)  
val p1 = new Person("Alice", "In Chains")

// COMMAND ----------

//A class with a method  
class Person2(fname:String, lname:String)
{  
  def greet = s"Hi $fname $lname!" 
}
val p2 = new Person2("Bob", "Marley")  
println(p2.greet)  

// COMMAND ----------

//A class with a public read only variable   
class Person3(fname:String, lname:String){  
  // a public read only field   
  val fullName = s"$fname $lname"   
  def greet = s"Hi $fullName!"  
}  

val p3 = new Person3("Carlos", "Santana")  
println(p3.greet)  
println(p3.fullName)   

// COMMAND ----------

//auto creates a getter for fname, and getter + setter to lname  
class Person4(val fname:String, var lname:String)  

val p4 = new Person4("Dave", "Matthews") 
//override the default string representation   
   {override def toString = s"$fname $lname"   
}  
println(p4.fname)  
println(p4.lname)  

// COMMAND ----------

//A full Java boilerplate style class (not idiomatic Scala!)  
class JPerson() 
{  
  var _name: String = null  
  def this(_name:String) = {  
    this()  
         this._name = _name  
  }  
}

// COMMAND ----------


