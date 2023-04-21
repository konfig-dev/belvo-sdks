

# OwnersPaginatedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | The total number of results in your Belvo account. |  [optional] |
|**next** | **String** | The URL to next page of results. Each page consists of up to 100 items. If there are not enough results for an additional page, the value is &#x60;null&#x60;.  In our documentation example, we use &#x60;{endpoint}&#x60; as a placeholder value. In production, this value will be replaced by the actual endpoint you are currently using (for example, &#x60;accounts&#x60; or &#x60;owners&#x60;).  |  [optional] |
|**previous** | **String** | The URL to the previous page of results. If there is no previous page, the value is &#x60;null&#x60;. |  [optional] |
|**results** | [**List&lt;Owner&gt;**](Owner.md) | Array of owner objects. |  [optional] |



