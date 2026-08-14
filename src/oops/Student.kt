package oops

 class Student(){                // Class Is a blueprint and objects are real values
     var name = ""
     var RollNumber = 0
     var age = 0
     fun HomeWork(){
         println("I have done my home work sir!!")
     }
     fun introduce(){
         println("My name is $name and my roll number is $RollNumber ..")
     }
     fun age(){
         println("Myself $name and my age is $age years old")
     }
     fun address(){
         println(" Myself $name and My address is Srirampur,Akalpoush,Debra,Paschim Medinipur")
     }

 }
fun main(){
    var student1 = Student()
    var student2 = Student()

    student1.name = "Rohan Mahanta"
    student2.name = "Ankit Singh"
    student1.RollNumber = 160
    student2.RollNumber = 161
    student1.HomeWork()
    student1.introduce()
    student2.HomeWork()
    student2.introduce()
    student1.age = 16
    student1.age()
    student2.age = 17
    student2.age()
    student1.address()

}
