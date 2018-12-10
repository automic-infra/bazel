// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/build/v1/publish_build_event.proto

package com.google.devtools.build.v1;

/**
 * <pre>
 * States which event has been committed. Any failure to commit will cause
 * RPC errors, hence not recorded by this proto.
 * </pre>
 *
 * Protobuf type {@code google.devtools.build.v1.PublishBuildToolEventStreamResponse}
 */
public  final class PublishBuildToolEventStreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.build.v1.PublishBuildToolEventStreamResponse)
    PublishBuildToolEventStreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishBuildToolEventStreamResponse.newBuilder() to construct.
  private PublishBuildToolEventStreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishBuildToolEventStreamResponse() {
    sequenceNumber_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublishBuildToolEventStreamResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            com.google.devtools.build.v1.StreamId.Builder subBuilder = null;
            if (streamId_ != null) {
              subBuilder = streamId_.toBuilder();
            }
            streamId_ = input.readMessage(com.google.devtools.build.v1.StreamId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(streamId_);
              streamId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            sequenceNumber_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.build.v1.BackendProto.internal_static_google_devtools_build_v1_PublishBuildToolEventStreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.build.v1.BackendProto.internal_static_google_devtools_build_v1_PublishBuildToolEventStreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.class, com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.Builder.class);
  }

  public static final int STREAM_ID_FIELD_NUMBER = 1;
  private com.google.devtools.build.v1.StreamId streamId_;
  /**
   * <pre>
   * The stream that contains this event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
   */
  public boolean hasStreamId() {
    return streamId_ != null;
  }
  /**
   * <pre>
   * The stream that contains this event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
   */
  public com.google.devtools.build.v1.StreamId getStreamId() {
    return streamId_ == null ? com.google.devtools.build.v1.StreamId.getDefaultInstance() : streamId_;
  }
  /**
   * <pre>
   * The stream that contains this event.
   * </pre>
   *
   * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
   */
  public com.google.devtools.build.v1.StreamIdOrBuilder getStreamIdOrBuilder() {
    return getStreamId();
  }

  public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 2;
  private long sequenceNumber_;
  /**
   * <pre>
   * The sequence number of this event that has been committed.
   * </pre>
   *
   * <code>int64 sequence_number = 2;</code>
   */
  public long getSequenceNumber() {
    return sequenceNumber_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (streamId_ != null) {
      output.writeMessage(1, getStreamId());
    }
    if (sequenceNumber_ != 0L) {
      output.writeInt64(2, sequenceNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStreamId());
    }
    if (sequenceNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sequenceNumber_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.build.v1.PublishBuildToolEventStreamResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.build.v1.PublishBuildToolEventStreamResponse other = (com.google.devtools.build.v1.PublishBuildToolEventStreamResponse) obj;

    boolean result = true;
    result = result && (hasStreamId() == other.hasStreamId());
    if (hasStreamId()) {
      result = result && getStreamId()
          .equals(other.getStreamId());
    }
    result = result && (getSequenceNumber()
        == other.getSequenceNumber());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStreamId()) {
      hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStreamId().hashCode();
    }
    hash = (37 * hash) + SEQUENCE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequenceNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.build.v1.PublishBuildToolEventStreamResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * States which event has been committed. Any failure to commit will cause
   * RPC errors, hence not recorded by this proto.
   * </pre>
   *
   * Protobuf type {@code google.devtools.build.v1.PublishBuildToolEventStreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.build.v1.PublishBuildToolEventStreamResponse)
      com.google.devtools.build.v1.PublishBuildToolEventStreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.build.v1.BackendProto.internal_static_google_devtools_build_v1_PublishBuildToolEventStreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.build.v1.BackendProto.internal_static_google_devtools_build_v1_PublishBuildToolEventStreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.class, com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.Builder.class);
    }

    // Construct using com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (streamIdBuilder_ == null) {
        streamId_ = null;
      } else {
        streamId_ = null;
        streamIdBuilder_ = null;
      }
      sequenceNumber_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.build.v1.BackendProto.internal_static_google_devtools_build_v1_PublishBuildToolEventStreamResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.build.v1.PublishBuildToolEventStreamResponse getDefaultInstanceForType() {
      return com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.build.v1.PublishBuildToolEventStreamResponse build() {
      com.google.devtools.build.v1.PublishBuildToolEventStreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.build.v1.PublishBuildToolEventStreamResponse buildPartial() {
      com.google.devtools.build.v1.PublishBuildToolEventStreamResponse result = new com.google.devtools.build.v1.PublishBuildToolEventStreamResponse(this);
      if (streamIdBuilder_ == null) {
        result.streamId_ = streamId_;
      } else {
        result.streamId_ = streamIdBuilder_.build();
      }
      result.sequenceNumber_ = sequenceNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.build.v1.PublishBuildToolEventStreamResponse) {
        return mergeFrom((com.google.devtools.build.v1.PublishBuildToolEventStreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.build.v1.PublishBuildToolEventStreamResponse other) {
      if (other == com.google.devtools.build.v1.PublishBuildToolEventStreamResponse.getDefaultInstance()) return this;
      if (other.hasStreamId()) {
        mergeStreamId(other.getStreamId());
      }
      if (other.getSequenceNumber() != 0L) {
        setSequenceNumber(other.getSequenceNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.devtools.build.v1.PublishBuildToolEventStreamResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.build.v1.PublishBuildToolEventStreamResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.build.v1.StreamId streamId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.build.v1.StreamId, com.google.devtools.build.v1.StreamId.Builder, com.google.devtools.build.v1.StreamIdOrBuilder> streamIdBuilder_;
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public boolean hasStreamId() {
      return streamIdBuilder_ != null || streamId_ != null;
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public com.google.devtools.build.v1.StreamId getStreamId() {
      if (streamIdBuilder_ == null) {
        return streamId_ == null ? com.google.devtools.build.v1.StreamId.getDefaultInstance() : streamId_;
      } else {
        return streamIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public Builder setStreamId(com.google.devtools.build.v1.StreamId value) {
      if (streamIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamId_ = value;
        onChanged();
      } else {
        streamIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public Builder setStreamId(
        com.google.devtools.build.v1.StreamId.Builder builderForValue) {
      if (streamIdBuilder_ == null) {
        streamId_ = builderForValue.build();
        onChanged();
      } else {
        streamIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public Builder mergeStreamId(com.google.devtools.build.v1.StreamId value) {
      if (streamIdBuilder_ == null) {
        if (streamId_ != null) {
          streamId_ =
            com.google.devtools.build.v1.StreamId.newBuilder(streamId_).mergeFrom(value).buildPartial();
        } else {
          streamId_ = value;
        }
        onChanged();
      } else {
        streamIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public Builder clearStreamId() {
      if (streamIdBuilder_ == null) {
        streamId_ = null;
        onChanged();
      } else {
        streamId_ = null;
        streamIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public com.google.devtools.build.v1.StreamId.Builder getStreamIdBuilder() {
      
      onChanged();
      return getStreamIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    public com.google.devtools.build.v1.StreamIdOrBuilder getStreamIdOrBuilder() {
      if (streamIdBuilder_ != null) {
        return streamIdBuilder_.getMessageOrBuilder();
      } else {
        return streamId_ == null ?
            com.google.devtools.build.v1.StreamId.getDefaultInstance() : streamId_;
      }
    }
    /**
     * <pre>
     * The stream that contains this event.
     * </pre>
     *
     * <code>.google.devtools.build.v1.StreamId stream_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.build.v1.StreamId, com.google.devtools.build.v1.StreamId.Builder, com.google.devtools.build.v1.StreamIdOrBuilder> 
        getStreamIdFieldBuilder() {
      if (streamIdBuilder_ == null) {
        streamIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.build.v1.StreamId, com.google.devtools.build.v1.StreamId.Builder, com.google.devtools.build.v1.StreamIdOrBuilder>(
                getStreamId(),
                getParentForChildren(),
                isClean());
        streamId_ = null;
      }
      return streamIdBuilder_;
    }

    private long sequenceNumber_ ;
    /**
     * <pre>
     * The sequence number of this event that has been committed.
     * </pre>
     *
     * <code>int64 sequence_number = 2;</code>
     */
    public long getSequenceNumber() {
      return sequenceNumber_;
    }
    /**
     * <pre>
     * The sequence number of this event that has been committed.
     * </pre>
     *
     * <code>int64 sequence_number = 2;</code>
     */
    public Builder setSequenceNumber(long value) {
      
      sequenceNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sequence number of this event that has been committed.
     * </pre>
     *
     * <code>int64 sequence_number = 2;</code>
     */
    public Builder clearSequenceNumber() {
      
      sequenceNumber_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.build.v1.PublishBuildToolEventStreamResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.build.v1.PublishBuildToolEventStreamResponse)
  private static final com.google.devtools.build.v1.PublishBuildToolEventStreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.build.v1.PublishBuildToolEventStreamResponse();
  }

  public static com.google.devtools.build.v1.PublishBuildToolEventStreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishBuildToolEventStreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<PublishBuildToolEventStreamResponse>() {
    @java.lang.Override
    public PublishBuildToolEventStreamResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PublishBuildToolEventStreamResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublishBuildToolEventStreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishBuildToolEventStreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.build.v1.PublishBuildToolEventStreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

