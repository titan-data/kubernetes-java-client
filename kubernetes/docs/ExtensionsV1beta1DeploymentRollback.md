

# ExtensionsV1beta1DeploymentRollback

DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**name** | **String** | Required: This must match the Name of a deployment. | 
**rollbackTo** | [**ExtensionsV1beta1RollbackConfig**](ExtensionsV1beta1RollbackConfig.md) |  | 
**updatedAnnotations** | **Map&lt;String, String&gt;** | The annotations to be updated to a deployment |  [optional]



