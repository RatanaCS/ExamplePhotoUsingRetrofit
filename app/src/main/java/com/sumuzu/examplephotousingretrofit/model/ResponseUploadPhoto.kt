package com.sumuzu.examplephotousingretrofit.model

import com.google.gson.annotations.SerializedName

data class ResponseUploadPhoto(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("isSuccess")
	val isSuccess: Boolean? = null
)
