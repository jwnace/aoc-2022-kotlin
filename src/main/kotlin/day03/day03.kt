package day03

import java.io.File

fun main() {
    val input = File("src/main/kotlin/day03/day03.txt").readLines()

    fun getPriority(letter: Char) = if (letter.isLowerCase()) letter - 'a' + 1 else letter - 'A' + 27

    fun part1() = input.map { it.chunked(it.length / 2) }
        .map { (left, right) -> (left.toSet() intersect right.toSet()).single() }
        .sumOf { getPriority(it) }

    fun part2() = input.chunked(3)
        .map { (a, b, c) -> (a.toSet() intersect b.toSet() intersect c.toSet()).single() }
        .sumOf { getPriority(it) }

    println(part1())
    println(part2())
}
