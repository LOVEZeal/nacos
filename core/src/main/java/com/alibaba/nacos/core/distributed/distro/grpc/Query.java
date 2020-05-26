// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Distro.proto

package com.alibaba.nacos.core.distributed.distro.grpc;

/**
 * Protobuf type {@code Query}
 */
public  final class Query extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Query)
    QueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Query.newBuilder() to construct.
  private Query(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Query() {
    group_ = "";
    origin_ = "";
    keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Query();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Query(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            group_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            origin_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keys_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            keys_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keys_ = keys_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Distro.internal_static_Query_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Distro.internal_static_Query_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Query.class, Query.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  private volatile Object group_;
  /**
   * <code>string group = 1;</code>
   */
  public String getGroup() {
    Object ref = group_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <code>string group = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupBytes() {
    Object ref = group_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIGIN_FIELD_NUMBER = 2;
  private volatile Object origin_;
  /**
   * <pre>
   * if keys is empty, mean query all
   * </pre>
   *
   * <code>string origin = 2;</code>
   */
  public String getOrigin() {
    Object ref = origin_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      origin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * if keys is empty, mean query all
   * </pre>
   *
   * <code>string origin = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOriginBytes() {
    Object ref = origin_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      origin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEYS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList keys_;
  /**
   * <code>repeated string keys = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getKeysList() {
    return keys_;
  }
  /**
   * <code>repeated string keys = 3;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <code>repeated string keys = 3;</code>
   */
  public String getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <code>repeated string keys = 3;</code>
   */
  public com.google.protobuf.ByteString
      getKeysBytes(int index) {
    return keys_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, group_);
    }
    if (!getOriginBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, origin_);
    }
    for (int i = 0; i < keys_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keys_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, group_);
    }
    if (!getOriginBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, origin_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += computeStringSizeNoTag(keys_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Query)) {
      return super.equals(obj);
    }
    Query other = (Query) obj;

    if (!getGroup()
        .equals(other.getGroup())) return false;
    if (!getOrigin()
        .equals(other.getOrigin())) return false;
    if (!getKeysList()
        .equals(other.getKeysList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigin().hashCode();
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Query parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Query parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Query parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Query parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Query parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Query parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Query parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Query parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Query parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Query parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Query parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Query parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Query prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Query}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Query)
      QueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Distro.internal_static_Query_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Distro.internal_static_Query_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Query.class, Query.Builder.class);
    }

    // Construct using com.alibaba.nacos.core.distributed.distro.grpc.Query.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      group_ = "";

      origin_ = "";

      keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Distro.internal_static_Query_descriptor;
    }

    @Override
    public Query getDefaultInstanceForType() {
      return Query.getDefaultInstance();
    }

    @Override
    public Query build() {
      Query result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Query buildPartial() {
      Query result = new Query(this);
      int from_bitField0_ = bitField0_;
      result.group_ = group_;
      result.origin_ = origin_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keys_ = keys_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keys_ = keys_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Query) {
        return mergeFrom((Query)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Query other) {
      if (other == Query.getDefaultInstance()) return this;
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
      }
      if (!other.getOrigin().isEmpty()) {
        origin_ = other.origin_;
        onChanged();
      }
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Query parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Query) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object group_ = "";
    /**
     * <code>string group = 1;</code>
     */
    public String getGroup() {
      Object ref = group_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string group = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group = 1;</code>
     */
    public Builder setGroup(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string group = 1;</code>
     */
    public Builder clearGroup() {

      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string group = 1;</code>
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      group_ = value;
      onChanged();
      return this;
    }

    private Object origin_ = "";
    /**
     * <pre>
     * if keys is empty, mean query all
     * </pre>
     *
     * <code>string origin = 2;</code>
     */
    public String getOrigin() {
      Object ref = origin_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        origin_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * if keys is empty, mean query all
     * </pre>
     *
     * <code>string origin = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOriginBytes() {
      Object ref = origin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        origin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * if keys is empty, mean query all
     * </pre>
     *
     * <code>string origin = 2;</code>
     */
    public Builder setOrigin(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      origin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if keys is empty, mean query all
     * </pre>
     *
     * <code>string origin = 2;</code>
     */
    public Builder clearOrigin() {

      origin_ = getDefaultInstance().getOrigin();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if keys is empty, mean query all
     * </pre>
     *
     * <code>string origin = 2;</code>
     */
    public Builder setOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      origin_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new com.google.protobuf.LazyStringArrayList(keys_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getKeysList() {
      return keys_.getUnmodifiableView();
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public int getKeysCount() {
      return keys_.size();
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public String getKeys(int index) {
      return keys_.get(index);
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public com.google.protobuf.ByteString
        getKeysBytes(int index) {
      return keys_.getByteString(index);
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public Builder setKeys(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public Builder addKeys(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public Builder addAllKeys(
        Iterable<String> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public Builder clearKeys() {
      keys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keys = 3;</code>
     */
    public Builder addKeysBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Query)
  }

  // @@protoc_insertion_point(class_scope:Query)
  private static final Query DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Query();
  }

  public static Query getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Query>
      PARSER = new com.google.protobuf.AbstractParser<Query>() {
    @Override
    public Query parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Query(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Query> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Query> getParserForType() {
    return PARSER;
  }

  @Override
  public Query getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
