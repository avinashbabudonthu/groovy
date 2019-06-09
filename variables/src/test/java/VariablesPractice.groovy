import org.junit.Test

class VariablesPractice {

    @Test
    public void declareVariable(){
        def sum = 3 + 5
        println "$sum"
    }

    @Test
    public void stringVariable(){
        def name = "john"
        println "name=$name"
    }
}
