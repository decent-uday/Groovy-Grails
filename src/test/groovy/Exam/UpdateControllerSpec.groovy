package Exam

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class UpdateControllerSpec extends Specification implements ControllerUnitTest<UpdateController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
