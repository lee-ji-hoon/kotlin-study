package javaToKotlin.chapter03.section03

fun isDirectoryPath(path: String): Boolean{
    return path.endsWith("/")
}