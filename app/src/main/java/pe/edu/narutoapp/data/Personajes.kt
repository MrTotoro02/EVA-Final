package pe.edu.narutoapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Personajes(

    val name: String,
    val appearsIn: String,
    val status: String,
    val images: String,
): Parcelable

fun getData(): List<Personajes> = listOf(

    Personajes("Obito Uchiha","Anime, Manga, Novel, Game, Movie","Deceased","https://static.wikia.nocookie.net/naruto/images/4/4a/Obito_Uchiha.png"),
    Personajes("Sasuke Uchiha","Anime, Manga, Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/1/13/Sasuke_Part_2.png"),
    Personajes("Shisui Uchiha","Anime, Manga, Novel, Game","Deceased","https://static.wikia.nocookie.net/naruto/images/4/4c/Shisui_Uchiha.png"),
    Personajes("Danzō Shimura","Anime, Manga, Novel, Game","Deceased","https://static.wikia.nocookie.net/naruto/images/1/17/Danz%C5%8D.png"),
    Personajes("Yagura Karatachi","Anime, Manga, Novel, Game","Deceased","https://static.wikia.nocookie.net/naruto/images/e/e0/Yagura.png"),
    Personajes("Hagoromo Ōtsutsuki","Anime, Manga, Game, Movie","Deceased","https://static.wikia.nocookie.net/naruto/images/6/62/Hagoromo.png"),
    Personajes("Kushina Uzumaki","Anime, Manga, Novel, Game, Movie","Deceased","https://static.wikia.nocookie.net/naruto/images/d/db/Kushina.png"),
    Personajes("Naruto Uzumaki","Anime, Manga, Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/7/7d/Naruto_Part_II.png"),
    Personajes("Menma Uzumaki","Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/8/85/Menma_Uzumaki.png"),
    Personajes("Kaguya Ōtsutsuki","Anime, Manga, Novel, Game, Movie","Incapacitated","https://static.wikia.nocookie.net/naruto/images/6/6c/Kaguya_%C5%8Ctsutsuki.png"),
    Personajes("Akamaru","Anime, Manga, Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/0/06/Akamaru_part_II.png"),
    Personajes("Gyūki","Anime, Manga, Novel, Game, Movie","Incapacitated","https://static.wikia.nocookie.net/naruto/images/d/d7/Gyuki.png"),
    Personajes("Himawari Uzumaki","Anime, Manga, Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/2/26/Himawari.png"),
    Personajes("Boruto Uzumaki","Anime, Manga, Novel, Game, Movie","Alive","https://static.wikia.nocookie.net/naruto/images/d/de/Boruto_Infobox.png"),
    Personajes("Torifu Akimichi","Anime, Manga","Presumed Deceased","https://static.wikia.nocookie.net/naruto/images/0/0a/Torifu_Akimichi.png"),
)