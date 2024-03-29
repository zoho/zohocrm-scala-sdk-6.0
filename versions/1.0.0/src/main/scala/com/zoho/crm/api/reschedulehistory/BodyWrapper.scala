package com.zoho.crm.api.reschedulehistory

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class BodyWrapper extends Model	{
	private var data:ArrayBuffer[RescheduleHistory] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getData() :ArrayBuffer[RescheduleHistory]	={
		return  this.data
	}

	def setData( data: ArrayBuffer[RescheduleHistory]) 	={
		 this.data = data
		 this.keyModified("data") = 1
	}

	def isKeyModified( key: String) :Any	={
		if((( this.keyModified.contains(key))))
		{
			return  this.keyModified(key)
		}
		return None
	}

	def setKeyModified( key: String,  modification: Int) 	={
		 this.keyModified(key) = modification
	}}