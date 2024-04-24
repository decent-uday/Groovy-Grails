package com.quiz

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class QuestionsSpec extends Specification implements DomainUnitTest<Questions> {

     void "test domain constraints"() {
        when:
        Questions domain = new Questions()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
