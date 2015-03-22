class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/$controller/$ids?"{
			action = [GET:"show", POST:"save", PUT:"update", DELETE:"remove"]
		  }
		
        "/"(view:"/index")
        "500"(view:'/error')
		//"/api/city"(resources: 'city')
	}
}
