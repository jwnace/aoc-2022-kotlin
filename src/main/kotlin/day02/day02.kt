package day02

import java.io.File

fun main() {
    val input = File("src/main/kotlin/day02/day02.txt").readLines()

    fun part1() = input.map {
        when (it) {
            "B X" -> 1
            "C Y" -> 2
            "A Z" -> 3
            "A X" -> 4
            "B Y" -> 5
            "C Z" -> 6
            "C X" -> 7
            "A Y" -> 8
            "B Z" -> 9
            else -> error("unexpected input: $it")
        }
    }.sum()

    fun part2() = input.map {
        when (it) {
            "B X" -> 1
            "C X" -> 2
            "A X" -> 3
            "A Y" -> 4
            "B Y" -> 5
            "C Y" -> 6
            "C Z" -> 7
            "A Z" -> 8
            "B Z" -> 9
            else -> error("unexpected input: $it")
        }
    }.sum()

    println(part1())
    println(part2())
}
