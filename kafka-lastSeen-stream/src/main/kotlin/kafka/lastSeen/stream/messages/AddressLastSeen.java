package kafka.lastSeen.stream.messages;

public final class AddressLastSeen {
  private AddressLastSeen() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddressLastSeenMapOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddressLastSeenMap)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */
    int getAddressLastSeenCount();
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */
    boolean containsAddressLastSeen(
        java.lang.String key);
    /**
     * Use {@link #getAddressLastSeenMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String>
    getAddressLastSeen();
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */
    java.util.Map<java.lang.String, java.lang.String>
    getAddressLastSeenMap();
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    java.lang.String getAddressLastSeenOrDefault(
        java.lang.String key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    java.lang.String getAddressLastSeenOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code AddressLastSeenMap}
   */
  public  static final class AddressLastSeenMap extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AddressLastSeenMap)
      AddressLastSeenMapOrBuilder {
    // Use AddressLastSeenMap.newBuilder() to construct.
    private AddressLastSeenMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddressLastSeenMap() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AddressLastSeenMap(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                addressLastSeen_ = com.google.protobuf.MapField.newMapField(
                    AddressLastSeenDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              addressLastSeen = input.readMessage(
                  AddressLastSeenDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              addressLastSeen_.getMutableMap().put(addressLastSeen.getKey(), addressLastSeen.getValue());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AddressLastSeen.internal_static_AddressLastSeenMap_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetAddressLastSeen();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddressLastSeen.internal_static_AddressLastSeenMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddressLastSeen.AddressLastSeenMap.class, AddressLastSeen.AddressLastSeenMap.Builder.class);
    }

    public static final int ADDRESS_LASTSEEN_FIELD_NUMBER = 1;
    private static final class AddressLastSeenDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.String>newDefaultInstance(
                  AddressLastSeen.internal_static_AddressLastSeenMap_AddressLastSeenEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> addressLastSeen_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetAddressLastSeen() {
      if (addressLastSeen_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AddressLastSeenDefaultEntryHolder.defaultEntry);
      }
      return addressLastSeen_;
    }

    public int getAddressLastSeenCount() {
      return internalGetAddressLastSeen().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    public boolean containsAddressLastSeen(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAddressLastSeen().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAddressLastSeenMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAddressLastSeen() {
      return getAddressLastSeenMap();
    }
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getAddressLastSeenMap() {
      return internalGetAddressLastSeen().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    public java.lang.String getAddressLastSeenOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAddressLastSeen().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
     */

    public java.lang.String getAddressLastSeenOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAddressLastSeen().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetAddressLastSeen().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
        addressLastSeen = AddressLastSeenDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        output.writeMessage(1, addressLastSeen);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetAddressLastSeen().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
        addressLastSeen = AddressLastSeenDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, addressLastSeen);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AddressLastSeen.AddressLastSeenMap)) {
        return super.equals(obj);
      }
      AddressLastSeen.AddressLastSeenMap other = (AddressLastSeen.AddressLastSeenMap) obj;

      boolean result = true;
      result = result && internalGetAddressLastSeen().equals(
          other.internalGetAddressLastSeen());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (!internalGetAddressLastSeen().getMap().isEmpty()) {
        hash = (37 * hash) + ADDRESS_LASTSEEN_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAddressLastSeen().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressLastSeen.AddressLastSeenMap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddressLastSeen.AddressLastSeenMap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressLastSeen.AddressLastSeenMap parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(AddressLastSeen.AddressLastSeenMap prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AddressLastSeenMap}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddressLastSeenMap)
        AddressLastSeen.AddressLastSeenMapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddressLastSeen.internal_static_AddressLastSeenMap_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetAddressLastSeen();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableAddressLastSeen();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddressLastSeen.internal_static_AddressLastSeenMap_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddressLastSeen.AddressLastSeenMap.class, AddressLastSeen.AddressLastSeenMap.Builder.class);
      }

      // Construct using AddressLastSeen.AddressLastSeenMap.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        internalGetMutableAddressLastSeen().clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddressLastSeen.internal_static_AddressLastSeenMap_descriptor;
      }

      public AddressLastSeen.AddressLastSeenMap getDefaultInstanceForType() {
        return AddressLastSeen.AddressLastSeenMap.getDefaultInstance();
      }

      public AddressLastSeen.AddressLastSeenMap build() {
        AddressLastSeen.AddressLastSeenMap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public AddressLastSeen.AddressLastSeenMap buildPartial() {
        AddressLastSeen.AddressLastSeenMap result = new AddressLastSeen.AddressLastSeenMap(this);
        int from_bitField0_ = bitField0_;
        result.addressLastSeen_ = internalGetAddressLastSeen();
        result.addressLastSeen_.makeImmutable();
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AddressLastSeen.AddressLastSeenMap) {
          return mergeFrom((AddressLastSeen.AddressLastSeenMap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddressLastSeen.AddressLastSeenMap other) {
        if (other == AddressLastSeen.AddressLastSeenMap.getDefaultInstance()) return this;
        internalGetMutableAddressLastSeen().mergeFrom(
            other.internalGetAddressLastSeen());
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        AddressLastSeen.AddressLastSeenMap parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddressLastSeen.AddressLastSeenMap) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.String> addressLastSeen_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetAddressLastSeen() {
        if (addressLastSeen_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AddressLastSeenDefaultEntryHolder.defaultEntry);
        }
        return addressLastSeen_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetMutableAddressLastSeen() {
        onChanged();;
        if (addressLastSeen_ == null) {
          addressLastSeen_ = com.google.protobuf.MapField.newMapField(
              AddressLastSeenDefaultEntryHolder.defaultEntry);
        }
        if (!addressLastSeen_.isMutable()) {
          addressLastSeen_ = addressLastSeen_.copy();
        }
        return addressLastSeen_;
      }

      public int getAddressLastSeenCount() {
        return internalGetAddressLastSeen().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public boolean containsAddressLastSeen(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetAddressLastSeen().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAddressLastSeenMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getAddressLastSeen() {
        return getAddressLastSeenMap();
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public java.util.Map<java.lang.String, java.lang.String> getAddressLastSeenMap() {
        return internalGetAddressLastSeen().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public java.lang.String getAddressLastSeenOrDefault(
          java.lang.String key,
          java.lang.String defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAddressLastSeen().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public java.lang.String getAddressLastSeenOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAddressLastSeen().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAddressLastSeen() {
        getMutableAddressLastSeen().clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public Builder removeAddressLastSeen(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        getMutableAddressLastSeen().remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String>
      getMutableAddressLastSeen() {
        return internalGetMutableAddressLastSeen().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */
      public Builder putAddressLastSeen(
          java.lang.String key,
          java.lang.String value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        getMutableAddressLastSeen().put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; address_lastSeen = 1;</code>
       */

      public Builder putAllAddressLastSeen(
          java.util.Map<java.lang.String, java.lang.String> values) {
        getMutableAddressLastSeen().putAll(values);
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:AddressLastSeenMap)
    }

    // @@protoc_insertion_point(class_scope:AddressLastSeenMap)
    private static final AddressLastSeen.AddressLastSeenMap DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddressLastSeen.AddressLastSeenMap();
    }

    public static AddressLastSeen.AddressLastSeenMap getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddressLastSeenMap>
        PARSER = new com.google.protobuf.AbstractParser<AddressLastSeenMap>() {
      public AddressLastSeenMap parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddressLastSeenMap(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddressLastSeenMap> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddressLastSeenMap> getParserForType() {
      return PARSER;
    }

    public AddressLastSeen.AddressLastSeenMap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddressLastSeenMap_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddressLastSeenMap_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddressLastSeenMap_AddressLastSeenEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddressLastSeenMap_AddressLastSeenEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025addressLastSeen.proto\"\220\001\n\022AddressLastS" +
      "eenMap\022B\n\020address_lastSeen\030\001 \003(\0132(.Addre" +
      "ssLastSeenMap.AddressLastSeenEntry\0326\n\024Ad" +
      "dressLastSeenEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001B\021B\017AddressLastSeenb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AddressLastSeenMap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddressLastSeenMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddressLastSeenMap_descriptor,
        new java.lang.String[] { "AddressLastSeen", });
    internal_static_AddressLastSeenMap_AddressLastSeenEntry_descriptor =
      internal_static_AddressLastSeenMap_descriptor.getNestedTypes().get(0);
    internal_static_AddressLastSeenMap_AddressLastSeenEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddressLastSeenMap_AddressLastSeenEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
