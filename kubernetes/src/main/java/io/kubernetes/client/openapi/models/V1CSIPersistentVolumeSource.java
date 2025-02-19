/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1SecretReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 */
@ApiModel(description = "Represents storage that is managed by an external CSI volume driver (Beta feature)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1CSIPersistentVolumeSource {
  public static final String SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF = "controllerExpandSecretRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF)
  private V1SecretReference controllerExpandSecretRef;

  public static final String SERIALIZED_NAME_CONTROLLER_PUBLISH_SECRET_REF = "controllerPublishSecretRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_PUBLISH_SECRET_REF)
  private V1SecretReference controllerPublishSecretRef;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF = "nodePublishSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF)
  private V1SecretReference nodePublishSecretRef;

  public static final String SERIALIZED_NAME_NODE_STAGE_SECRET_REF = "nodeStageSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_STAGE_SECRET_REF)
  private V1SecretReference nodeStageSecretRef;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES = "volumeAttributes";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES)
  private Map<String, String> volumeAttributes = null;

  public static final String SERIALIZED_NAME_VOLUME_HANDLE = "volumeHandle";
  @SerializedName(SERIALIZED_NAME_VOLUME_HANDLE)
  private String volumeHandle;


  public V1CSIPersistentVolumeSource controllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    
    this.controllerExpandSecretRef = controllerExpandSecretRef;
    return this;
  }

   /**
   * Get controllerExpandSecretRef
   * @return controllerExpandSecretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretReference getControllerExpandSecretRef() {
    return controllerExpandSecretRef;
  }


  public void setControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
  }


  public V1CSIPersistentVolumeSource controllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {
    
    this.controllerPublishSecretRef = controllerPublishSecretRef;
    return this;
  }

   /**
   * Get controllerPublishSecretRef
   * @return controllerPublishSecretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretReference getControllerPublishSecretRef() {
    return controllerPublishSecretRef;
  }


  public void setControllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {
    this.controllerPublishSecretRef = controllerPublishSecretRef;
  }


  public V1CSIPersistentVolumeSource driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Driver is the name of the driver to use for this volume. Required.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "Driver is the name of the driver to use for this volume. Required.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1CSIPersistentVolumeSource fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;.
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\".")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1CSIPersistentVolumeSource nodePublishSecretRef(V1SecretReference nodePublishSecretRef) {
    
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

   /**
   * Get nodePublishSecretRef
   * @return nodePublishSecretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretReference getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }


  public void setNodePublishSecretRef(V1SecretReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }


  public V1CSIPersistentVolumeSource nodeStageSecretRef(V1SecretReference nodeStageSecretRef) {
    
    this.nodeStageSecretRef = nodeStageSecretRef;
    return this;
  }

   /**
   * Get nodeStageSecretRef
   * @return nodeStageSecretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretReference getNodeStageSecretRef() {
    return nodeStageSecretRef;
  }


  public void setNodeStageSecretRef(V1SecretReference nodeStageSecretRef) {
    this.nodeStageSecretRef = nodeStageSecretRef;
  }


  public V1CSIPersistentVolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1CSIPersistentVolumeSource volumeAttributes(Map<String, String> volumeAttributes) {
    
    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public V1CSIPersistentVolumeSource putVolumeAttributesItem(String key, String volumeAttributesItem) {
    if (this.volumeAttributes == null) {
      this.volumeAttributes = new HashMap<String, String>();
    }
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

   /**
   * Attributes of the volume to publish.
   * @return volumeAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes of the volume to publish.")

  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }


  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }


  public V1CSIPersistentVolumeSource volumeHandle(String volumeHandle) {
    
    this.volumeHandle = volumeHandle;
    return this;
  }

   /**
   * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
   * @return volumeHandle
  **/
  @ApiModelProperty(required = true, value = "VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.")

  public String getVolumeHandle() {
    return volumeHandle;
  }


  public void setVolumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIPersistentVolumeSource {\n");
    sb.append("    controllerExpandSecretRef: ").append(toIndentedString(controllerExpandSecretRef)).append("\n");
    sb.append("    controllerPublishSecretRef: ").append(toIndentedString(controllerPublishSecretRef)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    nodeStageSecretRef: ").append(toIndentedString(nodeStageSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

