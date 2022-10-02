package sealedExample

sealed class PersonState {
    class Running: PersonState()
    class Walking: PersonState()
    class Idle: PersonState()
}

fun main() {
    val running = PersonState.Running()
    val running2 = PersonState.Running()

    println(running == running2)
}

fun getStateMessage(personState: PersonState): String =
    when (personState) {
        is PersonState.Running -> "Person is Running"
        is PersonState.Walking -> "Person is Walking"
        is PersonState.Idle -> "Person is Idle"
    }