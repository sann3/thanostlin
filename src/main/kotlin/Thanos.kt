import java.io.File

val ANSI_RED = "\u001B[31m"
val ANSI_GREEN = "\u001B[32m"
val ANSI_YELLOW = "\u001B[33m"
val ANSI_BLUE = "\u001B[34m"
val ANSI_PURPLE = "\u001B[35m"
val ANSI_RESET = "\u001B[0m"

fun main(args: Array<String>) {
    print("$ANSI_RESET Collecting $ANSI_GREEN Time$ANSI_GREEN $ANSI_RESET stone$ANSI_RESET")
    Thread.sleep(1_000)
    println("$ANSI_GREEN.$ANSI_GREEN")
    Thread.sleep(1_000)

    print("$ANSI_RESET Collecting $ANSI_YELLOW Mind$ANSI_YELLOW $ANSI_RESET stone$ANSI_RESET$ANSI_GREEN.$ANSI_GREEN")
    Thread.sleep(1_000)
    println("$ANSI_YELLOW.$ANSI_YELLOW")
    Thread.sleep(1_000)

    print("$ANSI_RESET Collecting $ANSI_RED Reality$ANSI_RED $ANSI_RESET stone$ANSI_RESET$ANSI_GREEN.$ANSI_GREEN$ANSI_YELLOW.$ANSI_YELLOW")
    Thread.sleep(1_000)
    println("$ANSI_RED.$ANSI_RED")
    Thread.sleep(1_000)

    print("$ANSI_RESET Collecting $ANSI_BLUE Space$ANSI_BLUE $ANSI_RESET stone$ANSI_RESET$ANSI_GREEN.$ANSI_GREEN$ANSI_YELLOW.$ANSI_YELLOW$ANSI_RED.$ANSI_RED")
    Thread.sleep(1_000)
    println("$ANSI_BLUE.$ANSI_BLUE")
    Thread.sleep(1_000)

    print("$ANSI_RESET Collecting $ANSI_PURPLE Power$ANSI_PURPLE $ANSI_RESET stone$ANSI_RESET$ANSI_BLUE$ANSI_GREEN.$ANSI_GREEN$ANSI_YELLOW.$ANSI_YELLOW$ANSI_RED.$ANSI_RED$ANSI_BLUE.$ANSI_BLUE")
    Thread.sleep(1_000)
    println("$ANSI_PURPLE.$ANSI_PURPLE")
    Thread.sleep(1_000)

    println("\n$ANSI_RESET$ANSI_PURPLE$ANSI_BLUE$ANSI_GREEN.$ANSI_GREEN$ANSI_YELLOW.$ANSI_YELLOW$ANSI_RED.$ANSI_RED$ANSI_BLUE.$ANSI_BLUE$ANSI_PURPLE.$ANSI_PURPLE Snapping fingers$ANSI_RESET$ANSI_PURPLE$ANSI_BLUE$ANSI_GREEN.$ANSI_GREEN$ANSI_YELLOW.$ANSI_YELLOW$ANSI_RED.$ANSI_RED$ANSI_BLUE.$ANSI_BLUE$ANSI_PURPLE.$ANSI_PURPLE")
    Thread.sleep(1_000)

    File(args[0])
        .walk()
        .filterIndexed { index, planet -> index % 2 == 0 }
        .map { planet -> planet.delete() }
        .toMutableList()

    println("\n$ANSI_RED Wiped out half of all life in the universe.$ANSI_RED")
}