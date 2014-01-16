package com.gtunes

class Album {

    static constraints = {
    String title
	 static hasMany = [songs:Song]

    }
}
