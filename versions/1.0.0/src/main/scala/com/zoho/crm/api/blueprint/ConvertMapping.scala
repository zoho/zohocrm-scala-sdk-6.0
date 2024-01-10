package com.zoho.crm.api.blueprint

import com.zoho.crm.api.util.Model
import scala.collection.mutable.HashMap

class ConvertMapping extends Model	{
	private var contacts:Option[ModuleMapping] = None
	private var deals:Option[ModuleMapping] = None
	private var accounts:Option[ModuleMapping] = None
	private var keyModified:HashMap[String, Int] = HashMap()

	def getContacts() :Option[ModuleMapping]	={
		return  this.contacts
	}

	def setContacts( contacts: Option[ModuleMapping]) 	={
		 this.contacts = contacts
		 this.keyModified("Contacts") = 1
	}

	def getDeals() :Option[ModuleMapping]	={
		return  this.deals
	}

	def setDeals( deals: Option[ModuleMapping]) 	={
		 this.deals = deals
		 this.keyModified("Deals") = 1
	}

	def getAccounts() :Option[ModuleMapping]	={
		return  this.accounts
	}

	def setAccounts( accounts: Option[ModuleMapping]) 	={
		 this.accounts = accounts
		 this.keyModified("Accounts") = 1
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