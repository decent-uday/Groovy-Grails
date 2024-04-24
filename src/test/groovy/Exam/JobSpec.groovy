package Exam

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class JobSpec extends Specification implements DomainUnitTest<Job> {

     void "test domain constraints"() {
        when:
        Job domain = new Job()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
