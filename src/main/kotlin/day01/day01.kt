package day01

import java.io.File

fun main() {
    val elves = File("src/main/kotlin/day01/day01.txt").readText()
        .split("${System.lineSeparator()}${System.lineSeparator()}")
        .map { elf -> elf.split(System.lineSeparator()).sumOf { it.toInt() } }

    fun part1(): Int = elves.max()

    fun part2(): Int = elves.sortedDescending().take(3).sum()

    println(part1())
    println(part2())
}
