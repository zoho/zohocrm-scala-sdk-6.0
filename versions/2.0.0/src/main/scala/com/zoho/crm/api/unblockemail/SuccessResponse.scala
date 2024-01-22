package com.zoho.crm.api.unblockemail

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class SuccessResponse extends Model with ActionResponse	{
	private var code:Option[String] = None
	private var details:HashMap[String, Any] = _
	private var message:Option[String] = None
	private var status:Option[String] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getCode() :Option[String]	={
		return  this.code
	}

	def setCode( code: Option[String]) 	={
		 this.code = code
		 this.keyModified("code") = 1
	}

	def getDetails() :HashMap[String, Any]	={
		return  this.details
	}

	def setDetails( details: HashMap[String, Any]) 	={
		 this.details = details
		 this.keyModified("details") = 1
	}

	def getMessage() :Option[String]	={
		return  this.message
	}

	def setMessage( message: Option[String]) 	={
		 this.message = message
		 this.keyModified("message") = 1
	}

	def getStatus() :Option[String]	={
		return  this.status
	}

	def setStatus( status: Option[String]) 	={
		 this.status = status
		 this.keyModified("status") = 1
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