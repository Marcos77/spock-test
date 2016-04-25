package groovy

import com.spock.Adder
import spock.lang.Specification

class AdderSpec extends Specification {
    def "Adding two numbers to return the sum"() {
        when: "a new Adder class is created"
        def adder = new Adder();
        then: "1 plus 1 is 2"
        adder.add(1, 1) == 2
    }

    def "Order does not matter"() {
        when: "a new Adder class is created"
        def adder = new Adder();

        then: "2 plus 3 is 5"
        adder.add(2, 3) == 5
        and: "3 plus 2 is 5"
        adder.add(3, 2) == 5
    }
}
