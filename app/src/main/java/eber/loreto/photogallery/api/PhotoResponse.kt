package eber.loreto.photogallery.api
@JsonClass(generateAdapter = true)

data class PhotoResponse {
    @Json (name = "photo") val galleryItems: List<GalleryItem>
}