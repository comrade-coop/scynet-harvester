package harvester.common.distribution

import harvester.common.messages.AddressFeature
import harvester.common.messages.StreamJoin
import org.apache.kafka.streams.kstream.ValueJoiner

class ValueJoiner: ValueJoiner<AddressFeature.AddressFeatureMap, AddressFeature.AddressFeatureMap, StreamJoin.Join> {
    override fun apply(value1: AddressFeature.AddressFeatureMap?, value2: AddressFeature.AddressFeatureMap?): StreamJoin.Join {
        val builder = StreamJoin.Join.newBuilder()
        builder.numberOfStreams = 2
        builder.putAllFeatureMap1(value1!!.addressFeatureMap)
        builder.putAllFeatureMap2(value2!!.addressFeatureMap)
        return builder.build()
    }
}