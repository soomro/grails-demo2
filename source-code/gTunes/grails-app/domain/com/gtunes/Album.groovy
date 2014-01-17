package com.gtunes

class Album {

    static constraints = {
    String title
	hasMany = [songs:Song]

    }
}
