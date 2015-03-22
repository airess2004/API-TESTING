// Place your Spring DSL code here
import grails.rest.render.xml.*
import grails.rest.render.json.*
import api.testing.City
 
beans = {
    cityXmlRenderer(XmlRenderer, City) {
        excludes = ['class', 'dateCreated','lastUpdated']
    }
    cityJSONRenderer(JsonRenderer, City) {
        excludes = ['class', 'dateCreated','lastUpdated']
    }
    cityXmlCollectionRenderer(XmlCollectionRenderer, City) {
        excludes = ['class', 'dateCreated','lastUpdated']
    }
    cityJSONCollectionRenderer(JsonCollectionRenderer, City) {
        excludes = ['class', 'dateCreated','lastUpdated']
    }
}
