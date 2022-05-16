import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.springframework.kafka.test.rule.EmbeddedKafkaRule;

public class Issue2272Test {

    @ClassRule
    public static EmbeddedKafkaRule embeddedKafka = new EmbeddedKafkaRule(2, true, 2, "messages");

    @Test
    public void anyTest() {
        Assert.assertNotNull(embeddedKafka.getEmbeddedKafka());
    }
}
