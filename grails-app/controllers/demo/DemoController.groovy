package demo

class DemoController {

    // this property will be dependency injected with
    // an instance of the KotlinMathHelper class
    // which is defined in src/main/kotlin/KotlinMathHelper.kt
    MathHelper mathHelper

    def add(int x, int y) {
        int sum = mathHelper.addNumbers(x, y)

        render "$x plus $y is $sum"
    }
}
