package Exam

import grails.converters.JSON


class DeleteController {

    def index() {
        render "Controller for Deleting"
    }
    def delete(){
        Job j = Job.findByProfile("Expert BE Developer")
        if (j) {
            j.delete()
            render j as JSON
        }
        render "No such Doc in Collection bro!!"
    }
}