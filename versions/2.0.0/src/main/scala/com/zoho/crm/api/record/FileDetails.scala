package com.zoho.crm.api.record

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class FileDetails extends Model	{
	private var fileNameS:Option[String] = None
	private var sizeS:Option[String] = None
	private var id:Option[Long] = None
	private var fileIdS:Option[String] = None
	private var delete:Option[String] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getFileNameS() :Option[String]	={
		return  this.fileNameS
	}

	def setFileNameS( fileNameS: Option[String]) 	={
		 this.fileNameS = fileNameS
		 this.keyModified("File_Name__s") = 1
	}

	def getSizeS() :Option[String]	={
		return  this.sizeS
	}

	def setSizeS( sizeS: Option[String]) 	={
		 this.sizeS = sizeS
		 this.keyModified("Size__s") = 1
	}

	def getId() :Option[Long]	={
		return  this.id
	}

	def setId( id: Option[Long]) 	={
		 this.id = id
		 this.keyModified("id") = 1
	}

	def getFileIdS() :Option[String]	={
		return  this.fileIdS
	}

	def setFileIdS( fileIdS: Option[String]) 	={
		 this.fileIdS = fileIdS
		 this.keyModified("File_Id__s") = 1
	}

	def getDelete() :Option[String]	={
		return  this.delete
	}

	def setDelete( delete: Option[String]) 	={
		 this.delete = delete
		 this.keyModified("_delete") = 1
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