package com.zoho.crm.api.layouts

import com.zoho.crm.api.util.Choice
import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class Tooltip extends Model	{
	private var name:Choice[String] = _
	private var value:Option[String] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getName() :Choice[String]	={
		return  this.name
	}

	def setName( name: Choice[String]) 	={
		 this.name = name
		 this.keyModified("name") = 1
	}

	def getValue() :Option[String]	={
		return  this.value
	}

	def setValue( value: Option[String]) 	={
		 this.value = value
		 this.keyModified("value") = 1
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