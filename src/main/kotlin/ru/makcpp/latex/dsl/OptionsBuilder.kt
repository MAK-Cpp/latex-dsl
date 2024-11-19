package ru.makcpp.latex.dsl

@LatexDSL
class OptionsBuilder {
    private val options: MutableList<String> = mutableListOf()

    operator fun String.unaryMinus() {
        options.add(this)
    }

    fun option(option: String) {
        options.add(option)
    }

    fun build(): List<String> = options
}