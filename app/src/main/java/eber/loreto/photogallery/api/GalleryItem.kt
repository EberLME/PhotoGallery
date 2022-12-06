package eber.loreto.photogallery.api
@Jsonclass (generateAdapter = true)

data class GalleryItem {
    val title: String,
    val id: String,
    @Json (name = "url_a")val url: String,
    val owner: String
    ) {
        val photoPageUri: Uri
        get() = Uri.parse("https://www.flickr.com/photos/")
            .buildUpon()
            .appendPath(owner)
            .appendPath(id)
            .build()
    }

}