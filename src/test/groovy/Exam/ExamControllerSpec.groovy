package Exam

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ExamControllerSpec extends Specification implements ControllerUnitTest<JobController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
