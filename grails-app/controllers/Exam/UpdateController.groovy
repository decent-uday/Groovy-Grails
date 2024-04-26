package Exam

import grails.converters.JSON


class UpdateController {

    def index() {
        render "This Controller is to Update the Doc"
    }
    def update(){
        Job j = Job.findByProfile("Expert Datascientist")
        j.setDesc("DataScientiest who has start-to-end project experience")
        j.save()
        render j as JSON
    }
}