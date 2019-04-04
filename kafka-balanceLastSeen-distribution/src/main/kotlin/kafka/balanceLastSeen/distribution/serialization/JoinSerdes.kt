package kafka.balanceLastSeen.distribution.serialization

import kafka.balanceLastSeen.distribution.messages.StreamJoin
import org.apache.kafka.common.serialization.Deserializer
import org.apache.kafka.common.serialization.Serde
import org.apache.kafka.common.serialization.Serializer

class JoinSerdes: Serde<StreamJoin.Join> {

    private val joinSerializer = JoinSerializer()
    private val joinDeserializer = JoinDeserializer()

    override fun configure(configs: MutableMap<String, *>?, isKey: Boolean) {
    }

    override fun deserializer(): Deserializer<StreamJoin.Join> {
        return joinDeserializer
    }

    override fun close() {
        joinSerializer.close()
        joinDeserializer.close()
    }

    override fun serializer(): Serializer<StreamJoin.Join> {
        return joinSerializer
    }
}