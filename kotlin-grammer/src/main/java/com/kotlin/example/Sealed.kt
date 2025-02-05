package com.kotlin.example

sealed class SealedError {

    class SealedFileError(val fileName: String) : SealedError()
    class SealedDatabaseError(val dbmsType: SealedDbmsType) : SealedError()
    class SealedOsError(val osType: SealedOsType) : SealedError()

}


enum class SealedOsType {
    WINDOWS, MACOS, LINUX
}

enum class SealedDbmsType {
    MYSQL, MARIA, ORACLE, H2
}

fun getCharacter(error: SealedError) = when (error) {
    is SealedError.SealedFileError -> "Error is occurred at ${error.fileName}"
    is SealedError.SealedDatabaseError -> "Error on DBMS : ${error.dbmsType}"
    is SealedError.SealedOsError -> "Error on OS : ${error.osType}"
    else -> throw IllegalArgumentException("Unknown Error type")
}

