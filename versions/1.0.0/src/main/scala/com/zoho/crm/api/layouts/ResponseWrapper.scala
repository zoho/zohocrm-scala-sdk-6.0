package com.zoho.crm.api.layouts

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class ResponseWrapper extends Model with ResponseHandler	{
	private var layouts:ArrayBuffer[Layouts] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getLayouts() :ArrayBuffer[Layouts]	={
		return  this.layouts
	}

	def setLayouts( layouts: ArrayBuffer[Layouts]) 	={
		 this.layouts = layouts
		 this.keyModified("layouts") = 1
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