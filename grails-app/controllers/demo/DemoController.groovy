package demo

class DemoController {

    // this property will be dependency injected with
    // an instance of the KotlinMathHelper class
    // which is defined in src/main/kotlin/KotlinMathHelper.kt
    // send a request to something like http://localhost:8080/demo/add?x=4&y=7
    MathHelper mathHelper

    def add(int x, int y) {
        int sum = mathHelper.addNumbers(x, y)

        render "$x plus $y is $sum"
    }
}
