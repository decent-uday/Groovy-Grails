package Exam

import grails.converters.JSON
import grails.mongodb.MongoEntity
import org.grails.datastore.mapping.mongo.MongoDatastore
import org.grails.datastore.mapping.query.Query
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller

@Controller
class JobController {

    MongoDatastore mongoDatastore

    def index() {
        render "Hello!!"
    }

    def allJobs(){
        def jobs = mongoDatastore.withSession { session ->
            def query = session.createQuery(Job)
            query.list()
        }
        // Return a ResponseEntity with the list of jobs and HTTP status OK
        render ResponseEntity.ok(jobs)
    }

    def getByExp(Integer exp) {
        def jobs = mongoDatastore.withSession { session ->
            def criteria = Job.createCriteria()
            criteria.list {
                gt("exp", exp ?: 3) // Filter by experience greater than the provided value or default to 3
            }
        }
        def eMap = [:]
        eMap["job"] = jobs
       render eMap as JSON
       // render ResponseEntity.ok(jobs)
    }

    def getById(Integer id){
        def jobs = mongoDatastore.withSession { session ->
            def criteria = Job.createCriteria()
            criteria.list {
                gt("_id", id ?: 3) // Filter by experience greater than the provided value or default to 3
            }
        }
        render ResponseEntity.ok(jobs)
    }

    def addJob() {
        def requestBody = request.JSON // Extract JSON data from the request body
        def job = new Job(requestBody) // Create a new Job instance from the JSON data
        job.save(flush: true) // Save the job to the database
        render status: HttpStatus.CREATED
    }

    def byTech(String tech){
        def jobs = mongoDatastore.withSession { session ->
            def criteria = Job.createCriteria()
            criteria.list {
                gt("techs", tech ?: "java") // Filter by experience greater than the provided value or default to 3
            }
        }
        def eMap = [:]
        eMap["job"] = jobs
        render eMap as JSON
        // render ResponseEntity.ok(jobs)
    }

}
