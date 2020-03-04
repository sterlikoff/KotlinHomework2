package ru.sterlikov.hierarcy

fun main() {

    val title = TextView("Main Screen")
    println(title.text)
    title.text = "Hello world!"
    println(title.text)

    val readMore = Button("Read more")

    val main = ViewGroup()
    val content = ViewGroup()

    main.addView(title)
    content.addView(readMore)

    title.click()
    readMore.click()

}