package kafka.balanceLastSeen.distribution.config

import harvester.common.messages.MatrixBlob
import harvester.common.messages.StringList
import harvester.common.serialization.BlobSerdes
import harvester.common.serialization.JoinSerdes
import harvester.common.serialization.StringListSerdes
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.config.TopicConfig
import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.StreamsConfig
import org.apache.kafka.streams.state.KeyValueStore
import org.apache.kafka.streams.state.StoreBuilder
import org.apache.kafka.streams.state.Stores
import java.util.Properties

class StreamConfig{
    companion object {
        fun getStreamProperties(): Properties{
            return Properties().apply {
                setProperty(StreamsConfig.APPLICATION_ID_CONFIG, "distribution")
                setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092")
                setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().javaClass.name)
                setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, BlobSerdes().javaClass.name)
                setProperty("cleanup.policy", TopicConfig.CLEANUP_POLICY_COMPACT) // currently set up manually
                setProperty("delete.retention.ms", "0")// currently set up manually
                setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest" )
            }
        }

        fun getJoinStreamProperties(): Properties{
            return Properties().apply {
                setProperty(StreamsConfig.APPLICATION_ID_CONFIG, "join")
                setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092")
                setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().javaClass.name)
                setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, JoinSerdes().javaClass.name)
                setProperty("cleanup.policy", TopicConfig.CLEANUP_POLICY_COMPACT) // currently set up manually
                setProperty("delete.retention.ms", "0")// currently set up manually
                setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest" )

            }
        }

        fun getMatrixStoreSupplier(): StoreBuilder<KeyValueStore<String, MatrixBlob.Blob>>{
            return Stores.keyValueStoreBuilder(
                    Stores.persistentKeyValueStore("Matrix"),
                    Serdes.String(),
                    BlobSerdes()
            )
        }

        fun getAddressPositionStoreSupplier(): StoreBuilder<KeyValueStore<String, StringList.List>>{
            return Stores.keyValueStoreBuilder(
                    Stores.inMemoryKeyValueStore("AddressPosition"),
                    Serdes.String(),
                    StringListSerdes()
            )
        }
        
    }
}