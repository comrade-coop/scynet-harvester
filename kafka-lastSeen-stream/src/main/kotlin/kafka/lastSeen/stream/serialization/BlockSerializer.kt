package kafka.lastSeen.stream.serialization

import kafka.lastSeen.stream.messages.Messages.Block
import org.apache.kafka.common.serialization.Serializer;

class BlockSerializer : Serializer<Block> {

    override fun serialize(topic: String?, data: Block): ByteArray {
        return data.toByteArray()
    }

    override fun configure(configs: MutableMap<String, *>?, isKey: Boolean) {
    }

    override fun close() {
    }

}