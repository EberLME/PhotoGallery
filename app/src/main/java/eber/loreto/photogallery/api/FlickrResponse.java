package eber.loreto.photogallery.api;

@JsonClass(generateAdapter = true)
data class FlickrResponse(
        val photos: PhotoResponse
)

