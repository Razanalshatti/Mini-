package com.razan.miniproject2.Models

data class BranchModel(

    val id: Int,
    val name: String,
    val type: BranchType,
    val address: String,
    val phone: String,
    val hours: String,
    val location: String,
    val imageUri: Int


)
