package com.bridgelabz.pattern;
public class xbxx(object):
	def __init__(self):
		self.developers=[]
		self.designers=[]
		self.testers=[]

	def addDeveloper(self,dev):
		self.developers.append(dev)
		
	def addDesigners(self,design):
		self.designers.append(design)
		
	def addTesters(self,testers):
		self.testers.append(testers)

	
class Developer(object):
	def __init__(self):
		print "developer added"
	
class Designer(object):
	def __init__(self):
		print "designer added"
	
class Testers(object):
	def __init__(self):
		print "tester added"
	
if __name__ == "__main__":
	a=Manager()
	a.addDeveloper(Developer())
	a.addDesigners(Designer())
