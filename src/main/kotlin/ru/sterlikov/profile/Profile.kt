package ru.sterlikov.profile

class Profile(

    var id: Int,
    var login: String,
    var name: String,
    var surName: String,
    var status: Int,
    var avatar: String

) {

    val fullName: String
    get() {
        return "$surName $name"
    }

}