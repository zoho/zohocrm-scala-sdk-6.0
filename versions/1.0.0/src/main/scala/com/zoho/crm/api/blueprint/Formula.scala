package com.zoho.crm.api.blueprint

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class Formula extends Model	{
	private var returnType:Option[String] = None
	private var expression:Option[Int] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getReturnType() :Option[String]	={
		return  this.returnType
	}

	def setReturnType( returnType: Option[String]) 	={
		 this.returnType = returnType
		 this.keyModified("return_type") = 1
	}

	def getExpression() :Option[Int]	={
		return  this.expression
	}

	def setExpression( expression: Option[Int]) 	={
		 this.expression = expression
		 this.keyModified("expression") = 1
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