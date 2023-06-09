package com.appninjas.data.mapper

import com.appninjas.domain.model.Review
import com.google.firebase.firestore.DocumentSnapshot

class ReviewMapper {

    fun documentsToReviewList(documentList: List<DocumentSnapshot>): ArrayList<Review> = documentList.map { t ->
        Review(
            reviewerName = t["reviewerName"].toString(),
            reviewDate = t["reviewDate"].toString(),
            reviewRate = t["reviewRate"].toString().toFloat(),
            reviewText = t["reviewText"].toString()
        )
    }.toCollection(ArrayList())

}