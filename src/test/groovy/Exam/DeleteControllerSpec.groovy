package Exam

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DeleteControllerSpec extends Specification implements ControllerUnitTest<DeleteController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
