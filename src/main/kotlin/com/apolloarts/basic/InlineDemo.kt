package com.apolloarts.basic

//https://kotlinlang.org/docs/reference/inline-functions.html
//Inlining may cause the generated code to grow; however, if we do it in a reasonable way (i.e. avoiding inlining large functions), it will pay off in performance, especially at "megamorphic" call-sites inside loops.
fun main(args: Array<String>) {
    //inlineFunction({ println("calling inline functions")})
    inlineFunction2({ println("calling inline function1")}, { println("calling inline function2")})
}

//Try to add/remove inline keyword here during debugging session. Without inline keyword, myfun function object will be created which will incur memory allocations.
inline fun inlineFunction(myFun1: () -> Unit ) {
    myFun1()
    print("code inside inline function")
}

// Function object will not be created for myFun2, but will be created for myFun1.
inline fun inlineFunction2(myFun1: () -> Unit, noinline myFun2:() -> Unit) {
    myFun1()
    myFun2()
    print("code inside inline function")
}