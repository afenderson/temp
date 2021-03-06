/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.developer;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InterceptTest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -629674758935092312L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InterceptTest\",\"namespace\":\"io.confluent.developer\",\"fields\":[{\"name\":\"req_custid\",\"type\":\"int\"},{\"name\":\"req_message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"req_json\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"req_remote_addr\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"req_uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"req_headers\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"req_method\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"result_json\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"result_post\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InterceptTest> ENCODER =
      new BinaryMessageEncoder<InterceptTest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InterceptTest> DECODER =
      new BinaryMessageDecoder<InterceptTest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<InterceptTest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<InterceptTest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InterceptTest>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this InterceptTest to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a InterceptTest from a ByteBuffer. */
  public static InterceptTest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int req_custid;
  @Deprecated public java.lang.String req_message;
  @Deprecated public java.lang.String req_json;
  @Deprecated public java.lang.String req_remote_addr;
  @Deprecated public java.lang.String req_uri;
  @Deprecated public java.lang.String req_headers;
  @Deprecated public java.lang.String req_method;
  @Deprecated public java.lang.String result_json;
  @Deprecated public java.lang.String result_post;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InterceptTest() {}

  /**
   * All-args constructor.
   * @param req_custid The new value for req_custid
   * @param req_message The new value for req_message
   * @param req_json The new value for req_json
   * @param req_remote_addr The new value for req_remote_addr
   * @param req_uri The new value for req_uri
   * @param req_headers The new value for req_headers
   * @param req_method The new value for req_method
   * @param result_json The new value for result_json
   * @param result_post The new value for result_post
   */
  public InterceptTest(java.lang.Integer req_custid, java.lang.String req_message, java.lang.String req_json, java.lang.String req_remote_addr, java.lang.String req_uri, java.lang.String req_headers, java.lang.String req_method, java.lang.String result_json, java.lang.String result_post) {
    this.req_custid = req_custid;
    this.req_message = req_message;
    this.req_json = req_json;
    this.req_remote_addr = req_remote_addr;
    this.req_uri = req_uri;
    this.req_headers = req_headers;
    this.req_method = req_method;
    this.result_json = result_json;
    this.result_post = result_post;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return req_custid;
    case 1: return req_message;
    case 2: return req_json;
    case 3: return req_remote_addr;
    case 4: return req_uri;
    case 5: return req_headers;
    case 6: return req_method;
    case 7: return result_json;
    case 8: return result_post;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: req_custid = (java.lang.Integer)value$; break;
    case 1: req_message = (java.lang.String)value$; break;
    case 2: req_json = (java.lang.String)value$; break;
    case 3: req_remote_addr = (java.lang.String)value$; break;
    case 4: req_uri = (java.lang.String)value$; break;
    case 5: req_headers = (java.lang.String)value$; break;
    case 6: req_method = (java.lang.String)value$; break;
    case 7: result_json = (java.lang.String)value$; break;
    case 8: result_post = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'req_custid' field.
   * @return The value of the 'req_custid' field.
   */
  public java.lang.Integer getReqCustid() {
    return req_custid;
  }

  /**
   * Sets the value of the 'req_custid' field.
   * @param value the value to set.
   */
  public void setReqCustid(java.lang.Integer value) {
    this.req_custid = value;
  }

  /**
   * Gets the value of the 'req_message' field.
   * @return The value of the 'req_message' field.
   */
  public java.lang.String getReqMessage() {
    return req_message;
  }

  /**
   * Sets the value of the 'req_message' field.
   * @param value the value to set.
   */
  public void setReqMessage(java.lang.String value) {
    this.req_message = value;
  }

  /**
   * Gets the value of the 'req_json' field.
   * @return The value of the 'req_json' field.
   */
  public java.lang.String getReqJson() {
    return req_json;
  }

  /**
   * Sets the value of the 'req_json' field.
   * @param value the value to set.
   */
  public void setReqJson(java.lang.String value) {
    this.req_json = value;
  }

  /**
   * Gets the value of the 'req_remote_addr' field.
   * @return The value of the 'req_remote_addr' field.
   */
  public java.lang.String getReqRemoteAddr() {
    return req_remote_addr;
  }

  /**
   * Sets the value of the 'req_remote_addr' field.
   * @param value the value to set.
   */
  public void setReqRemoteAddr(java.lang.String value) {
    this.req_remote_addr = value;
  }

  /**
   * Gets the value of the 'req_uri' field.
   * @return The value of the 'req_uri' field.
   */
  public java.lang.String getReqUri() {
    return req_uri;
  }

  /**
   * Sets the value of the 'req_uri' field.
   * @param value the value to set.
   */
  public void setReqUri(java.lang.String value) {
    this.req_uri = value;
  }

  /**
   * Gets the value of the 'req_headers' field.
   * @return The value of the 'req_headers' field.
   */
  public java.lang.String getReqHeaders() {
    return req_headers;
  }

  /**
   * Sets the value of the 'req_headers' field.
   * @param value the value to set.
   */
  public void setReqHeaders(java.lang.String value) {
    this.req_headers = value;
  }

  /**
   * Gets the value of the 'req_method' field.
   * @return The value of the 'req_method' field.
   */
  public java.lang.String getReqMethod() {
    return req_method;
  }

  /**
   * Sets the value of the 'req_method' field.
   * @param value the value to set.
   */
  public void setReqMethod(java.lang.String value) {
    this.req_method = value;
  }

  /**
   * Gets the value of the 'result_json' field.
   * @return The value of the 'result_json' field.
   */
  public java.lang.String getResultJson() {
    return result_json;
  }

  /**
   * Sets the value of the 'result_json' field.
   * @param value the value to set.
   */
  public void setResultJson(java.lang.String value) {
    this.result_json = value;
  }

  /**
   * Gets the value of the 'result_post' field.
   * @return The value of the 'result_post' field.
   */
  public java.lang.String getResultPost() {
    return result_post;
  }

  /**
   * Sets the value of the 'result_post' field.
   * @param value the value to set.
   */
  public void setResultPost(java.lang.String value) {
    this.result_post = value;
  }

  /**
   * Creates a new InterceptTest RecordBuilder.
   * @return A new InterceptTest RecordBuilder
   */
  public static io.confluent.developer.InterceptTest.Builder newBuilder() {
    return new io.confluent.developer.InterceptTest.Builder();
  }

  /**
   * Creates a new InterceptTest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InterceptTest RecordBuilder
   */
  public static io.confluent.developer.InterceptTest.Builder newBuilder(io.confluent.developer.InterceptTest.Builder other) {
    return new io.confluent.developer.InterceptTest.Builder(other);
  }

  /**
   * Creates a new InterceptTest RecordBuilder by copying an existing InterceptTest instance.
   * @param other The existing instance to copy.
   * @return A new InterceptTest RecordBuilder
   */
  public static io.confluent.developer.InterceptTest.Builder newBuilder(io.confluent.developer.InterceptTest other) {
    return new io.confluent.developer.InterceptTest.Builder(other);
  }

  /**
   * RecordBuilder for InterceptTest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InterceptTest>
    implements org.apache.avro.data.RecordBuilder<InterceptTest> {

    private int req_custid;
    private java.lang.String req_message;
    private java.lang.String req_json;
    private java.lang.String req_remote_addr;
    private java.lang.String req_uri;
    private java.lang.String req_headers;
    private java.lang.String req_method;
    private java.lang.String result_json;
    private java.lang.String result_post;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.developer.InterceptTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.req_custid)) {
        this.req_custid = data().deepCopy(fields()[0].schema(), other.req_custid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.req_message)) {
        this.req_message = data().deepCopy(fields()[1].schema(), other.req_message);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.req_json)) {
        this.req_json = data().deepCopy(fields()[2].schema(), other.req_json);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.req_remote_addr)) {
        this.req_remote_addr = data().deepCopy(fields()[3].schema(), other.req_remote_addr);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.req_uri)) {
        this.req_uri = data().deepCopy(fields()[4].schema(), other.req_uri);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.req_headers)) {
        this.req_headers = data().deepCopy(fields()[5].schema(), other.req_headers);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.req_method)) {
        this.req_method = data().deepCopy(fields()[6].schema(), other.req_method);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.result_json)) {
        this.result_json = data().deepCopy(fields()[7].schema(), other.result_json);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.result_post)) {
        this.result_post = data().deepCopy(fields()[8].schema(), other.result_post);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InterceptTest instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.developer.InterceptTest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.req_custid)) {
        this.req_custid = data().deepCopy(fields()[0].schema(), other.req_custid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.req_message)) {
        this.req_message = data().deepCopy(fields()[1].schema(), other.req_message);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.req_json)) {
        this.req_json = data().deepCopy(fields()[2].schema(), other.req_json);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.req_remote_addr)) {
        this.req_remote_addr = data().deepCopy(fields()[3].schema(), other.req_remote_addr);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.req_uri)) {
        this.req_uri = data().deepCopy(fields()[4].schema(), other.req_uri);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.req_headers)) {
        this.req_headers = data().deepCopy(fields()[5].schema(), other.req_headers);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.req_method)) {
        this.req_method = data().deepCopy(fields()[6].schema(), other.req_method);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.result_json)) {
        this.result_json = data().deepCopy(fields()[7].schema(), other.result_json);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.result_post)) {
        this.result_post = data().deepCopy(fields()[8].schema(), other.result_post);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'req_custid' field.
      * @return The value.
      */
    public java.lang.Integer getReqCustid() {
      return req_custid;
    }

    /**
      * Sets the value of the 'req_custid' field.
      * @param value The value of 'req_custid'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqCustid(int value) {
      validate(fields()[0], value);
      this.req_custid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'req_custid' field has been set.
      * @return True if the 'req_custid' field has been set, false otherwise.
      */
    public boolean hasReqCustid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'req_custid' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqCustid() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_message' field.
      * @return The value.
      */
    public java.lang.String getReqMessage() {
      return req_message;
    }

    /**
      * Sets the value of the 'req_message' field.
      * @param value The value of 'req_message'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqMessage(java.lang.String value) {
      validate(fields()[1], value);
      this.req_message = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'req_message' field has been set.
      * @return True if the 'req_message' field has been set, false otherwise.
      */
    public boolean hasReqMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'req_message' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqMessage() {
      req_message = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_json' field.
      * @return The value.
      */
    public java.lang.String getReqJson() {
      return req_json;
    }

    /**
      * Sets the value of the 'req_json' field.
      * @param value The value of 'req_json'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqJson(java.lang.String value) {
      validate(fields()[2], value);
      this.req_json = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'req_json' field has been set.
      * @return True if the 'req_json' field has been set, false otherwise.
      */
    public boolean hasReqJson() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'req_json' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqJson() {
      req_json = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_remote_addr' field.
      * @return The value.
      */
    public java.lang.String getReqRemoteAddr() {
      return req_remote_addr;
    }

    /**
      * Sets the value of the 'req_remote_addr' field.
      * @param value The value of 'req_remote_addr'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqRemoteAddr(java.lang.String value) {
      validate(fields()[3], value);
      this.req_remote_addr = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'req_remote_addr' field has been set.
      * @return True if the 'req_remote_addr' field has been set, false otherwise.
      */
    public boolean hasReqRemoteAddr() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'req_remote_addr' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqRemoteAddr() {
      req_remote_addr = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_uri' field.
      * @return The value.
      */
    public java.lang.String getReqUri() {
      return req_uri;
    }

    /**
      * Sets the value of the 'req_uri' field.
      * @param value The value of 'req_uri'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqUri(java.lang.String value) {
      validate(fields()[4], value);
      this.req_uri = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'req_uri' field has been set.
      * @return True if the 'req_uri' field has been set, false otherwise.
      */
    public boolean hasReqUri() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'req_uri' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqUri() {
      req_uri = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_headers' field.
      * @return The value.
      */
    public java.lang.String getReqHeaders() {
      return req_headers;
    }

    /**
      * Sets the value of the 'req_headers' field.
      * @param value The value of 'req_headers'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqHeaders(java.lang.String value) {
      validate(fields()[5], value);
      this.req_headers = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'req_headers' field has been set.
      * @return True if the 'req_headers' field has been set, false otherwise.
      */
    public boolean hasReqHeaders() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'req_headers' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqHeaders() {
      req_headers = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'req_method' field.
      * @return The value.
      */
    public java.lang.String getReqMethod() {
      return req_method;
    }

    /**
      * Sets the value of the 'req_method' field.
      * @param value The value of 'req_method'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setReqMethod(java.lang.String value) {
      validate(fields()[6], value);
      this.req_method = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'req_method' field has been set.
      * @return True if the 'req_method' field has been set, false otherwise.
      */
    public boolean hasReqMethod() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'req_method' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearReqMethod() {
      req_method = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'result_json' field.
      * @return The value.
      */
    public java.lang.String getResultJson() {
      return result_json;
    }

    /**
      * Sets the value of the 'result_json' field.
      * @param value The value of 'result_json'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setResultJson(java.lang.String value) {
      validate(fields()[7], value);
      this.result_json = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'result_json' field has been set.
      * @return True if the 'result_json' field has been set, false otherwise.
      */
    public boolean hasResultJson() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'result_json' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearResultJson() {
      result_json = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'result_post' field.
      * @return The value.
      */
    public java.lang.String getResultPost() {
      return result_post;
    }

    /**
      * Sets the value of the 'result_post' field.
      * @param value The value of 'result_post'.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder setResultPost(java.lang.String value) {
      validate(fields()[8], value);
      this.result_post = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'result_post' field has been set.
      * @return True if the 'result_post' field has been set, false otherwise.
      */
    public boolean hasResultPost() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'result_post' field.
      * @return This builder.
      */
    public io.confluent.developer.InterceptTest.Builder clearResultPost() {
      result_post = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InterceptTest build() {
      try {
        InterceptTest record = new InterceptTest();
        record.req_custid = fieldSetFlags()[0] ? this.req_custid : (java.lang.Integer) defaultValue(fields()[0]);
        record.req_message = fieldSetFlags()[1] ? this.req_message : (java.lang.String) defaultValue(fields()[1]);
        record.req_json = fieldSetFlags()[2] ? this.req_json : (java.lang.String) defaultValue(fields()[2]);
        record.req_remote_addr = fieldSetFlags()[3] ? this.req_remote_addr : (java.lang.String) defaultValue(fields()[3]);
        record.req_uri = fieldSetFlags()[4] ? this.req_uri : (java.lang.String) defaultValue(fields()[4]);
        record.req_headers = fieldSetFlags()[5] ? this.req_headers : (java.lang.String) defaultValue(fields()[5]);
        record.req_method = fieldSetFlags()[6] ? this.req_method : (java.lang.String) defaultValue(fields()[6]);
        record.result_json = fieldSetFlags()[7] ? this.result_json : (java.lang.String) defaultValue(fields()[7]);
        record.result_post = fieldSetFlags()[8] ? this.result_post : (java.lang.String) defaultValue(fields()[8]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InterceptTest>
    WRITER$ = (org.apache.avro.io.DatumWriter<InterceptTest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InterceptTest>
    READER$ = (org.apache.avro.io.DatumReader<InterceptTest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
