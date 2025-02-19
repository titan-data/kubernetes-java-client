

# V1CephFSPersistentVolumeSource

Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monitors** | **List&lt;String&gt;** | Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it | 
**path** | **String** | Optional: Used as the mounted root, rather than the full Ceph tree, default is / |  [optional]
**readOnly** | **Boolean** | Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]
**secretFile** | **String** | Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]
**secretRef** | [**V1SecretReference**](V1SecretReference.md) |  |  [optional]
**user** | **String** | Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]



