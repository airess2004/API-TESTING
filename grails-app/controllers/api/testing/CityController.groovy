package api.testing

import grails.rest.RestfulController
import grails.converters.JSON
import java.security.MessageDigest

class CityController extends RestfulController {
//    static responseFormats = ['json', 'xml']
//    CityController() {
//		
//        super(City)
//		
//    }
	
	def show = {
		println params
		
		println params.action
		println params.controller
		if(params.ids && City.exists(params.ids)){
		 render City.findById(params.ids) as JSON
		}else{
		 render City.list() as JSON
		}
	   }
	
	def generateMD5(String s) {
		MessageDigest digest = MessageDigest.getInstance("MD5")
		digest.update(s.bytes);
		new BigInteger(1, digest.digest()).toString(16).padLeft(32, '0')
	 }
	
	def save = {
		def runner = new City(request.JSON)
		print request.JSON.cityName
		render generateMD5("")
		if(runner.save()){
		 render runner as JSON
		}else{
		 //handle errors...
		}
	   }
	
}		