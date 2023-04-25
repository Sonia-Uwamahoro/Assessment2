fun main(args: Array<String>) {
//    println(colorString("blue"))
//    var passCheck = passwordChecking("123abc")
//    println(passCheck)
    multiples()


    val currentAcc = CurrentAccount(3645372,"Moreen Vi", 647393.29)
    currentAcc.deposit(3748.5)
    currentAcc.widrawAmount(7362.1)
    currentAcc.details()

}

// 1
// Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

//fun colorString(color: String): Char{

    // first char
//    return (color[0])

//    // last char
//    return (color[-1])
//
//    // length
//    return (color.length)
//
//
//    // Length of the string
//    for(i in color.length - 1){
//        val character = color[i]
//        if (character == 'a' || character == 'e' || character == 'i' || character == 'u' || character == 'o' ){
//            println("It starts with vowel")
//        }
//        else{
//            println("it doesnt start with vowel")
//        }
//    }
//
//


// 2.
// Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

//fun passwordChecking(password: String): String {
//        if (password. length == 8){
//            println("valid")
//        }
//    else if(password.length != 16){
//        println("not valid")
//        }
//    else if(password != "password"){
//        println("not valid")
//        }
//    else {
////            if(password.contains(1..100)){
////                println("valid")
////            }
////
////            else{
////                return("true")
//            }
//    }
//
//}





// 3.
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)


fun multiples(){
    var multiRange = 1..1000
    for (x in multiRange){
        if(x%6 == 0 && x%8 == 0) {
            println("Bingo")
        }
        else if(x %8 == 0){
            println(x)
        }
        else if(x%8 == 0){
            println(x)
        }
    }
}


// 4.
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”


open class CurrentAccount(var accountNumber: Int, var accountName: String, var balance: Double){
    fun deposit(amount :Double){
        var incrementedAmount = balance + amount
        println(" Increments the balance by the amount deposited: $incrementedAmount")
    }

    fun widrawAmount(amount: Double){
        var decrementedAmount = balance - amount
        println(" decrements the balance by the amount deposited: $decrementedAmount")
    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}

//5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal

class SavingAccount(accountNumber: Int, accountName: String, balance: Double, var withdrawals: Int): CurrentAccount(accountNumber,accountName, balance){


}
















