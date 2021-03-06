/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

/**
 * A link in an users account that refers them to a public or individual share in
 * another user's account.
 * 
 * <dl>
 * <dt>shareName</dt>
 * <dd>the display name of the shared notebook.
 *   The link owner can change this.</dd>
 * 
 * <dt>username</dt>
 * <dd>the username of the user who owns the shared or public notebook</dd>
 * 
 * <dt>shardId</dt>
 * <dd>the shard ID of the notebook if the notebook is not public</dt>
 * 
 * <dt>shareKey</dt>
 * <dd>the secret key that provides access to the shared notebook</dd>
 * 
 * <dt>uri</dt>
 * <dd>the identifier of the public notebook</dd>
 * 
 * <dt>guid</dt>
 *   <dd>The unique identifier of this linked notebook.  Will be set whenever
 *   a linked notebook is retrieved from the service, but may be null when a client
 *   is creating a linked notebook.
 *   <br/>
 *   Length:  EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
 *   <br/>
 *   Regex:  EDAM_GUID_REGEX
 *   </dd>
 * 
 * <dt>updateSequenceNum</dt>
 *   <dd>A number identifying the last transaction to
 *   modify the state of this object.  The USN values are sequential within an
 *   account, and can be used to compare the order of modifications within the
 *   service.
 *   </dd>
 * 
 * <dt>noteStoreUrl</dt>
 *   <dd>
 *   This field will contain the full URL that clients should use to make
 *   NoteStore requests to the server shard that contains that notebook's data.
 *   I.e. this is the URL that should be used to create the Thrift HTTP client
 *   transport to send messages to the NoteStore service for the account.
 *   </dd>
 * 
 * <dt>webApiUrlPrefix:</dt>
 *   <dd>
 *   This field will contain the initial part of the URLs that should be used
 *   to make requests to Evernote's thin client "web API", which provide
 *   optimized operations for clients that aren't capable of manipulating
 *   the full contents of accounts via the full Thrift data model. Clients
 *   should concatenate the relative path for the various servlets onto the
 *   end of this string to construct the full URL, as documented on our
 *   developer web site.
 *   </dd>
 * 
 * <dt>stack</dt>
 *   <dd>If this is set, then the notebook is visually contained within a stack
 *   of notebooks with this name.  All notebooks in the same account with the
 *   same 'stack' field are considered to be in the same stack.
 *   Notebooks with no stack set are "top level" and not contained within a
 *   stack.  The link owner can change this and this field is for the benefit
 *   of the link owner.
 *   </dd>
 * 
 * <dt>businessId</dt>
 *   <dd>If set, this will be the unique identifier for the business that owns
 *   the notebook to which the linked notebook refers.
 * 
 * </dl>
 */
public class LinkedNotebook implements TBase<LinkedNotebook>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("LinkedNotebook");

  private static final TField SHARE_NAME_FIELD_DESC = new TField("shareName", TType.STRING, (short)2);
  private static final TField USERNAME_FIELD_DESC = new TField("username", TType.STRING, (short)3);
  private static final TField SHARD_ID_FIELD_DESC = new TField("shardId", TType.STRING, (short)4);
  private static final TField SHARE_KEY_FIELD_DESC = new TField("shareKey", TType.STRING, (short)5);
  private static final TField URI_FIELD_DESC = new TField("uri", TType.STRING, (short)6);
  private static final TField GUID_FIELD_DESC = new TField("guid", TType.STRING, (short)7);
  private static final TField UPDATE_SEQUENCE_NUM_FIELD_DESC = new TField("updateSequenceNum", TType.I32, (short)8);
  private static final TField NOTE_STORE_URL_FIELD_DESC = new TField("noteStoreUrl", TType.STRING, (short)9);
  private static final TField WEB_API_URL_PREFIX_FIELD_DESC = new TField("webApiUrlPrefix", TType.STRING, (short)10);
  private static final TField STACK_FIELD_DESC = new TField("stack", TType.STRING, (short)11);
  private static final TField BUSINESS_ID_FIELD_DESC = new TField("businessId", TType.I32, (short)12);

  private String shareName;
  private String username;
  private String shardId;
  private String shareKey;
  private String uri;
  private String guid;
  private int updateSequenceNum;
  private String noteStoreUrl;
  private String webApiUrlPrefix;
  private String stack;
  private int businessId;


  // isset id assignments
  private static final int __UPDATESEQUENCENUM_ISSET_ID = 0;
  private static final int __BUSINESSID_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public LinkedNotebook() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LinkedNotebook(LinkedNotebook other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetShareName()) {
      this.shareName = other.shareName;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetShardId()) {
      this.shardId = other.shardId;
    }
    if (other.isSetShareKey()) {
      this.shareKey = other.shareKey;
    }
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetGuid()) {
      this.guid = other.guid;
    }
    this.updateSequenceNum = other.updateSequenceNum;
    if (other.isSetNoteStoreUrl()) {
      this.noteStoreUrl = other.noteStoreUrl;
    }
    if (other.isSetWebApiUrlPrefix()) {
      this.webApiUrlPrefix = other.webApiUrlPrefix;
    }
    if (other.isSetStack()) {
      this.stack = other.stack;
    }
    this.businessId = other.businessId;
  }

  public LinkedNotebook deepCopy() {
    return new LinkedNotebook(this);
  }

  public void clear() {
    this.shareName = null;
    this.username = null;
    this.shardId = null;
    this.shareKey = null;
    this.uri = null;
    this.guid = null;
    setUpdateSequenceNumIsSet(false);
    this.updateSequenceNum = 0;
    this.noteStoreUrl = null;
    this.webApiUrlPrefix = null;
    this.stack = null;
    setBusinessIdIsSet(false);
    this.businessId = 0;
  }

  public String getShareName() {
    return this.shareName;
  }

  public void setShareName(String shareName) {
    this.shareName = shareName;
  }

  public void unsetShareName() {
    this.shareName = null;
  }

  /** Returns true if field shareName is set (has been asigned a value) and false otherwise */
  public boolean isSetShareName() {
    return this.shareName != null;
  }

  public void setShareNameIsSet(boolean value) {
    if (!value) {
      this.shareName = null;
    }
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been asigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getShardId() {
    return this.shardId;
  }

  public void setShardId(String shardId) {
    this.shardId = shardId;
  }

  public void unsetShardId() {
    this.shardId = null;
  }

  /** Returns true if field shardId is set (has been asigned a value) and false otherwise */
  public boolean isSetShardId() {
    return this.shardId != null;
  }

  public void setShardIdIsSet(boolean value) {
    if (!value) {
      this.shardId = null;
    }
  }

  public String getShareKey() {
    return this.shareKey;
  }

  public void setShareKey(String shareKey) {
    this.shareKey = shareKey;
  }

  public void unsetShareKey() {
    this.shareKey = null;
  }

  /** Returns true if field shareKey is set (has been asigned a value) and false otherwise */
  public boolean isSetShareKey() {
    return this.shareKey != null;
  }

  public void setShareKeyIsSet(boolean value) {
    if (!value) {
      this.shareKey = null;
    }
  }

  public String getUri() {
    return this.uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been asigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public String getGuid() {
    return this.guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public void unsetGuid() {
    this.guid = null;
  }

  /** Returns true if field guid is set (has been asigned a value) and false otherwise */
  public boolean isSetGuid() {
    return this.guid != null;
  }

  public void setGuidIsSet(boolean value) {
    if (!value) {
      this.guid = null;
    }
  }

  public int getUpdateSequenceNum() {
    return this.updateSequenceNum;
  }

  public void setUpdateSequenceNum(int updateSequenceNum) {
    this.updateSequenceNum = updateSequenceNum;
    setUpdateSequenceNumIsSet(true);
  }

  public void unsetUpdateSequenceNum() {
    __isset_vector[__UPDATESEQUENCENUM_ISSET_ID] = false;
  }

  /** Returns true if field updateSequenceNum is set (has been asigned a value) and false otherwise */
  public boolean isSetUpdateSequenceNum() {
    return __isset_vector[__UPDATESEQUENCENUM_ISSET_ID];
  }

  public void setUpdateSequenceNumIsSet(boolean value) {
    __isset_vector[__UPDATESEQUENCENUM_ISSET_ID] = value;
  }

  public String getNoteStoreUrl() {
    return this.noteStoreUrl;
  }

  public void setNoteStoreUrl(String noteStoreUrl) {
    this.noteStoreUrl = noteStoreUrl;
  }

  public void unsetNoteStoreUrl() {
    this.noteStoreUrl = null;
  }

  /** Returns true if field noteStoreUrl is set (has been asigned a value) and false otherwise */
  public boolean isSetNoteStoreUrl() {
    return this.noteStoreUrl != null;
  }

  public void setNoteStoreUrlIsSet(boolean value) {
    if (!value) {
      this.noteStoreUrl = null;
    }
  }

  public String getWebApiUrlPrefix() {
    return this.webApiUrlPrefix;
  }

  public void setWebApiUrlPrefix(String webApiUrlPrefix) {
    this.webApiUrlPrefix = webApiUrlPrefix;
  }

  public void unsetWebApiUrlPrefix() {
    this.webApiUrlPrefix = null;
  }

  /** Returns true if field webApiUrlPrefix is set (has been asigned a value) and false otherwise */
  public boolean isSetWebApiUrlPrefix() {
    return this.webApiUrlPrefix != null;
  }

  public void setWebApiUrlPrefixIsSet(boolean value) {
    if (!value) {
      this.webApiUrlPrefix = null;
    }
  }

  public String getStack() {
    return this.stack;
  }

  public void setStack(String stack) {
    this.stack = stack;
  }

  public void unsetStack() {
    this.stack = null;
  }

  /** Returns true if field stack is set (has been asigned a value) and false otherwise */
  public boolean isSetStack() {
    return this.stack != null;
  }

  public void setStackIsSet(boolean value) {
    if (!value) {
      this.stack = null;
    }
  }

  public int getBusinessId() {
    return this.businessId;
  }

  public void setBusinessId(int businessId) {
    this.businessId = businessId;
    setBusinessIdIsSet(true);
  }

  public void unsetBusinessId() {
    __isset_vector[__BUSINESSID_ISSET_ID] = false;
  }

  /** Returns true if field businessId is set (has been asigned a value) and false otherwise */
  public boolean isSetBusinessId() {
    return __isset_vector[__BUSINESSID_ISSET_ID];
  }

  public void setBusinessIdIsSet(boolean value) {
    __isset_vector[__BUSINESSID_ISSET_ID] = value;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LinkedNotebook)
      return this.equals((LinkedNotebook)that);
    return false;
  }

  public boolean equals(LinkedNotebook that) {
    if (that == null)
      return false;

    boolean this_present_shareName = true && this.isSetShareName();
    boolean that_present_shareName = true && that.isSetShareName();
    if (this_present_shareName || that_present_shareName) {
      if (!(this_present_shareName && that_present_shareName))
        return false;
      if (!this.shareName.equals(that.shareName))
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_shardId = true && this.isSetShardId();
    boolean that_present_shardId = true && that.isSetShardId();
    if (this_present_shardId || that_present_shardId) {
      if (!(this_present_shardId && that_present_shardId))
        return false;
      if (!this.shardId.equals(that.shardId))
        return false;
    }

    boolean this_present_shareKey = true && this.isSetShareKey();
    boolean that_present_shareKey = true && that.isSetShareKey();
    if (this_present_shareKey || that_present_shareKey) {
      if (!(this_present_shareKey && that_present_shareKey))
        return false;
      if (!this.shareKey.equals(that.shareKey))
        return false;
    }

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    boolean this_present_guid = true && this.isSetGuid();
    boolean that_present_guid = true && that.isSetGuid();
    if (this_present_guid || that_present_guid) {
      if (!(this_present_guid && that_present_guid))
        return false;
      if (!this.guid.equals(that.guid))
        return false;
    }

    boolean this_present_updateSequenceNum = true && this.isSetUpdateSequenceNum();
    boolean that_present_updateSequenceNum = true && that.isSetUpdateSequenceNum();
    if (this_present_updateSequenceNum || that_present_updateSequenceNum) {
      if (!(this_present_updateSequenceNum && that_present_updateSequenceNum))
        return false;
      if (this.updateSequenceNum != that.updateSequenceNum)
        return false;
    }

    boolean this_present_noteStoreUrl = true && this.isSetNoteStoreUrl();
    boolean that_present_noteStoreUrl = true && that.isSetNoteStoreUrl();
    if (this_present_noteStoreUrl || that_present_noteStoreUrl) {
      if (!(this_present_noteStoreUrl && that_present_noteStoreUrl))
        return false;
      if (!this.noteStoreUrl.equals(that.noteStoreUrl))
        return false;
    }

    boolean this_present_webApiUrlPrefix = true && this.isSetWebApiUrlPrefix();
    boolean that_present_webApiUrlPrefix = true && that.isSetWebApiUrlPrefix();
    if (this_present_webApiUrlPrefix || that_present_webApiUrlPrefix) {
      if (!(this_present_webApiUrlPrefix && that_present_webApiUrlPrefix))
        return false;
      if (!this.webApiUrlPrefix.equals(that.webApiUrlPrefix))
        return false;
    }

    boolean this_present_stack = true && this.isSetStack();
    boolean that_present_stack = true && that.isSetStack();
    if (this_present_stack || that_present_stack) {
      if (!(this_present_stack && that_present_stack))
        return false;
      if (!this.stack.equals(that.stack))
        return false;
    }

    boolean this_present_businessId = true && this.isSetBusinessId();
    boolean that_present_businessId = true && that.isSetBusinessId();
    if (this_present_businessId || that_present_businessId) {
      if (!(this_present_businessId && that_present_businessId))
        return false;
      if (this.businessId != that.businessId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LinkedNotebook other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LinkedNotebook typedOther = (LinkedNotebook)other;

    lastComparison = Boolean.valueOf(isSetShareName()).compareTo(typedOther.isSetShareName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareName()) {      lastComparison = TBaseHelper.compareTo(this.shareName, typedOther.shareName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(typedOther.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {      lastComparison = TBaseHelper.compareTo(this.username, typedOther.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShardId()).compareTo(typedOther.isSetShardId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShardId()) {      lastComparison = TBaseHelper.compareTo(this.shardId, typedOther.shardId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShareKey()).compareTo(typedOther.isSetShareKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareKey()) {      lastComparison = TBaseHelper.compareTo(this.shareKey, typedOther.shareKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUri()).compareTo(typedOther.isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUri()) {      lastComparison = TBaseHelper.compareTo(this.uri, typedOther.uri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuid()).compareTo(typedOther.isSetGuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuid()) {      lastComparison = TBaseHelper.compareTo(this.guid, typedOther.guid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateSequenceNum()).compareTo(typedOther.isSetUpdateSequenceNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateSequenceNum()) {      lastComparison = TBaseHelper.compareTo(this.updateSequenceNum, typedOther.updateSequenceNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNoteStoreUrl()).compareTo(typedOther.isSetNoteStoreUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteStoreUrl()) {      lastComparison = TBaseHelper.compareTo(this.noteStoreUrl, typedOther.noteStoreUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWebApiUrlPrefix()).compareTo(typedOther.isSetWebApiUrlPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWebApiUrlPrefix()) {      lastComparison = TBaseHelper.compareTo(this.webApiUrlPrefix, typedOther.webApiUrlPrefix);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStack()).compareTo(typedOther.isSetStack());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStack()) {      lastComparison = TBaseHelper.compareTo(this.stack, typedOther.stack);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBusinessId()).compareTo(typedOther.isSetBusinessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessId()) {      lastComparison = TBaseHelper.compareTo(this.businessId, typedOther.businessId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 2: // SHARE_NAME
          if (field.type == TType.STRING) {
            this.shareName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // USERNAME
          if (field.type == TType.STRING) {
            this.username = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SHARD_ID
          if (field.type == TType.STRING) {
            this.shardId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SHARE_KEY
          if (field.type == TType.STRING) {
            this.shareKey = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // URI
          if (field.type == TType.STRING) {
            this.uri = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // GUID
          if (field.type == TType.STRING) {
            this.guid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // UPDATE_SEQUENCE_NUM
          if (field.type == TType.I32) {
            this.updateSequenceNum = iprot.readI32();
            setUpdateSequenceNumIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // NOTE_STORE_URL
          if (field.type == TType.STRING) {
            this.noteStoreUrl = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // WEB_API_URL_PREFIX
          if (field.type == TType.STRING) {
            this.webApiUrlPrefix = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // STACK
          if (field.type == TType.STRING) {
            this.stack = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // BUSINESS_ID
          if (field.type == TType.I32) {
            this.businessId = iprot.readI32();
            setBusinessIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.shareName != null) {
      if (isSetShareName()) {
        oprot.writeFieldBegin(SHARE_NAME_FIELD_DESC);
        oprot.writeString(this.shareName);
        oprot.writeFieldEnd();
      }
    }
    if (this.username != null) {
      if (isSetUsername()) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(this.username);
        oprot.writeFieldEnd();
      }
    }
    if (this.shardId != null) {
      if (isSetShardId()) {
        oprot.writeFieldBegin(SHARD_ID_FIELD_DESC);
        oprot.writeString(this.shardId);
        oprot.writeFieldEnd();
      }
    }
    if (this.shareKey != null) {
      if (isSetShareKey()) {
        oprot.writeFieldBegin(SHARE_KEY_FIELD_DESC);
        oprot.writeString(this.shareKey);
        oprot.writeFieldEnd();
      }
    }
    if (this.uri != null) {
      if (isSetUri()) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(this.uri);
        oprot.writeFieldEnd();
      }
    }
    if (this.guid != null) {
      if (isSetGuid()) {
        oprot.writeFieldBegin(GUID_FIELD_DESC);
        oprot.writeString(this.guid);
        oprot.writeFieldEnd();
      }
    }
    if (isSetUpdateSequenceNum()) {
      oprot.writeFieldBegin(UPDATE_SEQUENCE_NUM_FIELD_DESC);
      oprot.writeI32(this.updateSequenceNum);
      oprot.writeFieldEnd();
    }
    if (this.noteStoreUrl != null) {
      if (isSetNoteStoreUrl()) {
        oprot.writeFieldBegin(NOTE_STORE_URL_FIELD_DESC);
        oprot.writeString(this.noteStoreUrl);
        oprot.writeFieldEnd();
      }
    }
    if (this.webApiUrlPrefix != null) {
      if (isSetWebApiUrlPrefix()) {
        oprot.writeFieldBegin(WEB_API_URL_PREFIX_FIELD_DESC);
        oprot.writeString(this.webApiUrlPrefix);
        oprot.writeFieldEnd();
      }
    }
    if (this.stack != null) {
      if (isSetStack()) {
        oprot.writeFieldBegin(STACK_FIELD_DESC);
        oprot.writeString(this.stack);
        oprot.writeFieldEnd();
      }
    }
    if (isSetBusinessId()) {
      oprot.writeFieldBegin(BUSINESS_ID_FIELD_DESC);
      oprot.writeI32(this.businessId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LinkedNotebook(");
    boolean first = true;

    if (isSetShareName()) {
      sb.append("shareName:");
      if (this.shareName == null) {
        sb.append("null");
      } else {
        sb.append(this.shareName);
      }
      first = false;
    }
    if (isSetUsername()) {
      if (!first) sb.append(", ");
      sb.append("username:");
      if (this.username == null) {
        sb.append("null");
      } else {
        sb.append(this.username);
      }
      first = false;
    }
    if (isSetShardId()) {
      if (!first) sb.append(", ");
      sb.append("shardId:");
      if (this.shardId == null) {
        sb.append("null");
      } else {
        sb.append(this.shardId);
      }
      first = false;
    }
    if (isSetShareKey()) {
      if (!first) sb.append(", ");
      sb.append("shareKey:");
      if (this.shareKey == null) {
        sb.append("null");
      } else {
        sb.append(this.shareKey);
      }
      first = false;
    }
    if (isSetUri()) {
      if (!first) sb.append(", ");
      sb.append("uri:");
      if (this.uri == null) {
        sb.append("null");
      } else {
        sb.append(this.uri);
      }
      first = false;
    }
    if (isSetGuid()) {
      if (!first) sb.append(", ");
      sb.append("guid:");
      if (this.guid == null) {
        sb.append("null");
      } else {
        sb.append(this.guid);
      }
      first = false;
    }
    if (isSetUpdateSequenceNum()) {
      if (!first) sb.append(", ");
      sb.append("updateSequenceNum:");
      sb.append(this.updateSequenceNum);
      first = false;
    }
    if (isSetNoteStoreUrl()) {
      if (!first) sb.append(", ");
      sb.append("noteStoreUrl:");
      if (this.noteStoreUrl == null) {
        sb.append("null");
      } else {
        sb.append(this.noteStoreUrl);
      }
      first = false;
    }
    if (isSetWebApiUrlPrefix()) {
      if (!first) sb.append(", ");
      sb.append("webApiUrlPrefix:");
      if (this.webApiUrlPrefix == null) {
        sb.append("null");
      } else {
        sb.append(this.webApiUrlPrefix);
      }
      first = false;
    }
    if (isSetStack()) {
      if (!first) sb.append(", ");
      sb.append("stack:");
      if (this.stack == null) {
        sb.append("null");
      } else {
        sb.append(this.stack);
      }
      first = false;
    }
    if (isSetBusinessId()) {
      if (!first) sb.append(", ");
      sb.append("businessId:");
      sb.append(this.businessId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

