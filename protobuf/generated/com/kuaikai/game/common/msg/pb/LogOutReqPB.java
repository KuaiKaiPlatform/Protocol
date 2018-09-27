// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account/LogOutReq.proto

package com.kuaikai.game.common.msg.pb;

public final class LogOutReqPB {
  private LogOutReqPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LogOutReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 reason = 1;
    /**
     * <code>required int32 reason = 1;</code>
     *
     * <pre>
     *原因 1 切换账号  2 主动退出登录
     * </pre>
     */
    boolean hasReason();
    /**
     * <code>required int32 reason = 1;</code>
     *
     * <pre>
     *原因 1 切换账号  2 主动退出登录
     * </pre>
     */
    int getReason();
  }
  /**
   * Protobuf type {@code LogOutReq}
   */
  public static final class LogOutReq extends
      com.google.protobuf.GeneratedMessage
      implements LogOutReqOrBuilder {
    // Use LogOutReq.newBuilder() to construct.
    private LogOutReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LogOutReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LogOutReq defaultInstance;
    public static LogOutReq getDefaultInstance() {
      return defaultInstance;
    }

    public LogOutReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LogOutReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              reason_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kuaikai.game.common.msg.pb.LogOutReqPB.internal_static_LogOutReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kuaikai.game.common.msg.pb.LogOutReqPB.internal_static_LogOutReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.class, com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.Builder.class);
    }

    public static com.google.protobuf.Parser<LogOutReq> PARSER =
        new com.google.protobuf.AbstractParser<LogOutReq>() {
      public LogOutReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogOutReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LogOutReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 reason = 1;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>required int32 reason = 1;</code>
     *
     * <pre>
     *原因 1 切换账号  2 主动退出登录
     * </pre>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 reason = 1;</code>
     *
     * <pre>
     *原因 1 切换账号  2 主动退出登录
     * </pre>
     */
    public int getReason() {
      return reason_;
    }

    private void initFields() {
      reason_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasReason()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, reason_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LogOutReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kuaikai.game.common.msg.pb.LogOutReqPB.internal_static_LogOutReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kuaikai.game.common.msg.pb.LogOutReqPB.internal_static_LogOutReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.class, com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.Builder.class);
      }

      // Construct using com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        reason_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kuaikai.game.common.msg.pb.LogOutReqPB.internal_static_LogOutReq_descriptor;
      }

      public com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq getDefaultInstanceForType() {
        return com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.getDefaultInstance();
      }

      public com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq build() {
        com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq buildPartial() {
        com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq result = new com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.reason_ = reason_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq) {
          return mergeFrom((com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq other) {
        if (other == com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq.getDefaultInstance()) return this;
        if (other.hasReason()) {
          setReason(other.getReason());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasReason()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kuaikai.game.common.msg.pb.LogOutReqPB.LogOutReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 reason = 1;
      private int reason_ ;
      /**
       * <code>required int32 reason = 1;</code>
       *
       * <pre>
       *原因 1 切换账号  2 主动退出登录
       * </pre>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 reason = 1;</code>
       *
       * <pre>
       *原因 1 切换账号  2 主动退出登录
       * </pre>
       */
      public int getReason() {
        return reason_;
      }
      /**
       * <code>required int32 reason = 1;</code>
       *
       * <pre>
       *原因 1 切换账号  2 主动退出登录
       * </pre>
       */
      public Builder setReason(int value) {
        bitField0_ |= 0x00000001;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 reason = 1;</code>
       *
       * <pre>
       *原因 1 切换账号  2 主动退出登录
       * </pre>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:LogOutReq)
    }

    static {
      defaultInstance = new LogOutReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:LogOutReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_LogOutReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LogOutReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027account/LogOutReq.proto\"\033\n\tLogOutReq\022\016" +
      "\n\006reason\030\001 \002(\005B-\n\036com.kuaikai.game.commo" +
      "n.msg.pbB\013LogOutReqPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_LogOutReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_LogOutReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_LogOutReq_descriptor,
              new java.lang.String[] { "Reason", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
