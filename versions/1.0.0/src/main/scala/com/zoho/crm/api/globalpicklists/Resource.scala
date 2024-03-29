package com.zoho.crm.api.globalpicklists

import com.zoho.crm.api.record.Record
import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

class Resource extends Model	{
	private var id:Option[Long] = None
	private var name:Option[String] = None
	private var details:ArrayBuffer[Record] = _
	private var keyModified:HashMap[String, Int] = HashMap()

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getName() :Option[String]	={
		return  this.name
	}

	def setName( name: Option[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getDetails() :ArrayBuffer[Record]	={
		return  this.details
	}

	def setDetails( details: ArrayBuffer[Record]) 	={
		 this.details = details
		 this.keyModified("details") = 1
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