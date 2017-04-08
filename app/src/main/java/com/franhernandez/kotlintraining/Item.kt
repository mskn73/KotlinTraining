package com.franhernandez.kotlintraining

/**
 * Created by moskis on 06/04/2017.
 */

fun getItems(): List<Item> {
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/sports/$it/") }
}

class Item(val id: Long, val title: String, val url: String)