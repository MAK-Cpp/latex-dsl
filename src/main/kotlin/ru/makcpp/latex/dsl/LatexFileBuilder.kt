package ru.makcpp.latex.dsl

@DslMarker
annotation class LatexDSL

@LatexDSL
class LatexFileBuilder {
    private val packages: MutableList<String> = mutableListOf()

    enum class DocumentClass { ARTICLE, REPORT, BOOK, SLIDES }

    fun documentClass(documentClass: DocumentClass) {}

    fun usePackage(packageName: String) {}
}

fun latexFile(builder : LatexFileBuilder.() -> Unit): String {

}

fun main(args: Array<String>) {
    
}