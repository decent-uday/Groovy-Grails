package Exam

class UrlMappings {
    static mappings = {

        "/job/all" {
            controller = "job"
            action = "allJobs"
            method = "GET"
        }

        "/job/exp" {
            controller = "job"
            action = "getByExp"
            method = "GET"
        }

        "/job/id" {
            controller = "job"
            action = "getById"
            method = "GET"
        }

        "/job/post" {
            controller = "job"
            action = "addJob"
            method = "POST"
        }

        "/job/tech" {
            controller = "job"
            action = "byTech"
            method = "GET"
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
